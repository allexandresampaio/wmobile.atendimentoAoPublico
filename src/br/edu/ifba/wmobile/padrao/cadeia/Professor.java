package br.edu.ifba.wmobile.padrao.cadeia;

public abstract class Professor {
	
	protected Professor proximo = null;
	
	public void setProximo(Professor proximo){
		if(this.proximo != null){
			this.proximo.setProximo(proximo);
		}else{
			this.proximo = proximo;
		}
	}
	
	public abstract String resolver(TipoDuvida duvida);
	
	
}
