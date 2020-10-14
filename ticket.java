/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise11;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author ARUMUGASAMY
 */
public class ticket {
    public static void main(String []args) throws InterruptedException{
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter no of the persons standing in the ticket counter : ");
        int k=obj1.nextInt();
        ticketbooking t[]=new ticketbooking[k];
        for(int h =0;h<k;h++)
        {
            t[h]=new ticketbooking();
            
        }
        for(int h=0;h<k;h++)
        {
            t[h].start();
            t[h].join();
        }
        
        }

    

    
}
class ticketbooking extends Thread
{
    Scanner obj=new Scanner(System.in);
   static double seats=900;
    double amount=500;
    static int i=0;
    synchronized public void run()
    {
    try
    {   
        i++;
        System.out.println("enter the number of seats " +(i));
        
        int n=obj.nextInt();
        if(n>seats)
        {
            System.out.println("seats are not available");
        }
        else
        {
         String a[]=new String[100];  
         int p[]=new int[100];
        System.out.println("enter your contact number");
        double c=obj.nextDouble();
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the name of person " +(i+1)+" : ");
            a[i]=obj.next();
            System.out.println("enter the age of that person "+ (i+1) +" : ");
            p[i]=obj.nextInt();
        }
        int l =0;
        l++;
        seats=seats-n;
        System.out.println("--------");
        System.out.println("billing details" +(l));
        System.out.println("--------");
        System.out.println("number of seats required :: "+(n));
        System.out.println("name and age of the persons");
        System.out.println("Contact number: " +(c));
        for(int i=0;i<n;i++)
        {
            System.out.println("name : " +(a[i])+ " age : " +(p[i]));
        }
        System.out.println("the total amount for"+(n)+ "seats :: ");
        System.out.println(+(n*amount));
        System.out.println("------------");
        }
        
    }
      catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }              
        
        
        
  
    

