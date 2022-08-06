public class TestBurgers
{
    public static void main(String[] args)
    {
        //To clear page whenever the program is run
        System.out.print("\f");
        /* Below I create McFeast and McRoyale objects and place them in the
         Burger array. */
        //McFeast burger objects
        McFeast f1 = new McFeast(105, "4.5 inch Bun", "100g Beef patty", 2, "Cheddar Cheese", 4, "Shredded Lettuce", "Fresh Onions", "Tomato", "Braai Sauce", "McChicken Sauce", true);
        McFeast f2 = new McFeast(34, "4.5 inch Bun", "100g Beef patty", 4, "Cheddar Cheese", 8, "No Shredded Lettuce", "Fresh Onions", "Tomato", "Spicy Sauce", "No McChicken Sauce", false);

        //McRoyale burger objects
        McRoyale r1 = new McRoyale(211, "Quater Pounder Bun", "50g Beef patty", 2, "White Cheese", 2, "Shredded Lettuce", "Fresh Onions", "No Tomato", "Ketchup", "No Mustard", "McChicken Sauce", "Pickles", false);
        McRoyale r2 = new McRoyale(74, "Quater Pounder Bun", "50g Beef patty", 3, "Cheddar Cheese", 4, "Shredded Lettuce", "Fresh Onions", "Tomato", "Ketchup", "Mustard", "No McChicken Sauce", "No Pickles", true);

        //Placement of the burger objects into my burger array
        Burger[] burgers = new Burger[4];
        burgers[0] = f2;
        burgers[1] = r2;
        burgers[2] = f1;
        burgers[3] = r1;

        for(int i = 0; i < burgers.length; i++){
            System.out.println("Burger " + (i+1) + burgers[i] + "\n\nThe total burger cost is R" + burgers[i].burgerCost() + "\n");
        }
    }
}