package view;

import java.util.Scanner;

public class ConsoleView {
    
    private Scanner scanner;

    public ConsoleView() {
        this.scanner = new Scanner(System.in);
    }

    public int lerEntrada() {
        System.out.println("Digite 1 para notificar chegada ou outro número para sair.");
        return scanner.nextInt();
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

}
