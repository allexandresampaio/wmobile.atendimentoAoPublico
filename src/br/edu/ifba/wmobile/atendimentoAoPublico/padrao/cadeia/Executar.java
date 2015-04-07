package br.edu.ifba.wmobile.atendimentoAoPublico.padrao.cadeia;

public class Executar {

	public static void main(String[] args) {
		
		Atendente atendente = new AtdCalcados("João");
		atendente.setProximo(new AtdVestFem("José"));
		atendente.setProximo(new AtdVestMasc("Antônio"));
		System.out.println(atendente.resolverDuvida(TipoDuvida.CALCADOS));
		System.out.println(atendente.resolverDuvida(TipoDuvida.VESTFEM));
		System.out.println(atendente.resolverDuvida(TipoDuvida.VESTMASC));
	}

}
