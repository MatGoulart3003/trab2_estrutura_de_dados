package br.edu.univas.vo;

import java.util.ArrayList;

public class Node {
	
	private String name;
	private int value;
	private int quant;
	private ArrayList<Node> subArv = new ArrayList<>();
	
	public ArrayList<Node> getSubArv() {
		return subArv;
	}
	public void setFilhos(ArrayList<Node> subArv) {
		this.subArv = subArv;
	}
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	@Override
	public String toString() {
		return "Node [name=" + name + ", value=" + value + ", quant=" + quant + ", subArv=" + subArv + "]";
	}
	
	
	
	
}
