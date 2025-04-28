package org.JavaCar;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase gestora de elementos alquilables
 */
public class LlogableGestor {
    private List<Llogable> elements;

    /**
     * Constructor por defecto
     */
    public LlogableGestor() {
        this.elements = new ArrayList<>();
    }

    /**
     * Añade un elemento alquilable a la lista
     * @param element Elemento alquilable
     */
    public void afegirElement(Llogable element) {
        elements.add(element);
    }

    /**
     * Elimina un elemento alquilable de la lista
     * @param element Elemento alquilable
     * @return true si se eliminó correctamente, false en caso contrario
     */
    public boolean eliminarElement(Llogable element) {
        return elements.remove(element);
    }

    /**
     * Calcula el precio total de alquiler para todos los elementos durante un número de días
     * @param dies Número de días de alquiler
     * @return Precio total de alquiler
     */
    public double calcularPreuTotal(int dies) {
        double total = 0;
        for (Llogable element : elements) {
            total += element.calcularPreu(dies);
        }
        return total;
    }

    /**
     * Obtiene la lista de elementos alquilables
     * @return Lista de elementos alquilables
     */
    public List<Llogable> getElements() {
        return elements;
    }
} 