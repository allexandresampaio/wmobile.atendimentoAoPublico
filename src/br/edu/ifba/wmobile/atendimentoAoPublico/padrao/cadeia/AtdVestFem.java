package br.edu.ifba.wmobile.atendimentoAoPublico.padrao.cadeia;

public class AtdVestFem extends Atendente {

	public AtdVestFem(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String resolverDuvida(TipoDuvida duvida) {
		if (duvida == TipoDuvida.VESTFEM){
			return this.getNome() + " resolve";
		}
		else return this.proximo.resolverDuvida(duvida);
	}

}
