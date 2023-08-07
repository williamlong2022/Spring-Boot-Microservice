package com.programmingtechie.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
//dto act as data transfer object, good practice
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//different with nmodel is without id
public class ProductRequest {
    private String name;
    private String description;
    private BigDecimal price;
}
