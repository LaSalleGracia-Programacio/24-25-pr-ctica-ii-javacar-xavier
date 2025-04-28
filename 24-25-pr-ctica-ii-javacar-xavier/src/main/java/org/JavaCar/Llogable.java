package org.JavaCar;

/**
 * Interfície que representa un element que es pot llogar
 */
public interface Llogable {
    
    /**
     * Calcula el preu de lloguer basat en els dies
     * @param dies Nombre de dies de lloguer
     * @return Preu total del lloguer
     */
    double calcularPreu(int dies);
} 