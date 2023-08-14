package com.gt.s.kos.login.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gt.s.kos.employee.vo.GtEmployeeVO;

@Repository
public class GtLoginDAOImpl implements GtLoginDAO {

	@Autowired(required = false)
	private SqlSession sqlSession;

	@Override
	public List<GtEmployeeVO> logincheck(GtEmployeeVO evo) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("logincheck", evo);
	}
}
