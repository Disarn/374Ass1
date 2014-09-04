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
 * @author Cable
 */
public class BinaryGate extends JPanel implements PropertyChangeListener  {
    
        
    private Image image;
    
    private OutputTerminal Output;
    
        public OutputTerminal getOutput() {
        return Output;
    }
    
    private transient final PropertyChangeSupport propertyChangeSupport
                                         = new PropertyChangeSupport(this);

    public BinaryGate(String imageName) {
        
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
        
        determineValueToCompute0();
        
        Output.setValue(recompute(valueToCompute0, valueToCompute1));
            
    }
    
    private Terminal input1;
    
    public Terminal getInput1() {
        return input1;
    }
    
    public void setInput1(Terminal input1) {
        
        if (input1 != null) {
        input1.addPropertyChangeListener(this);
        } 
        
        this.input1 = input1;
        
        determineValueToCompute1();
        
        Output.setValue(recompute(valueToCompute0, valueToCompute1));
        
    }
    
    boolean valueToCompute0;
    
    //Method - determineValueToCompute0() - Determines the first value to compute
    //based off of our inputs, in particular, input0
    private void determineValueToCompute0() {
        
        if (input0 == null) {           
            valueToCompute0 = false;
        } else {
            valueToCompute0 = input0.getValue();
        }
    }
    
    boolean valueToCompute1;
    
    //Method - determineValueToCompute1() - Determines the first value to compute
    //based off of our inputs, in particular, input1
    private void determineValueToCompute1() {
        
        if (input1 == null) {           
            valueToCompute1 = false;
        } else {
            valueToCompute1 = input1.getValue();
        }
    }
      
    protected boolean recompute(boolean a, boolean b){
        return true;//Meaningless
    }
    
    @Override
    public void paintComponent(java.awt.Graphics g) {
        g.drawImage(image, 0, 0, null);
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        
        determineValueToCompute0();
        determineValueToCompute1();
        
        Output.setValue(recompute(valueToCompute0, valueToCompute1));
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