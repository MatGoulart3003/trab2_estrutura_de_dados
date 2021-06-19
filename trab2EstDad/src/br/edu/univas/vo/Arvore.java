package br.edu.univas.vo;

public class Arvore {
	
	private Node root;
	private int amout;
	
	
	public Node newNode(String caracter, int quant, int value) {
		
		Node node = new Node();
		node.setName(caracter);
		node.setQuant(quant);
		node.setValue(value);
		
		return node;
	
	}
	
	public Node initialNode (String nome) {
		
		final int quant = 1;
		root = newNode(nome, quant, amout);
		
		return root;
	}
	
	public Node newLevel(String nome, int quant, int value) {
		
		Node mainNode = newNode(nome, quant, value);
		
		return mainNode;

	}
	
	public void setListNodes (Node highLevelNode, Node node) {
		
		highLevelNode.getFilhos().add(node);
		
	}
	
	public int getAmout() {
		return amout;
	}

	public void setAmout(int amout) {
		this.amout = amout;
	}
	
	
}
