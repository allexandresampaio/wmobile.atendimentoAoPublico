package br.edu.ifba.wmobile.padrao.cadeia;

public class ProfessorRedes extends Professor {

	@Override
	public String resolver(TipoDuvida duvida) {
		if (duvida == TipoDuvida.CABEAMENTO){
			return 
					"Professsor Claudionor resolve este tipo de d�vida!";
		}
		return "N�o � poss�vel resolver esta d�vida.";
	}

}
