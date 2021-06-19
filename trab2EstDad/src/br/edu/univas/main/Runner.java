package br.edu.univas.main;

import br.edu.univas.vo.Arvore;
import br.edu.univas.vo.Node;

public class Runner {
		
	public static void main(String[] args) {
		
		Arvore arvore = new Arvore ();
		
		// iniciando árvore 
		Node casa = arvore.initialNode("Casa");
				
		// iniciando primeiro nivel
		Node quarto = arvore.newLevel("Quarto", 3);
		arvore.setListNodes (casa,quarto);
		Node cozinha = arvore.newLevel("Cozinha", 1);
		arvore.setListNodes (casa,cozinha);
		Node sala = arvore.newLevel("Sala", 1);
		arvore.setListNodes (casa,sala);
		Node banheiro = arvore.newLevel("Banheiro", 2);
		arvore.setListNodes (casa,banheiro);
		
		
		//inicializando segundo nivel
		
	}

}
