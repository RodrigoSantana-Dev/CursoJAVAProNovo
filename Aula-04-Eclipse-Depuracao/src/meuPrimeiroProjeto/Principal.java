package meuPrimeiroProjeto;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		// 			Inicializando os Objetos 
		
		       AdmBanco admBanco = new AdmBanco();
		       Programador programador = new Programador();
		
		//					Recebendo dados
		
		       Scanner entradaDados = new Scanner(System.in);
		
		
		//			Iniciando comunicacao com o Console
		
		
		       System.out.println("Cadastro do Profissional");
				
		
		//					Cadastro do AdmBanco'''''''
		
		       System.out.println("Qual é o seu nome:    ");
		       admBanco.Nome = entradaDados.next();
		
		       System.out.println(admBanco.Nome +    " qual é o seu CPF:    ");
		       admBanco.Cpf = entradaDados.next();
		

		       System.out.println("Tipo de banco de dados:   ");
		       admBanco.TipoDeBancoDeDados = entradaDados.next();
		
		
		//					Cadastro do Programador
		
		
		
		System.out.println("Qual é o seu nome:    ");
		programador.Nome = entradaDados.next();
		
		System.out.println(programador.Nome + " qual é o seu CPF:  ");
		programador.Cpf = entradaDados.next();
		
		System.out.println(" Tipo de Linguagem:   ");
		programador.Linguagem  = entradaDados.next();
		
		
		//				Exibindo no Console o resultado
		
		
		
		System.out.println(admBanco.Nome);
		System.out.println(admBanco.Cpf);
		System.out.println(admBanco.TipoDeBancoDeDados);
		
		
		
		System.out.println(programador.Nome);
		System.out.println(programador.Cpf);
		System.out.println(programador.Linguagem);
		
		
	}

}
