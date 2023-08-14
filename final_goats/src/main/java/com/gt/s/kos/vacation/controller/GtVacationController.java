package com.gt.s.kos.vacation.controller;

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
import com.gt.s.kos.vacation.service.GtVacationService;
import com.gt.s.kos.vacation.vo.GtVacationVO;


@Controller
public class GtVacationController {
	
	Logger log = LogManager.getLogger(this.getClass());
	
	private String chabun;
	
	
	@Autowired(required = false)
	private GtVacationService gtVacationService;
	
	@Autowired(required = false)
	private GtChabunService gtChabunService;
	
	@GetMapping("gtVacationChanbun")
	@ResponseBody
	public String gtVacationChanbun() {
		
		log.info("test >> :");
		
		String gbt_num = ChabunUtil.BIZ_GUBUN_BU.concat(DateFormatUtil.ymdFormats("D")).concat(gtChabunService.getGtVacationChabun().getGvnum());
		
		return gbt_num;
	}

	@PostMapping("gtVacationInsertFile") // < 파일을 먼저 넣는다.
	public String gtVacationInsertFile(HttpServletRequest req) { // 함수는 xml 연결
		
		log.info("gtVacationInsertFile > : 진입");
		
		ImgUploadUtil fu= new ImgUploadUtil(CommonUtils.VA_IMG_UPLOAD_PATH, CommonUtils.VA_IMG_FILE_SIZE, CommonUtils.VA_EN_CODE);
		
		boolean bool = fu.imgfileUpload(req);

		GtVacationVO vvo = new GtVacationVO();
		
		vvo.setGvnum(this.chabun);
		vvo.setGvfile(fu.getFileName("gvfile")); // 파일 이름만저장하는 것
	
		log.info(vvo.getGvnum());
		log.info(vvo.getGvfile());
		
		int nCnt = gtVacationService.gtVacationInsertFile(vvo);
		
		if(nCnt > 0) {
			return "vacation/vacationInsert";
			
		}else {
			return "vacation/fail";
			
		}
	
	}
	
	@GetMapping("gtVacationInsert")
	@ResponseBody
	public String gtVacationInsert(GtVacationVO vvo, HttpServletRequest req) {
		
		log.info("chabunInsert 진입 > ㅣ:");
		
		this.chabun = null;
		
		this.chabun = vvo.getGvnum();
		
		// VO에 이름이 없어서 req/getParameter해서 값을 세팅해줬다.
		String gvapprover1 = req.getParameter("approver1");
		String gvapprover2 = req.getParameter("approver2");
		String gvapprover3 = req.getParameter("approver3");
		String gvapprover4 = req.getParameter("approver4");
		String gvapprover5 = req.getParameter("approver5");
		// String gehp = req.getParameter("gehp");
		

		String gvapprover = gvapprover1 + "/" + gvapprover2 + "/" + gvapprover3 + "/" + gvapprover4 + "/" + gvapprover5;
		
		log.info(gvapprover);
		String gvdept1 = req.getParameter("dep1");
		String gvdept2 = req.getParameter("dep2");
		String gvdept3 = req.getParameter("dep3");
		String gvdept4 = req.getParameter("dep4");
		String gvdept5 = req.getParameter("dep5");
		
		String gvdetp = gvdept1 + "/" + gvdept2 + "/" + gvdept3 + "/" + gvdept4 + "/" + gvdept5;
		
		String gvwriter = req.getParameter("writer");
		log.info(gvwriter);

		
		// 연락처
		String gvgehp = req.getParameter("gehp");
		log.info("연락처 > : " + gvgehp);
		
		// vvo.setGvnum("1234"); 나중에 세션부여가 되면 지워줘야함 : 임시로 값을 지정해준 상태
		// 사번
		vvo.setGenum("1234");
		vvo.setApprover(gvapprover);
		vvo.setDept(gvdetp);
		log.info(" >>> : " + gvapprover);
		log.info(" >>> : " + gvdetp);
		
		// 제목, 사유, 구분, 비고
		String gvsubject = vvo.getGvsubject();
		String gvreasons = vvo.getGvreasons();
		String gvtype = vvo.getGvtype();
		String gvmemo = vvo.getGvmemo();
		String gvdays = vvo.getGvdays();
		
		log.info("제목 > : " + gvsubject);
		log.info("사유 > : " + gvreasons);
		log.info("구분 > : " + gvtype);
		log.info("비고 > : " + gvmemo);
		log.info("기간 > : " + gvdays);
		
		
		
		// String 변수 명= vvo.get가져오고싶은 값();
		int nCnt = gtVacationService.gtVacationInsert(vvo);
		
		log.info("nCnt : " + nCnt);

		if(nCnt > 0) {
			// ajax return은 return에 사용한 값이 나옴
			// 원래는 return에 view 페이지 명을 찾아서 갔었음
			
			return "OK";
			
		}else {
			
			return "NO";
		}
		
		
		
	}
	
	@GetMapping("gtVacationInsertForm")
	// @ResponseBody <<< ajax에서만 쓰는거
	public String gtVacationInsertForm() {
		
		return "vacation/vacationInsertForm";
	}
	
}
