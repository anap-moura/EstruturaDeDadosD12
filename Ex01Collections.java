package CanvasD12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ex01Collections {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		
		for(int i=0;i<5;i++) {
			System.out.println("\nEscreva a cor número "+(i+1)+": ");
			cores.add(ler.nextLine());
		}
		
		Iterator<String> iterator = cores.iterator();
			
		while(iterator.hasNext()) {
			
			System.out.println("\n" +iterator.next());
		}
		
		
		Collections.sort(cores);
		System.out.println("\n\t Cores ordenadas: ");
		System.out.println("\n"+cores);

	}

}