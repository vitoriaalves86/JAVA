package Atividade1;

public class Universidade {
	
	private String nome;
	private String unidades;
	private String telefone;
	private String cursosOferecidos;
	private double valorMatricula;
	private long cnpj;
	private boolean processoSeletivo;
	
	public Universidade (String nome, String unidades,String telefone, String cursosOferecidos, double valorMatricula,
			long cnpj, boolean processoSeletivo){
		this.nome = nome;
		this.unidades = unidades;
		this.telefone = telefone;
		this.cursosOferecidos = cursosOferecidos;
		this.valorMatricula = valorMatricula;
		this.cnpj = cnpj;
		this.processoSeletivo = processoSeletivo;
		
		
	}
	
	public Universidade (){
		
		
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUnidades() {
		return unidades;
	}
	public void setUnidades(String unidades) {
		this.unidades = unidades;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		if(Validadores.verificarTelefone(telefone)) {
			this.telefone = telefone;
		}else {
			System.out.println("Número de telefone inválido");
		}
		
	}
	public String getCursosOferecidos() {
		return cursosOferecidos;
	}
	public void setCursosOferecidos(String cursosOferecidos) {
		this.cursosOferecidos = cursosOferecidos;
	}
	public double getValorMatricula() {
		return valorMatricula;
	}
	public void setValorMatricula(double valorMatricula) {
		this.valorMatricula = valorMatricula;
	}
	public long getCnpj() {
		return cnpj;
	}
	public void setCnpj(long cnpj) {
		if(Validadores.verificarCnpj (cnpj)) {
			this.cnpj = cnpj;
		}else {
			System.out.println("CNPJ inválido");
		}
		
	}
	public boolean getProcessoSeletivo() {
		return processoSeletivo;
	}
	public void setIngressar(boolean processoSeletivo) {
		this.processoSeletivo = processoSeletivo;
	}
	
	
	
	
	
}
