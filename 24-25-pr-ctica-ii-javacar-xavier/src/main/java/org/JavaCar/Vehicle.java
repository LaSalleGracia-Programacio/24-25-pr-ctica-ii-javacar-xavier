package org.JavaCar;

/**
 * Classe abstracta que representa un vehicle
 * @author Xavier Moreno Navarro
 */
public abstract class Vehicle implements Llogable {
    protected String matricula;
    protected String marca;
    protected String model;
    protected double preuBase;
    protected Motor motor;
    protected Roda[] rodes;
    protected String etiquetaAmbiental;

    /**
     * Constructor amb tots els atributs
     * @param matricula Matrícula del vehicle
     * @param marca Marca del vehicle
     * @param model Model del vehicle
     * @param preuBase Preu base del vehicle
     * @param motor Motor del vehicle
     * @param rodes Rodes del vehicle
     * @param etiquetaAmbiental Etiqueta ambiental del vehicle
     */
    public Vehicle(String matricula, String marca, String model, double preuBase, 
                Motor motor, Roda[] rodes, String etiquetaAmbiental) {
        this.matricula = matricula;
        this.marca = marca;
        this.model = model;
        this.preuBase = preuBase;
        this.motor = motor;
        this.rodes = rodes;
        this.etiquetaAmbiental = etiquetaAmbiental;
    }

    /**
     * Obté la matrícula del vehicle
     * @return Matrícula del vehicle
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Obté la marca del vehicle
     * @return Marca del vehicle
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Obté el model del vehicle
     * @return Model del vehicle
     */
    public String getModel() {
        return model;
    }

    /**
     * Obté el preu base del vehicle
     * @return Preu base del vehicle
     */
    public double getPreuBase() {
        return preuBase;
    }

    /**
     * Obté el motor del vehicle
     * @return Motor del vehicle
     */
    public Motor getMotor() {
        return motor;
    }

    /**
     * Obté les rodes del vehicle
     * @return Rodes del vehicle
     */
    public Roda[] getRodes() {
        return rodes;
    }

    /**
     * Obté l'etiqueta ambiental del vehicle
     * @return Etiqueta ambiental del vehicle
     */
    public String getEtiquetaAmbiental() {
        return etiquetaAmbiental;
    }
} 