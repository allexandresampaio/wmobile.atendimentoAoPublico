package br.edu.ifba.wmobile.atendimentoAoPublico;

public abstract class Atendente {
	
	protected Atendente proximo = null;
	
	private String nome;
	
	public Atendente(String nome){
		this.nome = nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setProximo (Atendente proximo){
		if (this.proximo != null){
			this.proximo.setProximo(proximo);
		}
		else{
			this.proximo = proximo;
		}
	}
	
	
	public abstract String resolverDuvida(TipoDuvida duvida);

}
