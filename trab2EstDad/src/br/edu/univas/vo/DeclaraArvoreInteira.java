package br.edu.univas.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeclaraArvoreInteira {
	
	private Arvore arvore = new Arvore ();
	private Scanner scan = new Scanner (System.in);
	private List <Node> listaDeNodes = new ArrayList<>();

	
	public void DeclaraArvore () {
			
		
		Node casa = arvore.initialNode("Casa");
		
		populaPrimeiroNivel(4,casa);
		populaDemaisNiveis    (4,0);	
		populaDemaisNiveis    (5,1);
		populaDemaisNiveis    (3,2);
		populaDemaisNiveis    (5,3);
		populaDemaisNiveis    (4,4);
		populaDemaisNiveis    (4,5);
		populaDemaisNiveis    (4,7);
		populaDemaisNiveis    (3,8);
		populaDemaisNiveis    (4,9);
		populaDemaisNiveis    (2,10);
		populaDemaisNiveis	  (3,16);
		populaValores		  (5,11);
		populaValores         (28,17);
		
		for (int i = listaDeNodes.size(); i > 0; i--) {
			listaDeNodes.get(i-1).calcEntireValueList();
		}
		
		casa.calcEntireValueList();
		
				
		System.out.println("O valor total da arvore" + casa.getName() + "é de " + casa.getValue()+":");
	}
		
	public int readInt () {
		
		int num = scan.nextInt();
		scan.nextLine();
		
		return num;
	}
	
	public void populaPrimeiroNivel (int idxFor, Node casa) {
		
		for (int i = 0; i < idxFor; i++) {
			
			Node node = arvore.newLevel(scan.nextLine(), readInt());
			arvore.setListNodes(casa, node);
			listaDeNodes.add(node);
			
		}
	}

	public void populaDemaisNiveis (int idxFor, int idxList) {
		
		for (int i = 0; i < idxFor ; i++) {
			
			Node node = arvore.newLevel(scan.nextLine(), readInt());
			arvore.setListNodes(listaDeNodes.get(idxList), node);
			listaDeNodes.add(node);
		}
		
	}

	public void populaValores (int idxFor, int idxList) {
		
		for (int i = 0; i < idxFor; i++) {
			
			int valor = readInt();
			listaDeNodes.get(idxList+i).setValue(valor);
			
		}
			
		
	}
}
