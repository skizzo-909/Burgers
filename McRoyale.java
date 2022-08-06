import java.util.*;
/** This is another burger type class (McRoyale) and will also inherit attributes from
 * the Burger super class.
 * */
public class McRoyale extends Burger {
    private String ketchup = "Ketchup";
    private String mustard = "Mustard";
    private String pickels = "Pickle Slices";
    private double burgerPrice = 69.90;
    private double pattyPrice = 14.90;
    private double cheesePrice = 8.90;
    private double extraOnionPrice = 2.90;
    private double extraPatty = 0;
    private double extraCheese = 0;

    // default constructor
    public McRoyale(){}

    public McRoyale(int orderNumber, String bun, String patty, int numberOfPatty, String cheese,
                    int cheeseSlice, String lettuce, String onions, String tomato,
                    String ketchup, String mustard, String sauce, String pickles,
                    boolean extraOnion){
        super(orderNumber, bun, patty, numberOfPatty, cheese, cheeseSlice, lettuce, onions,
                tomato, sauce, extraOnion);
        setKetchup(ketchup);
        setMustard(mustard);
        setPickles(pickles);
        setBurgerPrice(burgerPrice);
    }

    // Accessor methods for attributes
    public String getKetchup(){
        return ketchup;
    }
    public String getMustard(){
        return mustard;
    }
    public String getPickles(){
        return pickels;
    }
    public double getBurgerPrice(){
        return burgerPrice;
    }

    // Mutator methods for attributes
    public void setKetchup(String ketchup){
        this.ketchup = ketchup;
    }
    public void setMustard(String mustard){
        this.mustard = mustard;
    }
    public void setPickles(String pickles){
        this.pickels = pickles;
    }
    public void setBurgerPrice(double burgerPrice){
        this.burgerPrice = burgerPrice;
    }

    /* Below is the implementation of both the burgerCost and makeBurger
       abstract methods. */
    public double burgerCost(){
        // if-statement for when a customer asks for extra onions
        if(getExtraOnion() == true){
            // if-statement to calculate extra cost if customer asks for extra patties
            if(getNumberOfPatty() > 1){
                extraPatty += (getNumberOfPatty() - 1) * pattyPrice;
            }

            // if-statement to calculate extra cost if customer asks for extra cheese
            if(getNumberOfCheeseSlice() > 1){
                extraCheese += (getNumberOfCheeseSlice() - 1) * cheesePrice;
            }

            return Math.round((burgerPrice + extraPatty + extraCheese + extraOnionPrice));
        }
        else{
            // if-statement to calculate extra cost if customer wants extra patties
            if(getNumberOfPatty() > 1){
                extraPatty = (getNumberOfPatty() - 1) * pattyPrice;
            }

            // if-statement to calculate extra cost if customer wants extra cheese
            if(getNumberOfCheeseSlice() > 1){
                extraCheese = (getNumberOfCheeseSlice() - 1) * cheesePrice;
            }

            return Math.round((burgerPrice + extraPatty + extraCheese));
        }
    }
    public String toString(){
        return (" with order no.: " + getOrderNumber() + " is a McRoyale burger with a cost price of R" + this.burgerPrice + " and is made up of:\n" + getBun() +
                "\n" + getNumberOfPatty() + "x " + getPatty() + "\n" + getNumberOfCheeseSlice() + "x " + getCheese() + "\n" +
                getLettuce() + "\n" + this.ketchup + "\n" + this.mustard + "\n" + getSauce()+ "\n" + getOnions() + "\n" + getTomato());
    }
}