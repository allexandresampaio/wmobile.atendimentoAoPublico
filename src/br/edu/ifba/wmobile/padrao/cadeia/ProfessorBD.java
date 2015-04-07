package br.edu.ifba.wmobile.padrao.cadeia;

public class ProfessorBD extends Professor {

	@Override
	public String resolver(TipoDuvida duvida) {
		if (duvida == TipoDuvida.SQL){
			return
					"Professor Pablonildo resolve este tipo de dúvida!";
		}
		return this.proximo.resolver(duvida);
	}

}
