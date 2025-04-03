package com.br.road_brasa_api.model;

import java.time.LocalDate;

public class Viagem {
    
    private Long id;
    private String destino;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    
    public Viagem(Long id, String destino, LocalDate dataInicio, LocalDate dataTermino) {
        this.id = id;
        this.destino = destino;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
    }

    public Long getId() {
        return id;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    

    

}
