package br.edu.ifba.wmobile.padrao.cadeia;

public class ProfessorProgramacao extends Professor {

	@Override
	public String resolver(TipoDuvida duvida) {
		if (duvida == TipoDuvida.PROGRAMACAO){
			return
					"Professor Deust�nio resolve este tipo de d�vida!";
		}
		return this.proximo.resolver(duvida);
	}

}
