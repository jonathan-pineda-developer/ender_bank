package com.enderbank;

public class crearCuenta {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		double saldo = 1000.0;
		int agencia = 0;
		int numero = 0;
		String titular ="";
		saldo = 1000.0;
		cuenta.agencia = 1;
		cuenta.numero = 1;
		cuenta.titular = "Generic";
		
		
		System.out.println(cuenta.depositar(saldo));
		
	}

}
