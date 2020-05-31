/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author jorge
 */
public class Singleton {
    
    private static volatile Singleton instance = new Singleton();
    
    private Singleton(){
        
    }
    
    public static Singleton getInstance(){
        System.out.println("Retornando única instancia del Singleton");
        return instance;
    }
}
