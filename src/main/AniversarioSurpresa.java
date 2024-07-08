package main;

import controller.Namorada;
import controller.PorteiroController;
import view.ConsoleView;

public class AniversarioSurpresa {
    
    public static void main(String[] args) {
        Namorada namorada = new Namorada();
        ConsoleView view = new ConsoleView();
        PorteiroController porteiro = new PorteiroController(view);

        porteiro.addChegadaAniversarianteObserver(namorada);

        porteiro.iniciar();
    }
}
