package br.edu.ifba.wmobile.padrao.cadeia;

public class ProfessorProgramacao extends Professor {

	@Override
	public String resolver(TipoDuvida duvida) {
		if (duvida == TipoDuvida.PROGRAMACAO){
			return
					"Professor Deustênio resolve este tipo de dúvida!";
		}
		return this.proximo.resolver(duvida);
	}

}
