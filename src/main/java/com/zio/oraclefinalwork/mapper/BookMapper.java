package com.zio.oraclefinalwork.mapper;

import com.zio.oraclefinalwork.domain.Book;

public interface BookMapper {
    int insert(Book record);

    int insertSelective(Book record);
}