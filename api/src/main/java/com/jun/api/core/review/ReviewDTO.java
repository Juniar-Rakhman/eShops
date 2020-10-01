package com.jun.api.core.review;

import lombok.Data;

@Data
public class ReviewDTO {
    private final int productId;
    private final int reviewId;
    private final String author;
    private final String subject;
    private final String content;
    private final String serviceAddress;
}
