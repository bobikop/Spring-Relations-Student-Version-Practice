package com.cydeo.mentor.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
public class Invoice_Product extends BaseEntity{

    private int quantity;
    private double profit;




    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;


}
