/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author wxue
 */
public class HelloSwing extends JFrame{
    public static void main(String args[]) {
	new HelloSwing();
        System.out.println("Hello, Hello");
    }

    HelloSwing() {
		JLabel jlbHelloWorld = new JLabel("Hello World");
		add(jlbHelloWorld);
		this.setSize(100, 100);
		// pack();
		setVisible(true);
	}
}
