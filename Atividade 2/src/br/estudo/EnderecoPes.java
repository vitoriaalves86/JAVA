package br.estudo;

public class EnderecoPes {
	//Atributos
	private String rua;
	private int num;
	private String bairro;
	private String cidade;
	private String estado;
	//construtor com campos
	public EnderecoPes(String rua, int num, String bairro, String cidade, String estado) {
		this.rua = rua;
		this.num = num;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	//construtor vazio
	public EnderecoPes() {
		
	}
	
	//get e set
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "\n---------------Endereço------------ "
				+ "\nRua: " + rua + ",\nNúmero: " + num + ", \nBairro: " 
				+ bairro + ", \nCidade: " + cidade + ", \nEstado: "	+ estado + "\n-----------------------------------";
		
	}
	

}
