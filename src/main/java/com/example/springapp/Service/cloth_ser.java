package com.example.springapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.springapp.Model.cloth_model;
import com.example.springapp.Repository.cloth_rep;

@Service
public class cloth_ser {
	@Autowired
	cloth_rep stRepo;
	
	public cloth_model saveDetails(cloth_model e)
	{
		return stRepo.save(e);
	}
	public List<cloth_model> getDetails()
	{
		return stRepo.findAll();
	}
	public cloth_model updateDetails(cloth_model e1)
	{
		return stRepo.saveAndFlush(e1);
	}
	public void deleteDetails(int cid)
	{
		stRepo.deleteById(cid);
	}
	public List<cloth_model> getSorted(String field) {
		return stRepo.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	
	public List<cloth_model> getWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
		Page<cloth_model> page =stRepo.findAll(PageRequest.of(offset, pageSize));
		return page.getContent();
	}

}