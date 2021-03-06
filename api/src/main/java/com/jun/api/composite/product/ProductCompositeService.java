package com.jun.api.composite.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductCompositeService {

    /**
     * Sample usage: curl $HOST:$PORT/product-composite/1
     *
     * @param productId
     * @return the composite product info, if found, else null
     */
    @GetMapping(
        value    = "/product-composite/{productId}",
        produces = "application/json")
    ProductAggregateDTO getProduct(@PathVariable int productId);
}
