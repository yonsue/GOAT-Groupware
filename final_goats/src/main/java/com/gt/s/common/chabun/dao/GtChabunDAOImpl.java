package com.gt.s.common.chabun.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gt.s.kos.business.vo.GtBusinessVO;
import com.gt.s.kos.contract.vo.GtContractVO;
import com.gt.s.kos.draft.vo.GtDraftVO;
import com.gt.s.kos.employee.vo.GtEmployeeVO;
import com.gt.s.kos.project.vo.GtProjectVO;
import com.gt.s.kos.resignation.vo.GtResignationVO;
import com.gt.s.kos.spend.vo.GtSpendVO;
import com.gt.s.kos.vacation.vo.GtVacationVO;


@Repository
public class GtChabunDAOImpl implements GtChabunDAO {

	@Autowired(required = false)
	private SqlSessionTemplate sqlSession;
	
	@Override
	public GtVacationVO getGtVacationChabun() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("getGtVacationChabun");
	}

	@Override
	public GtBusinessVO getGtBusinessChabun() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("getGtBusinessChabun");
	}

	@Override
	public GtSpendVO getGtSpendChabun() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("getGtSpendChabun");
	}

	@Override
	public GtProjectVO getGtProjectChabun() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("getGtProjectChabun");
	}
	@Override
	public GtDraftVO getGtDraftChabun() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("getGtDraftChabun");
	}

	@Override
	public GtResignationVO getGtResignationChabun() {
		
		return sqlSession.selectOne("getGtResignationChabun");
	}
	
		@Override
	public GtEmployeeVO getGtEmployeeChabun() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("getGtEmployeeChabun");
	}

	public GtContractVO getGtContractChabun() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("getGtContractChabun");
	}
}
