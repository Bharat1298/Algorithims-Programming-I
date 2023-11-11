/*
 * Draw_Bicycle.java
 */

import java.awt.*;

/*
 * CPS 150
 * Algorithms & Programming I
 * Lab Project: Bicycle!
 * 
 *   Make sure to add all graphics code in the paint method below,
 *   NOT in the main method.
 * 
 *   NOTE: DO NOT rename this class or file!!!  Doing so will cause
 *         this program to stop working!!!
 * 
 * Name:
 * 
 */

@SuppressWarnings("serial")
public class Draw_Bicycle extends javax.swing.JFrame
{

    public void paint(Graphics g)
    {
        // draw the window title, menu, buttons
        super.paint(g);

        // get the Graphics context for the canvas
        Graphics pen = canvas.getGraphics();

        // *** add pen Graphics method calls after this line ***
       
        pen.drawOval(115, 260, 125, 125); //Bottom Left Wheel
        pen.drawOval(450, 260, 125, 125); //Bottom Right Wheel
        pen.drawLine(300, 315, 175, 325); //Bottom Left Horizontal
        pen.drawLine(220, 180, 175, 325); //Bottom Left Diagonal
        pen.drawLine(420, 190, 220, 180); //Middle Long Frame
        pen.drawLine(310, 300, 220, 180); //Right Triangle Frame
        pen.drawOval(300, 295, 40 , 40 ); //Chain Wheel
        pen.drawLine(325, 295, 330, 270); //Top Step
        pen.drawLine(320, 265, 345, 275); //Top Foot Step
        pen.drawLine(318, 335, 313, 360); //Bottom Step
        pen.drawLine(300, 355, 325, 365); //Bottom Foot Step
        pen.drawLine(520, 325, 390, 150); //Front Long Frame
        pen.drawLine(395, 180, 390, 150); //Right Handle
        pen.drawLine(360, 140, 390, 150); //Left Handle
        pen.drawLine(338, 305, 440, 220); //Connecter Frame
        pen.drawLine(250, 165, 190, 195); //Seat Bottom
        pen.drawLine(190, 165, 190, 195); //Seat Back
        pen.drawLine(190, 165, 250, 165); //Seat Top       
        
        /**
         * *********************************************************
         * WARNING!!! DO NOT ADD OR MODIFY CODE BELOW THIS LINE!!! *
         * *********************************************************
         */
    } // end paint

    /**
     * Creates new form Draw_Bicycle
     */
    public Draw_Bicycle()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the NB_Grafix_Thing2 Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        canvas = new javax.swing.JPanel();
        resetBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CPS 150 Lab Project 9");

        canvas.setBackground(new java.awt.Color(255, 255, 255));
        canvas.setLayout(new java.awt.BorderLayout());
        getContentPane().add(canvas, java.awt.BorderLayout.CENTER);

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                resetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetBtn, java.awt.BorderLayout.PAGE_END);

        setSize(new java.awt.Dimension(816, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        repaint();
    }//GEN-LAST:event_resetBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Draw_Bicycle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Draw_Bicycle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Draw_Bicycle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Draw_Bicycle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Draw_Bicycle().setVisible(true);
            }
        });
    } // end main method

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel canvas;
    private javax.swing.JButton resetBtn;
    // End of variables declaration//GEN-END:variables
} // end Draw_Bicycle class