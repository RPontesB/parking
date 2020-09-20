package com.parking.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estacionamento")
public class Estacionamento {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @Column(name = "placa")
    private String placa;

    @Column(name = "entrada")
    private LocalDateTime entrada;

    @Column(name = "pago")
    private Boolean pago;

    @Column(name = "saiu")
    private Boolean saiu;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
    }

    public Boolean getPago() {
        return pago;
    }

    public void setPago(Boolean pago) {
        this.pago = pago;
    }

    public Boolean getSaiu() {
        return saiu;
    }

    public void setSaiu(Boolean saiu) {
        this.saiu = saiu;
    }
}
