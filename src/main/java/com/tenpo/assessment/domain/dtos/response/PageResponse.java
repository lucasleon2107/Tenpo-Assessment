package com.tenpo.assessment.domain.dtos.response;

import org.springframework.data.domain.Page;

import java.util.List;

public class PageResponse<T> {
    private List<T> content;
    private Integer totalPages;
    private Integer page;
    private Integer limit;
    private Long total;

    public PageResponse(Page<T> pageable) {
        this.totalPages = pageable.getTotalPages();
        this.page = pageable.getNumber();
        this.limit = pageable.getSize();
        this.content = pageable.getContent();
        this.total = pageable.getTotalElements();
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public PageResponse<T> setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    public Integer getPage() {
        return page;
    }

    public PageResponse<T> setPage(Integer page) {
        this.page = page;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public PageResponse<T> setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public List<T> getContent() {
        return content;
    }

    public PageResponse<T> setContent(List<T> content) {
        this.content = content;
        return this;
    }

    public Long getTotal() {
        return total;
    }

    public PageResponse<T> setTotal(Long total) {
        this.total = total;
        return this;
    }
}
