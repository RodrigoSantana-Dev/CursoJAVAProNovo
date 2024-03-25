package meuPrimeiroProjeto;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		// Inicializando os Objetos 
		
		AdmBanco admBanco = new AdmBanco();
		
		//'''''''''''Recebendo dados''''''''''''''''''''''''''''''''''''''''
		
		Scanner entradaDados = new Scanner(System.in);
		
		
		//'''''''''''Iniciando comunicacao com o Console'''''''''''''''''''''
		
		
		System.out.println("Cadastro do Profissional");
		
		//'''''''''' Se Comunicando com o Usuario pelo console'''''''''''''''
		
		System.out.println("Qual é o seu nome:    ");
		admBanco.Nome = entradaDados.next();
		
		System.out.println("Qual é o seu CPF:    ");
		admBanco.Cpf = entradaDados.next();
		
		//'''''''''''Exibindo no Console o resultado''''''''''''''''''''''''''
		
		System.out.println(admBanco.Nome);

		System.out.println(admBanco.Cpf);
		
		
	}

}
