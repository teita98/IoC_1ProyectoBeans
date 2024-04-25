package com.app.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Paso 1: Cargar xml de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContextMetodosInitDestroy.xml");
		
		// Paso 2: Obtencion del bean
		Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
		
		// Paso 3: Pedimos el informe
		System.out.println(Juan.getInforme());
		
		// Paso 4: Cerrar el contexto
		contexto.close();
		
	}

}
