package com.tenpo.assessment.controllers;

import com.tenpo.assessment.domain.dtos.response.PageResponse;
import com.tenpo.assessment.domain.dtos.response.SumResponse;
import com.tenpo.assessment.domain.entities.SumHistory;
import com.tenpo.assessment.domain.exceptions.NotFoundException;
import com.tenpo.assessment.domain.services.SumHistoryService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

    private final SumHistoryService sumHistoryService;

    @Value("${page.limit}")
    private Integer limit;

    public SumController(SumHistoryService sumHistoryService) {
        this.sumHistoryService = sumHistoryService;
    }

    @GetMapping("/sum")
    public ResponseEntity<SumResponse> getSum(@ApiParam(example = "1") @RequestParam Integer a, @ApiParam(example = "2") @RequestParam Integer b) {
        sumHistoryService.saveSumHistory(a, b);
        return ResponseEntity.ok(new SumResponse(a + b));
    }

    @GetMapping("/sum/history")
    public ResponseEntity<PageResponse<SumHistory>> getSumHistory(@RequestParam(defaultValue = "0") Integer page) {
        Pageable pageRequest = PageRequest.of(page, limit);

        Page<SumHistory> sumHistoryPage = sumHistoryService.getSumHistory(pageRequest);

        if (page > sumHistoryPage.getTotalPages()) {
            throw new NotFoundException();
        }

        return ResponseEntity.ok(new PageResponse<>(sumHistoryPage));
    }
}
