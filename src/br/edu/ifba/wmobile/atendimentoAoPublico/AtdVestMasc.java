package br.edu.ifba.wmobile.atendimentoAoPublico;

public class AtdVestMasc extends Atendente {

	@Override
	public String resolverDuvida(TipoDuvida duvida) {
		if (duvida == TipoDuvida.VESTMASC){
			return this.getNome() + "resolve";
		}
		else return "N�o h� atendenes dispon�vel para esta d�vida.";
	}

}
