package br.ufes.inf.designpatterns.creational.factorymethod.nomes;import java.util.HashSet;import java.util.Set;/** * Aplicação de manipulação de nomes. *  * @author Vitor E. Silva Souza (vitorsouza@gmail.com) * @version 2005.07.02 */public abstract class AplicacaoNomes {	/** Conjunto de nomes. */	private Set<Nome> nomes = new HashSet<Nome>();	/** Adiciona um nome ao conjunto. */	public void adicionarNome(String nome) {		Nome novoNome = construirNome(nome);		nomes.add(novoNome);	}	/** Constrói o nome: método fábrica a ser sobrescrito. */	public abstract Nome construirNome(String nome);	/** Imprime os nomes. */	public void imprimirNomes() {		for (Nome nome : nomes)			System.out.println(nome);	}}