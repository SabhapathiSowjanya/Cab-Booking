package com.cab.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cab.entity.Cab;
import com.cab.service.CabService;



@RestController
@RequestMapping("/cabRegister")
public class CabController {

	@Autowired
	CabService cabSer;
	
	@PostMapping("/addCab")
	public ResponseEntity<String> addCabDetails(@RequestBody Cab cab)
	{
		Cab obj=cabSer.addCabDetails(cab);
		return new ResponseEntity<String>("Cab Id is "+obj.getCabId(),HttpStatus.OK);
	}
	
	@GetMapping("/getAllCabs")
	public ResponseEntity<List<Cab>> getDetails()
	{
		List<Cab> cabResponse = cabSer.getAllCabs();
		return new ResponseEntity<List<Cab>>(cabResponse,HttpStatus.OK);
	}
	
	@GetMapping("/getByCabId/{cabId}")
	public Optional<Cab> getUserID(@PathVariable("cabId") Integer cabId ){
		return cabSer.getById(cabId);
	}
	
	@DeleteMapping("/deleteCab")
	public ResponseEntity<String> deleteExpenseById(@RequestParam("cabId") Integer cabId) {
		cabSer.deleteCabById(cabId);
		return new ResponseEntity<String>("Deleted Successfully",HttpStatus.OK);
	}
}
