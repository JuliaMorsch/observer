package observer;

public class Namorada implements ChegadaAniversarianteObserver {
    
    @Override
    public void chegou(ChegadaAniversarianteEvent event){
        System.out.println("Vamos apagar as luzes...");
        System.out.println("Vamos fazer silêncio...");
        System.out.println("Surpresa aniversariante!!!");
    }

}