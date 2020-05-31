
package Observer;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorge
 */
public class HeadHunter implements Subject {

    private ArrayList<String> jobs;
    private ArrayList<Observer> userList;
    
    public HeadHunter(){
        this.jobs = new ArrayList<String>();
        this.userList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.userList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.userList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : this.userList) {
            observer.update(this);
        }
    }
 
    public void addJob(String job){
        this.jobs.add(job);
        this.notifyAllObservers();
    }
    
    public ArrayList<String> getJobs(){
        return this.jobs;
    }
    
    public String toString(){
        return jobs.toString();
    }
}

