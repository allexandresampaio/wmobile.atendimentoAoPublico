package br.edu.ifba.wmobile.atendimentoAoPublico.padrao.cadeia;

public class AtdVestMasc extends Atendente {

	public AtdVestMasc(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String resolverDuvida(TipoDuvida duvida) {
		if (duvida == TipoDuvida.VESTMASC){
			return this.getNome() + " resolve";
		}
		else return "N�o h� atendentes dispon�veis para esta d�vida.";
	}

}
