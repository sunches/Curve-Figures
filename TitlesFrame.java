/*
 * Decompiled with CFR 0_118.
 */
import javax.swing.JFrame;
/*Unused import 'import java.awt.Component;*/
import javax.swing.SwingUtilities;

class TitlesFrame /*Can be package-private*/
extends JFrame {
    private TitlesFrame() /*Can be private*/
    {
        this.initUI();
    }

    private void initUI() /*настройка UI*/
    {
        this.setTitle("\u041a\u0440\u0438\u0432\u044b\u0435 \u0444\u0438\u0433\u0443\u0440\u044b");
        this.setDefaultCloseOperation(3);
        this.add(new TitlesPanel());/*Actual value of parameter ''_shape'' is always ''78''*/
        this.setSize(350, 350);
        this.setLocationRelativeTo(null);
    }


    public static void main(String[] args) {
                SwingUtilities.invokeLater(new Runnable(){

                  /*   @Override*/
             public void run() {
                               TitlesFrame ps = new TitlesFrame();
                                ps.setVisible(true);
                            }
         });
           }

}

