package org.JavaCar;

import java.util.List;

/**
 * Clase utilidad para gestionar alquileres
 */
public class GestorLloguers {
    
    /**
     * Calcula los ingresos totales para una lista de elementos alquilables
     * @param elements Lista de elementos alquilables
     * @param dies Número de días de alquiler
     * @return Ingresos totales
     */
    public static <T extends Llogable> double calcularIngressosTotals(List<T> elements, int dies) {
        double total = 0;
        for (T element : elements) {
            total += element.calcularPreu(dies);
        }
        return total;
    }
} 