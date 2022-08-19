package com.temacuatrojavabasico.modelo;

public class SmartDevice {
    private String marca;
    private int modelo;
    private int peso;
    private long bateria;

    public SmartDevice() {
    }

    public SmartDevice(String marca, int modelo, int peso, long bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.bateria = bateria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public long getBateria() {
        return bateria;
    }

    public void setBateria(long bateria) {
        this.bateria = bateria;
    }
}