package com.bigbasket.bigbasketapi.model;

// import java.util.List;

// import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
// import jakarta.persistence.ManyToOne;
// import jakarta.persistence.OneToMany;
// import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Orders")
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int saleId;

    @ManyToOne
    @JoinColumn(name = "custId")
    private UserModel customer;

    private String saleDate;
    private String totalInvoiceAmount;
    private double discount;
    private String paymentNaration;
    private String deliveryAddress1;
    private String deliveryAddress2;
    private String deliveryCity;
    private String deliveryPinCode;
    private String deliveryLandmark;
    public int getSaleId() {
        return saleId;
    }
    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }
    public UserModel getCustomer() {
        return customer;
    }
    public void setCustomer(UserModel customer) {
        this.customer = customer;
    }
    public String getSaleDate() {
        return saleDate;
    }
    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }
    public String getTotalInvoiceAmount() {
        return totalInvoiceAmount;
    }
    public void setTotalInvoiceAmount(String totalInvoiceAmount) {
        this.totalInvoiceAmount = totalInvoiceAmount;
    }
    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public String getPaymentNaration() {
        return paymentNaration;
    }
    public void setPaymentNaration(String paymentNaration) {
        this.paymentNaration = paymentNaration;
    }
    public String getDeliveryAddress1() {
        return deliveryAddress1;
    }
    public void setDeliveryAddress1(String deliveryAddress1) {
        this.deliveryAddress1 = deliveryAddress1;
    }
    public String getDeliveryAddress2() {
        return deliveryAddress2;
    }
    public void setDeliveryAddress2(String deliveryAddress2) {
        this.deliveryAddress2 = deliveryAddress2;
    }
    public String getDeliveryCity() {
        return deliveryCity;
    }
    public void setDeliveryCity(String deliveryCity) {
        this.deliveryCity = deliveryCity;
    }
    public String getDeliveryPinCode() {
        return deliveryPinCode;
    }
    public void setDeliveryPinCode(String deliveryPinCode) {
        this.deliveryPinCode = deliveryPinCode;
    }
    public String getDeliveryLandmark() {
        return deliveryLandmark;
    }
    public void setDeliveryLandmark(String deliveryLandmark) {
        this.deliveryLandmark = deliveryLandmark;
    }
    public OrderModel(int saleId, UserModel customer, String saleDate, String totalInvoiceAmount, double discount,
            String paymentNaration, String deliveryAddress1, String deliveryAddress2, String deliveryCity,
            String deliveryPinCode, String deliveryLandmark) {
        this.saleId = saleId;
        this.customer = customer;
        this.saleDate = saleDate;
        this.totalInvoiceAmount = totalInvoiceAmount;
        this.discount = discount;
        this.paymentNaration = paymentNaration;
        this.deliveryAddress1 = deliveryAddress1;
        this.deliveryAddress2 = deliveryAddress2;
        this.deliveryCity = deliveryCity;
        this.deliveryPinCode = deliveryPinCode;
        this.deliveryLandmark = deliveryLandmark;
    }
    public OrderModel() {
    }
    @Override
    public String toString() {
        return "OrderModel [saleId=" + saleId + ", customer=" + customer + ", saleDate=" + saleDate
                + ", totalInvoiceAmount=" + totalInvoiceAmount + ", discount=" + discount + ", paymentNaration="
                + paymentNaration + ", deliveryAddress1=" + deliveryAddress1 + ", deliveryAddress2=" + deliveryAddress2
                + ", deliveryCity=" + deliveryCity + ", deliveryPinCode=" + deliveryPinCode + ", deliveryLandmark="
                + deliveryLandmark + "]";
    }

    

    
}
