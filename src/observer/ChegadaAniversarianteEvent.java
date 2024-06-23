package observer;

import java.util.Date;

public class ChegadaAniversarianteEvent {

    private final Date horaDataChegada;

    public ChegadaAniversarianteEvent(Date horaDataChegada) {
        this.horaDataChegada = horaDataChegada;
    }

    public Date getHoraDataChegada() {
        return horaDataChegada;
    }

    

    
}
