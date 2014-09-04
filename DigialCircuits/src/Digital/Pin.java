/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Digital;

/**
 *
 * @author Cable
 */
public class Pin extends UnaryGate {
        
    public Pin() {
        super("images/PIN.gif");
    }
    
    @Override
    protected boolean recompute(boolean a) {
        return a;
    }
}
