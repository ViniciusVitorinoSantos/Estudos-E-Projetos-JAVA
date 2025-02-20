package com.evilcorp.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeiroProjetoSpringApplication {

	public static void main(String[] args) {
		UsuarioService serv = new UsuarioService();
		serv.obterUsuario();
	}

}
