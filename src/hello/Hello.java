/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.ArrayList;

/**
 *
 * @author wxue
 */
public class Hello {

    // just a test comment 2
    private void printout()
    {
        int i;
        for(i = 0; i < 5; i++)
        {    
            System.out.println("Hello, Hello");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        for(i = 0; i < 5; i++)
        {    
            System.out.println("Hello, Kitty");
        }
        Hello hello = new Hello();
        hello.printout();
        
        ArrayList<Animal> animals = new ArrayList<Animal>();
        
        Animal ani1 = new Animal();
        ani1.setAge(3);
        ani1.printAge();
        
        Animal ani2 = ani1;
        ani2.printAge();
        ani2.setAge(5);   
        ani1.printAge();
        
        Animal ani3 = new Animal();
        ani3 = ani1;
        ani3.printAge();
        ani3.setAge(7);   
        ani1.printAge();
        
        System.out.println(ani3 == ani2);
        
        animals.add(ani1);
        animals.add(ani2);
        
        System.out.println(ani3 == animals.get(1));
        Animal ani4 = animals.get(1);
    }    
}

class Animal {
    private int m_age;    

    public void setAge(int age) {
        this.m_age = age;
    }
    
    // just a test comment 2
    void printAge()
    {
        System.out.println("Age : " + m_age);
    }
}
