package com.gt.s.kos.spend.service;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gt.s.kos.spend.dao.GtSpendDAO;
import com.gt.s.kos.spend.vo.GtSpendVO;

@Service
@Transactional
public class GtSpendServiceImpl implements GtSpendService {

	Logger log = LogManager.getLogger(this.getClass());
	
	@Autowired(required = false)
	private GtSpendDAO gtSpendDAO;

	@Override
	public int gtSpendInsert(GtSpendVO svo) {
		// TODO Auto-generated method stub
		log.info("svo.getReference() > : " + svo.getReference());
		return gtSpendDAO.gtSpendInsert(svo);
	}

	@Override
	public int gtSpendInsertFile(GtSpendVO svo) {
		// TODO Auto-generated method stub
		return gtSpendDAO.gtSpendInsertFile(svo);
	}
}
