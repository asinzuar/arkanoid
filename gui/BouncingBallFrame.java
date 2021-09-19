package gui;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BouncingBallFrame
        extends JFrame
        implements ActionListener {
    private static final long serialVersionUID = 8773576835364063197L;
    public static final int WIDTH = 606;
    public static final int HEIGHT = 600;
    private ViewPanel gamePanel;
    private JPanel buttonPanel;
    private JButton start_btn;
    private JButton stop_btn;

    public BouncingBallFrame() {
        super("Arkanoid by Rahul Chhiber");
        initGUI();
    }

    private void initGUI() {
        setSize(606, 600);
        setLocationRelativeTo((Component) null);

        this.gamePanel = new ViewPanel();
        add(this.gamePanel);

        this.buttonPanel = new JPanel();

        this.start_btn = new JButton("Start game");
        this.stop_btn = new JButton("Stop game");

        this.start_btn.addActionListener(this);
        this.stop_btn.addActionListener(this);

        this.buttonPanel.add(this.start_btn);
        this.buttonPanel.add(this.stop_btn);


        this.start_btn.setFocusable(false);
        this.stop_btn.setFocusable(false);


        add(this.buttonPanel, "South");


        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        this.gamePanel.initGameComponents();
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.start_btn) {
            this.gamePanel.startGame();
        } else {
            this.gamePanel.stopGame();
        }
    }
}
