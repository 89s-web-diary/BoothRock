package com.multi.FM.booth;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.FM.myboothpage.BoothVO;



@Controller
public class BoothContoller {

//  @Autowired
//  BoothDAO dao;
//
//  // booth �� ������_booth����
//  @RequestMapping("/detail")
//  public String detail(Model model) throws Exception {
//    List<BoothVO> detail = dao.detail();
//    model.addAttribute("booth_detail", detail);
//    return "booth_detail";
//  }// detail
//
//  // booth �� ������_booth_product����
//  @RequestMapping("/product")
//  public String product(Model model) throws Exception {
//    List<BoothProductVO> product = dao.product();
//    model.addAttribute("booth_product", product);
//    return "booth_detail";
//  }// product
//
//  // booth �� ������_�ߺ��Ű�üũ
//  // 1 ID�� �� �ν� �Ű� �� ���� �� �� �ֵ��� ����
//  @RequestMapping("/duplicateReportCheck")
//  public String report(Model model, HttpSession session) {
//    String userId = (String) session.getAttribute("userId");
//    model.addAttribute("userId", userId);
//    return "booth_detail";
//  }// duplicateReportCheck



}// class
