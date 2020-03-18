package br.estudo;

public class Validadores {

	public static boolean verificarRg(String rg) {
		if(rg.length() == 9){
			return true;
		}else {
			return false;
		}
	}

	public static boolean validarIdade (int idade){
		if(idade >= 0 && idade <= 130){
			return true;
		}else{
			return false;
		}
	}
}
