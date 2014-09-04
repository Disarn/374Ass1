/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Digital;

import java.awt.Image;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javax.swing.JPanel;

/**
 *
 * @author melatonind
 */

public class UnaryGate extends JPanel implements PropertyChangeListener {
   
    private Image image;
    
    private OutputTerminal Output;
    
    public OutputTerminal getOutput() {
        return Output;
    }
    
    private transient final PropertyChangeSupport propertyChangeSupport
                                         = new PropertyChangeSupport(this);
    
    public UnaryGate(String imageName) {
        
        java.net.URL url = getClass().getResource(imageName);
        image = new javax.swing.ImageIcon(url).getImage();
        Output = new OutputTerminal();
        
        this.setSize(image.getWidth(null), image.getHeight(null));
        
    }
   
    private Terminal input0;
    
    public Terminal getInput0() {
        return input0;
    }
    
    public void setInput0(Terminal input0) {
        
        if (input0 != null) {
            input0.addPropertyChangeListener(this);
        }  
  
        this.input0 = input0;  
        
        determineValueToCompute();
        
        Output.setValue(recompute(valueToCompute));
            
    }
    
    boolean valueToCompute;
    
    //Method - determineValueToCompute() - Determines the value to compute
    //based off of our input
    private void determineValueToCompute() {
        
        if (input0 == null) {           
            valueToCompute = false;
        } else {
            valueToCompute = input0.getValue();
        }
    }
    
        protected boolean recompute(boolean a) {
        return true;//Meaningless
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        
        determineValueToCompute();
        
        Output.setValue(recompute(valueToCompute));
    }
    
    @Override
    public void paintComponent(java.awt.Graphics g) {
        g.drawImage(image, 0, 0, null);
    }
    
    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) 
    {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) 
    {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }  
    
}
