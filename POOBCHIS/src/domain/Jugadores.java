package domain;

import java.util.ArrayList;

public abstract class Jugadores {

    public abstract ArrayList<Ficha> giveTheFichasOfPlayer();
     /**
     * Mata una ficha y lo manda a la carcel
     * @param card
     */
    public abstract void killCard(Ficha card);

    /**
     * Regresa el nombre del jugador
     * @return
     */
    public abstract String getNamePlayer();

}
  
