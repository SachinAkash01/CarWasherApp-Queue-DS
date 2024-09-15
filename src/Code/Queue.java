/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author it21351372
 */
public class Queue {
    private int maxSize;
    private MachineRequest queueArray[];
    private int front;
    private int rear;
    private int nItems;
    
    public Queue(int s){
        this.maxSize = s;
        queueArray = new MachineRequest[s];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    
    public boolean isEmpty(){
        return (nItems == 0);
    }
    
    public boolean isFull(){
        return (nItems == maxSize);
    }
    
    public void insert(MachineRequest mr){
        if (isFull()){
            System.out.println("Queue is Full!");
        }
        else{
            if (rear == (maxSize-1)){
                rear = -1;
            }
            queueArray[++rear] = mr;
            nItems++;
        }
    }
    
    public MachineRequest remove(){
        if (isEmpty()){
            return null;
        }
        else{
            nItems--;
            return queueArray[front++];
        }
    }
    
    public MachineRequest peek(){
        if (isEmpty()){
            return null;
        }
        else{
            return queueArray[front];
        }
    }
}
