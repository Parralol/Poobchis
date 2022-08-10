package domain;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * Clase POOBchis
 */
public class POOBCHIS{

    private int players;
    private int numDice;
    private Dice dado;
    private ArrayList<Player> jugador;
    private HashMap<String, Casilla> tablero;
    private Board board;

    /**
     * Constructor de la clase POOBchis
     * @param player
     */
    public POOBCHIS(int playerOnPOOBchis, ArrayList<Player> jugador, Dice dado, HashMap<String,Casilla> tablero){
        this.jugador = jugador;
        this.dado = dado;
        this.tablero = tablero;

    }

    /**
     * Recarga del constructor de la clase POOBchis
     */
    public POOBCHIS(){

    }

    /**
     * Agrega el jugador uno a la partida con su color y su nombre
     * @param name
     * @param colorPlayer
     */
    public void setPlayersOne(String name, String colorPlayer, ArrayList<Ficha> fichas){
        Player jugadorrand  = new Player(name, colorPlayer, fichas);
        
    }

    /**
     * Devuelve el valor del dado
     * @return valor dado (int)
     */
    public int getNumDice(){
        this.numDice = dado.getNumOfTheDice();
        return numDice;
    }

    /**
     * Metodo que hace girar el dado
     */
    public void rollDice(){
        dado.rollDiceRandom();
    }

    public void turnPlayer(){

    }

    public void movePlayer(String player){

    }

    public void diePlayer(){

    }

    public boolean checkCanMater(){
        return false;
    }

}
    
