package com.gt.s.kos.schedule.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gt.s.kos.schedule.dao.GtScheduleDAO;
import com.gt.s.kos.schedule.vo.GtScheduleVO;


@Service
@Transactional
public class GtScheduleServiceImpl implements GtScheduleService {
	
	@Autowired(required = false)
	private GtScheduleDAO gtScheduleDAO;

	@Override
	public List<GtScheduleVO> gtScheduleSelectAll(GtScheduleVO svo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GtScheduleVO> gtScheduleSelectVa(GtScheduleVO svo) {
		// TODO Auto-generated method stub
		return gtScheduleDAO.gtScheduleSelectVa(svo);
	}

}
