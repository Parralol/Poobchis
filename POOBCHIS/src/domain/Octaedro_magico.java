package domain;

public class Octaedro_magico {
    private int numDice;
    /**
     * Constructor Octaedro Magico
     */

    public Octaedro_magico(){
    }
    public void rollDiceRandom(){
        int valorDado = (int) Math.floor(Math.random()*8+1);
        if (valorDado == 9){
            this.numDice = 1;
        }
        else {
            this.numDice = valorDado;
        }
    }
    public int getNumOfTheDice(){
        return numDice;
    }
}
