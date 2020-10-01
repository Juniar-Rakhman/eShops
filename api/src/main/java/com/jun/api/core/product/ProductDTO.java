package com.jun.api.core.product;

import lombok.Data;

@Data
public class ProductDTO {
    private final int productId;
    private final String name;
    private final int weight;
    private final String serviceAddress;
}
