package com.cydeo.mentor.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table (name = "categories")
public class Category extends BaseEntity{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String categoryName;
    private int tax;

}
