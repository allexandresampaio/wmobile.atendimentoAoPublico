package br.edu.ifba.wmobile.padrao.cadeia;

public class AtdVestMasc extends Atendente {

	public AtdVestMasc(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String resolverDuvida(TipoDuvida duvida) {
		if (duvida == TipoDuvida.VESTMASC){
			return this.getNome();
		}
		else return "N�o h� atendenes dispon�vel para esta d�vida.";
	}

}
