import java.util.*;

/**This is a burger type class(McFeast sub-class) and will inherit properties from the Burger class*/
public class McFeast extends Burger
{
    /**The variables declared in this class only apply to the McFeast burger only*/
    private String sauce2 = "";
    private double burgerPrice = 74.90;
    private double pattyPrice = 24.90;
    private double cheesePrice = 8.90;
    private double extraOnionPrice = 2.90;
    private double extraPatty = 0;
    private double extraCheese = 0;

    /**Default constructor*/
    public McFeast(){}

    public McFeast(int orderNumber, String bun, String patty, int numberOfPatty, String cheese,
                   int cheeseSlice, String lettuce, String onions, String tomato, String sauce1,
                   String sauce2, boolean extraOnion){
        /**Calling constructor from the super class and setting all the appropriate values*/
        super(orderNumber, bun, patty, numberOfPatty, cheese, cheeseSlice, lettuce, onions, tomato, sauce1, extraOnion);
        setSauce2(sauce2);
        setBurgerPrice(burgerPrice);
    }

    /**Getter/Accessor methods for attributes*/
    public String getSauce2(){
        return sauce2;
    }

    public double getBurgerPrice(){
        return burgerPrice;
    }

    public double getPattyPrice(){
        return pattyPrice;
    }

    public double getCheesePrice(){
        return cheesePrice;
    }

    /**Setter/Mutator methods for attributes*/
    public void setSauce2(String sauce2){
        this.sauce2 = sauce2;
    }

    public void setBurgerPrice(double burgerPrice){
        this.burgerPrice = burgerPrice;
    }

    /**The implementation of the burgerCost abstract method from the Burger class.
     In this calss it is not declared as abstract since it it being implemented
     and in order for me to not get any error when compiling the spelling of the
     this method should be the same as the one in the Burger class.*/
    public double burgerCost(){
        if(getExtraOnion() == true){
            //If-statement to calculate extra cost if customer wants extra patties
            if(getNumberOfPatty() > 2){
                extraPatty = (getNumberOfPatty() - 2) * pattyPrice;
            }

            //If-statement to calculate extra cost if customer wants extra cheese
            if(getNumberOfCheeseSlice() > 2){
                extraCheese = (getNumberOfCheeseSlice() - 2) * cheesePrice;
            }

            return Math.round((burgerPrice + extraPatty + extraCheese + extraOnionPrice));
        }
        else{
            //If-statement to calculate extra cost if customer wants extra patties
            if(getNumberOfPatty() > 2){
                extraPatty = (getNumberOfPatty() - 2) * pattyPrice;
            }

            //If-statement to calculate extra cost if customer wants extra cheese
            if(getNumberOfCheeseSlice() > 2){
                extraCheese = (getNumberOfCheeseSlice() - 2) * cheesePrice;
            }

            return Math.round((burgerPrice + extraPatty + extraCheese));
        }

    }

    /**The implementation of the makeBurger abstract method from the Burger super class.*/
    public String toString(){
        return (" with order no.: " + getOrderNumber() + " is a McFeast burger with a cost price of R" + this.burgerPrice + " is made up of:\n" + getBun() +
                "\n" + getNumberOfPatty() + "x " + getPatty() + "\n" + getNumberOfCheeseSlice() + "x " + getCheese() + "\n" +
                getLettuce() + "\n" + this.sauce2 + "\n" + getSauce()+ "\n" + getOnions() + "\n" + getTomato());
    }
}