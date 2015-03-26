package br.edu.ifba.wmobile.atendimentoAoPublico;

public class AtdVestFem extends Atendente {

	@Override
	public String resolverDuvida(TipoDuvida duvida) {
		if (duvida == TipoDuvida.VESTFEM){
			return this.getNome() + "resolve";
		}
		else return this.proximo.resolverDuvida(duvida);
	}

}
