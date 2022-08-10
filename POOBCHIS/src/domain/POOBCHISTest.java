package domain;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

//import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class POOBCHISTest {

    private ArrayList<Ficha> fichas;
    private ArrayList<Player> jugadores;
    private Ficha ficha1;
    private Ficha ficha2;
    private Ficha ficha3;
    private Ficha ficha4;
    private Board tablero;

//import org.junit.internal.runners.statements.Fail;

    @Before
    public void setUp(){

        
        jugadores = new ArrayList<Player>();
        fichas = new ArrayList<Ficha>(); 
        ficha1 = new Ventajosa("green", "Parralol");
        ficha2 = new Saltarina("blue", "Parralol");
        ficha3 = new Ingeniera("red", "Parralol");
        ficha4 = new Ventajosa("yellow", "Parralol");
        fichas.add(ficha1);
        fichas.add(ficha2);
        fichas.add(ficha3);
        fichas.add(ficha4);
        jugadores.add(new Player("Parralol", "Yellow", fichas));
        jugadores.add(new Player("Azar", "blue"));
        tablero = new Board(jugadores.size(), jugadores);
    }

    @After
    public void tearDown()
    {

    }    

    @Test
    public void shouldReturnColorFicha(){
        String a = ficha1.colorFicha();
        assertEquals("green", a);
        String b = ficha2.colorFicha();
        assertEquals("blue", b);
        String c = ficha3.colorFicha();
        assertEquals("red", c);
        String d = ficha4.colorFicha();
        assertEquals("yellow", d);

    }

    @Test
    public void shouldGetPlayers(){
        for(int i =0; i<=jugadores.size(); i++){
            if(i==0){
                assertEquals( "Parralol",jugadores.get(i).getNamePlayer());
                assertArrayEquals(fichas.toArray(new Ficha[0]), jugadores.get(i).giveTheFichasOfPlayer().toArray(new Ficha[0]));
            }
            if(i==1){
                assertEquals( "Azar",jugadores.get(i).getNamePlayer());
            }
        }
    }

    @Test
    public void shouldBeReleasedFromPrision(){
        assertEquals(jugadores.get(0).saleDeLaCarcel(1, 1).comprobateOnJail(), false);
    }

    @Test
    public void shouldBeOnJailIfHasNotMove(){
        assertEquals(jugadores.get(0).searchForIndex(1).comprobateOnJail(), true);
    }

    @Test
    public void shouldChangeShifts(){
        assertEquals(tablero.turnPlayer(), "Parralol");
        assertEquals(tablero.turnPlayer(), "Azar");
        assertEquals(tablero.turnPlayer(), "Parralol");
        assertEquals(tablero.turnPlayer(), "Azar");
    }

    @Test
    public void shouldGetOutOfJailOnBoard(){
        Ventajosa one = new Ventajosa("Azul", "Nadie");
        Saltarina two = new Saltarina("Azul", "Nadie");
        Ingeniera tree = new Ingeniera("Azul", "Nadie");
        Normal four = new Normal("Azul", "Nadie");
        ArrayList<Ficha> fichas = new ArrayList<Ficha>();
        fichas.add(one);
        fichas.add(two);
        fichas.add(tree);
        fichas.add(four);
        Ventajosa one1 = new Ventajosa("Amarillo", "lol");
        Saltarina two1 = new Saltarina("Amarillo", "lol");
        Ingeniera tree1 = new Ingeniera("Amarillo", "lol");
        Normal four1 = new Normal("Amarillo", "lol");
        ArrayList<Ficha> fichas1 = new ArrayList<Ficha>();
        fichas1.add(one1);
        fichas1.add(two1);
        fichas1.add(tree1);
        fichas1.add(four1);
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(new Player("Azul", "Nadie", fichas));
        players.add(new Player("Amarillo", "lol", fichas1));
        Board tablerito = new Board(2, players);
        if (tablerito.turnPlayer() == "Nadie"){
            tablerito.fichaSaleCarcelPlayer(2, 2);
            HashMap<String, Casilla> testBoard = tablerito.giveMeTheBoard();
            int fichasCasilla = testBoard.get("33").cantidadDeFichasEnLaCasilla();
            assertEquals(1, fichasCasilla);
        }
    }

    @Test
    public void shouldMoveFicha(){
        Ventajosa one = new Ventajosa("Azul", "Nadie");
        Saltarina two = new Saltarina("Azul", "Nadie");
        Ingeniera tree = new Ingeniera("Azul", "Nadie");
        Normal four = new Normal("Azul", "Nadie");
        ArrayList<Ficha> fichas = new ArrayList<Ficha>();
        fichas.add(one);
        fichas.add(two);
        fichas.add(tree);
        fichas.add(four);
        Ventajosa one1 = new Ventajosa("Amarillo", "lol");
        Saltarina two1 = new Saltarina("Amarillo", "lol");
        Ingeniera tree1 = new Ingeniera("Amarillo", "lol");
        Normal four1 = new Normal("Amarillo", "lol");
        ArrayList<Ficha> fichas1 = new ArrayList<Ficha>();
        fichas1.add(one1);
        fichas1.add(two1);
        fichas1.add(tree1);
        fichas1.add(four1);
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(new Player("Azul", "Nadie", fichas));
        players.add(new Player("Amarillo", "lol", fichas1));
        Board tablerito = new Board(2, players);
        if (tablerito.turnPlayer() == "Nadie"){
            tablerito.fichaSaleCarcelPlayer(2, 2);
            tablerito.moveFichaPlayerInTablero(4,3);
            HashMap<String, Casilla> testBoard = tablerito.giveMeTheBoard();
            int fichasCasilla = testBoard.get("37").cantidadDeFichasEnLaCasilla();
            assertEquals(1, fichasCasilla);
        }
    }




    @Test
    public void shouldMove(){
        Ventajosa one = new Ventajosa("Azul", "Nadie");
        Saltarina two = new Saltarina("Azul", "Nadie");
        Ingeniera tree = new Ingeniera("Azul", "Nadie");
        Normal four = new Normal("Azul", "Nadie");
        ArrayList<Ficha> fichas = new ArrayList<Ficha>();
        fichas.add(one);
        fichas.add(two);
        fichas.add(tree);
        fichas.add(four);
        Ventajosa one1 = new Ventajosa("Amarillo", "lol");
        Saltarina two1 = new Saltarina("Amarillo", "lol");
        Ingeniera tree1 = new Ingeniera("Amarillo", "lol");
        Normal four1 = new Normal("Amarillo", "lol");
        ArrayList<Ficha> fichas1 = new ArrayList<Ficha>();
        fichas1.add(one1);
        fichas1.add(two1);
        fichas1.add(tree1);
        fichas1.add(four1);
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(new Player("Azul", "Nadie", fichas));
        players.add(new Player("Amarillo", "lol", fichas1));
        Board tablerito = new Board(2, players);
        if (tablerito.turnPlayer() == "Nadie"){
            tablerito.moveFicha(4, 3);
            HashMap<String, Casilla> testBoard = tablerito.giveMeTheBoard();
            int fichasCasilla = testBoard.get("37").cantidadDeFichasEnLaCasilla();    
            assertEquals(1, fichasCasilla);
            tablerito.moveFicha(3, 3);
            HashMap<String, Casilla> testBoardAgain = tablerito.giveMeTheBoard();
            int fichasCasillaAgain = testBoardAgain.get("40").cantidadDeFichasEnLaCasilla();  
            assertEquals(1, fichasCasillaAgain);
        }
    }
}