/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Digital;

import java.awt.Image;
import javax.swing.JPanel;

/**
 *
 * @author melatonind
 */
public class BitAdderComponent extends JPanel {
    
    private BitAdderCircuit adder = new BitAdderCircuit();
    
    private Image image;
    
    public BitAdderComponent() {
        
        java.net.URL url = getClass().getResource("images/Adder.gif");
        image = new javax.swing.ImageIcon(url).getImage();
      
        this.setSize(image.getWidth(null), image.getHeight(null));
    }
    
    public Terminal getInput0(){
        return adder.getPin1().getInput0();
    }
    
    public void setInput0(Terminal input){
        adder.getPin1().setInput0(input);
    }
    
    public Terminal getInput1(){
        return adder.getPin2().getInput0();
    }
    
    public void setInput1(Terminal input){
        adder.getPin2().setInput0(input);
    }
    
    public Terminal getInput2(){
        return adder.getPin3().getInput0();
    }
    
    public void setInput2(Terminal input){
        adder.getPin3().setInput0(input);
    }
    
    public Terminal getOutput0() {
        return adder.getPin4().getOutput();
    }
    
    public Terminal getOutput1() {
        return adder.getPin5().getOutput();
    }
    
    //Override for paintComponent()
    @Override
    public void paintComponent(java.awt.Graphics g) {
        g.drawImage(image, 0, 0, null);
    }
      
}
