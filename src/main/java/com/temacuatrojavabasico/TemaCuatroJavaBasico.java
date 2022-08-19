package com.temacuatrojavabasico;

import com.temacuatrojavabasico.servicio.SmartPhone;
import com.temacuatrojavabasico.servicio.SmartWatch;

public class TemaCuatroJavaBasico {
    public static void main(String[] args) {
        executeSmartPhone("Xiaomi", 12, 163, 4600, 50, "Liberado");
        executeSmartWatch("Xiaomi", 2, 31, 230, "Si", 2);

    }

    public static void executeSmartPhone(String marca, int modelo, int peso, int bateria, int camaraTrasera, String companiaTelefonica){
        SmartPhone smartPhone = new SmartPhone(marca, modelo, peso, bateria, camaraTrasera, companiaTelefonica);
        System.out.println(smartPhone.getDetalles());
    }

    public static void executeSmartWatch (String marca, int modelo, int peso, int bateria, String metricaPai, int correa){
        SmartWatch smartWatch = new SmartWatch(marca, modelo, peso, bateria, metricaPai, correa);
        System.out.println(smartWatch.getDetalles());
    }
}
