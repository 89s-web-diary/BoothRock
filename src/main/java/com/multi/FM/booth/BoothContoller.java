package com.multi.FM.booth;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.FM.myboothpage.BoothVO;

@Controller 
public class BoothContoller {
//
//	@Autowired
//	boothDAO dao;
//		
//	@Autowired
//	BoothVO bvo;
//	
//	//booth �� ������_booth����
//	@RequestMapping("/detail")
//	public String detail(Model model) throws Exception {
//        List<BoothVO> detail = dao.detail();
//        model.addAttribute("booth_detail", detail);
//        return "booth_detail"; // ��ȯ������ View �̸� ��ȯ
//    }//detail
//	
//	//booth �� ������_booth_product����
//	@RequestMapping("/product")
//	public String product(Model model) throws Exception {
//        List<BoothProductVO> product = dao.product();
//        model.addAttribute("booth_product", product);
//        return "booth_product"; // ��ȯ������ View �̸� ��ȯ
//    }//product
//	
}//class
