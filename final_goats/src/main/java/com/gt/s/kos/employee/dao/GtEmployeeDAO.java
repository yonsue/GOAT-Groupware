package com.gt.s.kos.employee.dao;

import java.util.List;

import com.gt.s.kos.employee.vo.GtEmployeeVO;


public interface GtEmployeeDAO {
	
	public GtEmployeeVO genumcheck(GtEmployeeVO evo);
	public GtEmployeeVO goatempidcheck(GtEmployeeVO evo);
	public List<GtEmployeeVO> goatsEmployeeSelect(GtEmployeeVO evo);
	public List<GtEmployeeVO> gtEmployeeIdcheck(GtEmployeeVO evo);
	public int gtEmployeeInsert(GtEmployeeVO evo);
	public int gtEmployeeFileInsert(GtEmployeeVO evo);
	public List<GtEmployeeVO> gtEmployeeDecianotherSelect(GtEmployeeVO evo);
	public GtEmployeeVO gecheck(GtEmployeeVO evo);
}
