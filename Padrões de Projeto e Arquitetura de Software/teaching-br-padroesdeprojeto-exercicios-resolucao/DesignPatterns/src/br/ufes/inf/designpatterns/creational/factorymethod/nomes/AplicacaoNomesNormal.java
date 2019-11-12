package br.ufes.inf.designpatterns.creational.factorymethod.nomes;/** * Aplicação para manipulação de nomes no formato "nome sobrenome". *  * @author Vitor E. Silva Souza (vitorsouza@gmail.com) * @version 2005.07.02 */public class AplicacaoNomesNormal extends AplicacaoNomes {	/** @see br.ufes.inf.designpatterns.creational.factorymethod.nomes.AplicacaoNomes#construirNome(java.lang.String) */	public Nome construirNome(String nome) {		String sobrenome = "";		// Separa pelo espaço.		int pos = nome.indexOf(" ");		if (pos != -1) {			sobrenome = nome.substring(pos + 1, nome.length()).trim();			nome = nome.substring(0, pos).trim();		}		// Cria o nome e adiciona.		return new Nome(nome, sobrenome);	}}