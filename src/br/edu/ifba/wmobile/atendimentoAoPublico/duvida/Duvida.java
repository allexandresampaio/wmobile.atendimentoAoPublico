package br.edu.ifba.wmobile.atendimentoAoPublico.duvida;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.ifba.wmobile.atendimentoAoPublico.padrao.cadeia.Atendente;
import br.edu.ifba.wmobile.atendimentoAoPublico.padrao.cadeia.AtdCalcados;
import br.edu.ifba.wmobile.atendimentoAoPublico.padrao.cadeia.AtdVestFem;
import br.edu.ifba.wmobile.atendimentoAoPublico.padrao.cadeia.AtdVestMasc;
import br.edu.ifba.wmobile.atendimentoAoPublico.padrao.cadeia.TipoDuvida;

@ManagedBean(name = "duvida")
@SessionScoped
public class Duvida {
	
	private String resultado = "";
	
	public List<String> getTiposDeDuvida(){
		List<String> tipos = new ArrayList<String>();
		
		tipos.add("Cal�ados");
		tipos.add("Vestu�rio Feminino");
		tipos.add("Vestu�rio Masculino");
		return tipos;
	}
	
	public void setTipoEscolhido(String tipo){
		TipoDuvida tipoDuvida = TipoDuvida.SEMDUVIDA;
		if ("Cal�ados".equals(tipo)){
			tipoDuvida = TipoDuvida.CALCADOS;
		} else if ("Vestu�rio Feminino".equals(tipo)){
			tipoDuvida = TipoDuvida.VESTFEM;
		} else if ("Vestu�rio Masculino".equals(tipo)){
			tipoDuvida = TipoDuvida.VESTMASC;
		}
		
		resultado = getAtendente(tipoDuvida);
	}

	private String getAtendente(TipoDuvida tipoDuvida){
		Atendente atd = new AtdCalcados("Jairo");
		atd.setProximo(new AtdVestFem("L�cia"));
		atd.setProximo(new AtdVestMasc("Alfredo"));
		
		return atd.resolverDuvida(tipoDuvida);
	}
	
	public String getResultado(){
		return resultado;
	}
}
