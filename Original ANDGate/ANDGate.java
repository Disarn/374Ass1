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

/**
 *
 * @author Cable
 */
public class ANDGate extends JPanel implements PropertyChangeListener {
    
    //Property - Image
    private java.awt.Image image;
    
    //Property - propertyChangeSupport
    private transient final PropertyChangeSupport propertyChangeSupport
                                         = new PropertyChangeSupport(this);
    //Property - valueToCompute0
    boolean valueToCompute0;
    
    //Property - valueToCompute1
    boolean valueToCompute1;
    
    //Constructor
    public ANDGate() {
        
        java.net.URL url = getClass().getResource("images/AND.gif");
        image = new javax.swing.ImageIcon(url).getImage();
        
        this.setSize(image.getWidth(null), image.getHeight(null));
        
                }
    
    //Method - recompute(boolean a, boolean b) - Recomputes the value
    //of our output terminal
    private void recompute(boolean a, boolean b) {
        Output.setValue(a && b);
    }
    
    //Property - Output Terminal
    private OutputTerminal Output = new OutputTerminal();
    
    //Getter - Output Terminal
    public Terminal getOutput() {
        return Output;
    }
    
    //Property - Input0
    private Terminal input0 = new OutputTerminal();
    
    //Getter - Input0
    public Terminal getInput0() {
        return input0;
    }
    
    //Setter - Input0 - Setter
    public void setInput0(Terminal input0) {
        Terminal oldInput0 = this.input0;
        this.input0 = input0;
        
        if (this.input0 != null) {
        this.input0.addPropertyChangeListener(this);
        } 
        
        propertyChangeSupport.firePropertyChange("Input0", oldInput0, input0);
                   
        if (input0 == null) {           
            valueToCompute0 = false;
        } else {
            valueToCompute0 = input0.getValue();
        }
        
        recompute(valueToCompute0, valueToCompute1);
            
    }
   
    //Property - Input1
    private Terminal input1 = new OutputTerminal();
    
    //Getter - Input1
    public Terminal getInput1() {
        return input1;
    }
    
    //Setter - Input1
    public void setInput1(Terminal input1) {
        Terminal oldInput1 = this.input1;
        this.input1 = input1;
        
        if (this.input1 != null) {
        this.input1.addPropertyChangeListener(this);
        }
        
        propertyChangeSupport.firePropertyChange("Input1", oldInput1, input1);
        
        if (input1 == null) {           
            valueToCompute1 = false;
        } else {
            valueToCompute1 = input1.getValue();
        }
        
        recompute(valueToCompute0, valueToCompute1);
        
    }
    
    //Override for propertyChange()
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        recompute(input0.getValue(), input1.getValue());
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
