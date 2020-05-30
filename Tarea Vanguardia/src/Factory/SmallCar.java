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
public class SmallCar extends Car{
    
    public SmallCar() {
        super(CarType.SMALL);
        construct();
    }
    
    protected void construct(){
        System.out.println("Construyendo un carro Pequeño");
    }
}
