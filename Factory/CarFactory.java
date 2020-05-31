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
public class CarFactory {
    
    
    public static Car buildCar(CarType model){
        
        Car car = null;
        
        switch(model){
            case LUXURY:
                car =  new LuxuryCar();
            case SEDAN:
                car =  new SedanCar();
            case SMALL:
                car = new SmallCar();
            default:
                break;
        }
        
        return car;
    }
    
}
