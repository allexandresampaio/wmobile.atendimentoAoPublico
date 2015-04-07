package br.edu.ifba.wmobile.duvida;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.ifba.wmobile.padrao.cadeia.Professor;
import br.edu.ifba.wmobile.padrao.cadeia.ProfessorBD;
import br.edu.ifba.wmobile.padrao.cadeia.ProfessorProgramacao;
import br.edu.ifba.wmobile.padrao.cadeia.ProfessorRedes;
import br.edu.ifba.wmobile.padrao.cadeia.TipoDuvida;

@ManagedBean(name = "duv")
@SessionScoped
public class Duvida {
	
	private String resultado = "";
	
	public List<String> getTiposDeDuvida(){
		List<String> tipos = new ArrayList<String>();
		
		tipos.add("SQL");
		tipos.add("Programação");
		tipos.add("Cabeamento");
		
		return tipos;
	}
	
	public void setTipoEscolhido(String tipo){
		TipoDuvida tipoDuvida = TipoDuvida.SEM_DUVIDA;
		if ("SQL".equals(tipo)){
			tipoDuvida = TipoDuvida.SQL;
		} else if ("Programação".equals(tipo)){
			tipoDuvida = TipoDuvida.PROGRAMACAO;
		} else if ("Cabeamento".equals(tipo)){
			tipoDuvida = TipoDuvida.CABEAMENTO;
		}
		
		resultado = getProfessor(tipoDuvida);
	}

	private String getProfessor(TipoDuvida tipoDuvida){
		Professor prof = new ProfessorProgramacao();
		prof.setProximo(new ProfessorBD());
		prof.setProximo(new ProfessorRedes());
		
		return prof.resolver(tipoDuvida);
	}
	
	public String getResultado(){
		return resultado;
	}
}
