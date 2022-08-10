package domain;

import java.util.ArrayList;
import java.util.HashMap;

public class Board {

    private HashMap<String, Casilla> tablero;
    private ArrayList<Player> jugadores;
    private int turn;
    private int juagdoresOnTablero;

    public Board(int juagdoresOnTablero, ArrayList<Player> players) {
        this.tablero = new HashMap<String, Casilla>();
        for (int i = 1; i < 41; i++) {
            String num = String.valueOf(i);
            if (i % 2 == 0 && i != 10 && i != 20 && i != 30 && i != 40) {
                Comodin poder = new Comodin();
                this.tablero.put(num, poder);
            }

            if (i == 3 || i == 7 || i == 13 || i == 17 || i == 23 || i == 27 || i == 33 || i == 37) {
                Seguro sure = new Seguro();
                this.tablero.put(num, sure);
            }

            if (i == 10 || i == 20 || i == 30 || i == 40) {
                Final finalStretch = new Final();
                this.tablero.put(num, finalStretch);
            }
            Casilla normal = new Casilla();
            this.tablero.put(num, normal);
        }
        this.juagdoresOnTablero = juagdoresOnTablero;
        this.jugadores = players;
        this.turn = -1;
    }

    public int jugadoresJugando() {
        return juagdoresOnTablero;
    }

    public int playerInTurn() {
        return turn;
    }

    public String turnPlayer() {
        if (turn > jugadores.size()) {
            this.turn = -1;
        }
        if (turn < jugadores.size() - 1) {
            this.turn++;
            return jugadores.get(turn).getNamePlayer();

        }

        return "nada";
    }

    public void fichaSaleCarcelPlayer(int dice1, int dice2) {
            int i = turn;
            if(turn == -1 ){
                i+=1;
                if(jugadores.get(i).getNamePlayer() == jugadores.get(turn+1).getNamePlayer()){
                    System.out.println(jugadores.get(i).getNamePlayer());
                    Ficha fichaOut = jugadores.get(i).saleDeLaCarcel(dice1, dice2);
                    if (fichaOut != null) {
                        fichaOut.saleJail();
                    
                        // jugadores.get(i).saleDeLaCarcel(dice1, dice2).saleJail();
                        if (fichaOut.colorFicha() == "Amarillo") {
                            jugadores.get(i).updatePosition(fichaOut, 23);
                            fichaOut.setPositionFicha(23);
                            this.tablero.get("23").setFichaOnCasilla(fichaOut);
                            
                            
                        } else if (fichaOut.colorFicha() == "Azul") {
                            jugadores.get(i).updatePosition(fichaOut, 33);
                            fichaOut.setPositionFicha(33);
                            this.tablero.get("33").setFichaOnCasilla(fichaOut);
                            
                            
                        } else if (fichaOut.colorFicha() == "Rojo") {
                            jugadores.get(i).updatePosition(fichaOut, 13);
                            fichaOut.setPositionFicha(13);
                            this.tablero.get("13").setFichaOnCasilla(fichaOut);
                            
                            
                        } else if (fichaOut.colorFicha() == "Verde") {
                            jugadores.get(i).updatePosition(fichaOut, 3);
                            fichaOut.setPositionFicha(3);
                            this.tablero.get("3").setFichaOnCasilla(fichaOut);
                            
                            
                        }
                }
            }
            else if (turn > -1){ 
                i+=1;
                if (jugadores.get(i).getNamePlayer() == jugadores.get(turn+1).getNamePlayer()) {
                    System.out.println(jugadores.get(i).getNamePlayer());
                    Ficha fichaOut = jugadores.get(i).saleDeLaCarcel(dice1, dice2);
                    if (fichaOut != null) {
                        fichaOut.saleJail();
                        
                        // jugadores.get(i).saleDeLaCarcel(dice1, dice2).saleJail();
                        if (fichaOut.colorFicha() == "Amarillo") {
                            jugadores.get(i).updatePosition(fichaOut, 23);
                            fichaOut.setPositionFicha(23);
                            this.tablero.get("23").setFichaOnCasilla(fichaOut);
                            
                            
                        } else if (fichaOut.colorFicha() == "Azul") {
                            jugadores.get(i).updatePosition(fichaOut, 33);
                            fichaOut.setPositionFicha(33);
                            this.tablero.get("33").setFichaOnCasilla(fichaOut);
                            
                            
                        } else if (fichaOut.colorFicha() == "Rojo") {
                            jugadores.get(i).updatePosition(fichaOut, 13);
                            fichaOut.setPositionFicha(13);
                            this.tablero.get("13").setFichaOnCasilla(fichaOut);
                            
                            
                        } else if (fichaOut.colorFicha() == "Verde") {
                            jugadores.get(i).updatePosition(fichaOut, 3);
                            fichaOut.setPositionFicha(3);
                            this.tablero.get("3").setFichaOnCasilla(fichaOut);
                            
                            
                        }
                    }
                } else {
                    noSaleFichaAun();
                }
            }
        }
        System.out.println(turn);
    }

    public void moveFichaPlayerInTablero(int valor, int x) {
        for (int i = 0; i < jugadores.size(); i++) {
            if(turn == -1){
                if (jugadores.get(i).getNamePlayer() == jugadores.get(turn+1).getNamePlayer()) {
                    if (jugadores.get(i).searchForIndex(x).comprobateOnJail() == false) {
                        int moves = jugadores.get(i).searchForIndex(x).getPositionFicha();
                        Ficha fichaMove = jugadores.get(i).searchForIndex(x);
                        String keyBoard = String.valueOf(moves);
                        this.tablero.get(keyBoard).saleFichaCasilla(fichaMove);
                        int j = moves + valor;
                        if (j % 2 == 0 && j != 10 && j != 20 && j != 30 && j != 40) {
                            // lee el comodin y reacciones segun sea el comodin random que salga
                            int movePlusComodin = jugadores.get(i).readComodin(x);
                            if (movePlusComodin == 0) {
                                jugadores.get(i).entraCarcel(fichaMove);
                            }
                            if (movePlusComodin == 1) {
                                fichaSaleCarcelPlayer(1, 1);
                            }
                            String newJ = String.valueOf(j + movePlusComodin);
                            fichaMove.setPositionFicha(j + movePlusComodin);
                            this.tablero.get(newJ).setFichaOnCasilla(fichaMove);
                        }
                        if (j == 3 || j == 7 || j == 13 || j == 17 || j == 23 || j == 27 || j == 33 || j == 37) {
                            // Vueleve segura la casilla que esta en movimiento ademas de moverla
                            String newKey = String.valueOf(moves + valor);
                            fichaMove.setPositionFicha(moves + valor);
                            fichaMove.setIsSure();
                            this.tablero.get(newKey).setFichaOnCasilla(fichaMove);
                        }
                        if (j == 10 || j == 20 || j == 30 || j == 40) {
                            String newKey = String.valueOf(moves + valor);
                            fichaMove.setPositionFicha(moves + valor);
                            this.tablero.get(newKey).setFichaOnCasilla(fichaMove);
                        }
                        String newKey = String.valueOf(moves + valor);
                        fichaMove.setPositionFicha(moves + valor);
                        this.tablero.get(newKey).setFichaOnCasilla(fichaMove);
                    }
                }
            }
            else{
                if (jugadores.get(i).getNamePlayer() == jugadores.get(turn).getNamePlayer()) {
                    if (jugadores.get(i).searchForIndex(x).comprobateOnJail() == false) {
                        int moves = jugadores.get(i).searchForIndex(x).getPositionFicha();
                        Ficha fichaMove = jugadores.get(i).searchForIndex(x);
                        String keyBoard = String.valueOf(moves);
                        this.tablero.get(keyBoard).saleFichaCasilla(fichaMove);
                        int j = moves + valor;
                        if (j % 2 == 0 && j != 10 && j != 20 && j != 30 && j != 40) {
                            // lee el comodin y reacciones segun sea el comodin random que salga
                            int movePlusComodin = jugadores.get(i).readComodin(x);
                            if (movePlusComodin == 0) {
                                jugadores.get(i).entraCarcel(fichaMove);
                            }
                            if (movePlusComodin == 1) {
                                fichaSaleCarcelPlayer(1, 1);
                            }
                            String newJ = String.valueOf(j + movePlusComodin);
                            fichaMove.setPositionFicha(j + movePlusComodin);
                            this.tablero.get(newJ).setFichaOnCasilla(fichaMove);
                        }
                        if (j == 3 || j == 7 || j == 13 || j == 17 || j == 23 || j == 27 || j == 33 || j == 37) {
                            // Vueleve segura la casilla que esta en movimiento ademas de moverla
                            String newKey = String.valueOf(moves + valor);
                            fichaMove.setPositionFicha(moves + valor);
                            fichaMove.setIsSure();
                            this.tablero.get(newKey).setFichaOnCasilla(fichaMove);
                        }
                        if (j == 10 || j == 20 || j == 30 || j == 40) {
                            String newKey = String.valueOf(moves + valor);
                            fichaMove.setPositionFicha(moves + valor);
                            this.tablero.get(newKey).setFichaOnCasilla(fichaMove);
                        }
                        String newKey = String.valueOf(moves + valor);
                        fichaMove.setPositionFicha(moves + valor);
                        this.tablero.get(newKey).setFichaOnCasilla(fichaMove);
                    }
                }
            }
        }
    }

    public String noSaleFichaAun() {
        return "No sale ficha aun";
    }

    public HashMap<String, Casilla> giveMeTheBoard() {
        return tablero;
    }

    public int giveCarcelJugador(String color) {
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).giveMeColorPlayer() == color) {
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Ficha> giveFichaslJugador() {
            return jugadores.get(turn).getFichasJugador();

    }

    public int fichasCasillasInTablero(String identificadorCasilla) {
            return tablero.get(identificadorCasilla).cantidadDeFichasEnLaCasilla();
       
    }

    public String fichaColorCasillaOnTablero(String identificadorCasilla) {
        ArrayList<Ficha> fichitas = tablero.get(identificadorCasilla).giveMeFichasCasilla();
        return fichitas.get(0).colorFicha();
    }

    public String giveMeJugadorTurno() {
        return jugadores.get(turn).getNamePlayer();
    }

    public ArrayList<Carcel> allJails() {
        ArrayList<Carcel> jails = new ArrayList<Carcel>();
        if (jugadores.size() <= 4){
            int value = 4 - jugadores.size(); 
            for (int i = 0; i < jugadores.size() + value-2; i++) {
                if (i <= jugadores.size()-1){
                    jails.add(jugadores.get(i).getCarcelJugador());
                }
                else{
                Carcel jailRandom = new Carcel("anything");
                jails.add(jailRandom);
                }
            }
        }
        return jails;
    }
    public String playerinTurn(){
        if(turn == -1){
            return jugadores.get(turn+1).getNamePlayer();
        }
        else{

            return jugadores.get(turn).getNamePlayer();
        }
    }

    public void moveFicha(int valor, int x){
        if(turn == -1){
            int i = turn + 1;
            if (jugadores.get(i).getNamePlayer() == jugadores.get(turn+1).getNamePlayer()){
                Ficha thing = jugadores.get(i).searchForIndex(x);
                int moves = jugadores.get(i).searchForIndex(x).getPositionFicha();
                System.out.println(moves);
                String newMoves = String.valueOf(moves);
                this.tablero.get(newMoves).saleFichaCasilla(thing);
                int newValor = moves + valor;
                thing.setPositionFicha(newValor);
                System.out.println(newValor);
                jugadores.get(i).updatePosition(thing, newValor);
                String newPosition = String.valueOf(newValor);
                this.tablero.get(newPosition).setFichaOnCasilla(thing);

            }
        }
        else if(turn > -1){
            int i = turn + 1;
            if (jugadores.get(i).getNamePlayer() == jugadores.get(turn+1).getNamePlayer()){
                Ficha thing = jugadores.get(i).searchForIndex(x);
                int moves = jugadores.get(i).searchForIndex(x).getPositionFicha();
                System.out.println(moves);
                String newMoves = String.valueOf(moves);
                this.tablero.get(newMoves).saleFichaCasilla(thing);
                int newValor = moves + valor;
                thing.setPositionFicha(newValor);
                System.out.println(newValor);
                jugadores.get(i).updatePosition(thing, newValor);
                String newPosition = String.valueOf(newValor);
                this.tablero.get(newPosition).setFichaOnCasilla(thing);

            }
        }
        
        this.turn+=1;
    }

}
