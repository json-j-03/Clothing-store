package com.example.springapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.Model.cloth_model;
import com.example.springapp.Service.cloth_ser;
@RestController
@CrossOrigin
public class cloth_cont {

	@Autowired
	cloth_ser stuService;
	@PostMapping("/addDetails")
	public cloth_model addinfo(@RequestBody cloth_model st) {
		return stuService.saveDetails(st);
	}
	@GetMapping("/showDetails")
	public List<cloth_model> fetchDetails()
	{
		return stuService.getDetails();
	}
	@PutMapping("/updateDetails")
	public cloth_model updateInfo(@RequestBody cloth_model st1)
	{
		return stuService.updateDetails(st1);
	}
	@DeleteMapping("/deleteDetails/{cid}")
	public String deleteInfo(@PathVariable("cid") int cid) {
		stuService.deleteDetails(cid);
		
		return "Details is Deleted"; 
	}
	//sorting
	@GetMapping("/product/{field}")
	public List<cloth_model> getWithSort(@PathVariable String field) {
		return stuService.getSorted(field);
	}

	// pagination
	@GetMapping("/product/{offset}/{pageSize}")
	public List<cloth_model> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
		return stuService.getWithPagination(offset, pageSize);
	}
}