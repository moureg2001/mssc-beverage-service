package com.springframework.msscbeverageservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeverageDto {
    private UUID id;
    private Integer version;
    private String beverageName;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;
    private String beverageDescription;
    private BeverageEnum beverageStyle;
    private Long upc;
    private BigDecimal price;
    private Integer quantityOnHand;
}
