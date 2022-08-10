package domain;
import java.util.ArrayList;
/**
 * Clase Comodin que extiende a Casilla
 */
public class Comodin extends Casilla{

    private ArrayList<String> comodines;
    private int eligeRandomComodin;
    private ArrayList<Ficha> fichasOnCasilla;

    /***
     * Constructor de la clase Comodin
     */
    public Comodin(){
        fichasOnCasilla = new ArrayList<Ficha>();
        comodines = new ArrayList<String>();
        comodines.add("retroceder");
        comodines.add("avanzar");
        comodines.add("Irse a la carcel");
        comodines.add("Sacar de la carcel");
    }

    /**
     * Elige un valor aletorio entre el catalogo de comodines
     */
    public void chooseRandomComodin(){
        this.eligeRandomComodin = (int) Math.floor(Math.random()*comodines.size());
    }

    /**
     * Regresa el comodin 
     * @return comodin (String)
     */
    public String regresaComodin(){
        return comodines.get(eligeRandomComodin);
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
