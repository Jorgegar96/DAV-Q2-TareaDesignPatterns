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
public interface MealBuilder {
    public abstract void addSandwich(String sandwich);
    public abstract void addSides(String sideOrder);
    public abstract void addDrink(String drink);
    public abstract void addOffer(String offer);
    public abstract void setPrice(double price);
    public abstract Meal getMeal();
}
