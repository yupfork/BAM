package com.bean;

public class Page {
    private Integer total;
    private Integer currentPage;
    private Integer totalPage;

    public Page() {
    }

    public Page(Integer total, Integer currentPage, Integer totalPage) {
        this.total = total;
        this.currentPage = currentPage;
        this.totalPage = totalPage;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }
}
