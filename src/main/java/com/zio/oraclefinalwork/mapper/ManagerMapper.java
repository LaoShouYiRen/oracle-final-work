package com.zio.oraclefinalwork.mapper;

import com.zio.oraclefinalwork.domain.Manager;

public interface ManagerMapper {
    int deleteByPrimaryKey(Long managerId);

    int insert(Manager record);

    int insertSelective(Manager record);

    Manager selectByPrimaryKey(Long managerId);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);
}