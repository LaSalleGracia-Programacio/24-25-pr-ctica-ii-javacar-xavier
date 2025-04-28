package org.JavaCar;

/**
 * Clase abstracta que representa un vehículo
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
     * Constructor con todos los atributos
     * @param matricula Matrícula del vehículo
     * @param marca Marca del vehículo
     * @param model Modelo del vehículo
     * @param preuBase Precio base del vehículo
     * @param motor Motor del vehículo
     * @param rodes Ruedas del vehículo
     * @param etiquetaAmbiental Etiqueta ambiental del vehículo
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
     * Obtiene la matrícula del vehículo
     * @return Matrícula del vehículo
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Obtiene la marca del vehículo
     * @return Marca del vehículo
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Obtiene el modelo del vehículo
     * @return Modelo del vehículo
     */
    public String getModel() {
        return model;
    }

    /**
     * Obtiene el precio base del vehículo
     * @return Precio base del vehículo
     */
    public double getPreuBase() {
        return preuBase;
    }

    /**
     * Obtiene el motor del vehículo
     * @return Motor del vehículo
     */
    public Motor getMotor() {
        return motor;
    }

    /**
     * Obtiene las ruedas del vehículo
     * @return Ruedas del vehículo
     */
    public Roda[] getRodes() {
        return rodes;
    }

    /**
     * Obtiene la etiqueta ambiental del vehículo
     * @return Etiqueta ambiental del vehículo
     */
    public String getEtiquetaAmbiental() {
        return etiquetaAmbiental;
    }
} 