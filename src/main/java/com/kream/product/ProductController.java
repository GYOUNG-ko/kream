package com.kream.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("product")
public class ProductController {
	@Autowired private ProductService service;
	
	@RequestMapping("list")
	public String productList(Model model) {
		service.productList(model);
		return "product/productList";
	}
	
	@RequestMapping("insert")
	public String index(Model model) {
		service.cate1List(model);
		service.cate2List(model);
		service.brandList(model);
		return "product/InsertProduct";
	}
	
	@ResponseBody
	@RequestMapping("/getSubcategories")
	public List<Category2DTO> getSubcategories(@RequestParam("num") int num) {
		List<Category2DTO> dto = service.subcateList(num);
		return dto;
	}
	
	@RequestMapping("insertProc")
	private String insertProc(ProductDTO dto, Model model, RedirectAttributes ra) {
		String msg = service.insertProc(dto);
		
		if(msg.equals("success")) {
			ra.addFlashAttribute("msg", msg);
			return "redirect:list";
		}
		return "product/insert";
	}
	
	// 카테고리1
	@RequestMapping("InsertCategory1")
	public String InsertCategory1() {
		return "product/InsertCategory1";
	}
	
	@RequestMapping("InsertCategory1Proc")
	public String InsertCategory1Proc(Category1DTO dto, Model model, RedirectAttributes ra) {
		String msg = service.cate1Proc(dto);
		
		if(msg.equals("success")) {
			ra.addFlashAttribute("msg", msg);
			return "redirect:cate1List";
		}
		return "product/InsertCategory1";
	}
	
	@RequestMapping("cate1List")
	private String cate1List(Model model) {
		service.cate1List(model);
		return "product/cate1List";
	}
	
	// 카테고리2
	@RequestMapping("InsertCategory2")
	public String InsertCategory2(Model model) {
		service.cate1List(model);
		return "product/InsertCategory2";
	}
	
	@RequestMapping("InsertCategory2Proc")
	public String InsertCategory2Proc(Category2DTO dto, Model model, RedirectAttributes ra) {
		String msg = service.cate2Proc(dto);
		
		if(msg.equals("success")) {
			ra.addAttribute("msg", msg);
			return "redirect:cate2List";
		}
		return "product/InsertCategory2";
	}
	
	@RequestMapping("cate2List")
	private String cate2List(Model model) {
		service.cate2List(model);
		return "product/cate2List";
	}
	
	// 브랜드
	@RequestMapping("InsertBrand")
	public String InsertBrand(Model model) {
		return "product/InsertBrand";
	}
	
	@RequestMapping("InsertBrandProc")
	public String InsertBrandProc(BrandDTO dto, Model model, RedirectAttributes ra) {
		String msg = service.brandProc(dto);
		
		if(msg.equals("success")) {
			ra.addAttribute("msg", msg);
			return "redirect:brandList";
		}
		return "product/InsertBrand";
	}
	
	@RequestMapping("brandList")
	private String brandList(Model model) {
		service.brandList(model);
		return "product/brandList";
	}
	
}
