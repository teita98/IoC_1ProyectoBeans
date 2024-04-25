package com.app.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Paso1: Cargar XML configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Paso 2: Pedir Bean al contenedor
		Empleados Antonio = contexto.getBean("miEmpleado",Empleados.class);
		
		// Paso 3. Usar el bean
		System.out.println(Antonio.getInforme());
		
		System.out.println(Antonio.getTareas());

		// Paso 4: Cerrar el contexto
		contexto.close();

	}

}
