package CanvasD12;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01Fila {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		
		int op;
		
		do {
			
			System.out.println("\n****************************************");
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retiar Cliente da Fila");
			System.out.println("0 - Sair\n");
			System.out.println("\n****************************************");
			System.out.println("\n\tDigite uma opção: ");
			op = leia.nextInt();
			
		
			switch(op) {
			case 1:
				leia.nextLine();
				System.out.println("Digite o nome:");
				String nome = leia.nextLine();
				if(nome.isEmpty()) {
					System.out.println("O nome não pode ser adicionado");
				}else {
				fila.add(nome);
				System.out.println("Cliente adicionado!");
				
				}
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("Lista de Clientes da fila:");
			
				for(Iterator<String> it = fila.iterator();it.hasNext();) {
					System.out.println(it.next());
				}
				break;
				
			case 3:
				leia.nextLine();
				
				if(fila.isEmpty() == true) {
					System.out.println("A Fila está vazia!");
				}else {
					System.out.printf("\nO Cliente %s foi chamado!",fila.poll());
					System.out.println("\nFila: \n");
					
					for(Iterator<String> it = fila.iterator();it.hasNext();) {
						System.out.println(it.next());
					}
					System.out.println();
					
				}
				break;
				
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
				
				default:
					System.out.println("\nOpção inválida.");
			}
			
			
		}while(op !=0);

	}

}