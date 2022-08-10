package domain;

public abstract class Ficha{

    private String color;
    private String tokenOwner;

    /**
     * Constructor de la clase Ficha
     * @param color
     * @param tokenOwner
     */
    public Ficha (String color, String tokenOwner){
        this.color = color;
        this.tokenOwner = tokenOwner;
    }

    public String getColor(){
        return color;
    }

    public String deQuienEs(){
        return tokenOwner;
    }

    /**
     * Regresa el color de la ficha
     * @return color ficha (String)
     */
    abstract public String colorFicha();


    /**
     * Metodo que regresa a quien pertenece la ficha
     * @return
     */
    abstract public String pertenece();

    /**
     * Metodo que ingresa si esta segura
     * @param sure
     */
    abstract public void setIsSure();

    /**
     * Metodo que dice si esta segura ficha
     * @return estado ficha (boolean)
     */
    abstract public boolean fichaIsSure();

    /**
     * Entra la ficha a la carcel
     */
    abstract public void entryJail();

    /**
     * Sale la ficha de la carcel   
     */
    abstract public void saleJail();

    /**
     * Compureba si esta dentro de la casilla
     * @return Regresa una ficha
     */
    abstract public boolean comprobateOnJail();

    /**
     * El tipo de ficha
     * @return tipo de ficha (String)
     */
    abstract public String getTypeOfFicha();
    
    /**
     * ingresa la posicion de la ficha
     * @param x
     */
    abstract public void setPositionFicha(int x);
    /**
     * regresa la posicion de la ficha
     * @return posicion de la fica (int)
     */
    abstract public int getPositionFicha();
    /**
     * activa el comidin para una ficha
     * @param numPower
     * @return entrero el cual lleva el poder
     */
    abstract public int activatePower(int numPower);
}