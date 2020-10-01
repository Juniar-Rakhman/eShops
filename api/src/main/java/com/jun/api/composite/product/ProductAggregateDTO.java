package com.jun.api.composite.product;

import java.util.List;

import lombok.Data;

@Data
public class ProductAggregateDTO {
    private final int productId;
    private final String name;
    private final int weight;
    private final List<RecommendationSummaryDTO> recommendations;
    private final List<ReviewSummaryDTO> reviews;
    private final ServiceAddressesDTO serviceAddressesDTO;
}
