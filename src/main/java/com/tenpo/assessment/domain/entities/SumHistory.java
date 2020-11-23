package com.tenpo.assessment.domain.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SumHistory {
    @Id
    @GeneratedValue
    private Long id;
    private Integer firstNumber;
    private Integer secondNumber;
    private Integer result;

    public SumHistory() {
    }

    public SumHistory(Integer firstNumber, Integer secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.result = firstNumber + secondNumber;
    }

    public Long getId() {
        return id;
    }

    public SumHistory setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getFirstNumber() {
        return firstNumber;
    }

    public SumHistory setFirstNumber(Integer firstNumber) {
        this.firstNumber = firstNumber;
        return this;
    }

    public Integer getSecondNumber() {
        return secondNumber;
    }

    public SumHistory setSecondNumber(Integer secondNumber) {
        this.secondNumber = secondNumber;
        return this;
    }

    public Integer getResult() {
        return result;
    }

    public SumHistory setResult(Integer result) {
        this.result = result;
        return this;
    }
}
