package com.kream.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class ProductService {
	@Autowired private ProductMapper mapper;
	
	// AJAX 사용
	public List<Category2DTO> subcateList(int num) {
		List<Category2DTO> dto = mapper.subcateList(num);
		return dto;
	}
	
	// 상품 등록
	public String insertProc(ProductDTO dto) {
		int result = mapper.productInsert(dto);
		if(result == 1)
			return "success";
		return "fail";
	}
	
	public void productList(Model model) {
		List<ProductDTO> product = mapper.productList();
		model.addAttribute("product", product);
	}
	
	// 카테고리1 등록
	public String cate1Proc(Category1DTO dto) {
		int result = mapper.cate1Insert(dto);
		if(result == 1)
			return "success";
		return "fail";
	}
	
	// 카테고리1 목록
	public void cate1List(Model model) {
		List<Category1DTO> cate1 = mapper.cate1List();
		model.addAttribute("cate1", cate1);
	}

	// 카테고리2 등록
	public String cate2Proc(Category2DTO dto) {
		int result = mapper.cate2Insert(dto);
		if(result == 1)
			return "success";
		return "fail";
	}
	
	public void cate2List(Model model) {
		List<Category2DTO> cate2 = mapper.cate2List();
		model.addAttribute("cate2", cate2);
	}

	// 브랜드 등록
	public String brandProc(BrandDTO dto) {
		int result = mapper.brandInsert(dto);
		if(result == 1)
			return "success";
		return "fail";
	}
	
	public void brandList(Model model) {
		List<BrandDTO> brand = mapper.brandList();
		model.addAttribute("brand", brand);
	}
	
	// 경매 등록
	public String addAuctionProc(AuctionDTO dto) {
		int result = mapper.addAuction(dto);
		if(result == 1)
			return "success";
		return "fail";
	}
	// 경매 현황 목록
	public void auctionStatusList(Model model) {
		List<AuctionDTO> status = mapper.auctionStatusList(model);
		model.addAttribute("status", status);
	}
	
	// 경매 목록 보기
	public void auctionList(Model model) {
		List<AuctionDTO> auction = mapper.auctionList();
		model.addAttribute("auction", auction);
	}

	// 파라미터 no받음 <오버로딩>
	public void productList(Model model, int no) {
		model.addAttribute("no", no);
	}
	
	public String editAuctionProc(AuctionDTO dto) {
		
		return "";
	}
	

	
}
