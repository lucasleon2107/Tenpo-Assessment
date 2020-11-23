package com.tenpo.assessment.domain.services;

import com.tenpo.assessment.domain.entities.ApplicationUser;
import com.tenpo.assessment.repositories.ApplicationUserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class ApplicationUserService implements UserDetailsService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final ApplicationUserRepository applicationUserRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public ApplicationUserService(ApplicationUserRepository applicationUserRepository,
                                  BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.applicationUserRepository = applicationUserRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public ApplicationUser signUp(String email, String password) {
        logger.info("Registering user...");

        String protectedPassword = bCryptPasswordEncoder.encode(password);

        ApplicationUser userToSignUp = new ApplicationUser(email, protectedPassword);

        return applicationUserRepository.save(userToSignUp);
    }

    public Boolean isUserRegistered(String user) {
        return applicationUserRepository.findByUserName(user) != null;
    }

    @Override
    public UserDetails loadUserByUsername(String user) {
        ApplicationUser applicationUser = applicationUserRepository.findByUserName(user);

        if (applicationUser == null) {
            throw new UsernameNotFoundException(user);
        }

        return new User(applicationUser.getUserName(), applicationUser.getPassword(), Collections.emptyList());
    }
}
