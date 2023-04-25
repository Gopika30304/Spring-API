package com.helmet.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helmet.demo.model.HelmetModel;
import com.helmet.demo.repository.HelmetRepository;

@Service

public class HelmetService {
	@Autowired
	HelmetRepository met;
	public List <HelmetModel> main(){
		return met.findAll();
	}
	public HelmetModel sub(HelmetModel h) {
		return met.save(h);
	}
	public HelmetModel dub(HelmetModel h) {
		return met.save(h);
	}
	public void del(int cost)
	{
		met.deleteById(cost);
	}


}
