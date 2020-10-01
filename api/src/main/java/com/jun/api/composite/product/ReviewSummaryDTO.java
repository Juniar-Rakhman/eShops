package com.jun.api.composite.product;

import lombok.Data;

@Data
public class ReviewSummaryDTO {
    private final int reviewId;
    private final String author;
    private final String subject;
}
