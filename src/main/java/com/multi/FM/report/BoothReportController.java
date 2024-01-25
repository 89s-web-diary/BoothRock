package com.multi.FM.report;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.multi.FM.review.BoothReviewVO;


@Controller
@RequestMapping("report")
public class BoothReportController {

  @Autowired
  BoothReportDAO dao;
  
  @Autowired
  BoothReportService reportSV;
  
  @RequestMapping("duplicate_report_check")
  public String duplicateReportCheck(@RequestParam("booth_no") int booth_no, HttpSession session,
                                     RedirectAttributes redirectAttributes, Model model) { 
   
        String user_id = (String) session.getAttribute("id");
        boolean isDuplicate = reportSV.checkDuplicateReport(user_id, booth_no);
        if (isDuplicate) {
            // 중복이면 에러 메시지
          session.setAttribute("showAlert", true);
            return "report/booth_report";
        } 
        model.addAttribute("booth_no", booth_no);
        return "report/booth_report";
  }
  
  @PostMapping("insertReport")
  public String submitReport(@RequestParam("report_title") String report_title,
                             @RequestParam("report_comment") String report_comment,
                             @RequestParam("user_id") String user_id,
                             @RequestParam("booth_no") int booth_no, HttpSession session,
                             Model model) {
      reportSV.insertReport(report_title, report_comment, booth_no, user_id);
      session.setAttribute("showAlert", true);
      return "redirect:/booth/booth_detail?booth_no=" + booth_no;
  }
  
  
  @RequestMapping("booth_detail_report")
  public String booth_detail_report(@RequestParam("booth_no") int booth_no, Model model) {
      BoothReportVO boothDetailReport = reportSV.boothDetailReport(booth_no);
      model.addAttribute("boothDetailReport", boothDetailReport);
      return "report/booth_detail_report"; 
  }
}
