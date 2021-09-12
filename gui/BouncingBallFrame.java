/*    */ package gui;
/*    */ 
/*    */ import java.awt.Component;
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import javax.swing.JButton;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BouncingBallFrame
/*    */   extends JFrame
/*    */   implements ActionListener
/*    */ {
/*    */   private static final long serialVersionUID = 8773576835364063197L;
/*    */   public static final int WIDTH = 606;
/*    */   public static final int HEIGHT = 600;
/*    */   private ViewPanel gamePanel;
/*    */   private JPanel buttonPanel;
/*    */   private JButton start_btn;
/*    */   private JButton stop_btn;
/*    */   
/*    */   public BouncingBallFrame() {
/* 32 */     super("Arkanoid by Rahul Chhiber");
/* 33 */     initGUI();
/*    */   }
/*    */ 
/*    */   
/*    */   private void initGUI() {
/* 38 */     setSize(606, 600);
/* 39 */     setLocationRelativeTo((Component)null);
/*    */     
/* 41 */     this.gamePanel = new ViewPanel();
/* 42 */     add(this.gamePanel);
/*    */     
/* 44 */     this.buttonPanel = new JPanel();
/*    */     
/* 46 */     this.start_btn = new JButton("Start game");
/* 47 */     this.stop_btn = new JButton("Stop game");
/*    */     
/* 49 */     this.start_btn.addActionListener(this);
/* 50 */     this.stop_btn.addActionListener(this);
/*    */     
/* 52 */     this.buttonPanel.add(this.start_btn);
/* 53 */     this.buttonPanel.add(this.stop_btn);
/*    */ 
/*    */     
/* 56 */     this.start_btn.setFocusable(false);
/* 57 */     this.stop_btn.setFocusable(false);
/*    */ 
/*    */     
/* 60 */     add(this.buttonPanel, "South");
/*    */ 
/*    */ 
/*    */     
/* 64 */     setResizable(false);
/* 65 */     setDefaultCloseOperation(3);
/* 66 */     setVisible(true);
/* 67 */     this.gamePanel.initGameComponents();
/*    */   }
/*    */ 
/*    */   
/*    */   public void actionPerformed(ActionEvent e) {
/* 72 */     if (e.getSource() == this.start_btn) {
/*    */       
/* 74 */       this.gamePanel.startGame();
/*    */     }
/*    */     else {
/*    */       
/* 78 */       this.gamePanel.stopGame();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Rahul\Desktop\arkanoid source\!\gui\BouncingBallFrame.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */