/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author jorge
 */
public class JobSeeker implements Observer{
    
    private String name;
    
    public JobSeeker(String name){
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        System.out.println("Se le ha notificado a " + this.name + " sobre una actualización.");
        System.out.println(subject);
    }
}