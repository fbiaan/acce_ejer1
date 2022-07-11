package com.ejercicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientBankService {

	@Autowired
	private ClientBankRepository clientbankRepository;
	
	public List<ClientBank> listAll(){
		return clientbankRepository.findAll();
	}
	
	public ClientBank get(Integer id){
	       return clientbankRepository.findById(id).get();
	}


}

