package com.kream.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("product")
public class ProductController {
	@Autowired private ProductService service;
	
	@RequestMapping("list")
	public String list() {
		return "product/list";
	}
	
	@RequestMapping("insert")
	public String index() {
		return "product/InsertProduct";
	}
	
	@RequestMapping("InsertCategory1")
	public String InsertCategory1() {
		return "product/InsertCategory1";
	}
	
	@RequestMapping("InsertCategory1Proc")
	public String InsertCategory1Proc(Category1DTO dto, Model model, RedirectAttributes ra) {
		String msg = service.cate1Proc(dto);
		
		if(msg.equals("success")) {
			ra.addFlashAttribute("msg", msg);
			return "redirect:list";
		}
		return "product/InsertCategory1";
	}
	
	@RequestMapping("InsertCategory2")
	public String InsertCategory2() {
		String msg = service.cate2Proc();
		return "product/InsertCategory2";
	}
	
	@RequestMapping("InsertCategory2Proc")
	public String InsertCategory2Proc() {
		return "카테고리2 추가 성공";
	}
	
}
