package com.tenpo.assessment.repositories;

import com.tenpo.assessment.domain.entities.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUserName(String user);
}
