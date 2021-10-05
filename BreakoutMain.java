import java.awt.EventQueue;

import javax.swing.JFrame;

public class BreakoutMain extends JFrame {
    public BreakoutMain(){
        initUI();
    }

    private void initUI(){
        add(new Board());
        setTitle("BREAKOUT");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var game = new BreakoutMain();
            game.setVisible(true);
        });
    }
}
