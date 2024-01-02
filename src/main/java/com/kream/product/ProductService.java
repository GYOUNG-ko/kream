package com.kream.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired private ProductMapper mapper;

	public String cate1Proc(Category1DTO dto) {
		int result = mapper.cate1Insert(dto);
		if(result == 1)
			return "success";
		return "fail";
	}

	public String cate2Proc() {
		return null;
	}
	
	
}
