/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.vanguardia;

import Singleton.*;
import Factory.*;
import Observer.*;

/**
 *
 * @author jorge
 */
public class TareaVanguardia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Singleton
        SingletonTest();
        
        //Factory
        FactoryTest();
        
        //Observer
        ObserverTest();
        
        //Builder
        BuilderTest();
    }
    
    public static void SingletonTest(){
        System.out.println("------------EJECUCIÓN DE SINGLETON-------------\n");
        
        Singleton instance = Singleton.getInstance();
        
        System.out.println("\n-------FIN DE EJECUCIÓN DE SINGLETON----------\n\n");
    }
    
    public static void FactoryTest(){
        System.out.println("-------------EJECUCIÓN DE FACTORY--------------\n");
        
        //Construir carro de Lujo
        Car luxury = new LuxuryCar();
        System.out.println("Modelo: " + luxury.getModel());
        
        //Construir carro de Sedan
        Car sedan = new SedanCar();
        System.out.println("Modelo: " + sedan.getModel());
        
        //Construir carro de Pequeño
        Car small = new SmallCar();
        System.out.println("Modelo: " + small.getModel());
        
        System.out.println("\n--------FIN DE EJECUCIÓN DE FACTORY-----------\n\n");
    }
    
    public static void ObserverTest(){
        
        System.out.println("----------EJECUCIÓN DE OBSERVER----------------\n");
        
        //Instancia de HeadHunter
        HeadHunter headhunter = new HeadHunter();
        
        //Registro de seguidores del HeadHunter
        headhunter.registerObserver(new JobSeeker("Samuel Flores"));
        headhunter.registerObserver(new JobSeeker("Eduardo Maradiaga"));
        headhunter.registerObserver(new JobSeeker("Alex Banegas"));
        headhunter.registerObserver(new JobSeeker("Martín Hernández"));
        
        //Agregando ofertas de trabajo al HeadHunter
        headhunter.addJob("Ciencia de Datos");
        headhunter.addJob("Ingeniero Civil");
        headhunter.addJob("Cocinero");
        
        System.out.println("\n---------FIN DE EJECUCIÓN DE OBSERVER---------\n\n");
    }
    
    public static void BuilderTest(){
        System.out.println("-------------EJECUCIÓN DE BUILDER----------------");
        
        System.out.println("\n---------FIN DE EJECUCIÓN DE OBSERVER---------\n\n");
    }
}
