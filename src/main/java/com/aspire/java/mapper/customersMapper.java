package com.aspire.java.mapper;

import com.aspire.java.entity.customers;

public interface customersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(customers record);

    int insertSelective(customers record);

    customers selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(customers record);

    int updateByPrimaryKey(customers record);
}