package domain;

import java.util.ArrayList;

public class Carcel extends Casilla{
        private ArrayList<Ficha> jail;
        private Ficha outpudCard;
        private String jailColor;
        private int timespar;
        //private int index;
        //private int indexEntryJail;
    
        public Carcel(String color){
            jail = new ArrayList<Ficha>();
            //this.indexEntryJail = 0;
            //this.index = 1;
            this.jailColor = color;
            timespar =0;
        }
    
        public Ficha guaranteeToLeave(int valorDice1, int valorDice2){
            if (valorDice1 == valorDice2){
                if (timespar==0){
                    this.outpudCard = jail.get(jail.size()-1);
                    this.jail.remove(jail.get(jail.size()-1));
                    this.outpudCard.saleJail();
                    timespar += 1;
                    System.out.println(timespar);
                    return this.outpudCard;
                }
                else{
                    this.outpudCard = jail.get(jail.size()-1);
                    this.jail.remove(jail.get(jail.size()-1));
                    this.outpudCard.saleJail();
                    timespar += 1;
                    System.out.println(timespar);
                    return this.outpudCard;

                }
            }
            return this.outpudCard;
        }


        public String getColorJail(){
            return jailColor;
        }
    
        public void returnCard(Ficha card){
            this.jail.add(card);
        }
    
        public Ficha cardKilled(){
            return this.outpudCard;
        }
    
        public void setCardOnJail(Ficha ficha){
            ficha.entryJail();
            this.jail.add(ficha);
        }
    
        public void clearJail(){
            jail.clear();
        }

        public int cantidadEnLaCarcel(){
            return jail.size();
        }
}
