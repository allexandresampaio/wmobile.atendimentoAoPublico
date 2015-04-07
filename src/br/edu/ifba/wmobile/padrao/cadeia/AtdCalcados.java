package br.edu.ifba.wmobile.padrao.cadeia;

public class AtdCalcados extends Atendente {


	public AtdCalcados(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	public String resolverDuvida(TipoDuvida duvida) {
		if (duvida == TipoDuvida.CALCADOS){
			return this.getNome() + " resolve";
		}
		else return this.proximo.resolverDuvida(duvida);
	}

}
