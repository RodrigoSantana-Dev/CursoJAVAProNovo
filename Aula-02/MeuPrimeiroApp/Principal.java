import java.util.Scanner;

class Principal{

	public static void main (String[] args){

		System.out.println("##########Cadastro de Aluno#########");
		System.out.println("Digite o seu Nome:");

		
		Scanner entradaDados = new Scanner (System.in);

		String nome = entradaDados.next();


		System.out.println("Digite sua Idade:");
		String Idade = entradaDados.next();


		System.out.println("Digite o seu endereco:");
		String Endereco = entradaDados.next();


		System.out.println("O Nome Digitado foi: ");
		System.out.println(nome);

		System.out.println("Sua Idade é: ");
		System.out.println(Idade);
		
		System.out.println("Seu endereco é: ");
		System.out.println(Endereco );


	}

}