package br.ufes.inf.designpatterns.creational.factorymethod.senha;import java.io.File;import java.util.Scanner;import br.ufes.inf.designpatterns.util.ResourceUtils;/** * Provedor de informações públicas. *  * @author Vitor E. Silva Souza (vitorsouza@gmail.com) * @version 2005.07.02 */public class ProvedorPublico extends ProvedorInformacao {	/** @see br.ufes.inf.designpatterns.creational.factorymethod.senha.ProvedorInformacao#recuperarInformacao() */	protected String recuperarInformacao() {		// Localiza o arquivo.		String pacote = getClass().getPackage().getName().toString().replace('.', '/');		File arquivo = ResourceUtils.getResourceAsFile(pacote + "/publico.txt");		// Cria um buffer para armazenar o conteúdo do arquivo.		StringBuffer buffer = new StringBuffer();		// Cria um scanner para ler o arquivo linha por linha.		Scanner scanner = criarScanner(arquivo);		while (scanner.hasNextLine()) {			// Anexa cada linha ao buffer na mesma ordem.			buffer.append(scanner.nextLine());			buffer.append("\n");		}		scanner.close();		// Retorna o conteúdo do buffer.		return buffer.toString();	}}