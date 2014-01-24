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
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

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
        
        Animal ani6 = new Animal();
        ani6.setAge(7);
        System.out.println(ani3 == ani6);        
        
        animals.add(ani1);
        animals.add(ani2);
        
        ani6 = animals.get(0);
        System.out.println(ani3 == ani6);
        
        System.out.println(ani3 == animals.get(1));
        Animal ani4 = animals.get(1);
        
        int a1 = 3;
        int a2 = 5;
        a2 = a1;
        System.out.println(a1 == a2);  //=
        System.out.println(a2);//5
        a2 = 6;
        System.out.println(a1);//5
        System.out.println(a1 == a2);//!       
    }    
}

class abstract Animal {
    int m_age;        
    
 void setAge(int age) {
        this.m_age = age;
    }    
    // just a test comment 2
    void printAge()
    {
        System.out.println("Age : " + m_age);
    }    
}

 class Dog extends Animal {
    
}

 class Cat extends Animal{
    
}

