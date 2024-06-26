package co.edu.uniquindio.tienda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
Esta clase será la clase principal del proyecto Spring. Acá estamos configurando nuestro proyecto
para que haga uso de Spring Boot. Cuando queramos desplegar el proyecto, simplemente
ejecutamos el main de esta clase.
 */

@SpringBootApplication
public class ProyectoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProyectoApplication.class, args);
        System.out.println("Hola mundo");
    }
}
