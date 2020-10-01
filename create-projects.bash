#!/usr/bin/env bash

mkdir microservices
cd microservices

spring init \
--boot-version=2.3.4 \
--build=gradle \
--java-version=1.11 \
--packaging=jar \
--name=product-service \
--package-name=com.jun.eshop.core.product \
--groupId=com.jun.eshop.core.product \
--dependencies=actuator,webflux \
--version=1.0.0-SNAPSHOT \
product-service

spring init \
--boot-version=2.3.4 \
--build=gradle \
--java-version=1.11 \
--packaging=jar \
--name=review-service \
--package-name=com.jun.eshop.core.review \
--groupId=com.jun.eshop.core.review \
--dependencies=actuator,webflux \
--version=1.0.0-SNAPSHOT \
review-service

spring init \
--boot-version=2.3.4 \
--build=gradle \
--java-version=1.8 \
--packaging=jar \
--name=recommendation-service \
--package-name=com.jun.eshop.core.recommendation \
--groupId=com.jun.eshop.core.recommendation \
--dependencies=actuator,webflux \
--version=1.0.0-SNAPSHOT \
recommendation-service

spring init \
--boot-version=2.3.4 \
--build=gradle \
--java-version=1.11 \
--packaging=jar \
--name=product-composite-service \
--package-name=com.jun.eshop.composite.product \
--groupId=com.jun.eshop.composite.product \
--dependencies=actuator,webflux \
--version=1.0.0-SNAPSHOT \
product-composite-service

cd ..
