package com.gt.s.kos.vacation.service;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gt.s.kos.vacation.dao.GtVacationDAO;
import com.gt.s.kos.vacation.vo.GtVacationVO;

@Service
@Transactional
public class GtVacationServiceImpl implements GtVacationService {
	Logger log = LogManager.getLogger(this.getClass());
	
	@Autowired(required = false)
	private GtVacationDAO gtVacationDAO;
	
	@Override
	public int gtVacationInsert(GtVacationVO gvvo) {
		// TODO Auto-generated method stub
		log.info("gtVacationInsert  진입 > :");
		return gtVacationDAO.gtVacationInsert(gvvo);
	}

	@Override
	public int gtVacationInsertFile(GtVacationVO vvo) {
		// TODO Auto-generated method stub
		log.info("gtVacationInsertFile  진입 > :");
		return gtVacationDAO.gtVacationInsertFile(vvo);
	}


	
}
