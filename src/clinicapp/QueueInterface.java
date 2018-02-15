/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicapp;

/**
 *
 * @author yo
 */
public interface QueueInterface {
    public boolean isEmpty();
    public Object dequeue();
    public void enqueue(Object element);
    public int size();
    public Object frontElement();
    public void display();
    
    
}
