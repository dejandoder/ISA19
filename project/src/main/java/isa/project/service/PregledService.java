package isa.project.service;

import java.util.List;

import isa.project.model.Pregled;
import isa.project.repository.PregledRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PregledService {
	
	@Autowired
	private PregledRepository pregledRepository;
	
	public List<Pregled> findAll() {
		return pregledRepository.findAll();
	}

}