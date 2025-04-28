package org.JavaCar;

/**
 * Clase que representa un coche
 */
public class Cotxe extends Vehicle {
    private int places;

    /**
     * Constructor con todos los atributos
     * @param matricula Matrícula del coche
     * @param marca Marca del coche
     * @param model Modelo del coche
     * @param preuBase Precio base del coche
     * @param places Número de plazas del coche
     * @param motor Motor del coche
     * @param rodes Ruedas del coche
     */
    public Cotxe(String matricula, String marca, String model, double preuBase, 
               int places, Motor motor, Roda[] rodes) {
        super(matricula, marca, model, preuBase, motor, rodes, determinarEtiqueta(motor));
        this.places = places;
    }

    /**
     * Obtiene el número de plazas del coche
     * @return Número de plazas
     */
    public int getPlaces() {
        return places;
    }

    /**
     * Determina la etiqueta ambiental según el tipo de motor
     * @param motor Motor del vehículo
     * @return Etiqueta ambiental correspondiente
     */
    private static String determinarEtiqueta(Motor motor) {
        if (motor == null) {
            return "Sin clasificar";
        }
        
        String tipus = motor.getTipus().toLowerCase();
        if (tipus.equals("eléctrico") || tipus.equals("electric")) {
            return "ECO";
        } else if (tipus.equals("híbrido") || tipus.equals("hibrid")) {
            return "C";
        } else if (tipus.equals("gasolina")) {
            return "B";
        } else {
            return "A";
        }
    }

    /**
     * Calcula el precio de alquiler según el número de días
     * @param dies Número de días de alquiler
     * @return Precio total del alquiler
     */
    @Override
    public double calcularPreu(int dies) {
        return preuBase * dies;
    }
} 