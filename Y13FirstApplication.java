
package y13firstapplication;

import java.util.ArrayList;

public class Y13FirstApplication {

    public static void main(String[] args) {
        
        //created arraylist object called shoppingList
        
        ArrayList<String> shoppingList = new ArrayList();
        
        
        //added items to shpping list using add method
        shoppingList.add("Bread");
        shoppingList.add("Milk");
        shoppingList.add("Butter");
        shoppingList.add("Eggs");
        shoppingList.add("Butter");
        shoppingList.add("Spaghetti");
        shoppingList.add("Water");
        shoppingList.add("Rice");
        shoppingList.add("Chicken");
        shoppingList.add("Salt");
        
        //printing out shoppingList 
        System.out.println(shoppingList);
        
        shoppingList.remove("Eggs");
        System.out.println(shoppingList);
        
        //Advanced for loop for iterating through
        //an ArrayList is an iterable
        for(String x: shoppingList) {
            System.out.println(x);
        }
    }
    
}
