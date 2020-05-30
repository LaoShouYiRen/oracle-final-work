package com.zio.oraclefinalwork.mapper;

import com.zio.oraclefinalwork.domain.BorrowRecord;

public interface BorrowRecordMapper {
    int insert(BorrowRecord record);

    int insertSelective(BorrowRecord record);
}