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
public class ORGate extends BinaryGate {
        
    public ORGate() {
        super("images/OR.gif");
    }
    
    @Override
    protected boolean recompute(boolean a, boolean b) {
        return a || b;
    }
}
