package br.edu.ifba.wmobile.atendimentoAoPublico.padrao.cadeia;

public class Executar {

	public static void main(String[] args) {
		
		Atendente atendente = new AtdCalcados("Jo�o");
		atendente.setProximo(new AtdVestFem("Jos�"));
		atendente.setProximo(new AtdVestMasc("Ant�nio"));
		System.out.println(atendente.resolverDuvida(TipoDuvida.CALCADOS));
		System.out.println(atendente.resolverDuvida(TipoDuvida.VESTFEM));
		System.out.println(atendente.resolverDuvida(TipoDuvida.VESTMASC));
	}

}
