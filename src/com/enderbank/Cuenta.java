package com.enderbank;

//se debe crear el directorio en donde se va a agregar las clases (package)

public class Cuenta {

	double saldo;
	int agencia;
	int numero;
	String titular;
	double depositar(double saldo) {
		//diferencia entre un atributo y un parametro	
		this.saldo += saldo;
		return saldo;
	}
}
