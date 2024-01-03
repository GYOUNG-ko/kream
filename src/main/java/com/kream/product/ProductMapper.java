package com.kream.product;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {

	List<Category2DTO> subcateList(int num);

	int productInsert(ProductDTO dto);

	List<ProductDTO> productList();

	int cate1Insert(Category1DTO dto);

	List<Category1DTO> cate1List();

	int cate2Insert(Category2DTO dto);

	List<Category2DTO> cate2List();

	int brandInsert(BrandDTO dto);

	List<BrandDTO> brandList();



}
