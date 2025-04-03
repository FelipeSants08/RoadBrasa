package com.br.road_brasa_api.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.road_brasa_api.model.Viagem;
import com.br.road_brasa_api.repository.ViagemRepository;

@RestController
@RequestMapping("/viagem")
public class ViagemController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private ViagemRepository repository;

    public List<Viagem> index() {
        log.info("Busacando Viagem");
        return repository.findAll();
    }

}
