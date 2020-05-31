/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author jorge
 */
public abstract class Car {
    
    public CarType model;
    
    protected Car(CarType model){
        this.model = model;
    }
    
    protected abstract void construct();
    
    public CarType getModel(){
        return this.model;
    }
    
    public void setModel(CarType model){
        this.model = model;
    }
}
