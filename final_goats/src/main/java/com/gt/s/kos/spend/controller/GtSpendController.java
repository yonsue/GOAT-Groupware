package com.gt.s.kos.spend.controller;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.gt.s.common.ChabunUtil;
import com.gt.s.common.CommonUtils;
import com.gt.s.common.DateFormatUtil;
import com.gt.s.common.FileUploadUtil;
import com.gt.s.common.K_Session;
import com.gt.s.common.chabun.service.GtChabunService;
import com.gt.s.kos.employee.service.GtEmployeeService;
import com.gt.s.kos.employee.vo.GtEmployeeVO;
import com.gt.s.kos.spend.service.GtSpendService;
import com.gt.s.kos.spend.vo.GtSpendVO;

@Controller
public class GtSpendController {
	
	private String gsnum = "";

	Logger log = LogManager.getLogger(this.getClass());
	
	@Autowired(required = false)
	private GtSpendService gtSpendService;
	
	@Autowired(required = false)
	private GtChabunService gtChabunService;
	
	@Autowired(required = false)
	private GtEmployeeService gtEmployeeService;
	
	@GetMapping(value = "spendInsertForm")
	public String spendInsertForm(HttpServletRequest q, GtSpendVO gvo, Model m, GtEmployeeVO evo) {
		
		K_Session ks = K_Session.getInstance();
		String genum = ks.getSession(q);
		if(genum != null) {
			evo.setGenum(genum);
			evo = gtEmployeeService.gecheck(evo);
			String gsname = evo.getGename() + "/" + evo.getGedept() + "/" + evo.getTitle();
			String gsnum = ChabunUtil.BIZ_GUBUN_SP + DateFormatUtil.ymdFormat() + gtChabunService.getGtSpendChabun().getGsnum();
			log.info("gsnum >> : " + gsnum);
				m.addAttribute("gsnum", gsnum);
				m.addAttribute("gsname", gsname);
				return "spend/spendinsertForm";

		}else {
			return "login/loginX";
		}
	}
		
		
		@GetMapping(value = "gtSpendInsert")
		@ResponseBody
		public String gtSpendInsert(GtSpendVO svo, Model m, HttpServletRequest req) {
			
			this.gsnum = null;
			
			this.gsnum = svo.getGsnum();
			svo.setGenum("123");
			
			log.info("svo.getGsnum() > : " + svo.getGsnum());
			log.info("svo.getGssubject() > : " + svo.getGssubject());
			log.info("svo.getGpnum() > : " + svo.getGpnum());
			log.info("svo.getGsdate() > : " + svo.getGsdate());
			log.info("svo.getGsgubun() > : " + svo.getGsgubun());
			log.info("svo.getGsaccount() > : " + svo.getGsaccount());
			log.info("svo.getGsinfo() > : " + svo.getGsinfo());
			log.info("svo.getGscount() > : " + svo.getGscount());
			log.info("svo.getGscost() > : " + svo.getGscost());
			log.info("svo.getGenum() > : " + svo.getGenum());
			log.info("svo.getWriter() > : " + svo.getWriter());
			log.info("svo.getReference() > : " + svo.getReference());
			log.info("svo.getApprover() > : " + svo.getApprover());
			log.info("svo.getDept() > : " + svo.getDept());

			
			int nCnt = gtSpendService.gtSpendInsert(svo);
			
			String str = "";
			
			  if(nCnt > 0 ) { 
			 
			  	str = "OK";
			 }else {
				 str = "NO";
			 }
			 		
			return str;
		}
	
		@PostMapping(value = "gtSpendFileupload")
		public String gtSpendFileupload(@RequestParam("gsfile") ArrayList<MultipartFile> files) {

			log.info("gtSpendFileupload() >>> : ");

			String fileNames = FileUploadUtil.fileupload(files, this.gsnum);
			log.info("fileNames > : " + fileNames);
			GtSpendVO svo = null;
			svo = new GtSpendVO();
			svo.setGsnum(this.gsnum);
			svo.setGsfile(fileNames);
			log.info("svo.getGsnum() > : " + svo.getGsnum());
			log.info("svo.getGsfile() > : " + svo.getGsfile());
			
			log.info(svo.getGsnum());
			
			int nCnt = gtSpendService.gtSpendInsertFile(svo);
			if (nCnt > 0) {
				
				return "business/businessInsert";
				
			}else {
				return "business/fail";
			}

		}
		
	    @GetMapping(value = "fileDownloadlist", produces = "application/x-www-form-urlencoded;charset=UTF-8")
	    @ResponseBody
	    public String fileDownloadList(HttpServletRequest q) {
	    	
	    	String num = q.getParameter("gsnum");
	    	String reString = "";
	        // 폴더에 있는 전체 파일 목록 가져오기
	        File path = new File(CommonUtils.SP_FILE_UPLOAD_PATH + "//" + num);
	        String[] fileList = path.list();
	        for(int i=0; i<fileList.length; i++) {
	        	reString += fileList[i] + ",";
	        }
	        
	        return reString;

	    }
	    // 파일 다운로드 처리
	    @GetMapping(value = "fileDownload")
	    public void fileDownload(@RequestParam String file, @RequestParam String num, HttpServletResponse s, HttpServletRequest q) {
	    	s.setContentType("text/html; charset=UTF-8");
	    	log.info("file > : " + file);
	    	log.info("gsnum > : " + num);
	    	
	    	boolean b = FileUploadUtil.filedownload(s, q, num, file);
	    	
	    	log.info("b > : " + b);
	    }
	    
	    @GetMapping(value = "testdownload")
	    public String testdownload() {
	    	
	    	log.info("testdownload() > : ");
	    	
	    	return "spend/spendselect";
	    }
}
