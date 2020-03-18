package br.estudo;

public class Aluno extends Pessoa{
	//Atributos
	private int ra;
	private String curso;
	
	//construtor com campos
	public Aluno(String nomePes, int idade, char sexo, EnderecoPes enderecoPes, String rg,  String curso ,int ra) {
		super(nomePes, idade, sexo, enderecoPes, rg);
		setRa (ra);
		setCurso (curso);
	}
	//construtor vazio
	public Aluno () {
		
	}
	
	@Override
	public String toString() {
		return  super.toString()+ " \nRA:  " + ra + " \nCurso: " + curso +"\n####################################";
	}
	//get e set
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
	    	this.ra = ra;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	

}
