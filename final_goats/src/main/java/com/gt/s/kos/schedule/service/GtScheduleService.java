package com.gt.s.kos.schedule.service;

import java.util.List;

import com.gt.s.kos.schedule.vo.GtScheduleVO;

public interface GtScheduleService {
	
	public List<GtScheduleVO> gtScheduleSelectAll(GtScheduleVO svo);

	public List<GtScheduleVO> gtScheduleSelectVa(GtScheduleVO svo);
	
} // end of interface
