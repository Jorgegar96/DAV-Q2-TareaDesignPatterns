/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author jorge
 */
public class MealDirector {
    
    public MealDirector(){
    
    }
    
    public void makeMeal(MealBuilder mealBuilder){
     
        mealBuilder.addSandwich("BBQ Ribs Sandwich");
        mealBuilder.addSides("Twister Chips");
        mealBuilder.addDrink("Root Beer");
        mealBuilder.addOffer("50% off");
        mealBuilder.setPrice(4.99);
        
    }
    
}
