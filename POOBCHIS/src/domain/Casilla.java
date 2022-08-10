package domain;
import java.util.ArrayList;

/**
 * Clase Casilla
 */
public class Casilla{

    private String typeCasilla;
    private ArrayList<Ficha> fichasOnCasilla;
    
    /**
     * Constructor de la clase Casilla
     */
    public Casilla(){   
        fichasOnCasilla = new ArrayList<Ficha>();
    }

    /**
     * Metodo que regresa de que tipo es la casilla
     * @return tipo de casilla (String)
     */
    public String casillaType(){
        return typeCasilla;
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

    public ArrayList<Ficha> giveMeFichasCasilla(){
        return fichasOnCasilla;
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

}

