/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TestCircuit;

/**
 *
 * @author Cable
 */
public class Form extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        circuitBoard1 = new Digital.CircuitBoard();
        decimalInput1 = new Digital.DecimalInput();
        decimalOutput1 = new Digital.DecimalOutput();
        decimalInput2 = new Digital.DecimalInput();
        bitAdderComponent1 = new Digital.BitAdderComponent();
        bitAdderComponent2 = new Digital.BitAdderComponent();
        bitAdderComponent3 = new Digital.BitAdderComponent();
        bitAdderComponent4 = new Digital.BitAdderComponent();
        lED1 = new Digital.LED();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        decimalOutput1.setInput0(bitAdderComponent1.getOutput0());
        decimalOutput1.setInput1(bitAdderComponent2.getOutput0());
        decimalOutput1.setInput2(bitAdderComponent3.getOutput0());
        decimalOutput1.setInput3(bitAdderComponent4.getOutput0());

        javax.swing.GroupLayout decimalOutput1Layout = new javax.swing.GroupLayout(decimalOutput1);
        decimalOutput1.setLayout(decimalOutput1Layout);
        decimalOutput1Layout.setHorizontalGroup(
            decimalOutput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );
        decimalOutput1Layout.setVerticalGroup(
            decimalOutput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        bitAdderComponent1.setInput1(decimalInput1.getOutput0());
        bitAdderComponent1.setInput2(decimalInput2.getOutput0());

        javax.swing.GroupLayout bitAdderComponent1Layout = new javax.swing.GroupLayout(bitAdderComponent1);
        bitAdderComponent1.setLayout(bitAdderComponent1Layout);
        bitAdderComponent1Layout.setHorizontalGroup(
            bitAdderComponent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        bitAdderComponent1Layout.setVerticalGroup(
            bitAdderComponent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        bitAdderComponent2.setInput0(bitAdderComponent1.getOutput1());
        bitAdderComponent2.setInput1(decimalInput1.getOutput1());
        bitAdderComponent2.setInput2(decimalInput2.getOutput1());

        javax.swing.GroupLayout bitAdderComponent2Layout = new javax.swing.GroupLayout(bitAdderComponent2);
        bitAdderComponent2.setLayout(bitAdderComponent2Layout);
        bitAdderComponent2Layout.setHorizontalGroup(
            bitAdderComponent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        bitAdderComponent2Layout.setVerticalGroup(
            bitAdderComponent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        bitAdderComponent3.setInput0(bitAdderComponent2.getOutput1());
        bitAdderComponent3.setInput1(decimalInput1.getOutput2());
        bitAdderComponent3.setInput2(decimalInput2.getOutput2());

        javax.swing.GroupLayout bitAdderComponent3Layout = new javax.swing.GroupLayout(bitAdderComponent3);
        bitAdderComponent3.setLayout(bitAdderComponent3Layout);
        bitAdderComponent3Layout.setHorizontalGroup(
            bitAdderComponent3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        bitAdderComponent3Layout.setVerticalGroup(
            bitAdderComponent3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        bitAdderComponent4.setInput0(bitAdderComponent3.getOutput1());
        bitAdderComponent4.setInput1(decimalInput1.getOutput3());
        bitAdderComponent4.setInput2(decimalInput2.getOutput3());

        javax.swing.GroupLayout bitAdderComponent4Layout = new javax.swing.GroupLayout(bitAdderComponent4);
        bitAdderComponent4.setLayout(bitAdderComponent4Layout);
        bitAdderComponent4Layout.setHorizontalGroup(
            bitAdderComponent4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        bitAdderComponent4Layout.setVerticalGroup(
            bitAdderComponent4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        lED1.setInput(bitAdderComponent4.getOutput1());

        javax.swing.GroupLayout lED1Layout = new javax.swing.GroupLayout(lED1);
        lED1.setLayout(lED1Layout);
        lED1Layout.setHorizontalGroup(
            lED1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        lED1Layout.setVerticalGroup(
            lED1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout circuitBoard1Layout = new javax.swing.GroupLayout(circuitBoard1);
        circuitBoard1.setLayout(circuitBoard1Layout);
        circuitBoard1Layout.setHorizontalGroup(
            circuitBoard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(circuitBoard1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(circuitBoard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(decimalInput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decimalInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(circuitBoard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(circuitBoard1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(bitAdderComponent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, circuitBoard1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(bitAdderComponent2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addGroup(circuitBoard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(decimalOutput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lED1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, circuitBoard1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bitAdderComponent4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, circuitBoard1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bitAdderComponent3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );
        circuitBoard1Layout.setVerticalGroup(
            circuitBoard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, circuitBoard1Layout.createSequentialGroup()
                .addGroup(circuitBoard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(circuitBoard1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(decimalOutput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(circuitBoard1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(decimalInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(circuitBoard1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(bitAdderComponent2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(bitAdderComponent3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(circuitBoard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(decimalInput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bitAdderComponent4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(lED1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(circuitBoard1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bitAdderComponent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(circuitBoard1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(circuitBoard1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Digital.BitAdderComponent bitAdderComponent1;
    private Digital.BitAdderComponent bitAdderComponent2;
    private Digital.BitAdderComponent bitAdderComponent3;
    private Digital.BitAdderComponent bitAdderComponent4;
    private Digital.CircuitBoard circuitBoard1;
    private Digital.DecimalInput decimalInput1;
    private Digital.DecimalInput decimalInput2;
    private Digital.DecimalOutput decimalOutput1;
    private Digital.LED lED1;
    // End of variables declaration//GEN-END:variables
}