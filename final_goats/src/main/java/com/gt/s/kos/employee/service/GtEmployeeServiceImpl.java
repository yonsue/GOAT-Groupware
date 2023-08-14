package com.gt.s.kos.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gt.s.kos.employee.dao.GtEmployeeDAO;
import com.gt.s.kos.employee.vo.GtEmployeeVO;



@Service
@Transactional
public class GtEmployeeServiceImpl implements GtEmployeeService {

	@Autowired(required = false)
	private GtEmployeeDAO gtEmployeeDAO;

	@Override
	public GtEmployeeVO genumcheck(GtEmployeeVO evo) {
		
		System.out.println(evo.getGeid());
		
		return gtEmployeeDAO.genumcheck(evo);
	}

	@Override
	public GtEmployeeVO goatempidcheck(GtEmployeeVO evo) {
		// TODO Auto-generated method stub
		return gtEmployeeDAO.goatempidcheck(evo);
	}
	
	@Override
	public List<GtEmployeeVO> goatsEmployeeSelect(GtEmployeeVO evo) {
		// TODO Auto-generated method stub
		System.out.println("GoatsEmployeeServiceImpl.goatsEmployeeSelect 함수 진입");
		return gtEmployeeDAO.goatsEmployeeSelect(evo);
	}

	@Override
	public List<GtEmployeeVO> gtEmployeeIdcheck(GtEmployeeVO evo) {
		// TODO Auto-generated method stub
		return gtEmployeeDAO.gtEmployeeIdcheck(evo);
	}

	@Override
	public int gtEmployeeInsert(GtEmployeeVO evo) {
		// TODO Auto-generated method stub
		return gtEmployeeDAO.gtEmployeeInsert(evo);
	}

	@Override
	public int gtEmployeeFileInsert(GtEmployeeVO evo) {
		// TODO Auto-generated method stub
		return gtEmployeeDAO.gtEmployeeFileInsert(evo);
	}

	@Override
	public List<GtEmployeeVO> gtEmployeeDecianotherSelect(GtEmployeeVO evo) {
		// TODO Auto-generated method stub
		return gtEmployeeDAO.gtEmployeeDecianotherSelect(evo);
	}

	@Override
	public GtEmployeeVO gecheck(GtEmployeeVO evo) {
		// TODO Auto-generated method stub
		return gtEmployeeDAO.gecheck(evo);
	}
}
