package br.com.reges.backend;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.reges.backend.models.Cliente;
import br.com.reges.backend.rdn.ClienteRdn;
import br.com.reges.backend.rdn.ConnectionFactory;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		ClienteRdn cliRdn = new ClienteRdn();
		ArrayList<Cliente> lstCliente = cliRdn.obterTodos();




		SpringApplication.run(BackendApplication.class, args);
	}

}
