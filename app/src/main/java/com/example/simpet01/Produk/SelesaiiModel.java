package com.example.simpet01.Produk;

public class SelesaiiModel {
    private String dateOrder;
    private Integer invoiceOrder;
    private Integer totalOrder;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;

    // Constructors, getters, and setters

    public String getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(String dateOrder) {
        this.dateOrder = dateOrder;
    }

    public Integer getInvoiceOrder() {
        return invoiceOrder;
    }

    public void setInvoiceOrder(Integer invoiceOrder) {
        this.invoiceOrder = invoiceOrder;
    }

    public Integer getTotalOrder() {
        return totalOrder;
    }

    public void setTotalOrder(Integer totalOrder) {
        this.totalOrder = totalOrder;
    }
}
