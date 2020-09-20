package com.parking.web.rest;

import com.parking.domain.Estacionamento;
import com.parking.repository.EstacionamentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/estacionamentos/")
public class EstacionamentoResource {
    
    @Autowired
    private EstacionamentoRepository estacionamentoRepository;

    @PostMapping("/estacionamentos/")
    public Estacionamento createEstacionamento(@RequestBody Estacionamento estacionamento) {
        return estacionamentoRepository.save(estacionamento);
    }
}
