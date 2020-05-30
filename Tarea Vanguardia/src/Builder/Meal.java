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
public class Meal {
    
    public String sandwich;
    public String sideOrder;
    public String drink;
    public String offer;
    public double price;
    
    public Meal(){
        
    }
    
    @Override
    public String toString(){
        return (
            "Sandwich: " + this.sandwich + "\n" +
            "Side Order: " + this.sandwich + "\n" +
            "Drink: " + this.drink + "\n" + 
            "Offer: " + this.offer + "\n" + 
            "Price: " + this.price
        );
    }
}
