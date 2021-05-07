package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.entities.Seller;

import java.io.Serializable;
import java.util.List;

public class SellerDto implements Serializable {

    private Long id;
    private String name;

    public SellerDto(){
    }

    public SellerDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public SellerDto(Seller seller) {
        id = seller.getId();
        name = seller.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
