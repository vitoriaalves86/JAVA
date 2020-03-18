package Atividade1;
import java.util.Scanner;
public class ProgramaPrincipal {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner (System.in);
		System.out.println("============================================================\n");
		System.out.println("=====================MENU PRINCIPAL=========================");
		System.out.println("============================================================\n");
		System.out.println("1-Criar objeto e mostrar.\n");
		System.out.println("2-Criar Objeto Inserindo Dados Pelo Construtor e mostrar.\n");
		System.out.println("3-Inserir/Alterar Dados Do Objeto.\n");
		System.out.println("4- Sair Do Sistema.\n");
		System.out.println("Escolha a opção desejada: ");
		
		do {
		int opcao = teclado.nextInt();
		switch (opcao){
		
		case 1: 
			Universidade universidade01= new Universidade();
			
			System.out.print("Nome da Universidade: ");
			String nome = teclado.next();
			
			System.out.print("Endereço dos Campos: ");
			String unidades = teclado.next();
			
			System.out.print("Telefone: ");
			String telefone = teclado.next();
			
			System.out.print("CNPJ: ");
			long cnpj = teclado.nextLong ();

			System.out.print("Principais cursos Oferecidos: ");
			String cursosOferecidos = teclado.next();
			
			System.out.print("Valor da matrícula: ");
			double valorMatricula = teclado.nextDouble ();
			
			System.out.print("Processo seletivo aberto(S/N): ");
			boolean processoSeletivo = teclado.nextBoolean ();
			
			
			teclado.close();
			
			System.out.println("Nome da universidade: "+ universidade01.getNome());
			System.out.println("Endereço dos campos: "+ universidade01.getUnidades());
			System.out.println("Telefone: "+ universidade01.getTelefone());
			System.out.println("CNPJ: "+ universidade01.getCnpj());
			System.out.println("Principais cursos oferecidos: "+ universidade01.getCursosOferecidos());
			System.out.println("Valor da Matricula: "+ universidade01.getValorMatricula());
			System.out.println("Processo seletivo aberto: "+ universidade01.getProcessoSeletivo());
			
			break;
		
		case 2:
			Universidade universidade02 = new Universidade ("Unip", "Santo Amaro - Pinheiros -Guarulhos" ,"(11)5896-5874",52361258965415l,
					"Medicina - Jornalismo - Matemática - Letras", 59.99, 'S');
			System.out.println("Nome da universidade: "+ universidade02.getNome());
			System.out.println("Endereço dos campos: "+ universidade02.getUnidades());
			System.out.println("Telefone: "+ universidade02.getTelefone());
			System.out.println("CNPJ: "+ universidade02.getCnpj());
			System.out.println("Principais cursos oferecidos: "+ universidade02.getCursosOferecidos());
			System.out.println("Valor da Matricula: "+ universidade02.getValorMatricula());
			System.out.println("Processo seletivo aberto: "+ universidade02.getProcessoSeletivo());
			break;
		
		case 3:
			Universidade universidade03 = new Universidade ();
			System.out.print("Nome da Universidade: ");
			String nome = teclado.next();
			
			System.out.print("Endereço dos Campos: ");
			String unidades = teclado.next();
			
			System.out.print("Telefone: ");
			String telefone = teclado.next();
			
			System.out.print("CNPJ: ");
			long cnpj = teclado.nextLong ();

			System.out.print("Principais cursos Oferecidos: ");
			String cursosOferecidos = teclado.next();
			
			System.out.print("Valor da matrícula: ");
			double valorMatricula = teclado.nextDouble ();
			
			System.out.print("Processo seletivo aberto(S/N): ");
			boolean processoSeletivo = teclado.nextBoolean ();
			
			System.out.println("Nome da universidade: "+ universidade03.getNome());
			System.out.println("Endereço dos campos: "+ universidade03.getUnidades());
			System.out.println("Telefone: "+ universidade03.getTelefone());
			System.out.println("CNPJ: "+ universidade03.getCnpj());
			System.out.println("Principais cursos oferecidos: "+ universidade03.getCursosOferecidos());
			System.out.println("Valor da Matricula: "+ universidade03.getValorMatricula());
			System.out.println("Processo seletivo aberto: "+ universidade03.getProcessoSeletivo());
			
			break;
			
		case 4: 
			System.out.println("Fim do programa.");
		
		}while (opcao <=1 && opcao >=3);
		
		
		}

	}

}
