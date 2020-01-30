# AmericaVirtualProject - Ejercicio1

## Descripción

-   **Se necesita implementar (en código) la funcionalidad** para saber si una planta está en peligro, especificando en qué clase se debería el método.

    `public String revisionDePeligro()`
    
-   La planta está en peligro cuando la cantidad de barras de uranio que hay es mayor a 10000 y el empleado de la sala de control está distraído, o independientmente de lo anterior, si Mr. Burns se quedó pobre.

    >cantidadUranio > 10000 ^ empleadoControl.estaDistraido() || Burns.estaPobre()

-   Sabemos que Homero el encargado de la sala de control puede ser reemplazado por el pato balancín.

    `public void despido()`
    
-   Con el siguiente diagrama de clases:

    ![](https://github.com/EddyVegaGarcia/AmericaVirtualProject-E1/blob/master/AmericaVirtualUML-Ej1.png)

## Solución del programa

-   JDK 8: Herramienta utilizada para el desarrollo de la solución del programa.

-   JUnit 4.12: Herramienta utilizada para el desarrollo de test.

-   Para este gestión de proyecto realice la metodología de trabajo de un proceso incremental la cuál es **Metodologías ágiles**.
    
-   Diseño de solución orientada a objetos.
    
-   Diseño de contrato sin romper el concepto de **encapsulamiento**.
    
-   Diseño con las clases interface: _EstadoBurns_, _EstadoHomero_.
    
-   Como no se da todo la explicación, se asume que Homero puede cambiar de estar Concentrado a estar Distraido llendo a almorzar, que Pato Balancín siempre se encuentra Distraido, que Mr. Burns no cambia su riqueza por la compra de Uranio, solo cuando lo inicializan.
    
-   Uso del patrón State para cambiar el estado de Homero de estar Concentrado a estar Distraido y así poder tener la herramienta de delegar implementación hacia lo que nos piden que es ver si es una posible causa de peligro para la planta nuclear. De manera similar el caso de Mr. Burns con su estado económco.

-   Nos facilitaban la interfaz EmpleadoControl lo cual nos orientaba a tener implementaciones separadas para cada empleado, pero mientras que en Mr. Burns faltaría implementar más.
    
-   Con el patrón double Dispatch se realizo las ordenes en vez de estar preguntando cada caso y así caer en la posibilidad de romper el encapsulamiento.
    

## Explicación del programa

-   Nos piden que implementemos un método para saber si la planta nuclear está en peligro, esta clase es PlantaNuclear ya que ella tiene relación con ambos objetos que nos proporcionarán la posible causa de peligro.

-   Para ser avisado sin tener que romper el encapsulamiento, osea estar preguntando y realizar alguna acción al respecto de la respuesta, implemento el lanzamiento de Exception para los casos donde puede ocurrir la causa de peligro. 
    
    `public class PlantaNuclearEnPeligroException extends RuntimeException()`
    
-   Tome como inicio la llamada a la economía de Mr. Burns ya que era independiente de las demás causas y lanzará la exception si su estado es estar pobre, en el caso contrario se llamará respectivamente al empleado según su estado, la cual lanzará una excepción si es una posible causa de peligro y la planta nuclear llamará a su propio método para ver si cumple con la causa faltante de ocacionar el peligro en la planta nuclear.
    
    `public class PosibleCasoEnPeligroException extends RuntimeException()`

-   Según lo que asumí quedaría que hay solo 4 casos donde el programa está bien y lanza el mensaje : "Todo bien. Yujuu!!", mientras que en los siguientes casos se lanza la exception.
    

## Diagrama UML

- Diagrama de clases: 

    - Patrón State:
    
        - Estado Homero:

            ![](https://github.com/EddyVegaGarcia/AmericaVirtualProject-E1/blob/master/StateHomeroUML.png)
            
        - Estado Burns:
        
            ![](https://github.com/EddyVegaGarcia/AmericaVirtualProject-E1/blob/master/StateBurnsUML.png)
      
- Diagrama de secuencia:

    - Método revisionDePeligro:
    
        - Caso donde el empleado está distraido y la cantidad de Uranio es mayor de lo estable.
        
            ![](https://github.com/EddyVegaGarcia/AmericaVirtualProject-E1/blob/master/SecuenciaRevisionDePeligro.png)

## Desarrollador

-   Tengo conocimientos de Git con lo cuál cree este respositorio y pude ir trabajando a la par con el desarrollo del programa.
    
-   El proyecto pude desarrollarlo desde un inicio con diseño **Unit Testing** con conceptos de **TDD** gracias a la herramienta de **Unix** para Java: `Junit`. 
