/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javathreading;

/**
 *
 * @author SHIKHON
 */
public class ThreadInterface implements Runnable {

    @Override
    public void run(){
        try{
            System.out.println("Thread interface object " +Thread.currentThread().getId());
        }catch(Exception e){
            
        }
    }
    
}
