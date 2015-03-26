package br.edu.ifba.wmobile.atendimentoAoPublico;

public class AtdCalcados extends Atendente {


	public String resolverDuvida(TipoDuvida duvida) {
		if (duvida == TipoDuvida.CALCADOS){
			return this.getNome() + "resolve";
		}
		else return this.proximo.resolverDuvida(duvida);
	}

}
