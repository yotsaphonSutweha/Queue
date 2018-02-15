/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicapp;

import java.util.ArrayList;

/**
 *
 * @author yo
 */
public class Queue implements QueueInterface{
    
    ArrayList<Customer> cus;
    
    public Queue(){
        cus = new ArrayList<>();
    }
    @Override
    public boolean isEmpty() {
       return cus.isEmpty();
    }

    @Override
    public Object dequeue() {
        return cus.remove(0);
    }

    @Override
    public void enqueue(Object element) {
        cus.add((Customer) element);
    }

    
    @Override
    public int size() {
         return cus.size();
    }

    @Override
    public Object frontElement() {
        return cus.get(0).displayInfo();
    }

    @Override
    public void display(){
        for(int i=0;i<cus.size();i++){
            System.out.println(cus.get(i).displayInfo());
        }
        
    }
}
