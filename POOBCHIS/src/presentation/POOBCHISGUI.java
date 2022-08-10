package presentation;
import domain.*;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.JFileChooser;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.*;

/**
 * Lista ventanas:
 * 
 * POOBCHISGUI  --  ventana inicial
 * 
 * Fichas       --  Ventana de fichas
 * 
 * j12          --  Ingreso de datos jugadores
 * 
 * ventana1     -- ventana para cargar, guardar o salir.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *     
 */

public class POOBCHISGUI extends JFrame{
    
    public POOBCHISGUI(){
    }

    /*
    Clase para la ventana 1, ventana de POOBCHIS
    */
    public void inicio(){

        Ventana1 inicio = new Ventana1();
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
    }
    /*
    Funcion MAIN para POOBCHIS
    */
    public static void main(String[] args){

        POOBCHISGUI xd = new POOBCHISGUI();
        xd.inicio();
    }
}


class Fichas extends JFrame{
    /**
     * datos
     *
     */
    private  ArrayList<Ficha> fichasj1= new ArrayList<Ficha>();
    private  ArrayList<Ficha> fichasj2=new ArrayList<Ficha>();

    private boolean salidaez1 = false;
    private boolean salidaez2 = false;
    /**
     * fin datos
     */
    private javax.swing.JLabel Title;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel f1_1;
    private javax.swing.JLabel f1_2;
    private javax.swing.JLabel f1_3;
    private javax.swing.JLabel f1_4;
    private javax.swing.JComboBox<String> ficha1;
    private javax.swing.JComboBox<String> ficha2;
    private javax.swing.JComboBox<String> ficha2_1;
    private javax.swing.JComboBox<String> ficha2_2;
    private javax.swing.JComboBox<String> ficha2_3;
    private javax.swing.JComboBox<String> ficha2_4;
    private javax.swing.JComboBox<String> ficha3;
    private javax.swing.JComboBox<String> ficha4;
    private javax.swing.JLabel j1_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton salidafacil;
    private javax.swing.JButton salidafacilj2;
    private javax.swing.JButton siguiente;

    private void setFicha1(String color, String tokenOwner) throws POOBCHISException{
        if(ficha1.getSelectedIndex() > 0){
            if(ficha1.getSelectedIndex() == 1){

                Ventajosa ficha1 = new Ventajosa(color, tokenOwner);
                fichasj1.add(ficha1);

            }
            if(ficha1.getSelectedIndex() == 2){

                Ingeniera ficha1 = new Ingeniera(color, tokenOwner);
                fichasj1.add(ficha1);
                }
            if(ficha1.getSelectedIndex() == 3){

                Saltarina ficha1 = new Saltarina(color, tokenOwner);
                fichasj1.add(ficha1);
                }
            if(ficha1.getSelectedIndex() == 4){

                }
            if(ficha1.getSelectedIndex() == 5){

                }
            if(ficha1.getSelectedIndex() == 6){

                }
 
        }

        else{
            throw new POOBCHISException(POOBCHISException.NO_ELIGIO_NADA);
        }

    }

    private void setFicha2(String color, String tokenOwner) throws POOBCHISException{
        if(ficha2.getSelectedIndex() > 0){           
            if(ficha2.getSelectedIndex() == 1){

                Ventajosa ficha2 = new Ventajosa(color, tokenOwner);
                fichasj1.add(ficha2);

            }
            if(ficha2.getSelectedIndex() == 2){

                Ingeniera ficha2 = new Ingeniera(color, tokenOwner);
                fichasj1.add(ficha2);
            }
            if(ficha2.getSelectedIndex() == 3){

                Saltarina ficha2 = new Saltarina(color, tokenOwner);
                fichasj1.add(ficha2);
            }
            if(ficha2.getSelectedIndex() == 4){

            }
            if(ficha2.getSelectedIndex() == 5){

            }
            if(ficha2.getSelectedIndex() == 6){

            }
        }else{
            throw new POOBCHISException(POOBCHISException.NO_ELIGIO_NADA);
        }
    }
    private void setFicha3(String color, String tokenOwner) throws POOBCHISException{
        if(ficha3.getSelectedIndex() > 0){           
            if(ficha3.getSelectedIndex() == 1){

                Ventajosa ficha3 = new Ventajosa(color, tokenOwner);
                fichasj1.add(ficha3);

            }
            if(ficha3.getSelectedIndex() == 2){

                Ingeniera ficha3 = new Ingeniera(color, tokenOwner);
                fichasj1.add(ficha3);
                }
            if(ficha3.getSelectedIndex() == 3){

                Saltarina ficha3 = new Saltarina(color, tokenOwner);
                fichasj1.add(ficha3);
                }
            if(ficha3.getSelectedIndex() == 4){

                }
            if(ficha3.getSelectedIndex() == 5){

                }
            if(ficha3.getSelectedIndex() == 6){

                }
        }else{
             throw new POOBCHISException(POOBCHISException.NO_ELIGIO_NADA);
        }
    }
    private void setFicha4(String color, String tokenOwner) throws POOBCHISException{
        if(ficha4.getSelectedIndex() > 0){           
            if(ficha4.getSelectedIndex() == 1){

                Ventajosa ficha4 = new Ventajosa(color, tokenOwner);
                fichasj1.add(ficha4);

                }
            if(ficha4.getSelectedIndex() == 2){

                Ingeniera ficha4 = new Ingeniera(color, tokenOwner);
                fichasj1.add(ficha4);
                }
            if(ficha4.getSelectedIndex() == 3){

                Saltarina ficha4 = new Saltarina(color, tokenOwner);
                fichasj1.add(ficha4);
                }
            if(ficha4.getSelectedIndex() == 4){

                }
            if(ficha4.getSelectedIndex() == 5){

                }
            if(ficha4.getSelectedIndex() == 6){

                }
        }else{
            throw new POOBCHISException(POOBCHISException.NO_ELIGIO_NADA);
        }
      }
      private void setFicha2_1(String color, String tokenOwner) throws POOBCHISException{
        if(ficha2_1.getSelectedIndex() > 0){
            if(ficha2_1.getSelectedIndex() == 1){

                Ventajosa ficha1 = new Ventajosa(color, tokenOwner);
                fichasj2.add(ficha1);

            }
            if(ficha2_1.getSelectedIndex() == 2){
                Ingeniera ficha1 = new Ingeniera(color, tokenOwner);
                fichasj2.add(ficha1);
                }
            if(ficha2_1.getSelectedIndex() == 3){
                Saltarina ficha1 = new Saltarina(color, tokenOwner);
                fichasj2.add(ficha1);
                }
            if(ficha2_1.getSelectedIndex() == 4){
                Normal ficha1 = new Normal(color, tokenOwner);
                fichasj2.add(ficha1);
                }
            if(ficha2_1.getSelectedIndex() == 5){

                }
            if(ficha2_1.getSelectedIndex() == 6){

                }
 
        }

        else{
            throw new POOBCHISException(POOBCHISException.NO_ELIGIO_NADA);
        }
      }
      private void setFicha2_2(String color, String tokenOwner) throws POOBCHISException{
        if(ficha2_2.getSelectedIndex() > 0){           
            if(ficha2_2.getSelectedIndex() == 1){

                Ventajosa ficha2 = new Ventajosa(color, tokenOwner);
                fichasj2.add(ficha2);

            }
            if(ficha2_2.getSelectedIndex() == 2){
                Ingeniera ficha2 = new Ingeniera(color, tokenOwner);
                fichasj2.add(ficha2);
            }
            if(ficha2_2.getSelectedIndex() == 3){
                Saltarina ficha2 = new Saltarina(color, tokenOwner);
                fichasj2.add(ficha2);
            }
            if(ficha2_2.getSelectedIndex() == 4){
                Normal ficha2 = new Normal(color, tokenOwner);
                fichasj2.add(ficha2);
            }
            if(ficha2_2.getSelectedIndex() == 5){

            }
            if(ficha2_2.getSelectedIndex() == 6){

            }
        }else{
            throw new POOBCHISException(POOBCHISException.NO_ELIGIO_NADA);
        }
      }
      private void setFicha2_3(String color, String tokenOwner) throws POOBCHISException{
        if(ficha2_3.getSelectedIndex() > 0){           
            if(ficha2_3.getSelectedIndex() == 1){

                Ventajosa ficha3 = new Ventajosa(color, tokenOwner);
                fichasj2.add(ficha3);

            }
            if(ficha2_3.getSelectedIndex() == 2){
                Ingeniera ficha3 = new Ingeniera(color, tokenOwner);
                fichasj2.add(ficha3);
                }
            if(ficha2_3.getSelectedIndex() == 3){
                Saltarina ficha3 = new Saltarina(color, tokenOwner);
                fichasj2.add(ficha3);
                }
            if(ficha2_3.getSelectedIndex() == 4){
                Normal ficha3 = new Normal(color, tokenOwner);
                fichasj2.add(ficha3);
                }
            if(ficha2_3.getSelectedIndex() == 5){

                }
            if(ficha2_3.getSelectedIndex() == 6){

                }
        }else{
             throw new POOBCHISException(POOBCHISException.NO_ELIGIO_NADA);
        }
      }
      private void setFicha2_4(String color, String tokenOwner) throws POOBCHISException{
        if(ficha4.getSelectedIndex() > 0){           
            if(ficha4.getSelectedIndex() == 1){

                Ventajosa ficha4 = new Ventajosa(color, tokenOwner);
                fichasj2.add(ficha4);

                }
            if(ficha4.getSelectedIndex() == 2){
                Ingeniera ficha4 = new Ingeniera(color, tokenOwner);
                fichasj2.add(ficha4);
                }
            if(ficha4.getSelectedIndex() == 3){
                Saltarina ficha4 = new Saltarina(color, tokenOwner);
                fichasj2.add(ficha4);
                }
            if(ficha4.getSelectedIndex() == 4){
                Normal ficha4 = new Normal(color, tokenOwner);
                fichasj2.add(ficha4);
                }
            if(ficha4.getSelectedIndex() == 5){

                }
            if(ficha4.getSelectedIndex() == 6){

                }
        }
        else{
            throw new POOBCHISException(POOBCHISException.NO_ELIGIO_NADA);
        }
      }
      
    private  void setItemj1(String color, String tokenOwner) throws POOBCHISException{
        /**
         * caja de ficha y creacion de ficha
         */
        if(salidaez1){

            
        }
        else{

            setFicha1(color, tokenOwner);
            setFicha2(color, tokenOwner);
            setFicha3(color, tokenOwner);
            setFicha4(color, tokenOwner);
        }
    }
        
        
       
      private  void setItemj2(String color, String tokenOwner) throws POOBCHISException{

        /**
         * caja de ficha y creacion de ficha
         */
        
        if(salidaez2){

            
        }
        else{

            setFicha2_1(color, tokenOwner);
            setFicha2_2(color, tokenOwner);
            setFicha2_3(color, tokenOwner);
            setFicha2_4(color, tokenOwner);
        }
      }

/** 
 * constructor maquina
*/

    public Fichas(String nombrej1, String colorj1){
        ArrayList<Player> jugadores = new ArrayList<Player>();
        Title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        j1_text = new javax.swing.JLabel();
        salidafacil = new javax.swing.JButton();
        ficha1 = new javax.swing.JComboBox<>();
        f1_1 = new javax.swing.JLabel();
        f1_2 = new javax.swing.JLabel();
        ficha2 = new javax.swing.JComboBox<>();
        f1_3 = new javax.swing.JLabel();
        ficha3 = new javax.swing.JComboBox<>();
        f1_4 = new javax.swing.JLabel();
        ficha4 = new javax.swing.JComboBox<>();
        siguiente = new javax.swing.JButton();

        Title.setFont(new java.awt.Font("Hotel De Paris", 0, 36)); // NOI18N
        Title.setText("POOBCHIS");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Hotel De Paris", 0, 36)); // NOI18N
        jLabel1.setText("POOBCHIS");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 12)); // NOI18N
        jLabel2.setText("elijan sus fichas");

        j1_text.setText("j1 : "+ nombrej1 + " - " + colorj1 );
        salidafacil.setText("salida facil (al azar)");
        
        /**
         * definicion acciones
         */
 
        salidafacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Player jugador1 = new Player(nombrej1, colorj1);
                jugadores.add(jugador1);
                salidaez1 = true;
            }
        });

        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
                if(salidaez1){
                    Board tablero = new Board(2, jugadores);
                    BoardGUI ventana1 = new BoardGUI(tablero,0 ,0, null);
                    ventana1.setLocationRelativeTo(null);
                    ventana1.setVisible(true);

                }else{
                    try {
                        setItemj1(nombrej1,colorj1);
                        Player jugador1 = new Player(nombrej1, colorj1, fichasj1);
                        jugadores.add(jugador1);
                        Board tablero = new Board(2, jugadores);
                        BoardGUI ventana1 = new BoardGUI(tablero,0 ,0, null);
                        ventana1.setLocationRelativeTo(null);
                        ventana1.setVisible(true);
                    } catch (POOBCHISException e) {
                        e.printStackTrace();

                         }
                }
            }
        });

        /**
         * fin definicion acciones
         */

        ficha1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un tipo de ficha", "Ventajosa", "Ingeniera", "Saltarina"}));
        f1_1.setText("Ficha 1:");

        f1_2.setText("Ficha 2:");

        ficha2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Selecciona un tipo de ficha", "Ventajosa", "Ingeniera", "Saltarina" }));

        f1_3.setText("Ficha 3:");

        ficha3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un tipo de ficha", "Ventajosa", "Ingeniera", "Saltarina" }));

        f1_4.setText("Ficha 4:");

        ficha4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un tipo de ficha", "Ventajosa", "Ingeniera", "Saltarina" }));

        siguiente.setText("Siguiente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(216, 216, 216))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 186, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(181, 181, 181))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(salidafacil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(siguiente))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(j1_text)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(f1_1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ficha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(f1_2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ficha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(f1_3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ficha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(f1_4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ficha4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j1_text)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ficha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f1_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f1_2)
                    .addComponent(ficha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f1_3)
                    .addComponent(ficha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f1_4)
                    .addComponent(ficha4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salidafacil)
                    .addComponent(siguiente))
                .addContainerGap())
        );
        pack();
    }

    /**
     * constructor jugadores vivos
     */
    public Fichas(String nombrej1, String colorj1,String nombrej2, String colorj2){
        ArrayList<Player> jugadores = new ArrayList<Player>();
       Title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        j1_text = new javax.swing.JLabel();
        salidafacil = new javax.swing.JButton();
        ficha1 = new javax.swing.JComboBox<>();
        f1_1 = new javax.swing.JLabel();
        f1_2 = new javax.swing.JLabel();
        ficha2 = new javax.swing.JComboBox<>();
        f1_3 = new javax.swing.JLabel();
        ficha3 = new javax.swing.JComboBox<>();
        f1_4 = new javax.swing.JLabel();
        ficha4 = new javax.swing.JComboBox<>();
        siguiente = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ficha2_1 = new javax.swing.JComboBox<>();
        ficha2_2 = new javax.swing.JComboBox<>();
        ficha2_3 = new javax.swing.JComboBox<>();
        ficha2_4 = new javax.swing.JComboBox<>();
        salidafacilj2 = new javax.swing.JButton();

        Title.setFont(new java.awt.Font("Hotel De Paris", 0, 36)); // NOI18N
        Title.setText("POOBCHIS");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Hotel De Paris", 0, 36)); // NOI18N
        jLabel1.setText("POOBCHIS");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 12)); // NOI18N
        jLabel2.setText("elijan sus fichas");

        j1_text.setText("j1 : "+ nombrej1 + " - " + colorj1 );
        ficha1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un tipo de ficha", "Ventajosa", "Ingeniera", "Saltarina" }));
        salidafacil.setText("salida facil j1 (al azar)");





        /**
         * definicion acciones
         */
        salidafacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Player jugador1 = new Player(nombrej1, colorj1);
                jugadores.add(jugador1);
                salidaez1 = true;
            }
        });

        salidafacilj2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Player jugador2 = new Player(nombrej2, colorj2);
                jugadores.add(jugador2);
                salidaez2 = true;
            }
        });

        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    
                    if(salidaez1 && salidaez2){
                        Board tablero = new Board(2, jugadores);
                        BoardGUI ventana1 = new BoardGUI(tablero, 0, -1, null);
                        ventana1.setLocationRelativeTo(null);
                        ventana1.setVisible(true);
                        dispose();


                    }
                    else if(salidaez1){
                        setItemj2(colorj2,nombrej2);
                        Player jugador2 = new Player(nombrej2, colorj2, fichasj2);
                        jugadores.add(jugador2);
                        Board tablero = new Board(2, jugadores);
                        BoardGUI ventana1 = new BoardGUI(tablero, 0, -1, null);
                        ventana1.setLocationRelativeTo(null);
                        ventana1.setVisible(true);
                        dispose();
                    }

                    else if(salidaez2){
                        setItemj1(colorj1, nombrej1);
                        Player jugador1 = new Player(nombrej1, colorj1, fichasj1);
                        jugadores.add(jugador1);
                        Board tablero = new Board(2, jugadores);
                        BoardGUI ventana1 = new BoardGUI(tablero, 0, -1, null);
                        ventana1.setLocationRelativeTo(null);
                        ventana1.setVisible(true);
                        dispose();
                    }
                    else{
                        setItemj1(colorj1, nombrej1);
                        setItemj2(colorj2,nombrej2);
                        Player jugador1 = new Player(nombrej1, colorj1, fichasj1);
                        Player jugador2 = new Player(nombrej2, colorj2, fichasj2);
                        
                        jugadores.add(jugador1);
                        jugadores.add(jugador2);
                        Board tablero = new Board(2, jugadores);
                        BoardGUI ventana1 = new BoardGUI(tablero, 0, -1, null);
                        ventana1.setLocationRelativeTo(null);
                        ventana1.setVisible(true);
                        dispose();

                    }

                } catch (POOBCHISException e) {
                    e.printStackTrace();
                }
            }
        });

        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
                try {
                    j12 ai = new j12();
                    ai.setLocationRelativeTo(null);
                    ai.setVisible(true);
                } catch (POOBCHISException e) {
                    e.printStackTrace();
                }
            }
        });

        ficha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
  
            }
        });
    /**
     * fin definicion acciones
     */





        f1_1.setText("Ficha 1:");

        f1_2.setText("Ficha 2:");

        ficha2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un tipo de ficha", "Ventajosa", "Ingeniera", "Saltarina" }));

        f1_3.setText("Ficha 3:");

        ficha3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un tipo de ficha", "Ventajosa", "Ingeniera", "Saltarina" }));

        f1_4.setText("Ficha 4:");

        ficha4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un tipo de ficha", "Ventajosa", "Ingeniera", "Saltarina" }));

        siguiente.setText("Siguiente");

        Volver.setText("Volver");

        jLabel3.setText("j2 : "+ nombrej2 + " - " + colorj2 );

        jLabel4.setText("Ficha 1:");

        jLabel5.setText("Ficha 2:");

        jLabel6.setText("Ficha 3:");

        jLabel7.setText("Ficha 4:");

        ficha2_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un tipo de ficha", "Ventajosa", "Ingeniera", "Saltarina" }));

        ficha2_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un tipo de ficha", "Ventajosa", "Ingeniera", "Saltarina" }));

        ficha2_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un tipo de ficha", "Ventajosa", "Ingeniera", "Saltarina" }));

        ficha2_4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un tipo de ficha", "Ventajosa", "Ingeniera", "Saltarina" }));

        salidafacilj2.setText("salida facil j2 (al azar)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(216, 216, 216))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(181, 181, 181))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(salidafacil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salidafacilj2))
                            .addComponent(j1_text)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(f1_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ficha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(f1_3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ficha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(f1_4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ficha4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(f1_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ficha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(Volver))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(siguiente))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ficha2_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ficha2_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ficha2_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ficha2_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j1_text)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ficha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f1_1)
                    .addComponent(jLabel4)
                    .addComponent(ficha2_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f1_2)
                    .addComponent(ficha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(ficha2_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f1_3)
                    .addComponent(ficha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(ficha2_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f1_4)
                    .addComponent(ficha4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(ficha2_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salidafacil)
                    .addComponent(siguiente)
                    .addComponent(Volver)
                    .addComponent(salidafacilj2))
                .addContainerGap())
        );

        pack();

    }


}

class j12 extends JFrame{              
        /**
         * informacion
         */
        private String color1;
        private String color2; 
        private String name1;
        private String name2; 
        private int noeligionada1;


        /**
         * grafico
         */
        private javax.swing.JButton Siguiente;
        private javax.swing.JLabel Title;
        private javax.swing.JButton Volver;
        private javax.swing.JComboBox<String> colorj1;
        private javax.swing.JLabel colorj1text;
        private javax.swing.JComboBox<String> colorj2;
        private javax.swing.JLabel colorj2text;
        private javax.swing.JLabel datos;
        private javax.swing.JLabel j1;
        private javax.swing.JLabel j2;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JTextField nombrej1;
        private javax.swing.JLabel nombrej1text;
        private javax.swing.JTextField nombrej2;
        private javax.swing.JLabel nombrej2text;

    /**
     * Constructor para j1 vs maquina
     * @param x
     * @throws POOBCHISException
     */

    public j12(int x) throws POOBCHISException{

        jSeparator1 = new javax.swing.JSeparator();
        Title = new javax.swing.JLabel();
        datos = new javax.swing.JLabel();
        j1 = new javax.swing.JLabel();
        nombrej1 = new javax.swing.JTextField();
        nombrej1text = new javax.swing.JLabel();
        colorj1text = new javax.swing.JLabel();
        colorj1 = new javax.swing.JComboBox<>();
        Volver = new javax.swing.JButton();
        Siguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Hotel De Paris", 0, 36)); // NOI18N
        Title.setText("POOBCHIS");

        datos.setText("Ingresa tus datos:");

        j1.setText("J1");

        nombrej1.setText("Ingresa tu nombre");
        nombrej1text.setText("Nombre:");
        colorj1text.setText("Color:");
        colorj1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "elije color", "Rojo", "Amarillo", "Azul", "Verde" }));
        Volver.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Volver.setText("Volver");
        /**
         * 
         * 
         * 
         *  seccion listeners botones
         * 
         * 
         * 
         * 
        */
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
                Jugadores ventana = new Jugadores();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
            }
        });
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    dispose();
                    setItem(0);
                    if(noeligionada1 == 1){
                       j12 a = new j12(0);
                       a.setLocationRelativeTo(null);
                       a.setVisible(true);
                    }
                    else{
                        Fichas ventana1 = new Fichas(name1,color1);

                        ventana1.setLocationRelativeTo(null);
                        ventana1.setVisible(true);
                    }
                    
                } catch (POOBCHISException e) {
                    e.printStackTrace();
                }
            }
        });

         /**
          * 
          * 
          * Fin seccion Listeners
          * 
          * 
          * 
          * 
          */
                   /**
          * 
          * 
          * Fin seccion Listeners
          * 
          * 
          * 
          * 
          */

        Siguiente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Siguiente.setText("Siguente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title)
                .addGap(189, 189, 189))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219)
                        .addComponent(Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(8, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombrej1text)
                                    .addComponent(colorj1text))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombrej1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(colorj1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datos)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(j1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrej1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombrej1text))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorj1text)
                    .addComponent(colorj1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Volver)
                    .addComponent(Siguiente))
                .addGap(15, 15, 15))
        );

        pack();
    }
    /**
     * 
     * coloca items para j1 y j2
     * 
     * @throws POOBCHISException
     */

    private  void setItem() throws POOBCHISException{
        int colorint = colorj1.getSelectedIndex();
        int colorints = colorj2.getSelectedIndex();
        name1 = nombrej1.getText();
        name2 = nombrej2.getText();
        if(colorint > 0){

          if(colorint ==1){
              color1="Rojo";
          }
          if(colorint ==2){
              color1= "Amarillo";
          }
          if(colorint ==3){
              color1 = "Azul";
          }
          if(colorint ==4){
              color1 = "Verde";
          }
        }
        else{
            noeligionada1=1;
            JOptionPane.showMessageDialog(this, POOBCHISException.NO_ELIGIO_NADAJ1.toString());

          
        }
        
        
        if(colorint >0){

          if(colorints ==1){
              color2="Rojo";
          }
          if(colorints ==2){
              color2= "Amarillo";
          }
          if(colorints ==3){
              color2 = "Azul";
          }
          if(colorints ==4){
              color2 = "Verde";
          }
        }
        else{
            noeligionada1=1;
            JOptionPane.showMessageDialog(this, POOBCHISException.NO_ELIGIO_NADAJ2.toString());
        }

        
      }

      /**
       * Coloca Items para j1
       * @param x
       * @throws POOBCHISException
       */

      private  void setItem(int x) throws POOBCHISException{
        int colorint = colorj1.getSelectedIndex();
        name1 = nombrej1.getText();
        if(colorint > 0){

          if(colorint ==1){
              color1="Rojo";
          }
          if(colorint ==2){
              color1= "Amarillo";
          }
          if(colorint ==3){
              color1 = "Azul";
          }
          if(colorint ==4){
              color1 = "Verde";
          }
        }
        else{
            noeligionada1 = 1;
            JOptionPane.showMessageDialog(this, POOBCHISException.NO_ELIGIO_NADA.toString());
        }
    }

    /**
     * Constructor para jugadores humanos
     * @throws POOBCHISException
     */

    public j12() throws POOBCHISException{

        jSeparator1 = new javax.swing.JSeparator();
        Title = new javax.swing.JLabel();
        datos = new javax.swing.JLabel();
        j1 = new javax.swing.JLabel();
        nombrej1 = new javax.swing.JTextField();
        nombrej1text = new javax.swing.JLabel();
        colorj1text = new javax.swing.JLabel();
        colorj1 = new javax.swing.JComboBox<>();
        j2 = new javax.swing.JLabel();
        nombrej2 = new javax.swing.JTextField();
        nombrej2text = new javax.swing.JLabel();
        colorj2 = new javax.swing.JComboBox<>();
        colorj2text = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();
        Siguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Hotel De Paris", 0, 36)); // NOI18N
        Title.setText("POOBCHIS");

        datos.setText("Ingresa tus datos:");

        j1.setText("J1");

        nombrej1.setText("Ingresa tu nombre");

        nombrej1text.setText("Nombre:");

        colorj1text.setText("Color:");

        colorj1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "elije color", "Rojo", "Amarillo", "Azul", "Verde" }));

        j2.setText("J2");

        nombrej2.setText("Ingresa tu nombre");

        nombrej2text.setText("Nombre:");

        colorj2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "elije color", "Rojo", "Amarillo", "Azul", "Verde" }));

        colorj2text.setText("Color:");

        Volver.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Volver.setText("Volver");

                /**
         * 
         * 
         * 
         *  seccion listeners botones
         * 
         * 
         * 
         * 
        */
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
                Jugadores ventana = new Jugadores();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
            }
        });
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    dispose();
                    setItem();
                    if( noeligionada1 == 1 || color1 == null || color2 == null){ 
                        j12 a = new j12();
                        a.setLocationRelativeTo(null);
                        a.setVisible(true);
                     }
                     else{
                        Fichas ventana1 = new Fichas(name1,color1,name2,color2);
                        ventana1.setLocationRelativeTo(null);
                        ventana1.setVisible(true);
                    }
                } catch (POOBCHISException e) {
                    e.printStackTrace();
                }
            }
        });
         /**
          * 
          * 
          * Fin seccion Listeners
          * 
          * 
          * 
          * 
          */

          /** 
           * 
           * 
           * Tratado de datos
           *
           * 
          */
 
          /**
           * 
           * 
           * Fin tratado de datos
           * 
           * 
           */
        Siguiente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Siguiente.setText("Siguente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title)
                .addGap(189, 189, 189))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219)
                        .addComponent(Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(8, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombrej1text)
                                    .addComponent(colorj1text))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombrej1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(colorj1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombrej2text)
                                    .addComponent(colorj2text))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombrej2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(colorj2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datos)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(j1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(j2)
                        .addGap(169, 169, 169))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j1)
                    .addComponent(j2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrej1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombrej1text)
                    .addComponent(nombrej2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombrej2text))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorj1text)
                    .addComponent(colorj1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorj2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorj2text))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Volver)
                    .addComponent(Siguiente))
                .addGap(15, 15, 15))
        );
        pack();
    }
}
class Jugadores extends JFrame{
    private javax.swing.JLabel Title;
    private javax.swing.JButton cuatrop;
    private javax.swing.JButton dosp;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton tresp;
    private javax.swing.JButton vsmaquina;

    public Jugadores(){

        jSeparator1 = new javax.swing.JSeparator();
        Title = new javax.swing.JLabel();
        dosp = new javax.swing.JButton();
        tresp = new javax.swing.JButton();
        cuatrop = new javax.swing.JButton();
        vsmaquina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Hotel De Paris", 0, 36)); // NOI18N
        Title.setText("POOBCHIS");

        dosp.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        dosp.setText("2P");
        dosp.setToolTipText("");

        tresp.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        tresp.setText("3P");

        cuatrop.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        cuatrop.setText("4P");

        vsmaquina.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        vsmaquina.setText("VS Maquina");


        /**
         * 
         * 
         * 
         *  seccion listeners botones
         * 
         * 
         * 
         * 
        */

        dosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
                j12 ventana;
                try {
                    ventana = new j12();
                    ventana.setLocationRelativeTo(null);
                    ventana.setVisible(true);
                } catch (POOBCHISException e) {
                    e.printStackTrace();
                }

            }
        });
        vsmaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
                j12 ventana;
                try {
                    ventana = new j12(0);
                    ventana.setLocationRelativeTo(null);
                    ventana.setVisible(true);
                } catch (POOBCHISException e) {
                    e.printStackTrace();
                }

            }
        });
         /**
          * 
          * 
          * Fin seccion Listeners
          * 
          * 
          * 
          * 
          */
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(Title)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(dosp, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vsmaquina)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tresp, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGap(20, 20, 20)
                .addComponent(cuatrop, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tresp, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dosp, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuatrop, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(vsmaquina)
                .addGap(36, 36, 36))
        );

        pack();
    }
}


class Ventana1 extends JFrame{
    private javax.swing.JButton Cargar;
    private javax.swing.JButton inicio;
    private javax.swing.JButton Salir;
    private java.awt.Label Title;
    private javax.swing.JSeparator jSeparator1;

    private void confirmateClose(){
        int valor = JOptionPane.showConfirmDialog(this, "�Desea cerrar la apliacion?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (valor == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }

    private void opener(){
        try{
            JFileChooser archivos = new JFileChooser();
            int seleccion  = archivos.showOpenDialog(null);
            if (seleccion == JFileChooser.APPROVE_OPTION){
    
                File xd = archivos.getSelectedFile();
                FileReader open = new FileReader(xd);
                open.close();
                }
            }
            catch(IOException ex){
                JOptionPane.showMessageDialog(null,"El archivo se a guardado Exitosamente", "Información",JOptionPane.INFORMATION_MESSAGE);
                }
    }
    public Ventana1(){



        Title = new java.awt.Label();
        inicio = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Cargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Hotel De Paris", 0, 24)); // NOI18N
        Title.setText("POOBCHIS");

        inicio.setText("Iniciar");

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        Cargar.setText("Cargar partida");


        /*
        
        Espacio para la asignacion de funciones a los botones
        
        */
        inicio.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                 dispose();
                 Jugadores jugadores = new Jugadores();
                 jugadores.setLocationRelativeTo(null);
                 jugadores.setVisible(true);
               }
         });
         Salir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                confirmateClose();
               }
         });
         Cargar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                opener();
               }
         });
         
        /*
        
        fin espacio de asignacion
        
        */
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(Cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        pack();
    }
}


class Comodines extends JFrame{

    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    
    public Comodines(Board tablero){
        
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jTextPane1.setEditable(false);
        jTextPane1.setText("en construccion");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();


    }



}

class Lanzarcomodin extends JFrame{
    private javax.swing.JLabel Itemsdese;
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox<String> items;
    private javax.swing.JButton listo;


    public Lanzarcomodin(){

        items = new javax.swing.JComboBox<>();
        Itemsdese = new javax.swing.JLabel();
        listo = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        items.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Itemsdese.setText("¿que carta jugaras?");

        listo.setText("Listo");

        cancelar.setText("Cancelar");

        /**
         * 
         * 
         * Definicion de acciones
         * 
         */
        listo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                    dispose();
            }
        });
         /**
          * Fin definicion acciones
          */
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(listo)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(Itemsdese)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(items, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(items, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Itemsdese))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listo)
                    .addComponent(cancelar))
                .addContainerGap())
        );

        pack();



    }

}




class DiceGUI extends JFrame{
    private int val1;
    private int val2;
    private Board tablero;
    private javax.swing.JLabel Dadouno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton ok;

    private BufferedImage requestImage(int x) {

        BufferedImage image = null;
        if(x==1){
        try {
            image = ImageIO.read( new File("src/resources/1.jpeg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;
         }
     if(x==2){
        try {
            image = ImageIO.read( new File("src/resources/2.jpeg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;
         }
     if(x==3){
        try {
            image = ImageIO.read( new File("src/resources/3.jpeg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;
     }
     if(x==4){
        try {
            image = ImageIO.read( new File("src/resources/4.jpeg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;
        }
     if(x==5){
        try {
            image = ImageIO.read( new File("src/resources/5.jpeg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;
       }
     if(x==6){
        try {
            image = ImageIO.read( new File("src/resources/6.jpeg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
       }
     return null;
    }
    
    public ArrayList<Integer> sendData(){
        ArrayList<Integer> res = new ArrayList<Integer>(); 
        res.add(val1);
        res.add(val2);
        return res;


    }
    private BufferedImage requestImageM(int x){
        BufferedImage image = null;
        if(x==1){
        try {
            image = ImageIO.read( new File("src/resources/M1.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;
         }
     if(x==2){
        try {
            image = ImageIO.read( new File("src/resources/M2.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;
         }
     if(x==3){
        try {
            image = ImageIO.read( new File("src/resources/M3.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;
     }
     if(x==4){
        try {
            image = ImageIO.read( new File("src/resources/M4.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;
        }
     if(x==5){
        try {
            image = ImageIO.read( new File("src/resources/M5.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;
       }
     if(x==6){
        try {
            image = ImageIO.read( new File("src/resources/M6.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
       }
       if(x==7){
        try {
            image = ImageIO.read( new File("src/resources/M7.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
       }
       if(x==8){
        try {
            image = ImageIO.read( new File("src/resources/M8.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
       }
       
     return null;
    }
    
    private void salecarcel(){
        tablero.fichaSaleCarcelPlayer(val1, val2);

    }
    public DiceGUI(Board tablero){
        this.tablero = tablero;


        Dice dado = new Dice(1);
        jSeparator1 = new javax.swing.JSeparator();
        Dadouno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        dado.rollDiceRandom();
        val1 = dado.getNumOfTheDice();
        dado.rollDiceRandom();
        val2 = dado.getNumOfTheDice();
        Dadouno.setText("Dado 1:"+  Integer.toString(val1));
        Dadouno.setToolTipText("");
        jLabel1.setText("Dado 2:"+ Integer.toString(val2));
        final BufferedImage image = requestImage(val1);
        final BufferedImage image2 = requestImage(val2);
        jPanel1 = new javax.swing.JPanel(){
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, null);
            }
        };
        jPanel2 = new javax.swing.JPanel(){
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image2, 0, 0, null);
            }
        };
        jPanel1.setPreferredSize(new DimensionUIResource(200, 200));
        jPanel2.setPreferredSize(new DimensionUIResource(200, 200));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        /**
         * definicion acciones
         */
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
                System.out.println("a");
                if(val1 == val2){
                    salecarcel();
                }
                BoardGUI asdsad = new BoardGUI(tablero, val1, val2, "noks");
                asdsad.setVisible(true);
                asdsad.setLocationRelativeTo(null);
            }
        });
        /**
         * fin definicion acciones
         */
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
        );
        ok.setText("OK");
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Dadouno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dadouno)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(ok)
                .addContainerGap())
        );
        pack();
    }
    public DiceGUI(Board tablero, boolean jijija){
        this.tablero = tablero;


        Octaedro_magico dado = new Octaedro_magico();
        jSeparator1 = new javax.swing.JSeparator();
        Dadouno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        dado.rollDiceRandom();
        val1 = dado.getNumOfTheDice();
        dado.rollDiceRandom();
        val2 = dado.getNumOfTheDice();
        Dadouno.setText("Dado 1:"+  Integer.toString(val1));
        Dadouno.setToolTipText("");
        jLabel1.setText("Dado 2:"+ Integer.toString(val2));
        final BufferedImage image = requestImageM(val1);
        final BufferedImage image2 = requestImageM(val2);
        jPanel1 = new javax.swing.JPanel(){
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, null);
            }
        };
        jPanel2 = new javax.swing.JPanel(){
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image2, 0, 0, null);
            }
        };
        jPanel1.setPreferredSize(new DimensionUIResource(200, 200));
        jPanel2.setPreferredSize(new DimensionUIResource(200, 200));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        /**
         * definicion acciones
         */
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salecarcel();
                dispose();
                BoardGUI asdsad = new BoardGUI(tablero, val1, val2, "cadabra");
                asdsad.setVisible(true);
                asdsad.setLocationRelativeTo(null);
            }
        });
        /**
         * fin definicion acciones
         */
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
        );
        ok.setText("OK");
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Dadouno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dadouno)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(ok)
                .addContainerGap())
        );
        pack();
    }
}


class BoardGUI extends JFrame{
    private Board tablero;
    
    /**
     * datos
     */
    private int dice1;
    private int dice2;
    private String magico;
    private boolean iniciaJugador;
    private String jugadorturno;
    private BufferedImage image = requestImage();
    private BufferedImage imagej1 = requestImagej1();
    private BufferedImage imagej2 = requestImagej2();
    private BufferedImage imagej3 = requestImagej3();
    private BufferedImage imagej4 = requestImagej4();
    /**
     *fin datos 
     */
    private javax.swing.JLayeredPane c1;
    private javax.swing.JLayeredPane c10;
    private javax.swing.JLayeredPane c11;
    private javax.swing.JLayeredPane c12;
    private javax.swing.JLayeredPane c13;
    private javax.swing.JLayeredPane c14;
    private javax.swing.JLayeredPane c15;
    private javax.swing.JLayeredPane c16;
    private javax.swing.JLayeredPane c17;
    private javax.swing.JLayeredPane c18;
    private javax.swing.JLayeredPane c19;
    private javax.swing.JLayeredPane c2;
    private javax.swing.JLayeredPane c20;
    private javax.swing.JLayeredPane c21;
    private javax.swing.JLayeredPane c22;
    private javax.swing.JLayeredPane c23;
    private javax.swing.JLayeredPane c24;
    private javax.swing.JLayeredPane c25;
    private javax.swing.JLayeredPane c26;
    private javax.swing.JLayeredPane c27;
    private javax.swing.JLayeredPane c28;
    private javax.swing.JLayeredPane c29;
    private javax.swing.JLayeredPane c3;
    private javax.swing.JLayeredPane c30;
    private javax.swing.JLayeredPane c31;
    private javax.swing.JLayeredPane c32;
    private javax.swing.JLayeredPane c33;
    private javax.swing.JLayeredPane c34;
    private javax.swing.JLayeredPane c35;
    private javax.swing.JLayeredPane c36;
    private javax.swing.JLayeredPane c37;
    private javax.swing.JLayeredPane c38;
    private javax.swing.JLayeredPane c39;
    private javax.swing.JLayeredPane c4;
    private javax.swing.JLayeredPane c40;
    private javax.swing.JLayeredPane c5;
    private javax.swing.JLayeredPane c6;
    private javax.swing.JLayeredPane c7;
    private javax.swing.JLayeredPane c8;
    private javax.swing.JLayeredPane c9;
    private javax.swing.JButton comodines1;
    private javax.swing.JLayeredPane f1;
    private javax.swing.JLayeredPane f10;
    private javax.swing.JLayeredPane f11;
    private javax.swing.JLayeredPane f12;
    private javax.swing.JLayeredPane f13;
    private javax.swing.JLayeredPane f14;
    private javax.swing.JLayeredPane f15;
    private javax.swing.JLayeredPane f16;
    private javax.swing.JLayeredPane f17;
    private javax.swing.JLayeredPane f18;
    private javax.swing.JLayeredPane f19;
    private javax.swing.JLayeredPane f2;
    private javax.swing.JLayeredPane f22;
    private javax.swing.JLayeredPane f23;
    private javax.swing.JLayeredPane f24;
    private javax.swing.JLayeredPane f25;
    private javax.swing.JLayeredPane f26;
    private javax.swing.JLayeredPane f3;
    private javax.swing.JLayeredPane f4;
    private javax.swing.JLayeredPane f5;
    private javax.swing.JLayeredPane f6;
    private javax.swing.JLayeredPane f7;
    private javax.swing.JLayeredPane f8;
    private javax.swing.JLayeredPane f9;
    private javax.swing.JLabel fichasjugar1;
    private javax.swing.JComboBox<String> fichasvalordado2;
    private javax.swing.JComboBox<String> fichavalordado3;
    private javax.swing.JLayeredPane j1;
    private javax.swing.JLayeredPane j2;
    private javax.swing.JLayeredPane j3;
    private javax.swing.JLayeredPane j4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane10;
    private javax.swing.JLayeredPane jLayeredPane16;
    private javax.swing.JLayeredPane jLayeredPane6;
    private javax.swing.JLayeredPane jLayeredPane9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton jugar1;
    private javax.swing.JButton lanzarcomodin1;
    private javax.swing.JButton lanzardado1;
    private javax.swing.JLabel turno1;
    private javax.swing.JLabel valordado3;
    private javax.swing.JLabel valordado4;
    private javax.swing.JComboBox<String> valordadotodoficha1;
    private Comodin comodin;
 
    private void saver(){
        try{
            JFileChooser archivos = new JFileChooser();
            int seleccion  = archivos.showSaveDialog(null);
            if (seleccion == JFileChooser.APPROVE_OPTION){
    
                File xd = archivos.getSelectedFile();
                FileWriter save = new FileWriter(xd+".txt");
                save.close();
                }
            }
            catch(IOException ex){
                JOptionPane.showMessageDialog(null,"El archivo se a guardado Exitosamente", "Información",JOptionPane.INFORMATION_MESSAGE);
                }
    }
    private void opener(){
        try{
            JFileChooser archivos = new JFileChooser();
            int seleccion  = archivos.showOpenDialog(null);
            if (seleccion == JFileChooser.APPROVE_OPTION){
    
                File xd = archivos.getSelectedFile();
                FileReader open = new FileReader(xd);
                open.close();
                }
            }
            catch(IOException ex){
                JOptionPane.showMessageDialog(null,"El archivo se a guardado Exitosamente", "Información",JOptionPane.INFORMATION_MESSAGE);
                }
    }
    private void createMenu(){
        //Items
        JMenuItem save = new JMenuItem("save");
        JMenuItem open = new JMenuItem("open");
        //acciones
        save.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
                 saver();
               }
         });
         open.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                 opener();
               }
         });
        //Bars
        JMenuBar menuBar= new JMenuBar();
        JMenu manu = new JMenu("Opciones");

        //adding them
        manu.add(open);
        manu.add(save);
        menuBar.add(manu);
        setJMenuBar(menuBar);
    }
    private BufferedImage requestImage() {
       BufferedImage image = null;

        try {
            image = ImageIO.read( new File("src/resources/TableroFinal.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;
    }
    private BufferedImage requestImagej1(){
        BufferedImage image = null;

        try {
            image = ImageIO.read( new File("src/resources/xd.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;
    }
    private BufferedImage requestImagej2(){
        BufferedImage image = null;

        try {
            image = ImageIO.read( new File("src/resources/Board.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;
    }
    private BufferedImage requestImagej3(){
        BufferedImage image = null;

        try {
            image = ImageIO.read( new File("src/resources/Board.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;
    }
    private BufferedImage requestImagej4(){
        BufferedImage image = null;

        try {
            image = ImageIO.read( new File("src/resources/Board.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;
    }





    private JLayeredPane fichasDondeCasilla(String identificador){
        // si es 0
        System.out.println(identificador + ' ' + tablero.fichasCasillasInTablero(identificador));
        if( tablero.fichasCasillasInTablero(identificador) == 0){
        
            JLayeredPane xd = new JLayeredPane();
            return xd;
            }
            // solo hay una ficha
            if( tablero.fichasCasillasInTablero(identificador) == 1){
            
                JLayeredPane xd = new JLayeredPane(){
                    @Override
                   protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        BufferedImage outputImage = imagej1;
                        int x = (this.getWidth() - outputImage.getWidth(null)) / 2;
                        int y = (this.getHeight() - outputImage.getHeight(null)) / 2;
                        g.drawImage(outputImage, x, y, null);
                      }
                };
                return xd;
            }
            // hay dos fichas
            if( tablero.fichasCasillasInTablero(identificador) == 2){
            
                JLayeredPane xd = new JLayeredPane(){
                    @Override
                   protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        BufferedImage outputImage = imagej1;
                        int x = (this.getWidth() - outputImage.getWidth(null)) / 2;
                        int y = (this.getHeight() - outputImage.getHeight(null)) / 2;
                       
                        g.drawImage(outputImage, x-40, y, null);
                        g.drawImage(outputImage, x+40, y, null);
                      }
                };
                return xd;
            }
                
                JLayeredPane xd = new JLayeredPane();
                return xd;
        }
        

        //private JLayeredPane testeo(){
        //    JLayeredPane xd = new JLayeredPane(){
        //        @Override
        //       protected void paintComponent(Graphics g) {
        //            super.paintComponent(g);
        //            BufferedImage outputImage = imagej1;
        //            int x = (this.getWidth() - outputImage.getWidth(null)) / 2;
        //            int y = (this.getHeight() - outputImage.getHeight(null)) / 2;
        //            g.drawImage(outputImage, x, y, null);
        //          }
        //    };
        //    return xd;
        //}


    private JLayeredPane FichasDondeCarcel(String color){
        ArrayList<Carcel> jails = tablero.allJails();
        int identificador = tablero.giveCarcelJugador(color);

        if(identificador == -1){
            JLayeredPane xd = new JLayeredPane();
            return xd;

        }
        // si es 0
        if( jails.get(identificador).cantidadEnLaCarcel() == 0){
        
        JLayeredPane xd = new JLayeredPane();
        return xd;
        }
        // solo hay una ficha
        if( jails.get(identificador).cantidadEnLaCarcel() == 1){
        
            JLayeredPane xd = new JLayeredPane(){
                @Override
               protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    BufferedImage outputImage = imagej1;
                    int x = (this.getWidth() - outputImage.getWidth(null)) / 2;
                    int y = (this.getHeight() - outputImage.getHeight(null)) / 2;
                    g.drawImage(outputImage, x, y, null);
                  }
            };
            return xd;
            }
        // hay dos fichas
        if( jails.get(identificador).cantidadEnLaCarcel() == 2){
        
            JLayeredPane xd = new JLayeredPane(){
                @Override
               protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    BufferedImage outputImage = imagej1;
                    int x = (this.getWidth() - outputImage.getWidth(null)) / 2;
                    int y = (this.getHeight() - outputImage.getHeight(null)) / 2;
                   
                    g.drawImage(outputImage, x-40, y, null);
                    g.drawImage(outputImage, x+40, y, null);
                  }
            };
            return xd;
            }
            if( jails.get(identificador).cantidadEnLaCarcel() == 3){
        
                JLayeredPane xd = new JLayeredPane(){
                    @Override
                   protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        BufferedImage outputImage = imagej1;
                        int x = (this.getWidth() - outputImage.getWidth(null)) / 2;
                        int y = (this.getHeight() - outputImage.getHeight(null)) / 2;
                       
                        g.drawImage(outputImage, x-40, y+40, null);
                        g.drawImage(outputImage, x+40, y+40, null);
                        g.drawImage(outputImage, x-40, y-40, null);
                      }
                };
                return xd;
                }

            if( jails.get(identificador).cantidadEnLaCarcel() == 4){
        
                JLayeredPane xd = new JLayeredPane(){
                    @Override
                   protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        BufferedImage outputImage = imagej1;
                        int x = (this.getWidth() - outputImage.getWidth(null)) / 2;
                        int y = (this.getHeight() - outputImage.getHeight(null)) / 2;
                       
                        g.drawImage(outputImage, x-40, y+40, null);
                        g.drawImage(outputImage, x+40, y+40, null);
                        g.drawImage(outputImage, x-40, y-40, null);
                        g.drawImage(outputImage, x+40, y-40, null);
                      }
                };
                return xd;
                }
                JLayeredPane xd = new JLayeredPane();
                return xd;
    }
    private void dupli1(){
        dice1 += dice1;


    }
    private void dupli2(){
        dice2 += dice2;


    }
    private void halve1(){

        dice1 = dice1 /2;

    }
    private void halve2(){

        dice1 = dice2 /2;

    }
    private void turnToOne(int x){
        if(x==1){

            dice1 = 1;

        }
        if(x==2){
            dice2 = 2;

        }
    }
    private Boolean somosMagicosPa(){
        if(magico == "cadabra"){
            return true;
        }
        return false;
    }
    public BoardGUI(Board tablero,int dice1,int dice2, String magico){

        createMenu();
        
        this.tablero = tablero;
        this.dice1 = dice1;
        this.dice2 = dice2;
        this.magico = magico;


        String jugadorturno= tablero.playerinTurn();
        /**|
         * imagenes fichas
         */

        /**
         * fin prueba
         */
        /**
         * prueba de agregar ficha
         *
         */

        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();

        jPanel3 = new javax.swing.JPanel()
        
        {

        @Override
         protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
            }

        };
        

        j1 =FichasDondeCarcel("Rojo");


        j2 =FichasDondeCarcel("Amarillo");


        j3 = FichasDondeCarcel("Azul");


        j4 = FichasDondeCarcel("Verde" );

 
        c1 = fichasDondeCasilla(Integer.toString(1));

        c2 = fichasDondeCasilla(Integer.toString(2));

        c3 = fichasDondeCasilla(Integer.toString(3));

        c4 = fichasDondeCasilla(Integer.toString(4));

        c5 = fichasDondeCasilla(Integer.toString(5));

        c6 = fichasDondeCasilla(Integer.toString(6));

        c7  = fichasDondeCasilla(Integer.toString(7));

        c8  = fichasDondeCasilla(Integer.toString(8));
 
        c9  = fichasDondeCasilla(Integer.toString(9));

        c10  = fichasDondeCasilla(Integer.toString(10));

        c11  = fichasDondeCasilla(Integer.toString(11));

        c12  = fichasDondeCasilla(Integer.toString(12));

        c13  = fichasDondeCasilla(Integer.toString(13));

        c14  = fichasDondeCasilla(Integer.toString(14));

        c15  = fichasDondeCasilla(Integer.toString(15));

        c16  = fichasDondeCasilla(Integer.toString(16));

        c17  = fichasDondeCasilla(Integer.toString(17));

        c18  = fichasDondeCasilla(Integer.toString(18));

        c19  = fichasDondeCasilla(Integer.toString(19));

        c20  = fichasDondeCasilla(Integer.toString(20));

        c21  = fichasDondeCasilla(Integer.toString(21));

        c22  = fichasDondeCasilla(Integer.toString(22));

        c23  = fichasDondeCasilla(Integer.toString(23));

        c24  = fichasDondeCasilla(Integer.toString(24));

        c25  = fichasDondeCasilla(Integer.toString(25));

        c26  = fichasDondeCasilla(Integer.toString(26));

        c27  = fichasDondeCasilla(Integer.toString(27));

        c28  = fichasDondeCasilla(Integer.toString(28));

        c29 = fichasDondeCasilla(Integer.toString(29));

        c30 = fichasDondeCasilla(Integer.toString(30));

        c31 = fichasDondeCasilla(Integer.toString(31));
        
        c32 = fichasDondeCasilla(Integer.toString(32));
        
        c33 = fichasDondeCasilla(Integer.toString(33));
        
        c34 = fichasDondeCasilla(Integer.toString(34));
        
        c35 = fichasDondeCasilla(Integer.toString(35));
        
        c36 = fichasDondeCasilla(Integer.toString(36));
        
        c37 = fichasDondeCasilla(Integer.toString(37));
        
        c38 = fichasDondeCasilla(Integer.toString(38));
        
        c39 = fichasDondeCasilla(Integer.toString(39));
        
        c40 = fichasDondeCasilla(Integer.toString(40));






        f15 = new javax.swing.JLayeredPane();
        f15.setBackground(Color.YELLOW);
        f15.setOpaque(true);


        f13 = new javax.swing.JLayeredPane();
        f13.setBackground(Color.YELLOW);
        f13.setOpaque(true);

        f14 = new javax.swing.JLayeredPane();
        f14.setBackground(Color.YELLOW);
        f14.setOpaque(true);

        f1 = new javax.swing.JLayeredPane();
        f1.setBackground(Color.GREEN);
        f1.setOpaque(true);


        f2 = new javax.swing.JLayeredPane();
        f2.setBackground(Color.GREEN);
        f2.setOpaque(true);


        f3 = new javax.swing.JLayeredPane();
        f3.setBackground(Color.GREEN);  
        f3.setOpaque(true);

        f19 = new javax.swing.JLayeredPane();
        f19.setBackground(Color.blue);
        f19.setOpaque(true);


        f22 = new javax.swing.JLayeredPane();
        f22.setBackground(Color.BLUE);
        f22.setOpaque(true);

        f7 = new javax.swing.JLayeredPane();
        f7.setBackground(Color.RED);
        f7.setOpaque(true);
        

        f24 = new javax.swing.JLayeredPane();
        f24.setBackground(Color.BLUE);
        f24.setOpaque(true);

        f8 = new javax.swing.JLayeredPane();
        f8.setBackground(Color.RED);
        f8.setOpaque(true);

        f9 = new javax.swing.JLayeredPane();
        f9.setBackground(Color.RED);
        f9.setOpaque(true);


        f25 = new javax.swing.JLayeredPane();
        f25.setBackground(Color.BLUE);
        f25.setOpaque(true);

        f26 = new javax.swing.JLayeredPane();
        f26.setBackground(Color.BLUE);
        f26.setOpaque(true);

        f10 = new javax.swing.JLayeredPane();
        f10.setBackground(Color.RED);
        f10.setOpaque(true);

        f11 = new javax.swing.JLayeredPane();
        f11.setBackground(Color.RED);
        f11.setOpaque(true);

        f12 = new javax.swing.JLayeredPane();
        f12.setBackground(Color.RED);
        f12.setOpaque(true);

        f23 = new javax.swing.JLayeredPane();
        f23.setBackground(Color.BLUE);
        f23.setOpaque(true);

        f5 = new javax.swing.JLayeredPane();
        f5.setBackground(Color.GREEN);
        f5.setOpaque(true);

        f6 = new javax.swing.JLayeredPane();
        f6.setBackground(Color.GREEN);
        f6.setOpaque(true);

        f16 = new javax.swing.JLayeredPane();
        f16.setBackground(Color.YELLOW);
        f16.setOpaque(true);

        f17 = new javax.swing.JLayeredPane();
        f17.setBackground(Color.YELLOW);
        f17.setOpaque(true);

        f18 = new javax.swing.JLayeredPane();
        f18.setBackground(Color.YELLOW);
        f18.setOpaque(true);

        f4 = new javax.swing.JLayeredPane();
        f4.setBackground(Color.GREEN);
        f4.setOpaque(true);


        lanzarcomodin1 = new javax.swing.JButton();
        lanzardado1 = new javax.swing.JButton();
        jugar1 = new javax.swing.JButton();
        valordadotodoficha1 = new javax.swing.JComboBox<>();
        fichasvalordado2 = new javax.swing.JComboBox<>();
        fichavalordado3 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        valordado3 = new javax.swing.JLabel();
        valordado4 = new javax.swing.JLabel();
        fichasjugar1 = new javax.swing.JLabel();
        comodines1 = new javax.swing.JButton();
        turno1 = new javax.swing.JLabel();
        


        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout j1Layout = new javax.swing.GroupLayout(j1);
        j1.setLayout(j1Layout);
        j1Layout.setHorizontalGroup(
            j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        j1Layout.setVerticalGroup(
            j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout j4Layout = new javax.swing.GroupLayout(j4);
        j4.setLayout(j4Layout);
        j4Layout.setHorizontalGroup(
            j4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        j4Layout.setVerticalGroup(
            j4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout j3Layout = new javax.swing.GroupLayout(j3);
        j3.setLayout(j3Layout);
        j3Layout.setHorizontalGroup(
            j3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        j3Layout.setVerticalGroup(
            j3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout j2Layout = new javax.swing.GroupLayout(j2);
        j2.setLayout(j2Layout);
        j2Layout.setHorizontalGroup(
            j2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        j2Layout.setVerticalGroup(
            j2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c19Layout = new javax.swing.GroupLayout(c19);
        c19.setLayout(c19Layout);
        c19Layout.setHorizontalGroup(
            c19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        c19Layout.setVerticalGroup(
            c19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c24Layout = new javax.swing.GroupLayout(c24);
        c24.setLayout(c24Layout);
        c24Layout.setHorizontalGroup(
            c24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        c24Layout.setVerticalGroup(
            c24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c20Layout = new javax.swing.GroupLayout(c20);
        c20.setLayout(c20Layout);
        c20Layout.setHorizontalGroup(
            c20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        c20Layout.setVerticalGroup(
            c20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c22Layout = new javax.swing.GroupLayout(c22);
        c22.setLayout(c22Layout);
        c22Layout.setHorizontalGroup(
            c22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        c22Layout.setVerticalGroup(
            c22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c21Layout = new javax.swing.GroupLayout(c21);
        c21.setLayout(c21Layout);
        c21Layout.setHorizontalGroup(
            c21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        c21Layout.setVerticalGroup(
            c21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout f15Layout = new javax.swing.GroupLayout(f15);
        f15.setLayout(f15Layout);
        f15Layout.setHorizontalGroup(
            f15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        f15Layout.setVerticalGroup(
            f15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c16Layout = new javax.swing.GroupLayout(c16);
        c16.setLayout(c16Layout);
        c16Layout.setHorizontalGroup(
            c16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        c16Layout.setVerticalGroup(
            c16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout f13Layout = new javax.swing.GroupLayout(f13);
        f13.setLayout(f13Layout);
        f13Layout.setHorizontalGroup(
            f13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        f13Layout.setVerticalGroup(
            f13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c23Layout = new javax.swing.GroupLayout(c23);
        c23.setLayout(c23Layout);
        c23Layout.setHorizontalGroup(
            c23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        c23Layout.setVerticalGroup(
            c23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout f14Layout = new javax.swing.GroupLayout(f14);
        f14.setLayout(f14Layout);
        f14Layout.setHorizontalGroup(
            f14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        f14Layout.setVerticalGroup(
            f14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c17Layout = new javax.swing.GroupLayout(c17);
        c17.setLayout(c17Layout);
        c17Layout.setHorizontalGroup(
            c17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        c17Layout.setVerticalGroup(
            c17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c18Layout = new javax.swing.GroupLayout(c18);
        c18.setLayout(c18Layout);
        c18Layout.setHorizontalGroup(
            c18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        c18Layout.setVerticalGroup(
            c18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c1Layout = new javax.swing.GroupLayout(c1);
        c1.setLayout(c1Layout);
        c1Layout.setHorizontalGroup(
            c1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        c1Layout.setVerticalGroup(
            c1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c40Layout = new javax.swing.GroupLayout(c40);
        c40.setLayout(c40Layout);
        c40Layout.setHorizontalGroup(
            c40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        c40Layout.setVerticalGroup(
            c40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout f1Layout = new javax.swing.GroupLayout(f1);
        f1.setLayout(f1Layout);
        f1Layout.setHorizontalGroup(
            f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        f1Layout.setVerticalGroup(
            f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c38Layout = new javax.swing.GroupLayout(c38);
        c38.setLayout(c38Layout);
        c38Layout.setHorizontalGroup(
            c38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        c38Layout.setVerticalGroup(
            c38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c2Layout = new javax.swing.GroupLayout(c2);
        c2.setLayout(c2Layout);
        c2Layout.setHorizontalGroup(
            c2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        c2Layout.setVerticalGroup(
            c2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c37Layout = new javax.swing.GroupLayout(c37);
        c37.setLayout(c37Layout);
        c37Layout.setHorizontalGroup(
            c37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        c37Layout.setVerticalGroup(
            c37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout f2Layout = new javax.swing.GroupLayout(f2);
        f2.setLayout(f2Layout);
        f2Layout.setHorizontalGroup(
            f2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        f2Layout.setVerticalGroup(
            f2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c39Layout = new javax.swing.GroupLayout(c39);
        c39.setLayout(c39Layout);
        c39Layout.setHorizontalGroup(
            c39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        c39Layout.setVerticalGroup(
            c39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c36Layout = new javax.swing.GroupLayout(c36);
        c36.setLayout(c36Layout);
        c36Layout.setHorizontalGroup(
            c36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        c36Layout.setVerticalGroup(
            c36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout f3Layout = new javax.swing.GroupLayout(f3);
        f3.setLayout(f3Layout);
        f3Layout.setHorizontalGroup(
            f3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        f3Layout.setVerticalGroup(
            f3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c4Layout = new javax.swing.GroupLayout(c4);
        c4.setLayout(c4Layout);
        c4Layout.setHorizontalGroup(
            c4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        c4Layout.setVerticalGroup(
            c4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c3Layout = new javax.swing.GroupLayout(c3);
        c3.setLayout(c3Layout);
        c3Layout.setHorizontalGroup(
            c3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        c3Layout.setVerticalGroup(
            c3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c29Layout = new javax.swing.GroupLayout(c29);
        c29.setLayout(c29Layout);
        c29Layout.setHorizontalGroup(
            c29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        c29Layout.setVerticalGroup(
            c29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c9Layout = new javax.swing.GroupLayout(c9);
        c9.setLayout(c9Layout);
        c9Layout.setHorizontalGroup(
            c9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        c9Layout.setVerticalGroup(
            c9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c31Layout = new javax.swing.GroupLayout(c31);
        c31.setLayout(c31Layout);
        c31Layout.setHorizontalGroup(
            c31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        c31Layout.setVerticalGroup(
            c31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c30Layout = new javax.swing.GroupLayout(c30);
        c30.setLayout(c30Layout);
        c30Layout.setHorizontalGroup(
            c30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        c30Layout.setVerticalGroup(
            c30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c28Layout = new javax.swing.GroupLayout(c28);
        c28.setLayout(c28Layout);
        c28Layout.setHorizontalGroup(
            c28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        c28Layout.setVerticalGroup(
            c28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout f19Layout = new javax.swing.GroupLayout(f19);
        f19.setLayout(f19Layout);
        f19Layout.setHorizontalGroup(
            f19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        f19Layout.setVerticalGroup(
            f19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c32Layout = new javax.swing.GroupLayout(c32);
        c32.setLayout(c32Layout);
        c32Layout.setHorizontalGroup(
            c32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        c32Layout.setVerticalGroup(
            c32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c26Layout = new javax.swing.GroupLayout(c26);
        c26.setLayout(c26Layout);
        c26Layout.setHorizontalGroup(
            c26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        c26Layout.setVerticalGroup(
            c26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c8Layout = new javax.swing.GroupLayout(c8);
        c8.setLayout(c8Layout);
        c8Layout.setHorizontalGroup(
            c8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        c8Layout.setVerticalGroup(
            c8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout f22Layout = new javax.swing.GroupLayout(f22);
        f22.setLayout(f22Layout);
        f22Layout.setHorizontalGroup(
            f22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        f22Layout.setVerticalGroup(
            f22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout f7Layout = new javax.swing.GroupLayout(f7);
        f7.setLayout(f7Layout);
        f7Layout.setHorizontalGroup(
            f7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        f7Layout.setVerticalGroup(
            f7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c33Layout = new javax.swing.GroupLayout(c33);
        c33.setLayout(c33Layout);
        c33Layout.setHorizontalGroup(
            c33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        c33Layout.setVerticalGroup(
            c33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c10Layout = new javax.swing.GroupLayout(c10);
        c10.setLayout(c10Layout);
        c10Layout.setHorizontalGroup(
            c10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        c10Layout.setVerticalGroup(
            c10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout f24Layout = new javax.swing.GroupLayout(f24);
        f24.setLayout(f24Layout);
        f24Layout.setHorizontalGroup(
            f24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        f24Layout.setVerticalGroup(
            f24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c34Layout = new javax.swing.GroupLayout(c34);
        c34.setLayout(c34Layout);
        c34Layout.setHorizontalGroup(
            c34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        c34Layout.setVerticalGroup(
            c34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c27Layout = new javax.swing.GroupLayout(c27);
        c27.setLayout(c27Layout);
        c27Layout.setHorizontalGroup(
            c27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        c27Layout.setVerticalGroup(
            c27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c12Layout = new javax.swing.GroupLayout(c12);
        c12.setLayout(c12Layout);
        c12Layout.setHorizontalGroup(
            c12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        c12Layout.setVerticalGroup(
            c12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c13Layout = new javax.swing.GroupLayout(c13);
        c13.setLayout(c13Layout);
        c13Layout.setHorizontalGroup(
            c13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        c13Layout.setVerticalGroup(
            c13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout f8Layout = new javax.swing.GroupLayout(f8);
        f8.setLayout(f8Layout);
        f8Layout.setHorizontalGroup(
            f8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        f8Layout.setVerticalGroup(
            f8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c7Layout = new javax.swing.GroupLayout(c7);
        c7.setLayout(c7Layout);
        c7Layout.setHorizontalGroup(
            c7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        c7Layout.setVerticalGroup(
            c7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c14Layout = new javax.swing.GroupLayout(c14);
        c14.setLayout(c14Layout);
        c14Layout.setHorizontalGroup(
            c14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        c14Layout.setVerticalGroup(
            c14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout f9Layout = new javax.swing.GroupLayout(f9);
        f9.setLayout(f9Layout);
        f9Layout.setHorizontalGroup(
            f9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        f9Layout.setVerticalGroup(
            f9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c6Layout = new javax.swing.GroupLayout(c6);
        c6.setLayout(c6Layout);
        c6Layout.setHorizontalGroup(
            c6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        c6Layout.setVerticalGroup(
            c6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c11Layout = new javax.swing.GroupLayout(c11);
        c11.setLayout(c11Layout);
        c11Layout.setHorizontalGroup(
            c11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        c11Layout.setVerticalGroup(
            c11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout f25Layout = new javax.swing.GroupLayout(f25);
        f25.setLayout(f25Layout);
        f25Layout.setHorizontalGroup(
            f25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        f25Layout.setVerticalGroup(
            f25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout f26Layout = new javax.swing.GroupLayout(f26);
        f26.setLayout(f26Layout);
        f26Layout.setHorizontalGroup(
            f26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        f26Layout.setVerticalGroup(
            f26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout f10Layout = new javax.swing.GroupLayout(f10);
        f10.setLayout(f10Layout);
        f10Layout.setHorizontalGroup(
            f10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        f10Layout.setVerticalGroup(
            f10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout f11Layout = new javax.swing.GroupLayout(f11);
        f11.setLayout(f11Layout);
        f11Layout.setHorizontalGroup(
            f11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        f11Layout.setVerticalGroup(
            f11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout f12Layout = new javax.swing.GroupLayout(f12);
        f12.setLayout(f12Layout);
        f12Layout.setHorizontalGroup(
            f12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        f12Layout.setVerticalGroup(
            f12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout f23Layout = new javax.swing.GroupLayout(f23);
        f23.setLayout(f23Layout);
        f23Layout.setHorizontalGroup(
            f23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        f23Layout.setVerticalGroup(
            f23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout f5Layout = new javax.swing.GroupLayout(f5);
        f5.setLayout(f5Layout);
        f5Layout.setHorizontalGroup(
            f5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        f5Layout.setVerticalGroup(
            f5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout f6Layout = new javax.swing.GroupLayout(f6);
        f6.setLayout(f6Layout);
        f6Layout.setHorizontalGroup(
            f6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        f6Layout.setVerticalGroup(
            f6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout f16Layout = new javax.swing.GroupLayout(f16);
        f16.setLayout(f16Layout);
        f16Layout.setHorizontalGroup(
            f16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        f16Layout.setVerticalGroup(
            f16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout f17Layout = new javax.swing.GroupLayout(f17);
        f17.setLayout(f17Layout);
        f17Layout.setHorizontalGroup(
            f17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        f17Layout.setVerticalGroup(
            f17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout f18Layout = new javax.swing.GroupLayout(f18);
        f18.setLayout(f18Layout);
        f18Layout.setHorizontalGroup(
            f18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        f18Layout.setVerticalGroup(
            f18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout f4Layout = new javax.swing.GroupLayout(f4);
        f4.setLayout(f4Layout);
        f4Layout.setHorizontalGroup(
            f4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        f4Layout.setVerticalGroup(
            f4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c25Layout = new javax.swing.GroupLayout(c25);
        c25.setLayout(c25Layout);
        c25Layout.setHorizontalGroup(
            c25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        c25Layout.setVerticalGroup(
            c25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c35Layout = new javax.swing.GroupLayout(c35);
        c35.setLayout(c35Layout);
        c35Layout.setHorizontalGroup(
            c35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        c35Layout.setVerticalGroup(
            c35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c5Layout = new javax.swing.GroupLayout(c5);
        c5.setLayout(c5Layout);
        c5Layout.setHorizontalGroup(
            c5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        c5Layout.setVerticalGroup(
            c5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout c15Layout = new javax.swing.GroupLayout(c15);
        c15.setLayout(c15Layout);
        c15Layout.setHorizontalGroup(
            c15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 159, Short.MAX_VALUE)
        );
        c15Layout.setVerticalGroup(
            c15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

    
        
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(j3)
                    .addComponent(j2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c22)
                            .addComponent(c21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(c20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(f13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(c23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(c25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(f15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(f16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(f17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(f18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(c37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(c38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(c39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(c40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(c36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(j4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(c31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c35)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(c30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(f19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(f22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(f23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(c29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(f24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(f25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(f26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(c15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(f12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(f11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(f10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(f9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(f8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(f7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(c23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(c24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(f14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(f15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(f17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(f18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(c25)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(c15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(f24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(f25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(f26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(f10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(f11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(f12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(f19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(c30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(f22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(f7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(f8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(f9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(f6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(f5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(4, 4, 4)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        
        lanzarcomodin1.setText("Lanzar Comodin");

        lanzardado1.setText("Lanzar dado");

        jugar1.setText("Jugada");

        valordadotodoficha1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Ficha 1", "Ficha 2", "Ficha 3", "Ficha 4" }));

        fichasvalordado2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nigunoxd", "Ficha 1", "Ficha 2", "Ficha 3", "Ficha 4" }));

        fichavalordado3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Ficha 1", "Ficha 2", "Ficha 3", "Ficha 4" }));

        jLabel6.setText("Mover todo ( valor dado " + Integer.toString(dice1+dice2) + " ) con una ficha:");

        valordado3.setText("Ficha a jugar con valor:"+ dice1);

        valordado4.setText("Ficha a jugar con valor:"+dice2);

        fichasjugar1.setText("Fichas disponibles para jugar:  Fichas");

        comodines1.setText("Comodines disponibles:");

        /**
         * acciones
         */

        comodines1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Comodines ventana1 = new Comodines(tablero);
                ventana1.setLocationRelativeTo(null);
                ventana1.setVisible(true);
            }
        });
        lanzardado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
                String[] options = {"Dado normal plz", "Dado magico plz"};
                int resp = JOptionPane.showOptionDialog(null,"¿que queri?","elige sabiamente", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,options,options[0] );
                if(resp==0){
                    DiceGUI ventana1 = new DiceGUI(tablero);
                    ventana1.setLocationRelativeTo(null);
                    ventana1.setVisible(true);
                }
                else{
                    DiceGUI ventana1 = new DiceGUI(tablero, true);
                    ventana1.setLocationRelativeTo(null);
                    ventana1.setVisible(true);
                }

            }
        });


        jugar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                    
                    int valortodoficha = valordadotodoficha1.getSelectedIndex();
                    int fichaajugar1=fichasvalordado2.getSelectedIndex();
                    int fichaajugar2=fichavalordado3.getSelectedIndex();

                    if(valortodoficha>0){
                        if(somosMagicosPa()){
                            if(tablero.giveFichaslJugador().get(valortodoficha).getTypeOfFicha() == "Normal"){
                                if(dice1==3 || dice1 == 1 || dice1 == 2){

                                    dupli1();
                                }
                                if(dice2==3 || dice2 == 1 || dice2 == 2){

                                    dupli2();
                                }
                            }
                            if(tablero.giveFichaslJugador().get(valortodoficha).getTypeOfFicha() == "Saltarina"){
                                if(dice1==8){

                                    halve1();
                                }
                                if(dice2==8){
                                    halve2();

                                }
                            }
                            if(tablero.giveFichaslJugador().get(valortodoficha).getTypeOfFicha() == "Ingeniera"){
                                if(dice1 %2==0){

                                    turnToOne(1);
                                }
                                if(dice2 %2==0){
                                    turnToOne(2);

                                }
                            }
                        }
                            dispose();
                            tablero.moveFicha(dice1+dice2, valortodoficha-1);
                            tablero.turnPlayer();
                            BoardGUI xd = new BoardGUI(tablero, 0, -1, "a");
                            xd.setLocationRelativeTo(null);
                            xd.setVisible(true);
                    }
                    else if(fichaajugar1>0 && fichaajugar2 > 0){
                        if(somosMagicosPa()){
                            if(tablero.giveFichaslJugador().get(fichaajugar1).getTypeOfFicha() == "Normal"){
                                if(dice1==3 || dice1 == 1 || dice1 == 2){
    
                                    dupli1();
                                }
                                if(dice2==3 || dice2 == 1 || dice2 == 2){
    
                                    dupli2();
                                }
                            }
                            if(tablero.giveFichaslJugador().get(fichaajugar1).getTypeOfFicha() == "Saltarina"){
                                if(dice1==8){
    
                                    halve1();
                                }
                                if(dice2==8){
                                    halve2();
    
                                }
                            }
                            if(tablero.giveFichaslJugador().get(fichaajugar1).getTypeOfFicha() == "Ingeniera"){
                                if(dice1 %2==0){
    
                                    turnToOne(1);
                                }
                                if(dice2 %2==0){
                                    turnToOne(2);
    
                                }
                            }
                        }
                        dispose();
                        tablero.moveFicha(dice1, fichaajugar1-1);
                        tablero.turnPlayer();
                        BoardGUI xd = new BoardGUI(tablero, 0, -1, "a");
                        xd.setLocationRelativeTo(null);
                        xd.setVisible(true);
                    }
                    
                    else{
                        dispose();
                        JOptionPane.showMessageDialog(null, POOBCHISException.NO_ELIGIO_NADA.toString());
                        BoardGUI a = new BoardGUI(tablero, dice1, dice2, "a");
                        a.setLocationRelativeTo(null);
                        a.setVisible(true);
                    }
            }
        });






        /**
         * fin acciones
         */

        turno1.setText("Ahora es turno de:" + jugadorturno);


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jugar1)
                                .addGap(98, 98, 98))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lanzarcomodin1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lanzardado1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(comodines1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(turno1)
                                    .addComponent(fichasjugar1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valordadotodoficha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(valordado4)
                                .addGap(18, 18, 18)
                                .addComponent(fichasvalordado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(valordado3)
                                .addGap(18, 18, 18)
                                .addComponent(fichavalordado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 201, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(turno1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comodines1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fichasjugar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valordado4)
                            .addComponent(fichasvalordado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valordado3)
                            .addComponent(fichavalordado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(valordadotodoficha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jugar1)
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lanzardado1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lanzarcomodin1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }
}