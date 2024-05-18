/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javathreading;

/**
 *
 * @author SHIKHON
 */
public class JavaThreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        for(int i=1;i<=10;i++){
            Threadclass ob= new Threadclass(i);
            ob.start();
            Thread.sleep(1000);
            for(int j=1;j<=1;j++){
            System.out.println("Mubasshir Naib");
            }
        }
    }
    
}
