# Practica JavaCar
Xavier Moreno Navarro \n

Sistema de gestió de lloguer de vehicles desenvolupat en Java, seguint els principis de Programació Orientada a Objectes (POO).

## Característiques

- Administració de vehicles de lloguer (Cotxes, Motos i Furgonetes).
- Càlcul del preu de lloguer en funció del tipus de vehicle.
- Assignació automàtica d'etiqueta ambiental (sostenibilitat).
- Gestió de motors i rodes.
- Validació automàtica mitjançant testos unitaris i GitHub Actions.

## Estructura del Projecte

- `Vehicle` (classe abstracta)
- `Cotxe`, `Moto`, `Furgoneta` (classes concretes)
- `Motor` i `Roda` (components dels vehicles)
- `GestorLloguers` (classe estàtica per operacions generals)
- `Llogable` (interfície funcional)
