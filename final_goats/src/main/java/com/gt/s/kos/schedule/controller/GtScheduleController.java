package com.gt.s.kos.schedule.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.gt.s.kos.schedule.service.GtScheduleService;
import com.gt.s.kos.schedule.vo.GtScheduleVO;


@Controller
public class GtScheduleController {
   Logger log = LogManager.getLogger(GtScheduleController.class);
   
   
   @Autowired(required = false)
   private GtScheduleService gtScheduleService;
   
   @PostMapping("gtScheduleSelect")
   public String gtScheduleSelect(HttpServletRequest req, Model m, GtScheduleVO svo) {

      log.info(svo.getGpstart());
      
      List<GtScheduleVO> listVa = gtScheduleService.gtScheduleSelectVa(svo);
      
      String selectday = req.getParameter("selectday");
      
      log.info("컨트롤러에서 받은 dd >> selectday >>> : " +selectday);
      
      m.addAttribute("selectday", selectday);
      m.addAttribute("listVa", listVa);
      
      

         return "/main/mainpage";
         

   } // end of gtScheduleSelect 
   
} // end of class