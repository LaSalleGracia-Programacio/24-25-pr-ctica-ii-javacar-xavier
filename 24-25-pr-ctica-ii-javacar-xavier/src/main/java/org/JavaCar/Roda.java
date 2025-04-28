package org.JavaCar;

/**
 * Clase que representa una rueda de un vehículo
 */
public class Roda {
    private String marca;
    private int diametre;

    /**
     * Constructor con todos los atributos
     * @param marca Marca de la rueda
     * @param diametro Diámetro de la rueda en pulgadas
     */
    public Roda(String marca, int diametro) {
        this.marca = marca;
        this.diametre = diametro;
    }

    /**
     * Obtiene la marca de la rueda
     * @return Marca de la rueda
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Obtiene el diámetro de la rueda
     * @return Diámetro de la rueda en pulgadas
     */
    public int getDiametre() {
        return diametre;
    }
} 