package domain;

import java.util.ArrayList;

/**
 * Clase Seguro que extiende Casilla
 */
/**
 * Clase Seguro que extiende Casilla
 */
public class Seguro extends Casilla{

    private boolean sure;
    private ArrayList<Ficha> fichasOnCasilla;

    /**
     * Construtor de la clase Seguro
     */
    public Seguro(){
        fichasOnCasilla = new ArrayList<Ficha>();
        this.sure = true;
    }

    /**
     * Metodo que avisa que esta en una casilla segura
     * @return es seguro (Boolean)
     */
    public boolean isSure(){
        return sure;
    }

    /**
     * Agrega un ficha a la casilla
     * @param ficha
     */
    public void setFichaOnCasilla(Ficha ficha){
        if (fichasOnCasilla.size() <= 2){
            this.fichasOnCasilla.add(ficha);
        }
        //mandar excepcion que tiene una cantidad de fichas que excede la cantidad permitida por la casilla
    }

    public void saleFichaCasilla(Ficha ficha){
        for (int i = 0; i < fichasOnCasilla.size(); i++){
            if (fichasOnCasilla.get(i) == ficha){
                this.fichasOnCasilla.remove(ficha);
            }
        }
    }

    /**
     * Todas la fichas en la casilla estan seguras
     */
    public void allFichasSureOnCasillaSure(){
        for (int i = 0; i < fichasOnCasilla.size(); i++){
            this.fichasOnCasilla.get(i).setIsSure();
        }
    }

    public int cantidadDeFichasEnLaCasilla(){
        return fichasOnCasilla.size();
    }

    /**
     * Comprueba si se hace un bloquea o si se mata una ficha
     */
    public void comprobateBlockOrKill(){
        if (fichasOnCasilla.get(0).colorFicha() == fichasOnCasilla.get(1).colorFicha()){
            block();
        }
        else if (fichasOnCasilla.get(0).getPositionFicha() > fichasOnCasilla.get(1).getPositionFicha()){
            this.fichasOnCasilla.get(0).entryJail();
        }

        else if (fichasOnCasilla.get(0).getPositionFicha() < fichasOnCasilla.get(1).getPositionFicha()){
            this.fichasOnCasilla.get(1).entryJail();
        }
    }
    
    public boolean block(){
        return true;
    }

    public ArrayList<Ficha> giveMeFichasCasilla(){
        return fichasOnCasilla;
    }

}

