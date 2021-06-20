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
		
		for (Node node : listaDeNodes) {
			
			System.out.println(node.getName() + " " + node.getQuant());
			
		}  
		
		System.out.println("\n" + listaDeNodes.get(0).getName() +" - " +listaDeNodes.get(0).getSubArv().get(0).getName());
		System.out.println(listaDeNodes.get(1).getName() + " - " + listaDeNodes.get(1).getSubArv().get(0).getName());
		System.out.println(listaDeNodes.get(2).getName() + " - " +listaDeNodes.get(2).getSubArv().get(0).getName());
		System.out.println(listaDeNodes.get(3).getName() + " - " +listaDeNodes.get(3).getSubArv().get(0).getName());
		System.out.println(listaDeNodes.get(4).getName() + " - " +listaDeNodes.get(4).getSubArv().get(0).getName());
		System.out.println(listaDeNodes.get(5).getName() + " - " +listaDeNodes.get(5).getSubArv().get(0).getName());
		System.out.println(listaDeNodes.get(7).getName() + " - " +listaDeNodes.get(7).getSubArv().get(0).getName());
		System.out.println(listaDeNodes.get(8).getName() + " - " +listaDeNodes.get(8).getSubArv().get(0).getName());
		System.out.println(listaDeNodes.get(9).getName() + " - " +listaDeNodes.get(9).getSubArv().get(0).getName());
		System.out.println(listaDeNodes.get(10).getName() + " - " +listaDeNodes.get(10).getSubArv().get(0).getName());
		System.out.println(listaDeNodes.get(16).getName() + " - " +listaDeNodes.get(16).getSubArv().get(0).getName());
		System.out.println("");
		
		for(int i = 11; i < 16; i++) {

			System.out.println(listaDeNodes.get(i).getName() + " " + listaDeNodes.get(i).getValue());
				
		}		
	
		for(int i = 17; i <listaDeNodes.size(); i++) {

			System.out.println(listaDeNodes.get(i).getName() + " " + listaDeNodes.get(i).getValue());
				
		}	
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
