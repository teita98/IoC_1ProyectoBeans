package com.app.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {

		// Crear un contexto creando un objeto o instancia perteneciente a la clase Path
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Crear objeto
		SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
						
		System.out.println("SECRETARIOS");
		System.out.println(Maria.getTareas()); 	// Imprimir objeto
		System.out.println(Maria.getInforme()); // Usando la inyeccion de dependencia
		System.out.println(Maria.getEmail()); // Inyección de campos
		System.out.println(Maria.getNombreEmpresa()); // Inyección de campos

		System.out.println();

		// Directores
		DirectorEmpleado Juan = contexto.getBean("miEmpleado",DirectorEmpleado.class);

		System.out.println("DIRECTORES");
		System.out.println(Juan.getTareas());  // Imprimir objeto
		System.out.println(Juan.getInforme()); // Usando la inyeccion de dependencia
		System.out.println(Juan.getEmail());  // Inyección de campos
		System.out.println(Juan.getNombreEmpresa()); // Inyección de campos
		
		// Cerramos contexto (archivo xml) para liberar recursos
		contexto.close();
		
		
	}

}
