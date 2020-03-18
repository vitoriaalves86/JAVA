package br.estudo;

//class abstrata
public abstract class Pessoa {
	
	//construtor com campos
	public Pessoa(String nomePes, int idade, char sexo, EnderecoPes enderecoPes, String rg) {
		super();
		setNomePes (nomePes);
		setIdade (idade);
		setSexo (sexo);
		setEnderecoPes (enderecoPes);
		setRg (rg);
	}
	//construtor vazio
	public Pessoa() {
		
	}
	@Override
	public String toString() {
		return "\n-------DADOS-------"+"\nNome: " + nomePes + 
				", \nIdade: " + idade +
				", \nSexo: " + sexo 
				+ ", \nRG=" + rg + enderecoPes ;
	}


	//Atributos ou Propriedades
	private String nomePes;
	private int idade;
	private char sexo;
	private EnderecoPes enderecoPes;
	private String rg;
	
	//Métodos GET e SET
	public String getNomePes() {
		return nomePes;
	}
	public void setNomePes(String nomePes) {
		this.nomePes = nomePes;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if(Validadores.validarIdade(idade)){
			this.idade = idade;
		}else{
			System.out.println();
			System.out.println("Idade invÃ¡lida!");
			System.exit(1);
		}
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public EnderecoPes getEnderecoPes() {
		return enderecoPes;
	}
	public void setEnderecoPes(EnderecoPes enderecoPes) {
		this.enderecoPes = enderecoPes;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		if(Validadores.verificarRg(rg)) {
	    	this.rg = rg;
		}else {
			System.out.println();
			System.out.println("Número de RG inválido");
			System.exit(1);
		}
	   
	}

}
