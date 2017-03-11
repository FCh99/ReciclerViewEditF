package com.faustocheca.reciclervieweditf;

/**
 * Created by faustocheca on 11/3/17.
 */

public class Car {

    private String marca, modelo, matricula;
    private int km;

    public Car(String marca, String modelo, String matricula, int km) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.km = km;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}
