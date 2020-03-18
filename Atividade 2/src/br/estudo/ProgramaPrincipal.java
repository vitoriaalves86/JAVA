package br.estudo;

import java.util.ArrayList;
import java.util.Scanner;


public class ProgramaPrincipal {

	public static void main(String[] args) throws RegraException {
		
		Scanner leitor = new Scanner(System.in);
		
		ArrayList <Aluno> cadastroAlu = new ArrayList <> ();
		
		ArrayList<Professor> cadastroProf = new ArrayList <> ();
		
		int opcao;
		int opcaoPes;
		
		System.out.println("**************************************************************");
		System.out.println("------------------MENU INICIAL--------------------------");
		System.out.println("**************************************************************");
		System.out.println("1 - CADASTRAR ALUNO");
		System.out.println("2 - CADASTRAR PROFESSOR");
		System.out.println("3 - SAIR DO SISTEMA");
		System.out.println();
		System.out.print("ESCOLHA A OPÇÃO DESEJADA: ");

		opcaoPes = leitor.nextInt ();
		try {
			
		
		switch (opcaoPes) {
			case 1:
				do{
					System.out.println();
					System.out.println("**************************************************************");
					System.out.println("------------------PROGRAMA PRINCIPAL--------------------------");
					System.out.println("**************************************************************");
					
					System.out.println("1 - CADASTRAR ALUNO");
					System.out.println("2 - MOSTRAR TODOS ALUNOS CADASTRADAS");
					System.out.println("3 - REMOVER ALUNO");
					System.out.println("4 - SAIR DO SISTEMA");
					System.out.println();
					System.out.print("ESCOLHA A OPÇÃO DESEJADA: ");
					opcao = leitor.nextInt();
					
					switch(opcao){
						case 1:
							System.out.println("\nOpção escolhida - 1");
							System.out.println("**************************************************************");
							System.out.println("CADASTRAR ALUNO");
							System.out.println("**************************************************************");
							int repetir;
							do {
							
								System.out.println("Digite o nome: ");
								String nomePes=(leitor.next());
								
								System.out.println("Digite a idade: ");
								int idade =(leitor.nextInt());
								
								System.out.println("Digite o sexo [F/M]: ");
								char sexo = (leitor.next().charAt(0));
								
								System.out.println("---------Endereço---------");
								EnderecoPes enderecoAluno = new EnderecoPes ();
								
								System.out.println("Digite a rua: ");
								String rua = (leitor.nextLine());
								enderecoAluno.setRua(rua);
								leitor.next ();
								System.out.println("Digite o número: ");
								int num = (leitor.nextInt());
								enderecoAluno.setNum(num);
								System.out.println("Digite o  bairro: ");
								String bairro = (leitor.next());
								enderecoAluno.setBairro(bairro);
								System.out.println("Digite a cidade: ");
								String cidade = (leitor.next());
								enderecoAluno.setCidade(cidade);
								System.out.println("Digite o estado: ");
								String estado = (leitor.next());
								enderecoAluno.setEstado(estado);

								//verificação
								System.out.println("Digite o RG: ");
								String rg = (leitor.next());
								
								System.out.println("Digite o Curso: ");
								String curso = (leitor.next());
								
								//verificação
								System.out.println("Digite o RA: ");
								int ra = (leitor.nextInt());
								
								
								cadastroAlu.add(new Aluno (nomePes, idade, sexo,enderecoAluno, rg,curso, ra));

						
								System.out.println("Deseja cadastrar mais alunos (1-Sim/2-Não)");
								repetir=leitor.nextInt();

								
							}while (repetir ==1);
							
							
							break;
							
						case 2:
							System.out.println("\nOpção escolhida - 2");
							System.out.println("**************************************************************");
							System.out.println("MOSTRAR TODOS OS ALUNOS");
							System.out.println("**************************************************************");
							for(int i=0;i<cadastroAlu.size();i++)
								System.out.println("POSIÇÃO "+ "["+(i)+ "]: "+"##################################"+cadastroAlu.get(i));
		
							
							
							break;
						case 3:
							System.out.println("\nOpção escolhida - 3");
							System.out.println("**************************************************************");
							System.out.println("REMOVER ALUNO");
							System.out.println("**************************************************************");
							System.out.println();
							System.out.println("Escolha a posição a ser removida: ");
							int posicao = (leitor.nextInt());
							if(posicao>=0 && posicao<cadastroAlu.size()) {
								cadastroAlu.remove(posicao);
								System.out.println("REMOVIDO COM SUCESSO");
								System.out.println();
							}else {
								System.out.println("POSIÇÃO INVÁLIDA");
								System.out.println();
								break;
							}
							break;
						case 4:
							System.out.println("\nOpção escolhida - 4");
							System.out.println("**************************************************************");
							System.out.println("SAIR DO SISTEMA");
							System.out.println("**************************************************************");
							break;
					}
					
				}while(opcao!=4);
				
			case 2:
				do{
					System.out.println();
					System.out.println("**************************************************************");
					System.out.println("------------------PROGRAMA PRINCIPAL--------------------------");
					System.out.println("**************************************************************");
					
					System.out.println("1 - CADASTRAR PROFESSOR");
					System.out.println("2 - MOSTRAR TODOS PROFESSORES CADASTRADOS");
					System.out.println("3 - REMOVER PROFESSOR");
					System.out.println("4 - SAIR DO SISTEMA");
					System.out.println();
					System.out.print("ESCOLHA A OPÇÃO DESEJADA: ");
					System.out.println();

					opcao = leitor.nextInt();
					
					switch(opcao){
						case 1:
							System.out.println("\nOpção escolhida - 1");
							System.out.println("**************************************************************");
							System.out.println("CADASTRAR PROFESSOR");
							System.out.println("**************************************************************");
							int repetir;
							do {
							
								System.out.println("Digite o nome: ");
								String nomePes=(leitor.next());
								
								System.out.println("Digite a idade: ");
								int idade = (leitor.nextInt());
								
								System.out.println("Digite o sexo [F/M]: ");
								char sexo = (leitor.next().charAt(0));
								
								System.out.println("---------Endereço---------");
								EnderecoPes enderecoProf = new EnderecoPes ();
								 
								System.out.println("Digite a rua: ");
								String rua = (leitor.nextLine());
								enderecoProf.setRua(rua);
								leitor.next ();

								System.out.println("Digite o número: ");
								int num = (leitor.nextInt());
								enderecoProf.setNum(num);
								System.out.println("Digite o  bairro: ");
								String bairro = (leitor.next());
								enderecoProf.setBairro(bairro);
								System.out.println("Digite a cidade: ");
								String cidade = (leitor.next());
								enderecoProf.setCidade(cidade);
								System.out.println("Digite o estado: ");
								String estado = (leitor.next());
								enderecoProf.setEstado(estado);
  
								//verificação
								System.out.println("Digite o RG: ");
								String rg = (leitor.next());
							
								
								System.out.println("Digite a especialidade: ");
								String especialidade = (leitor.next());
								
								System.out.println("Digite o salário: ");
								double salario = (leitor.nextDouble());
								
																
								cadastroProf.add(new Professor (nomePes, idade, sexo,enderecoProf, rg,especialidade, salario));

						
								System.out.println("Deseja cadastrar mais professores (1-Sim/2-Não)");
								repetir=leitor.nextInt();
								
							}while (repetir ==1);
							
							break;
							
						case 2:
							System.out.println("\nOpção escolhida - 2");
							System.out.println("**************************************************************");
							System.out.println("MOSTRAR TODOS OS PROFESSORES");
							System.out.println("**************************************************************");
							for(int i=0;i<cadastroProf.size();i++)
								System.out.println("POSIÇÃO "+" [ "+(i)+" ] "+"#################################"+cadastroProf.get(i));
							break;
						case 3:
							System.out.println("\nOpção escolhida - 3");
							System.out.println("**************************************************************");
							System.out.println("REMOVER PROFESSOR");
							System.out.println("**************************************************************");
							System.out.println();
							System.out.println("Escolha a posição a ser removida: ");
							int posicao = (leitor.nextInt());
							if(posicao>=0 && posicao<cadastroProf.size()) {
								cadastroProf.remove(posicao);
								System.out.println("REMOVIDO COM SUCESSO");
								System.out.println();
							}else {
								System.out.println("POSIÇÃO INVÁLIDA");
								System.out.println();
								break;
							}
							break;
						case 4:
							System.out.println("\nOpção escolhida - 4");
							System.out.println("**************************************************************");
							System.out.println("SAIR DO SISTEMA");
							System.out.println("**************************************************************");
							break;
						default:
			            	System.out.println("Opção inválida");
			            	break;
							
					}
					
				}while(opcao!=4);
				
			case 3:
            	System.out.println("Fim do programa.");
            	break;
            	
        	default:
            	System.out.println("Opção inválida");
            	break;
		}
		
		leitor.close();
		}catch(Exception ex){
			System.out.println();
			throw new RegraException("OCORREU UM ERRO!");
		}

	}

}
