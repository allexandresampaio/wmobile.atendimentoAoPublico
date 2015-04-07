package br.edu.ifba.wmobile.padrao.cadeia;

public class ProfessorRedes extends Professor {

	@Override
	public String resolver(TipoDuvida duvida) {
		if (duvida == TipoDuvida.CABEAMENTO){
			return 
					"Professsor Claudionor resolve este tipo de dúvida!";
		}
		return "Não é possível resolver esta dúvida.";
	}

}
