# JavaCar - Sistema de Gestió de Lloguer de Vehicles
**Autor:** Xavier Moreno Navarro

## Descripció
JavaCar és un sistema de gestió de lloguer de vehicles desenvolupat en Java que permet administrar de manera eficient una flota de vehicles. El projecte segueix els principis de la Programació Orientada a Objectes (POO) i implementa les millors pràctiques de desenvolupament.

## Característiques Principals
- Gestió completa de vehicles (Cotxes, Motos i Furgonetes)
- Sistema intel·ligent de càlcul de preus
- Integració amb el sistema d'etiquetes ambientals de la DGT
- Gestió personalitzada de components (motors i rodes)
- Suite completa de testos unitaris
- Integració contínua amb GitHub Actions

## Estructura del Projecte
El projecte està organitzat en les següents classes principals:

- `Vehicle`: Classe abstracta base que defineix la estructura comuna
- `Cotxe`, `Moto`, `Furgoneta`: Implementacions específiques per cada tipus de vehicle
- `Motor` i `Roda`: Components modolars dels vehicles
- `GestorLloguers`: Utilitats per a la gestió d'operacions comunes
- `Llogable`: Interfície que defineix el comportament dels elements llogables

## Tecnologies Utilitzades
- Java 17
- JUnit 5 per a testos unitaris
- Maven per a la gestió de dependències
- GitHub Actions per a la integració contínua

## Començar
1. Clona el repositori
2. Executa `mvn install` per a instal·lar les dependències
3. Executa `mvn test` per a verificar que tot funciona correctament

## Contribucions
Les contribucions són benvingudes! Si vols contribuir al projecte:
1. Fes un fork del repositori
2. Crea una branca per a la teva feature
3. Fes commit dels teus canvis
4. Fes push a la branca
5. Obre un Pull Request

## Llicència
Aquest projecte està sota la llicència MIT. Veure el fitxer `LICENSE` per a més detalls.
