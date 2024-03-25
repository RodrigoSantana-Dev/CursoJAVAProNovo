import java.util.Scanner;
public class Principal{

	public static void main (String[] args){

	// Criando Objetos Adm e Programador 

	AdmBanco admBanco = new AdmBanco();
	Programador programador = new Programador(); 

	// Recebendo Dados 

	Scanner entradaDados = new Scanner(System.in);

     
	System.out.println("##### Cadastro De Profissional #####");

	System.out.println("#####################");
	

	System.out.println("##### Nome Do AdmBanco #####");
	admBanco.nome =  entradaDados.next();

	System.out.println("##### Tipo de Banco de Dados #####");
	admBanco.TipoDeBancoDeDados =  entradaDados.next();

	System.out.println("##### Cpf Do AdmBanco #####");
	admBanco.Cpf =  entradaDados.next();



	System.out.println("#####################");
	

	System.out.println("##### Cadastro De Profissional #####");
	

	System.out.println("#####################");


	System.out.println("##### Nome Do programador #####");
	programador.nome =  entradaDados.next();
	
	System.out.println("##### Tipo de Linguagem #####");
	programador.Linguagem =  entradaDados.next();

	System.out.println("##### Cpf Do programador #####");
	programador.Cpf =  entradaDados.next();
	

	System.out.println(admBanco.nome);
	System.out.println(admBanco.TipoDeBancoDeDados);
	System.out.println(admBanco.Cpf);

	System.out.println(programador.nome);
	System.out.println(programador.Linguagem);
	System.out.println(programador.Cpf);

	}


}
