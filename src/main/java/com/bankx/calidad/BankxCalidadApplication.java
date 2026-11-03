package com.bankx.calidad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Punto de inicio del microservicio.
 */
@SpringBootApplication
public class BankxCalidadApplication {

  /**
   * Inicia la aplicacion Spring Boot.
   *
   * @param args argumentos recibidos desde la linea de comandos
   */
  public static void main(String[] args) {
    SpringApplication.run(BankxCalidadApplication.class, args);
  }
}
