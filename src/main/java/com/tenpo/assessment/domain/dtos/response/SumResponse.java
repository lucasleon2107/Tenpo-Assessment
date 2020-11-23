package com.tenpo.assessment.domain.dtos.response;

public class SumResponse {
    private Integer result;

    public SumResponse(Integer result) {
        this.result = result;
    }

    public Integer getResult() {
        return result;
    }

    public SumResponse setResult(Integer result) {
        this.result = result;
        return this;
    }
}
