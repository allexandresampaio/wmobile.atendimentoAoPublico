package br.edu.ifba.wmobile.duvida;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.ifba.wmobile.padrao.cadeia.Atendente;
import br.edu.ifba.wmobile.padrao.cadeia.AtdCalcados;
import br.edu.ifba.wmobile.padrao.cadeia.AtdVestFem;
import br.edu.ifba.wmobile.padrao.cadeia.AtdVestMasc;
import br.edu.ifba.wmobile.padrao.cadeia.TipoDuvida;

@ManagedBean(name = "duvida")
@SessionScoped
public class Duvida {
	
	private String resultado = "";
	
	public List<String> getTiposDeDuvida(){
		List<String> tipos = new ArrayList<String>();
		
		tipos.add("Calçados");
		tipos.add("Vestuário Feminino");
		tipos.add("Vestuário Masculino");
		
		return tipos;
	}
	
	public void setTipoEscolhido(String tipo){
		TipoDuvida tipoDuvida = TipoDuvida.SEMDUVIDA;
		if ("Calçados".equals(tipo)){
			tipoDuvida = TipoDuvida.CALCADOS;
		} else if ("Vestuário Feminino".equals(tipo)){
			tipoDuvida = TipoDuvida.VESTFEM;
		} else if ("Vestuário Masculino".equals(tipo)){
			tipoDuvida = TipoDuvida.VESTMASC;
		}
		
		resultado = getAtendente(tipoDuvida);
	}

	private String getAtendente(TipoDuvida tipoDuvida){
		Atendente atd = new AtdCalcados("Ferris");
		atd.setProximo(new AtdVestFem("Sloane"));
		atd.setProximo(new AtdVestMasc("Cameron"));
		
		return atd.resolverDuvida(tipoDuvida);
	}
	
	public String getResultado(){
		return resultado;
	}
}
