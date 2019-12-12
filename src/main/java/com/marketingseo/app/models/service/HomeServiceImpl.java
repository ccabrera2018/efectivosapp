package com.marketingseo.app.models.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marketingseo.app.models.dao.IHomeDao;
import com.marketingseo.app.models.entity.Home;


@Service
public class HomeServiceImpl implements IHomeServices{
	
	
	@Autowired
	private IHomeDao  homeDao;

	@Override
	@Transactional
	public void save(Home home) {
		homeDao.save(home);
		
	}

}
