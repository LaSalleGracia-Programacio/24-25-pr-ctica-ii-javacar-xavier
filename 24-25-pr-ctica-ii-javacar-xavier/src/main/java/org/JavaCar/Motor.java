package org.JavaCar;

/**
 * Clase que representa el motor de un vehículo
 */
public class Motor {
    private String tipus;
    private int potencia;

    /**
     * Constructor con todos los atributos
     * @param tipus Tipo de motor (ej. Gasolina, Diesel, Eléctrico)
     * @param potencia Potencia del motor en CV
     */
    public Motor(String tipus, int potencia) {
        this.tipus = tipus;
        this.potencia = potencia;
    }

    /**
     * Obtiene el tipo de motor
     * @return Tipo de motor
     */
    public String getTipus() {
        return tipus;
    }

    /**
     * Obtiene la potencia del motor
     * @return Potencia del motor en CV
     */
    public int getPotencia() {
        return potencia;
    }
} 