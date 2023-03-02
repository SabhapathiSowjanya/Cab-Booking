package com.cab.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cab.entity.Cab;
import com.cab.repository.CabRepository;


@Service
public class CabService {

	@Autowired
	CabRepository cabRepo;
	
	public Cab addCabDetails(Cab cab) {
		cab.setBooked(true);
		return cabRepo.save(cab);
	}
	
	public List<Cab> getAllCabs(){
		return (List<Cab>)cabRepo.findAll();
	}
	
	public Optional<Cab> getById(Integer cabId){
		return  cabRepo.findById(cabId);
	}
	
	public void deleteCabById(Integer cabId) {
		cabRepo.deleteById(cabId);
		
	}
	
	
	
}
