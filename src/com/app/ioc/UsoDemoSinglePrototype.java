package com.app.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSinglePrototype {

	public static void main(String[] args) {

		// Carga de XML de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContextPatronesDiseno.xml");
		
		// Peticion de beans al contenedor Spring - APUNTAN AL MISMO OBJETO
		SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		SecretarioEmpleado Pedro = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		SecretarioEmpleado Manolo = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		SecretarioEmpleado Juan = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		SecretarioEmpleado Ana = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);

		// En consola sale direccion de memoria del objeto
		// - Si ponemos singleton (o nada que por defecto es lo mismo) en el XML correspondiente dan la misma direccion de memoria porque los dos apuntan al mismo objeto
		// - Si ponemos prototype en el XML correspondiente no dan la misma direccion de memoria porque ya no apuntan al mismo objeto, son objetos clonados
		// Ahora tenemos puesto prototype en el XML
		System.out.println(Maria);
		System.out.println(Pedro);
		System.out.println(Manolo);
		System.out.println(Juan);
		System.out.println(Ana);

		if(Maria == Pedro) System.out.println("Apuntan al mismo objeto");
		else System.out.println("No se trata del mismo objeto");
	}

}
