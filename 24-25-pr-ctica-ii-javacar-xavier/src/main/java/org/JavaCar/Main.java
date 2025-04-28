package org.JavaCar;

public class Main {
    public static void main(String[] args) {
        // Crear motores
        Motor motorGasolina = new Motor("Gasolina", 120);
        Motor motorElectric = new Motor("Electric", 150);
        
        // Crear ruedas
        Roda[] rodesCotxe = {
            new Roda("Michelin", 17),
            new Roda("Michelin", 17),
            new Roda("Michelin", 17),
            new Roda("Michelin", 17)
        };
        
        Roda[] rodesMoto = {
            new Roda("Pirelli", 19),
            new Roda("Pirelli", 19)
        };
        
        Roda[] rodesFurgoneta = {
            new Roda("Continental", 20),
            new Roda("Continental", 20),
            new Roda("Continental", 20),
            new Roda("Continental", 20)
        };
        
        // Crear vehículos
        Cotxe cotxe = new Cotxe("1234ABC", "Toyota", "Corolla", 30, 5, motorGasolina, rodesCotxe);
        Moto moto = new Moto("5678DEF", "Honda", "CBR", 20, 600, motorElectric, rodesMoto);
        Furgoneta furgoneta = new Furgoneta("9012GHI", "Mercedes", "Sprinter", 40, 1500, motorGasolina, rodesFurgoneta);
        
        // Crear gestor de alquiler
        LlogableGestor gestor = new LlogableGestor();
        gestor.afegirElement(cotxe);
        gestor.afegirElement(moto);
        gestor.afegirElement(furgoneta);
        
        // Calcular precios individuales para 3 días
        System.out.println("=== Precios para 3 días de alquiler ===");
        System.out.println("Coche " + cotxe.getMarca() + " " + cotxe.getModel() + ": " + cotxe.calcularPreu(3) + "€");
        System.out.println("Moto " + moto.getMarca() + " " + moto.getModel() + ": " + moto.calcularPreu(3) + "€");
        System.out.println("Furgoneta " + furgoneta.getMarca() + " " + furgoneta.getModel() + ": " + furgoneta.calcularPreu(3) + "€");
        
        // Calcular precio total para 3 días
        System.out.println("\nPrecio total para 3 días: " + gestor.calcularPreuTotal(3) + "€");
        
        // Mostrar etiquetas ambientales
        System.out.println("\n=== Etiquetas ambientales ===");
        System.out.println("Coche " + cotxe.getMarca() + " " + cotxe.getModel() + ": " + cotxe.getEtiquetaAmbiental());
        System.out.println("Moto " + moto.getMarca() + " " + moto.getModel() + ": " + moto.getEtiquetaAmbiental());
        System.out.println("Furgoneta " + furgoneta.getMarca() + " " + furgoneta.getModel() + ": " + furgoneta.getEtiquetaAmbiental());
    }
}