package org.JavaCar;

/**
 * Classe principal que demostra el funcionament del sistema JavaCar
 * @author Xavier Moreno Navarro
 */
public class Main {
    public static void main(String[] args) {
        // Crear motors
        Motor motorGasolina = new Motor("Gasolina", 120);
        Motor motorElectric = new Motor("Elèctric", 150);
        
        // Crear rodes
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
        
        // Crear vehicles
        Cotxe cotxe = new Cotxe("1234ABC", "Toyota", "Corolla", 30, 5, motorGasolina, rodesCotxe);
        Moto moto = new Moto("5678DEF", "Honda", "CBR", 20, 600, motorElectric, rodesMoto);
        Furgoneta furgoneta = new Furgoneta("9012GHI", "Mercedes", "Sprinter", 40, 1500, motorGasolina, rodesFurgoneta);
        
        // Crear gestor de lloguers
        LlogableGestor gestor = new LlogableGestor();
        gestor.afegirElement(cotxe);
        gestor.afegirElement(moto);
        gestor.afegirElement(furgoneta);
        
        // Mostrar informació dels vehicles
        mostrarInformacioVehicles(cotxe, moto, furgoneta);
        
        // Calcular i mostrar preus per 3 dies
        mostrarPreusLloguer(cotxe, moto, furgoneta, gestor);
        
        // Mostrar etiquetes ambientals
        mostrarEtiquetesAmbientals(cotxe, moto, furgoneta);
    }
    
    private static void mostrarInformacioVehicles(Cotxe cotxe, Moto moto, Furgoneta furgoneta) {
        System.out.println("=== Informació dels Vehicles ===");
        System.out.printf("Cotxe: %s %s (Places: %d)%n", 
            cotxe.getMarca(), cotxe.getModel(), cotxe.getPlaces());
        System.out.printf("Moto: %s %s (Cilindrada: %d cc)%n", 
            moto.getMarca(), moto.getModel(), moto.getCilindrada());
        System.out.printf("Furgoneta: %s %s (Capacitat: %.0f kg)%n", 
            furgoneta.getMarca(), furgoneta.getModel(), furgoneta.getCapacitatCarga());
        System.out.println();
    }
    
    private static void mostrarPreusLloguer(Cotxe cotxe, Moto moto, Furgoneta furgoneta, LlogableGestor gestor) {
        System.out.println("=== Preus per 3 dies de lloguer ===");
        System.out.printf("Cotxe %s %s: %.2f€%n", 
            cotxe.getMarca(), cotxe.getModel(), cotxe.calcularPreu(3));
        System.out.printf("Moto %s %s: %.2f€%n", 
            moto.getMarca(), moto.getModel(), moto.calcularPreu(3));
        System.out.printf("Furgoneta %s %s: %.2f€%n", 
            furgoneta.getMarca(), furgoneta.getModel(), furgoneta.calcularPreu(3));
        System.out.printf("%nPreu total per 3 dies: %.2f€%n", gestor.calcularPreuTotal(3));
        System.out.println();
    }
    
    private static void mostrarEtiquetesAmbientals(Cotxe cotxe, Moto moto, Furgoneta furgoneta) {
        System.out.println("=== Etiquetes Ambientals ===");
        System.out.printf("Cotxe %s %s: %s%n", 
            cotxe.getMarca(), cotxe.getModel(), cotxe.getEtiquetaAmbiental());
        System.out.printf("Moto %s %s: %s%n", 
            moto.getMarca(), moto.getModel(), moto.getEtiquetaAmbiental());
        System.out.printf("Furgoneta %s %s: %s%n", 
            furgoneta.getMarca(), furgoneta.getModel(), furgoneta.getEtiquetaAmbiental());
    }
}