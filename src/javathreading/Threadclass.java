/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javathreading;

/**
 *
 * @author SHIKHON
 */
public class Threadclass extends Thread {
    public int id;
    public Threadclass(int id){
        this.id=id;
    }
    @Override
    public void run(){
        try{
            System.out.println("Thread class object " +id);
            for(int i=0;i<=2;i++){
                System.out.println("Naib");
            }
        }catch(Exception e){
            
        }
    }
}
