package com.zio.oraclefinalwork.mapper;

import com.zio.oraclefinalwork.domain.Category;
import java.math.BigDecimal;

public interface CategoryMapper {
    int deleteByPrimaryKey(BigDecimal categoryId);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(BigDecimal categoryId);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}