package org.JavaCar;

/**
 * Clase que representa una moto
 */
public class Moto extends Vehicle {
    private int cilindrada; // en cc
    private String tipus; // Deportiva, Scooter, etc.
    private boolean requereixCarnet;

    /**
     * Constructor para tests antiguos (según los tests)
     * @param matricula Matrícula de la moto
     * @param marca Marca de la moto
     * @param model Modelo de la moto
     * @param preuBase Precio base de la moto
     * @param cilindrada Cilindrada de la moto en cc
     * @param motor Motor de la moto
     * @param rodes Ruedas de la moto
     */
    public Moto(String matricula, String marca, String model, double preuBase,
               int cilindrada, Motor motor, Roda[] rodes) {
        super(matricula, marca, model, preuBase, motor, rodes, determinarEtiqueta(motor));
        this.cilindrada = cilindrada;
        this.tipus = cilindrada > 500 ? "Deportiva" : "Estándar";
        this.requereixCarnet = cilindrada > 500;
    }

    /**
     * Constructor completo
     * @param matricula Matrícula de la moto
     * @param marca Marca de la moto
     * @param model Modelo de la moto
     * @param preuBase Precio base de la moto
     * @param tipus Tipo de moto (Deportiva, Scooter, etc.)
     * @param requereixCarnet Si requiere carnet especial
     * @param motor Motor de la moto
     * @param rodes Ruedas de la moto
     */
    public Moto(String matricula, String marca, String model, double preuBase,
               String tipus, boolean requereixCarnet, Motor motor, Roda[] rodes) {
        super(matricula, marca, model, preuBase, motor, rodes, determinarEtiqueta(motor));
        this.tipus = tipus;
        this.requereixCarnet = requereixCarnet;
        this.cilindrada = requereixCarnet ? 600 : 300; // Asignar cilindrada por defecto basada en si requiere carnet
    }

    /**
     * Obtiene la cilindrada de la moto
     * @return Cilindrada en cc
     */
    public int getCilindrada() {
        return cilindrada;
    }

    /**
     * Obtiene el tipo de moto
     * @return Tipo de moto
     */
    public String getTipus() {
        return tipus;
    }

    /**
     * Consulta si requiere carnet especial
     * @return true si requiere carnet especial, false en caso contrario
     */
    public boolean isRequereixCarnet() {
        return requereixCarnet;
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
        } else {
            return "C";
        }
    }

    /**
     * Calcula el precio de alquiler según el número de días
     * @param dies Número de días de alquiler
     * @return Precio total del alquiler
     */
    @Override
    public double calcularPreu(int dies) {
        double preu = preuBase * dies;
        if (cilindrada > 500) {
            preu += 5 * dies; // 5€ adicionales por día para motos grandes
        }
        return preu;
    }
} 