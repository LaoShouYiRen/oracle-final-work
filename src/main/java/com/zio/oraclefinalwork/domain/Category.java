package com.zio.oraclefinalwork.domain;

import java.math.BigDecimal;

public class Category {
    private BigDecimal categoryId;

    private String categoryName;

    public BigDecimal getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(BigDecimal categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }
}