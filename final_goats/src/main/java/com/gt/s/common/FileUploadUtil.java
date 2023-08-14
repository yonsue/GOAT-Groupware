package com.gt.s.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public abstract class FileUploadUtil {

	private static Logger log = LogManager.getLogger(FileUploadUtil.class);
	public static String forderMaking(String num) {
		String fileload = CommonUtils.SP_FILE_UPLOAD_PATH+ "//" + num;
		File file = new File(fileload);
		
		if(file.mkdir() == true) {
			System.out.println("디렉토리 생성 성공");
		}else {
			System.out.println("디렉토리 생성 실패");
		}
		
		return fileload;
	}
	
	public static String fileupload(ArrayList<MultipartFile> files, String num) {
		
        String uploadPath = FileUploadUtil.forderMaking(num);
        log.info("uploadPath >> : " + uploadPath);
        String fileNames = "";
        
        ArrayList<String> FileNameList = new ArrayList<String>();
        for(MultipartFile file : files) {
            String FileName = file.getOriginalFilename();
            fileNames += FileName + ",";
            FileNameList.add(FileName);
            // 5. 파일 생성
            File file1 = new File(uploadPath + "//" + FileName);
            // 6. 서버로 전송
            try {
				file.transferTo(file1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				log.info("파일 저장시 에러 >>> : " + e.getMessage());
			}
        }
		
		return fileNames;
	}
	
	public static boolean filedownload(HttpServletResponse s, HttpServletRequest q, String num, String file) {
		
		boolean b = false;
		
		try {
			String filename = URLEncoder.encode(file, "UTF-8");
			
	        File f = new File(CommonUtils.SP_FILE_UPLOAD_PATH + "//" + num + "//" + file);
	        // file 다운로드 설정
	        s.setContentType("application/download");
	        s.setContentLength((int)f.length());
	        s.setHeader("Content-disposition", "attachment;filename=\"" + filename + "\";");
	        s.setHeader("Content-Transfer-Encoding", "binary");
	        // response 객체를 통해서 서버로부터 파일 다운로드
	        OutputStream os;
			try {
				os = s.getOutputStream();
				os.flush();
	        // 파일 입력 객체 생성
	        FileInputStream fis = new FileInputStream(f);
	        FileCopyUtils.copy(fis, os);
	        fis.close();
	        os.close();
	        b = true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				log.info("파일 다운로드 에러 >> : " + e.getMessage());
			}
			
			return b;
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			log.info("파일 다운로드 인코딩시 에러 > :" + e1.getMessage());
		}
		return b;

	}
	
	public static void main(String[] args) {
		forderMaking("SP202307070001");
	}
	
	
	
}
