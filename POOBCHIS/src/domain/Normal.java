package domain;
public class Normal extends Ficha{
    private String color;
    private int positionFicha;
    private String tokenOwner;
    private String type;   
    private boolean isSure; 
    private boolean onJail;    

    /**
     * Constructor de la clase Normal
     * @param color
     * @param tokenOwner
     */
    public Normal(String color, String tokenOwner){
        super(color, tokenOwner);
        this.color = color;
        this.tokenOwner = tokenOwner;
        this.positionFicha = 1;
        this.isSure = false;
        this.type = "Normal";
    }

    public String pertenece(){
        return tokenOwner;
    }

    /**
     * Metodo que ingresa si esta segura
     * @param sure
     */
    public void setIsSure(){
        this.isSure = true;
    }

    /**
     * Metodo que dice si esta segura ficha
     * @return estado ficha (boolean)
     */
    public boolean fichaIsSure(){
        return isSure;
    }

    /**
     * Entra la ficha a la carcel
     */
    public void entryJail(){
        this.onJail = true;
    }

    /**
     * Sale la ficha de la carcel   
     */
    public void saleJail(){
        this.onJail = false;
    }

    /**
     * Compureba si esta dentro de la casilla
     * @return Regresa una ficha
     */
    public boolean comprobateOnJail(){
        return onJail;
    }

    /**
     * El tipo de ficha
     * @return tipo de ficha (String)
     */
    public String getTypeOfFicha(){
        return type;
    }

    /**
     * Metodo que activa el poder de la ficha
     * @return casilla que debe mover al activar el poder (int)
     */
    public int activarPoder(){
        return 1;
    }

    public int activatePower(int power){
        return power;
    }

    public void setPositionFicha(int x){
        this.positionFicha = x;
    }

    public int getPositionFicha(){
        return positionFicha;
    }

    public String colorFicha(){
        return color;
    }
}
