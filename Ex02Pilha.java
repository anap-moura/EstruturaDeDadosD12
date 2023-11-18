package CanvasD12;

import java.util.Scanner;
import java.util.Stack;

public class Ex02Pilha {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Stack<String> pilhaDeLivros = new Stack<>();

        int opcao;
        do {
            System.out.println("\t*****Menu*****");
            System.out.println("1 - Adicionar Livro na pilha");
            System.out.println("2 - Listar todos os Livros");
            System.out.println("3 - Retirar Livro da pilha");
            System.out.println("0 - Sair.");
            System.out.println("\t**************");
            System.out.print("Escolha a opção desejada: ");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    
                    leia.nextLine();
                    System.out.print("Digite o nome do livro a ser adicionado: ");
                    String nomeLivro = leia.nextLine();
                    pilhaDeLivros.push(nomeLivro);
                    System.out.println("Livro adicionado!\n");
                    break;
                case 2:
                    if (pilhaDeLivros.isEmpty()) {
                        System.out.println("A pilha está vazia :(\n");
                    } else {
                        System.out.println("Lista de Livros na Pilha:");
                        for (String livro : pilhaDeLivros) {
                            System.out.println(livro);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    if (pilhaDeLivros.isEmpty()) {
                        System.out.println("Pilha vazia :( \n");
                    } else {
                        String livroRetirado = pilhaDeLivros.pop();
                        System.out.println("Livro retirado: " + livroRetirado + "\n");
                    }
                    break;
                case 0:
                    System.out.println("Programa Finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida. Digite as opções de 1 a 3.\n");
                    break;
            }

        } while (opcao != 0);

    }
}