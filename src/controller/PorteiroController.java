package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import view.ConsoleView;

import model.ChegadaAniversarianteEvent;

public class PorteiroController {
    
    private List<ChegadaAniversarianteObserver> observers;
    private ConsoleView view;

    public PorteiroController(ConsoleView view){
        this.observers = new ArrayList<>();
        this.view = view;
    }
    
    public void addChegadaAniversarianteObserver(ChegadaAniversarianteObserver observer){
        this.observers.add(observer);
    }

    public void iniciar() {
        while (true) {
            int valor = view.lerEntrada();

            if (valor == 1) {
                ChegadaAniversarianteEvent event = new ChegadaAniversarianteEvent(new Date());

                for (ChegadaAniversarianteObserver observer : observers) {
                    observer.chegou(event);
                }
            } else {
                view.mostrarMensagem("Saindo...");
                break;
            }
        }
    }
    

}
