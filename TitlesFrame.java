/*
 * Decompiled with CFR 0_118.
 */
import javax.swing.*;


public class TitlesFrame
extends JFrame {
    private TitlesFrame()
    {
        this.initUI();
    }

    private void initUI() /* UI configuration */
    {
        this.setTitle("\u041a\u0440\u0438\u0432\u044b\u0435 \u0444\u0438\u0433\u0443\u0440\u044b");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.add(new TitlesPanel());/*Actual value of parameter ''_shape'' is always ''78''*/
        this.setSize(350, 350);
        this.setLocationRelativeTo(null);
    }


    public static void main(String[] args) {
                SwingUtilities.invokeLater(new Runnable(){


             public void run() {
                               TitlesFrame ps = new TitlesFrame();
                                ps.setVisible(true);
                            }
         });
           }

}

