/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Digital;

import javax.swing.JPanel;
import java.awt.Image;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author Cable
 */
public class LED extends JPanel implements PropertyChangeListener {
    
    private Image on;
    
    private Image off;
    
    private boolean isPowered;
        
    public LED() {
        
        java.net.URL url = getClass().getResource("images/LED_on.gif");
        on = new javax.swing.ImageIcon(url).getImage();
        url = getClass().getResource("images/LED_off.gif");
        off = new javax.swing.ImageIcon(url).getImage();
        
        this.setSize(on.getWidth(null), on.getHeight(null));
    }
    
    //Property - Input
    private Terminal input;
    
    //Getter - Input
    public Terminal getInput() {
        return input;
    }
    
    //Setter - Input - Setter
    public void setInput(Terminal input) {
        
         if (input != null) {
            input.addPropertyChangeListener(this);
         }
         
         this.input = input;
         
         determineIsPowered();
    }  
    
    private void determineIsPowered() {
        
        if (this.input != null) {
            isPowered = input.getValue();
        } else {
            isPowered = false;
        }  
    }
    
    //Overides paintComponent to hold our condition for displaying
    // the right image
    @Override
    public void paintComponent(java.awt.Graphics g) {
        
        if (isPowered) {
            g.drawImage(on, 0, 0, null);
        } else {
            g.drawImage(off, 0, 0, null);
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) { 
        determineIsPowered();
        repaint();   
    }
    
}
