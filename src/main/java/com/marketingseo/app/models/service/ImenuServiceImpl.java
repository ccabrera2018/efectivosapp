package com.marketingseo.app.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marketingseo.app.models.dao.IMenuDao;
import com.marketingseo.app.models.entity.Menu;


@Service
public class ImenuServiceImpl implements IMenuServices {

	@Autowired
	private IMenuDao menuDao;
	
	@Transactional
	public void save(Menu menu) {
		menuDao.save(menu);
		
	}

}
