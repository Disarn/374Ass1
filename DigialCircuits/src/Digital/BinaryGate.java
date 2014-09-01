/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Digital;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javax.swing.JPanel;
import java.awt.Image;

/**
 *
 * @author Cable
 */
public class BinaryGate extends JPanel implements PropertyChangeListener {
    
    //Property - Image
    private Image image;
    
    //Property - Output Terminal
    private OutputTerminal Output;
    
    //Property - propertyChangeSupport
    private transient final PropertyChangeSupport propertyChangeSupport
                                         = new PropertyChangeSupport(this);
    
    //Constructor
    public BinaryGate(String imageName) {
        
        java.net.URL url = getClass().getResource(imageName);
        image = new javax.swing.ImageIcon(url).getImage();
        Output = new OutputTerminal();
        
        this.setSize(image.getWidth(null), image.getHeight(null));
        
                }
    
    //Getter - Output Terminal
    public Terminal getOutput() {
        return Output;
    }
    
    //Property - valueToCompute0
    boolean valueToCompute0;
    
    //Property - valueToCompute1
    boolean valueToCompute1;
    
    //Method determineValueToCompute0() - Determines the first value to compute
    //based off of our inputs, in particular, input0
    private void determineValueToCompute0() {
        
        if (input0 == null) {           
            valueToCompute0 = false;
        } else {
            valueToCompute0 = input0.getValue();
        }
    }
    
    //Method determineValueToCompute1() - Determines the first value to compute
    //based off of our inputs, in particular, input1
    private void determineValueToCompute1() {
        
        if (input1 == null) {           
            valueToCompute1 = false;
        } else {
            valueToCompute1 = input1.getValue();
        }
    }
    
    //Method - recompute(boolean a, boolean b) - Recomputes the value
    //of our output terminal
    protected boolean recompute(boolean a, boolean b) {
        return true;
    }

    //Property - Input0
    private Terminal input0;
    
    //Getter - Input0
    public Terminal getInput0() {
        return input0;
    }
    
    //Setter - Input0 - Setter
    public void setInput0(Terminal input0) {
  
        this.input0 = input0;
        
        if (this.input0 != null) {
        this.input0.addPropertyChangeListener(this);
        }    
        
        determineValueToCompute0();
        
        Output.setValue(recompute(valueToCompute0, valueToCompute1));
            
    }
   
    //Property - Input1
    private Terminal input1;
    
    //Getter - Input1
    public Terminal getInput1() {
        return input1;
    }
    
    //Setter - Input1
    public void setInput1(Terminal input1) {
        
        this.input1 = input1;
        
        if (this.input1 != null) {
        this.input1.addPropertyChangeListener(this);
        }    
        
        determineValueToCompute1();
        
        Output.setValue(recompute(valueToCompute0, valueToCompute1));
        
    }
    
    //Override for propertyChange()
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        
        determineValueToCompute0();
        determineValueToCompute1();
        
        Output.setValue(recompute(valueToCompute0, valueToCompute1));
    }
    
    //Override for paintComponent()
    @Override
    public void paintComponent(java.awt.Graphics g) {
        g.drawImage(image, 0, 0, null);
    }
    
    //Override for addPropertyChangeListener
    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) 
    {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    //Override for removePropertyChangeListener
    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) 
    {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }    
    
}