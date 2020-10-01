package com.jun.api.composite.product;

import lombok.Data;

@Data
public class RecommendationSummaryDTO {
    private final int recommendationId;
    private final String author;
    private final int rate;
}
