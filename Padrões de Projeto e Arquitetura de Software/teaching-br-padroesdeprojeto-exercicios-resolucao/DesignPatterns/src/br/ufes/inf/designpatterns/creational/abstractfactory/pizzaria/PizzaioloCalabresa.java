package br.ufes.inf.designpatterns.creational.abstractfactory.pizzaria;/** * Pizzaiolo que só sabe fazer pizza de calabresa. *  * @author Vitor E. Silva Souza (vitorsouza@gmail.com) * @version 2013.03.05 */public class PizzaioloCalabresa implements Pizzaiolo {	/** @see br.ufes.inf.designpatterns.creational.abstractfactory.pizzaria.Pizzaiolo#criarPizza() */	public Pizza criarPizza() {		// Cria uma pizza de calabresa.		return new PizzaCalabresa();	}	/** @see br.ufes.inf.designpatterns.creational.abstractfactory.pizzaria.Pizzaiolo#criarCalzone() */	@Override	public Calzone criarCalzone() {		// Cria um calzone de calabresa.		return new CalzoneCalabresa();	}}