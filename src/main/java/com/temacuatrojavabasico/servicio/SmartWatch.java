package com.temacuatrojavabasico.servicio;

import com.temacuatrojavabasico.modelo.SmartDevice;

public class SmartWatch extends SmartDevice {
    private String metricaPai;
    private int correa;

    public SmartWatch() {
    }

    public SmartWatch(String marca, int modelo, int peso, long bateria, String metricaPai, int correa) {
        super(marca, modelo, peso, bateria);
        this.metricaPai = metricaPai;
        this.correa = correa;
    }

    public String getDetalles() {
        return (String.format("SmartWatch\nMarca: %s\nModelo: %d\nPeso: %dg\nBateria: %dmAH\n" +
                "MetricaPaid: %s\nCorrea: %d unidades", getMarca(), getModelo(), getPeso(), getBateria(), getMetricaPai(), getCorrea()));
    }

    public String getMetricaPai() {
        return metricaPai;
    }

    public void setMetricaPai(String metricaPai) {
        this.metricaPai = metricaPai;
    }

    public int getCorrea() {
        return correa;
    }

    public void setCorrea(int correa) {
        this.correa = correa;
    }
}