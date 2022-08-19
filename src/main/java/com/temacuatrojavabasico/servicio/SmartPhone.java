package com.temacuatrojavabasico.servicio;

import com.temacuatrojavabasico.modelo.SmartDevice;

public class SmartPhone extends SmartDevice {
    private int camaraTrasera;
    private String companiaTelefonica;

    public SmartPhone() {
    }

    public SmartPhone(String marca, int modelo, int peso, long bateria, int camaraTrasera, String companiaTelefonica) {
        super(marca, modelo, peso, bateria);
        this.camaraTrasera = camaraTrasera;
        this.companiaTelefonica = companiaTelefonica;
    }

    public String getDetalles() {
        return (String.format("SmartPhone\nMarca: %s \nModelo: %dsPro\nPeso: %dg\nbateria: %dmAH\n" +
                "Camara Trasera: %dMP camara triple\nCompania Telefonica: %s", getMarca(), getModelo(), getPeso(), getBateria(), getCamaraTrasera(), getCompaniaTelefonica()));
    }

    public int getCamaraTrasera() {
        return camaraTrasera;
    }

    public void setCamaraTrasera(int camaraTrasera) {
        this.camaraTrasera = camaraTrasera;
    }

    public String getCompaniaTelefonica() {
        return companiaTelefonica;
    }

    public void setCompaniaTelefonica(String companiaTelefonica) {
        this.companiaTelefonica = companiaTelefonica;
    }
}