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
		populaDemaisNiveis    (3,7);
		populaDemaisNiveis    (4,8);
		
		for (Node node : listaDeNodes) {
			
			System.out.println(node.getName() + " " + node.getQuant());
			
		}  
		
		System.out.println("\n" + listaDeNodes.get(0).getSubArv().get(0).getName());
		System.out.println(listaDeNodes.get(1).getSubArv().get(0).getName());
		System.out.println(listaDeNodes.get(2).getSubArv().get(0).getName());
		System.out.println(listaDeNodes.get(3).getSubArv().get(0).getName());
		System.out.println(listaDeNodes.get(4).getSubArv().get(0).getName());
		System.out.println(listaDeNodes.get(5).getSubArv().get(0).getName());
		System.out.println(listaDeNodes.get(7).getSubArv().get(0).getName());
		System.out.println(listaDeNodes.get(8).getSubArv().get(0).getName());
					
				
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
}
