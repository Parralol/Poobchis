package domain;

public class Ingeniera extends Ficha{
    private String color;
    private int positionFicha;
    private String tokenOwner;
    private String type;   
    private boolean isSure; 
    private boolean onJail;

    /**
     * Constructor de Ingeniera
     * 
     * @param color
     * @param tokenOwner
     */
    public Ingeniera(String color, String tokenOwner){
        super(color, tokenOwner);
        this.color = color;
        this.tokenOwner = tokenOwner;
        this.positionFicha = 1;
        this.isSure = false;
        this.type = "Ingeniera";
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
     * Activa el poder de la ficha ingeniera
     * @return
     */
    public boolean activaPoder(){
        return fichaIsSure();
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

    public String getTypeOfFicha(){
        return type;
    }
    public String colorFicha(){
        return color;
    }
}
