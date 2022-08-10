package domain;

import java.util.ArrayList;

public  class Maquina extends Jugadores {
    private String name;
    private String color;
    private ArrayList<Ficha> fichaJugador;
    private Carcel jail;
    private Comodin poderesFichas;

    public Maquina(String color){

        name = "Maquina";
        this.color=color;
        poderesFichas = new Comodin();
        jail = new Carcel(color);
        ArrayList<Ficha> fichas = randomFichas();
        this.fichaJugador = fichas;
        for (int i = 0; i < fichaJugador.size(); i++){
            jail.setCardOnJail(fichaJugador.get(i));
        }

    }

    private ArrayList<Ficha> randomFichas(){
        ArrayList<Ficha> randomFichas = new ArrayList<Ficha>();
        randomFichas.add(new Ventajosa(color, name));
        randomFichas.add(new Ingeniera(color, name));
        randomFichas.add(new Saltarina(color, name));
        randomFichas.add(new Normal(color, name));
        ArrayList<Ficha> lasFichasDelJugador = new ArrayList<Ficha>();
        for (int i = 1; i < 5; i++){
            int randomLaFicha = (int) Math.floor(Math.random()*randomFichas.size());
            lasFichasDelJugador.add(randomFichas.get(randomLaFicha));
        }
        return lasFichasDelJugador;
    }
    /**
     * Regresa las fichas que posee un jugador
     * @return fichas en un arreglo
     */
    public ArrayList<Ficha> giveTheFichasOfPlayer(){
        return fichaJugador;
    }
     /**
     * Mata una ficha y lo manda a la carcel
     * @param card
     */
    public void killCard(Ficha card){
        for (int i = 0; i < fichaJugador.size(); i++){
            if(fichaJugador.get(i) == card){
                jail.setCardOnJail(fichaJugador.get(i));
            }
        }
    }
    /**
     * Regresa el nombre del jugador
     * @return
     */
    public String getNamePlayer(){
        return this.name;
    }
    public int readComodin(int x){
        poderesFichas.chooseRandomComodin();
        if(poderesFichas.regresaComodin() == "retroceder"){
            return fichaJugador.get(x).activatePower(-5);
        }
        else if (poderesFichas.regresaComodin() == "avanzar"){
            return fichaJugador.get(x).activatePower(5);
        }
        else if (poderesFichas.regresaComodin() == "Irse a la carcel"){
            return fichaJugador.get(x).activatePower(0);
        }
        else if(poderesFichas.regresaComodin() == "Sacar de la carcel"){
            return fichaJugador.get(x).activatePower(1);
        }
        return -1;
    }

    public Ficha saleDeLaCarcel(int valorDice1, int valorDice2){
        return jail.guaranteeToLeave(valorDice1, valorDice2);
    }

    public void entraCarcel(Ficha ficha){
        for (int i = 0; i < fichaJugador.size(); i++){
            if (ficha == fichaJugador.get(i)){
                fichaJugador.get(i).entryJail();
                jail.setCardOnJail(fichaJugador.get(i));
            }
        }
    }

    public Ficha searchFichaType(String type){
        for (int i = 0; i < fichaJugador.size(); i++){
            if (fichaJugador.get(i).getTypeOfFicha() == type){
                return fichaJugador.get(i);
            }
        }
        return null;
    }

    public Ficha searchForIndex(int x){
        return fichaJugador.get(x);
    }

    public Carcel getCarcelJugador(){
        return this.jail;
    }

    public ArrayList<Ficha> getFichasJugador(){
        return fichaJugador;
    }

    public String giveMeColorPlayer(){
        return color;
    }
}
