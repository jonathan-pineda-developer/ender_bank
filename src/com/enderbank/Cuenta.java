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
	String retirar(double retiro) {
	
		if(this.saldo == 0 || this.saldo < retiro) {
			return String.valueOf(-1 + " Saldo insuficiente");
		}else {
			retiro = this.saldo - retiro;
			return retiro +" Saldo restante";
			
		}
	
	}
}
