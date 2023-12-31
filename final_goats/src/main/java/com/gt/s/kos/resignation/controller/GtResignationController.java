package com.gt.s.kos.resignation.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gt.s.common.ChabunUtil;
import com.gt.s.common.CommonUtils;
import com.gt.s.common.DateFormatUtil;
import com.gt.s.common.FileUploadUtil;
import com.gt.s.common.ImgUploadUtil;
import com.gt.s.common.chabun.service.GtChabunService;
import com.gt.s.kos.resignation.service.GtResignationService;
import com.gt.s.kos.resignation.vo.GtResignationVO;

@Controller
public class GtResignationController {
	
	
	private String chabun;

	Logger logger = LogManager.getLogger(GtResignationController.class);
	
	@Autowired(required=false)
	private GtResignationService gtResignationService;
	
	@Autowired(required=false)
	private GtChabunService gtChabunService;
	
	// 사직서 입력폼
	@GetMapping("resignationInsertForm")
	public String resignationInsertForm() {
		
		logger.info(">>> resignationInsertForm() In");
		
		return "resignation/resignationInsertForm";
		
	} // end of resignationForm()
	
	
	// 사직서 입력폼에서 ajax
	@GetMapping("gtResignationChanbun")
	@ResponseBody
	public String gtResignationChanbun() {
		
		logger.info(">>> gtResignationChanbun() In");
		
		this.chabun =  ChabunUtil.BIZ_GUBUN_RE.concat(DateFormatUtil.ymdFormats("D")).concat(gtChabunService.getGtResignationChabun().getGrnum());
		
		logger.info(">>> gtResignationChanbun() :: grnum : " + chabun);
		
		return chabun;
	}
	
	@GetMapping("resignationInsert")
	@ResponseBody
	public String resignationInsert(GtResignationVO rvo) {
		
		logger.info(">>> resignationInsert() In");
		
		this.chabun = null;
		
		this.chabun = rvo.getGrnum();
		logger.info(">>> resignationInsert() In :: grnum : " + chabun);
//		String gr_startdate = rvo.getGr_();
//		String gr_enddate = rvo.getGr_num();
//		String gr_subject = rvo.getGr_num();
//		String gr_memo = rvo.getGr_num();
//		String gr_file = rvo.getGr_num();
//		String insertdate = rvo.getGr_num();
//		String updatedate = rvo.getGr_num();
//		String deleteyn = rvo.getGr_num();
//		String dept = rvo.getGr_num();
//		String title = rvo.getGr_num();
//		String ge_num = rvo.getGr_num();
//		String ge_name = rvo.getGr_num();
//		String ge_dept = rvo.getGr_num();
//		String reference = rvo.getGr_num();
//		String gdr_dept = rvo.getGr_num();
//		String gdr_poroval = rvo.getGr_num();
//		String gta_count = rvo.getGr_num();
		
		GtResignationVO _rvo = null;
		_rvo = new GtResignationVO();
		
		_rvo.setGrnum(chabun);
		
		int nCnt = gtResignationService.gtResignationInsert(_rvo);
		
		logger.info(">>> resignationInsert() In :: nCnt : " + nCnt);
		
		if(nCnt > 0) {
			return "YES";
		}else {
			
			return "NO";			
		}
		
	} // end of resignationInsert()
	
	// file insert
	@PostMapping("gtResignationInsertFile")
	public String gtResignationInsertFile(HttpServletRequest req) {
		
		logger.info(">>> gtResignationInsertFile() In");		
		
		ImgUploadUtil fu = new ImgUploadUtil( CommonUtils.RE_IMG_UPLOAD_PATH, 
												CommonUtils.RE_IMG_FILE_SIZE, 
												CommonUtils.RE_EN_CODE);
		
		logger.info(">>> resignationInsertFile() In :: grnum : " + this.chabun);
		
		boolean bool = fu.imgfileUpload(req);
		
		logger.info(">>> resignationInsertFile() In :: bool : " + bool);
		String grfile = fu.getFileName("grfile");
		
		logger.info(">>> resignationInsertFile() In :: grfile : " + grfile);
		
		GtResignationVO _rvo = null;
		_rvo = new GtResignationVO();
		
		_rvo.setGrnum(this.chabun);
		_rvo.setGrfile(grfile);
		
		int nCnt = gtResignationService.gtResignationInsertFile(_rvo);
		
		logger.info(">>> gtResignationInsertFile() :: nCnt : " + nCnt);
		
		return "resignation/resignationInsert";
	} // end of gtResignationInsertFile()
	
	
	
	

	
	
}
