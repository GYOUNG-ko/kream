package com.kream.product;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {

	int cate1Insert(Category1DTO dto);
	
	
}
