package br.ufes.inf.designpatterns.creational.abstractfactory.pizzaria;/** * Pizzaiolo que só sabe fazer pizza de presunto. *  * @author Vitor E. Silva Souza (vitorsouza@gmail.com) * @version 2013.03.05 */public class PizzaioloPresunto implements Pizzaiolo {	/** @see br.ufes.inf.designpatterns.creational.abstractfactory.pizzaria.Pizzaiolo#criarPizza() */	public Pizza criarPizza() {		// Cria uma pizza de presunto.		return new PizzaPresunto();	}	/** @see br.ufes.inf.designpatterns.creational.abstractfactory.pizzaria.Pizzaiolo#criarCalzone() */	@Override	public Calzone criarCalzone() {		// Cria um calzone de presunto.		return new CalzonePresunto();	}}