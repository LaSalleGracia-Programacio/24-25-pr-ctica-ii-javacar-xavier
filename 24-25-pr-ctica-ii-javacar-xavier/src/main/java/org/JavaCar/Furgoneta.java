package org.JavaCar;

/**
 * Clase que representa una furgoneta
 */
public class Furgoneta extends Vehicle {
    private double capacitatCarrega; // en kg
    private double volumCarrega; // en m³

    /**
     * Constructor simplificado para tests antiguos
     * @param matricula Matrícula de la furgoneta
     * @param marca Marca de la furgoneta
     * @param model Modelo de la furgoneta
     * @param preuBase Precio base de la furgoneta
     * @param capacitatCarrega Capacidad de carga en kg
     * @param motor Motor de la furgoneta
     * @param rodes Ruedas de la furgoneta
     */
    public Furgoneta(String matricula, String marca, String model, double preuBase,
                    int capacitatCarrega, Motor motor, Roda[] rodes) {
        super(matricula, marca, model, preuBase, motor, rodes, determinarEtiqueta(motor));
        this.capacitatCarrega = capacitatCarrega;
        this.volumCarrega = capacitatCarrega / 200.0; // Valor aproximado basado en la capacidad
    }

    /**
     * Constructor completo
     * @param matricula Matrícula de la furgoneta
     * @param marca Marca de la furgoneta
     * @param model Modelo de la furgoneta
     * @param preuBase Precio base de la furgoneta
     * @param capacitatCarrega Capacidad de carga en kg
     * @param volumCarrega Volumen de carga en m³
     * @param motor Motor de la furgoneta
     * @param rodes Ruedas de la furgoneta
     */
    public Furgoneta(String matricula, String marca, String model, double preuBase,
                    double capacitatCarrega, double volumCarrega, Motor motor, Roda[] rodes) {
        super(matricula, marca, model, preuBase, motor, rodes, determinarEtiqueta(motor));
        this.capacitatCarrega = capacitatCarrega;
        this.volumCarrega = volumCarrega;
    }

    /**
     * Obtiene la capacidad de carga
     * @return Capacidad de carga en kg
     */
    public double getCapacitatCarga() {
        return capacitatCarrega;
    }

    /**
     * Obtiene la capacidad de carga (método alternativo)
     * @return Capacidad de carga en kg
     */
    public double getCapacitatCarrega() {
        return capacitatCarrega;
    }

    /**
     * Obtiene el volumen de carga
     * @return Volumen de carga en m³
     */
    public double getVolumCarrega() {
        return volumCarrega;
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
        } else {
            return "B";
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
        
        // Cargo adicional para furgonetas grandes
        if (capacitatCarrega > 1000) {
            preu += 10 * dies; // 10€ adicionales por día para furgonetas grandes
        }
        
        return preu;
    }
} 