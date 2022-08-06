/** Burger.java is the super class from which the burger types will
 * inherit their attributes from.
 * */

public abstract class Burger {
    /* Here I declared all the basic common properties fo beef burgers that will be
     * used in the different burger types
     * */
    private int orderNumber = 0;
    private String bun = "";
    private String patty = "";
    private int numberOfPatty = 1;
    private String cheese = "";
    private int cheeseSlice = 1;
    private String lettuce = "";
    private String onions = "";
    private String tomato = "";
    private String sauce = "";
    private boolean extraOnion = false;

    // the default constructor
    protected Burger(){}

    /* Full burger object that receives all the variables and the variables are
       placed in the correct private variable using mutators
    * */
    protected Burger(int orderNumber, String bun, String patty, int numberOfPatty, String cheese,
                     int cheeseSlice, String lettuce, String onions, String tomato,
                     String sauce, boolean extraOnion){
        setOrderNumber(orderNumber);
        setBun(bun);
        setPatty(patty);
        setNumberOfPatty(numberOfPatty);
        setCheese(cheese);
        setNumberOfCheeseSlice(cheeseSlice);
        setLettuce(lettuce);
        setOnions(onions);
        setTomato(tomato);
        setSauce(sauce);
        setExtraOnion(extraOnion);
    }

    // Accessor methods for attributes
    public int getOrderNumber(){
        return orderNumber;
    }
    public String getBun(){
        return bun;
    }
    public String getPatty(){
        return patty;
    }
    public int getNumberOfPatty(){
        return numberOfPatty;
    }
    public String getCheese(){
        return cheese;
    }
    public int getNumberOfCheeseSlice(){
        return cheeseSlice;
    }
    public String getLettuce(){
        return lettuce;
    }
    public String getOnions(){
        return onions;
    }
    public String getTomato(){
        return tomato;
    }
    public String getSauce(){
        return sauce;
    }
    public boolean getExtraOnion(){
        return extraOnion;
    }

    // Mutator methods for attributes
    public void setOrderNumber(int orderNumber){
        this.orderNumber = orderNumber;
    }
    public void setBun(String bun){
        this.bun = bun;
    }
    public void setPatty(String patty){
        this.patty = patty;
    }
    public void setNumberOfPatty(int numberOfPatty){
        this.numberOfPatty = numberOfPatty;
    }
    public void setCheese(String cheese){
        this.cheese = cheese;
    }
    public void setNumberOfCheeseSlice(int cheeseSlice){
        this.cheeseSlice = cheeseSlice;
    }
    public void setLettuce(String lettuce){
        this.lettuce = lettuce;
    }
    public void setOnions(String onions){
        this.onions = onions;
    }
    public void setTomato(String tomato){
        this.tomato = tomato;
    }
    public void setSauce(String sauce){
        this.sauce = sauce;
    }
    public void setExtraOnion(boolean extraOnion){
        this.extraOnion = extraOnion;
    }

    /* Abstract method burgerCost. Its implementation can be found in
       the burger type sub classes.*/
    public abstract double burgerCost();
}