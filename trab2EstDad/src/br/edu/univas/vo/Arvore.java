package br.edu.univas.vo;

public class Arvore {
	
	private Node root;
	private int amout;
	
	
	public Node newNode(String caracter, int quant) {
		
		Node node = new Node();
		node.setName(caracter);
						
		return node;
	
	}
	
	public Node initialNode (String nome) {
		
		final int quant = 1;
		root = newNode(nome, quant);
		
		return root;
	}
	
	public Node newLevel(String nome, int quant) {
		
		Node subNode = newNode(nome, quant);
		
		return subNode;

	}
	
	public void setListNodes (Node highLevelNode, Node node) {
		
		highLevelNode.getSubArv().add(node);
		
	}
	
	public int getAmout() {
		return amout;
	}

	public void setAmout(int amout) {
		this.amout = amout;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	
	
}
