package br.com.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

public class ExercicioLista2 {

	public static void main(String[] args) {
		/*
		 * Utilizando uma lista, fa�a um programa que fa�a 5 perguntas para uma pessoa
		 * sobre um crime. As perguntas s�o:
		 * 1. Telefonou para a v�tima?
		 * 2. Esteve no local do crime?
		 * 3. Mora perto da v�tima?
		 * 4. Devia para a v�tima?
		 * 5. J� trabalhou com a v�tima?
		 * 
		 * Se a pessoa responder com "Sim" a 2 quest�es, ela deve ser classificada como "Suspeita",
		 * entre 3 e 4 como "C�mplice" e 5 como "Assassina". Caso contr�rio, ela ser� classificada como "Inocente".
		 * 
		 * Respostas esperadas para cada pergunta: "Sim" ou "N�o".
		 */
		
		List<String> respostas = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int pergunta = 0;
		String temp;
		while(pergunta < 5) {
			temp = "";
			switch(pergunta) {
				case 0:
					System.out.println("Telefonou para a v�tima?");
					temp = sc.nextLine();
					if (temp.equalsIgnoreCase("Sim")) {
						respostas.add(temp);
						pergunta++;
					}else if (temp.equalsIgnoreCase("N�o"))
						pergunta++;
					break;
				case 1:
					System.out.println("Esteve no local do crime?");
					temp = sc.nextLine();
					if (temp.equalsIgnoreCase("Sim")) {
						respostas.add(temp);
						pergunta++;
					}else if (temp.equalsIgnoreCase("N�o"))
						pergunta++;
					break;
				case 2:
					System.out.println("Mora perto da v�tima?");
					temp = sc.nextLine();
					if (temp.equalsIgnoreCase("Sim")) {
						respostas.add(temp);
						pergunta++;
					}else if (temp.equalsIgnoreCase("N�o"))
						pergunta++;
					break;
				case 3:
					System.out.println("Devia para a v�tima?");
					temp = sc.nextLine();
					if (temp.equalsIgnoreCase("Sim")) {
						respostas.add(temp);
						pergunta++;
					}else if (temp.equalsIgnoreCase("N�o"))
						pergunta++;
					break;
				case 4:
					System.out.println("J� trabalhou com a v�tima?");
					temp = sc.nextLine();
					if (temp.equalsIgnoreCase("Sim")) {
						respostas.add(temp);
						pergunta++;
					}else if (temp.equalsIgnoreCase("N�o"))
						pergunta++;
					break;
			}
		}
		
		int veredito = respostas.size();
		switch (veredito) {
		case 0:
		case 1:
			System.out.println("Inocente");
			break;
		case 2:
			System.out.println("Suspeita");
			break;
		case 3:
		case 4:
			System.out.println("C�mplice");
			break;
		case 5:
			System.out.println("Assassina");
			break;
		default:
			break;
		}
		
	}

}
