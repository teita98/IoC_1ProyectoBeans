package com.app.ioc;

import org.springframework.stereotype.Component;

//JAVA ANNOTATION: Id que le damos a este bean (no tiene que tener el mismo nom con nom clase)
@Component("ComercialExperimentado") // Registrado automaticamente el BEAN (sin tener que crearlo en el XML)

public class ComercialExperimentado implements Empleados {

	public String getTareas() {
		return "Vender";
	}

	public String getInforme() {
		return "Informe generado por el comercial";
	}

}
