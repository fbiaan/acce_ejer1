package com.ejercicio;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/apiCli")
public class ClientBankController {

	@Autowired
	private ClientBankService clientbankService;

	@Autowired
	private ClientBankRepository clientbankRepository;
	
    @GetMapping("/getAll")
    public List<ClientBank> list(){
        return clientbankRepository.findAll();
    }

    @GetMapping("/prueba")
    public String prueba() {
    	return "hola ejercicio";
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClientBank> get(@PathVariable Integer id) {
        try {
        	ClientBank clientBank = clientbankService.get(id);
            return new ResponseEntity<ClientBank>(clientBank, HttpStatus.OK);

        } catch (NoSuchElementException e) {
            return new ResponseEntity<ClientBank>(HttpStatus.NOT_FOUND);
        }
    }

}
