## 🧑‍💻 Tasca S1.01. Herència i Polimorfisme
Aquest projecte conté diversos exercicis de programació orientada a objectes amb Java, organitzats per nivells de dificultat.

🔹 Nivell 1
Exercici 1 – Instruments musicals
Es defineix una classe abstracta Instrument amb atributs nom i preu, i un mètode abstracte tocar().
Es creen subclasses: Vent, Corda i Percussió, que implementen el mètode tocar() mostrant un missatge específic.
Es demostra el comportament de càrrega de classes amb membres estàtics i blocs d’inicialització.
Exercici 2 – Classe Cotxe
Es crea la classe Cotxe amb atributs:
marca → static final
model → static
potència → final
Es demostra la diferència entre aquests modificadors i quins es poden inicialitzar al constructor.
Inclou dos mètodes:
frenar() → mètode estàtic
accelerar() → mètode no estàtic
Es mostra com invocar-los des del main().

🔹 Nivell 2
Exercici 1 – Smartphone
Es crea la classe Telèfon amb atributs marca i model, i el mètode trucar(String número).
Es defineixen dues interfícies:
Camera amb el mètode fotografiar()
Rellotge amb el mètode alarma()
La classe Smartphone hereta de Telèfon i implementa les dues interfícies.
Es demostra l’ús dels mètodes des del main().

🔹 Nivell 3
Exercici 1 – Redacció de Notícies Esportives
Es defineixen redactors amb atributs nom, DNI (immutable) i sou (comú per tots).
Cada redactor pot tenir múltiples notícies.
Les notícies es classifiquen per esport: futbol, bàsquet, tenis, F1 i motociclisme.
Cada tipus de notícia té atributs específics i un mètode calcularPreuNoticia() segons criteris detallats.
També es calcula la puntuació de cada notícia segons el seu contingut.
Es crea un menú amb les opcions:
Introduir redactor
Eliminar redactor
Introduir notícia a un redactor
Eliminar notícia
Mostrar notícies per redactor
Calcular puntuació de la notícia
Calcular preu de la notícia

## 💻 Tecnologies Utilitzades

- **Java SE 17**  
- **IntelliJ IDEA** com a entorn de desenvolupament  
- **Git & GitHub** per al control de versions  
- **JDK** per a la compilació i execució del codi  
- **Collections Framework** (ArrayList, etc.)  
- **POO**: Classes, herència, interfícies, mètodes abstractes i membres estàtics



## 📋 Requisits

- **Java Development Kit (JDK) 17 o superior**  
- **IntelliJ IDEA** o qualsevol IDE compatible amb Java  
- **Git** instal·lat per clonar el repositori  
- Coneixements bàsics de programació orientada a objectes



## 🛠️ Instal·lació

1. Clona el repositori:
   ```bash
   git clone https://github.com/Viid21/S1_01_Inheritance_and_Polymorphism.git
