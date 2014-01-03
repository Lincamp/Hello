/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

/**
 *
 * @author wxue
 */
public class Hello {

    // just a test comment 1
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
    }
}
