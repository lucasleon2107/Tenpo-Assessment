package com.tenpo.assessment.domain.services;

import com.tenpo.assessment.domain.entities.SumHistory;
import com.tenpo.assessment.repositories.SumHistoryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

@Service
public class SumHistoryService {

    private final SumHistoryRepository sumHistoryRepository;

    public SumHistoryService(SumHistoryRepository sumHistoryRepository) {
        this.sumHistoryRepository = sumHistoryRepository;
    }

    public void saveSumHistory(Integer a, Integer b) {
        sumHistoryRepository.save(new SumHistory(a, b));
    }

    public Page<SumHistory> getSumHistory(Pageable pageRequest) {
        return sumHistoryRepository.findAll(pageRequest);
    }
}
