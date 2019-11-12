package br.ufes.inf.designpatterns.creational.builder.patternburgers;/** * Funcionário montador de lanches infantis que coloca o sanduíche, a batata e o brinquedo dentro da caixa e deixa o * refrigerante fora da caixa. *  * @author Vitor E. Silva Souza (vitorsouza@gmail.com) * @version 2005.07.01 */public class FuncionarioMontador implements MontadorProduto {	/** Pedido. */	private Pedido pedido = new Pedido();	/** @see br.ufes.inf.designpatterns.creational.builder.patternburgers.MontadorProduto#adicionarSanduiche(java.lang.String) */	public void adicionarSanduiche(String sanduiche) {		pedido.adicionarDentroDaCaixa(sanduiche);	}	/** @see br.ufes.inf.designpatterns.creational.builder.patternburgers.MontadorProduto#adicionarBatata(java.lang.String) */	public void adicionarBatata(String batata) {		pedido.adicionarDentroDaCaixa(batata);	}	/** @see br.ufes.inf.designpatterns.creational.builder.patternburgers.MontadorProduto#adicionarBrinquedo(java.lang.String) */	public void adicionarBrinquedo(String brinquedo) {		pedido.adicionarDentroDaCaixa(brinquedo);	}	/** @see br.ufes.inf.designpatterns.creational.builder.patternburgers.MontadorProduto#adicionarRefrigerante(java.lang.String) */	public void adicionarRefrigerante(String refrigerante) {		pedido.adicionarForaDaCaixa(refrigerante);	}	/** Retorna o pedido. */	public Pedido getPedido() {		return pedido;	}}