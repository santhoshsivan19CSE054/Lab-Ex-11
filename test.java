/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise11;

/**
 *
 * @author ARUMUGASAMY
 */
public class test {
    public static void main(String[] args) throws InterruptedException {
        int a=Integer.parseInt(args[0]);
        thread obj[]=new thread[a];
        for(int i=0;i<a;i++)
        {
            obj[i]=new thread();
            obj[i].start();
            
        }
        
    }
    
}
class thread extends Thread 
{
    static int m=0;
    public void run()
    {
       
       System.out.println("I am Thread #"+(++m));
    }
}
    

