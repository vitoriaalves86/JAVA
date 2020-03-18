package br.estudo;

public class Professor extends Pessoa{
	//Atributos
	
	private String especialidade;
	private double salario;
	//construtor com campor
	public Professor(String nomePes, int idade, char sexo, EnderecoPes enderecoPes, String rg,String especialidade,double salario) {
		super(nomePes, idade, sexo, enderecoPes, rg);
		this.especialidade = especialidade;
		setSalario (salario);
		
	}
	//construtor vazio
	public Professor () {
		
	}
	
	@Override
	public String toString() {
		return "\nEspecialidade: " + especialidade + ","
				+ " \nSalário: " + salario;
	}
	//metodos extras sobrecarregados- aumento de salario
	public void aumentoSalario(double bonus1) {
		
		this.salario += bonus1;
		
	}
	public void aumentoSalario( double bonus2, double bonus3) {
		
		this.salario += bonus2+bonus3;
		
	}
	
	//get e set
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
			this.salario = salario;
	    	
		
	}
	public String getMensalidade() {
		return especialidade;
	}
	public void setMensalidade(String mensalidade) {
		this.especialidade = mensalidade;
	}
	

}
