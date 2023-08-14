package com.gt.s.kos.business.contoller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gt.s.common.ChabunUtil;
import com.gt.s.common.CommonUtils;
import com.gt.s.common.DateFormatUtil;
import com.gt.s.common.FileUploadUtil;
import com.gt.s.common.ImgUploadUtil;
import com.gt.s.common.chabun.service.GtChabunService;
import com.gt.s.kos.business.service.GtBusinessService;
import com.gt.s.kos.business.vo.GtBusinessVO;



@Controller
public class GtBusinessController {

	private String chabun;
	
	Logger log = LogManager.getLogger(GtBusinessController.class);
	
	@Autowired(required = false)
	private GtBusinessService gtBusinessService;
	

	@Autowired(required = false)
	private GtChabunService gtChabunService;
	
	@GetMapping("gtBusinessInsertForm")
	public String gtBusinessInsertForm() {
		
		return "business/businessInsertForm";
	}
	
	@GetMapping("gtBusinessInsert")
	@ResponseBody
	public String gtBusinessInsert(GtBusinessVO buvo, Model m, HttpServletRequest req) {
		
		this.chabun = null;
		
		this.chabun = buvo.getGbtnum();
		
		String gdr_approver1 = req.getParameter("approver1");
		String gdr_approver2 = req.getParameter("approver2");
		String gdr_approver3 = req.getParameter("approver3");
		String gdr_approver4 = req.getParameter("approver4");
		String gdr_approver5 = req.getParameter("approver5");
		
		String gdr_approver = gdr_approver1 + "/" + gdr_approver2 + "/" + gdr_approver3 + "/" + gdr_approver4 + "/" + gdr_approver5 + "/"; 
		
		String gdr_dept1 = req.getParameter("dept1");
		String gdr_dept2 = req.getParameter("dept2");
		String gdr_dept3 = req.getParameter("dept3");
		String gdr_dept4 = req.getParameter("dept4");
		String gdr_dept5 = req.getParameter("dept5");
		
		String gdr_dept = gdr_dept1 + "/" + gdr_dept2 + "/" + gdr_dept3 + "/" + gdr_dept4 + "/" + gdr_dept5 + "/"; 
		log.info(gdr_approver);
		
		
		buvo.setGenum("1234");
		buvo.setApprover(gdr_approver);
		buvo.setDept(gdr_dept);
		
		log.info(" >>> : " + gdr_approver);
		log.info(">>> : " + buvo.getGenum());
		log.info(">>>:"+  buvo.getGbtnum());
		log.info(">>>:"+  buvo.getGbtname());
		log.info(">>> : " + req.getParameter("reference1"));
		log.info(">>>> : " + buvo.getGbttotalprice());
		log.info(">>> : " + buvo.getReference());
		
		
		int nCnt = gtBusinessService.gtBusinessInsert(buvo);
		
		String str = "";
		
		  if(nCnt > 0 ) { 
		 
		  	str = "OK";
		 }else {
			 str = "NO";
		 }
		 		
		return str;
	}
	
	@GetMapping("gtBusinessChanbun")
	@ResponseBody
	public String gtBusinessChanbun() {
		
		String gbt_num = ChabunUtil.BIZ_GUBUN_BU.concat(DateFormatUtil.ymdFormats("D")).concat(gtChabunService.getGtBusinessChabun().getGbtnum());
		
		return gbt_num;
	}
	
	@PostMapping("gtBusinessInsertFile")
	public String gtBusinessInsertFile(HttpServletRequest req) {
		
		
		
		ImgUploadUtil fr = new ImgUploadUtil(CommonUtils.BU_IMG_UPLOAD_PATH, CommonUtils.BU_IMG_FILE_SIZE, CommonUtils.BU_EN_CODE);
		
		boolean bool = fr.imgfileUpload(req);
		
		GtBusinessVO buvo = new GtBusinessVO();
		
		buvo.setGbtnum(this.chabun);
		buvo.setGbtfile(fr.getFileName("gbtfile"));
		
		
		log.info(buvo.getGbtnum());
		
		int nCnt = gtBusinessService.gtBusinessInsertFile(buvo);
		if (nCnt > 0) {
			
			return "business/businessInsert";
			
		}else {
			return "business/fail";
		}
		
	}
	
	@GetMapping("gtBusinessSelectAll")
	public String gtBusinessSelectAll(HttpServletRequest req, Model m, GtBusinessVO buvo) {
		
		List<GtBusinessVO> aList = gtBusinessService.gtBusinessSelectAll(buvo);
		
		if (aList.size() > 0) {
			
			m.addAttribute("aList", aList);
			return "business/businessSelectAll";
		}else {
			return "business/fail";
		}
		
	}
	
	@GetMapping("gtBusinessSelect")
	public String gtBusinessSelect(HttpServletRequest req, Model m, GtBusinessVO buvo) {
		
		List<GtBusinessVO> list = gtBusinessService.gtBusinessSelect(buvo);
		
		if(list.size() > 0) {
			
			m.addAttribute("list",list);
			
			return "business/businessSelect";

		}else {
			
			return "business/fail";
		}
		
	}
	
	
	@GetMapping("gtBusinessUpdate")
	public String gtBusinessUpdate(HttpServletRequest req, Model model, GtBusinessVO buvo) {
		
		int nCnt = gtBusinessService.gtBusinessUpdate(buvo);
		
		if(nCnt > 0) {
			
			return "business/sellectAll";
			
		}else {
			
			return "business/fail";
		}

	}
	
}
