/*     */ package gui;
/*     */ 
/*     */ import core_classes.Ball;
/*     */ import core_classes.Brick;
/*     */ import core_classes.PlayBar;
/*     */ import core_classes.special_bricks.ToughBrick;
/*     */ import java.awt.Color;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.HeadlessException;
/*     */ import java.awt.Point;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.KeyListener;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.awt.event.MouseListener;
/*     */ import java.awt.event.MouseMotionListener;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Random;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ViewPanel
/*     */   extends JPanel
/*     */   implements MouseMotionListener, KeyListener, MouseListener
/*     */ {
/*     */   private static final long serialVersionUID = -793809479896346230L;
/*     */   
/*     */   class gamePlayThread
/*     */     extends Thread
/*     */   {
/*     */     private static final int DEFAULT_XSHIFT = 1;
/*     */     private static final int DEFAULT_YSHIFT = 3;
/*     */     private static final int DEFAULT_SPEED = 18;
/*     */     private static final int SLEEP_CONSTANT = 30;
/*     */     private boolean exit;
/*     */     private boolean terminated;
/*     */     private int xshift;
/*     */     private int yshift;
/*     */     private Point ballPos;
/*     */     private int speed;
/*     */     private int sleepQuantum;
/*     */     CollisionDetecter collisionDetecter;
/*     */     
/*     */     class CollisionDetecter
/*     */     {
/*     */       public boolean checkGroundCollision() {
/* 428 */         if (ViewPanel.gamePlayThread.this.ballPos.y + (ViewPanel.gamePlayThread.access$6(ViewPanel.gamePlayThread.this)).myBall.getDiameter() >= ViewPanel.gamePlayThread.access$6(ViewPanel.gamePlayThread.this).getHeight()) {
/*     */           
/* 430 */           if ((ViewPanel.gamePlayThread.access$6(ViewPanel.gamePlayThread.this)).chances == 0) {
/*     */             
/* 432 */             JOptionPane.showMessageDialog(null, "Game Over");
/*     */             
/* 434 */             (new Thread(new Runnable()
/*     */                 {
/*     */                   public void run()
/*     */                   {
/* 438 */                     ViewPanel.gamePlayThread.access$6(ViewPanel.gamePlayThread.CollisionDetecter.access$0(ViewPanel.gamePlayThread.CollisionDetecter.this)).stopGame();
/*     */                   }
/* 441 */                 })).start();
/*     */           }
/*     */           else {
/*     */             
/* 445 */             (ViewPanel.gamePlayThread.access$6(ViewPanel.gamePlayThread.this)).chances = (ViewPanel.gamePlayThread.access$6(ViewPanel.gamePlayThread.this)).chances - 1;
/* 446 */             JOptionPane.showMessageDialog(null, String.valueOf((ViewPanel.gamePlayThread.access$6(ViewPanel.gamePlayThread.this)).chances) + " chance(s) left");
/*     */             
/* 448 */             (new Thread(new Runnable()
/*     */                 {
/*     */                   public void run()
/*     */                   {
/* 452 */                     ViewPanel.gamePlayThread.access$6(ViewPanel.gamePlayThread.CollisionDetecter.access$0(ViewPanel.gamePlayThread.CollisionDetecter.this)).nextAttempt();
/*     */                   }
/* 455 */                 })).start();
/*     */           } 
/* 457 */           return true;
/*     */         } 
/* 459 */         return false;
/*     */       }
/*     */ 
/*     */       
/*     */       public boolean checkRoofCollision() {
/* 464 */         if (ViewPanel.gamePlayThread.this.ballPos.y <= 0) {
/*     */           
/* 466 */           ViewPanel.gamePlayThread.this.yshift = ViewPanel.gamePlayThread.this.yshift * -1;
/* 467 */           return true;
/*     */         } 
/* 469 */         return false;
/*     */       }
/*     */ 
/*     */       
/*     */       public boolean checkWallCollision() {
/* 474 */         if (ViewPanel.gamePlayThread.this.ballPos.x + (ViewPanel.gamePlayThread.access$6(ViewPanel.gamePlayThread.this)).myBall.getDiameter() >= ViewPanel.gamePlayThread.access$6(ViewPanel.gamePlayThread.this).getWidth() || ViewPanel.gamePlayThread.this.ballPos.x <= 0) {
/*     */           
/* 476 */           ViewPanel.gamePlayThread.this.xshift = ViewPanel.gamePlayThread.this.xshift * -1;
/* 477 */           return true;
/*     */         } 
/* 479 */         return false;
/*     */       }
/*     */ 
/*     */       
/*     */       public boolean checkAndApplyForAnyBrickCollision() {
/* 484 */         boolean matrix_empty = true; byte b; int i; Brick[][] arrayOfBrick;
/* 485 */         for (i = (arrayOfBrick = (ViewPanel.gamePlayThread.access$6(ViewPanel.gamePlayThread.this)).BrickMatrix).length, b = 0; b < i; ) { Brick[] brickRow = arrayOfBrick[b]; byte b1; int j;
/*     */           Brick[] arrayOfBrick1;
/* 487 */           for (j = (arrayOfBrick1 = brickRow).length, b1 = 0; b1 < j; ) { Brick br = arrayOfBrick1[b1];
/*     */             
/* 489 */             if (!br.isEmpty()) {
/*     */               
/* 491 */               matrix_empty = false;
/*     */               
/* 493 */               if (checkAndApplySingleBrickCollision(br))
/* 494 */                 return true; 
/*     */             }  b1++; }
/*     */            b++; }
/*     */         
/* 498 */         if (matrix_empty) {
/*     */           
/* 500 */           JOptionPane.showMessageDialog(null, "Congratulations, you have finished the game!!");
/*     */           
/* 502 */           (new Thread(new Runnable()
/*     */               {
/*     */                 
/*     */                 public void run()
/*     */                 {
/* 507 */                   ViewPanel.gamePlayThread.access$6(ViewPanel.gamePlayThread.CollisionDetecter.access$0(ViewPanel.gamePlayThread.CollisionDetecter.this)).gameCompleted();
/*     */                 }
/* 509 */               })).start();
/*     */         } 
/* 511 */         return false;
/*     */       }
/*     */       
/*     */       public boolean checkAndApplySingleBrickCollision(Brick br) {
/* 515 */         int c = br.checkCollisionWithBall((ViewPanel.gamePlayThread.access$6(ViewPanel.gamePlayThread.this)).myBall);
/* 516 */         switch (c) {
/*     */           
/*     */           case 1:
/* 519 */             ViewPanel.gamePlayThread.this.xshift = -1;
/* 520 */             ViewPanel.gamePlayThread.this.yshift = -3;
/* 521 */             br.setEmpty(true);
/*     */             break;
/*     */           case 2:
/* 524 */             ViewPanel.gamePlayThread.this.yshift = ViewPanel.gamePlayThread.this.yshift * -1;
/* 525 */             br.setEmpty(true);
/*     */             break;
/*     */           case 3:
/* 528 */             ViewPanel.gamePlayThread.this.xshift = 1;
/* 529 */             ViewPanel.gamePlayThread.this.yshift = -3;
/* 530 */             br.setEmpty(true);
/*     */             break;
/*     */           case 4:
/* 533 */             ViewPanel.gamePlayThread.this.xshift = ViewPanel.gamePlayThread.this.xshift * -1;
/* 534 */             br.setEmpty(true);
/*     */             break;
/*     */           case 5:
/* 537 */             ViewPanel.gamePlayThread.this.xshift = ViewPanel.gamePlayThread.this.xshift * -1;
/* 538 */             br.setEmpty(true);
/*     */             break;
/*     */           case 6:
/* 541 */             ViewPanel.gamePlayThread.this.xshift = -1;
/* 542 */             ViewPanel.gamePlayThread.this.yshift = 3;
/* 543 */             br.setEmpty(true);
/*     */             break;
/*     */           case 7:
/* 546 */             ViewPanel.gamePlayThread.this.yshift = ViewPanel.gamePlayThread.this.yshift * -1;
/* 547 */             br.setEmpty(true);
/*     */             break;
/*     */           case 8:
/* 550 */             ViewPanel.gamePlayThread.this.xshift = 1;
/* 551 */             ViewPanel.gamePlayThread.this.yshift = 3;
/* 552 */             br.setEmpty(true);
/*     */             break;
/*     */           case 0:
/* 555 */             return false;
/*     */         } 
/* 557 */         return true;
/*     */       }
/*     */ 
/*     */       
/*     */       public boolean checkAndApplyBarCollision() {
/* 562 */         int c = (ViewPanel.gamePlayThread.access$6(ViewPanel.gamePlayThread.this)).myPlayBar.checkCollisionWithBall((ViewPanel.gamePlayThread.access$6(ViewPanel.gamePlayThread.this)).myBall);
/* 563 */         switch (c) {
/*     */           
/*     */           case 1:
/* 566 */             ViewPanel.gamePlayThread.this.xshift = -2;
/* 567 */             ViewPanel.gamePlayThread.this.yshift = -3;
/*     */             break;
/*     */           case 2:
/* 570 */             ViewPanel.gamePlayThread.this.yshift = ViewPanel.gamePlayThread.this.yshift * -1;
/*     */             
/* 572 */             impartDirection();
/*     */             break;
/*     */           case 3:
/* 575 */             ViewPanel.gamePlayThread.this.xshift = 2;
/* 576 */             ViewPanel.gamePlayThread.this.yshift = -3;
/*     */             break;
/*     */           case 4:
/* 579 */             ViewPanel.gamePlayThread.this.xshift = ViewPanel.gamePlayThread.this.xshift * -1;
/*     */             break;
/*     */           case 5:
/* 582 */             ViewPanel.gamePlayThread.this.xshift = ViewPanel.gamePlayThread.this.xshift * -1;
/*     */             break;
/*     */           case 6:
/* 585 */             ViewPanel.gamePlayThread.this.xshift = -2;
/* 586 */             ViewPanel.gamePlayThread.this.yshift = 3;
/*     */             break;
/*     */           case 7:
/* 589 */             ViewPanel.gamePlayThread.this.yshift = ViewPanel.gamePlayThread.this.yshift * -1;
/*     */             break;
/*     */           case 8:
/* 592 */             ViewPanel.gamePlayThread.this.xshift = 2;
/* 593 */             ViewPanel.gamePlayThread.this.yshift = 3;
/*     */             break;
/*     */           case 0:
/* 596 */             return false;
/*     */         } 
/* 598 */         return true;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       private void impartDirection() {
/* 609 */         Point ballCenter = (ViewPanel.gamePlayThread.access$6(ViewPanel.gamePlayThread.this)).myBall.getCenter(); int x = ballCenter.x;
/* 610 */         int barXpos = (ViewPanel.gamePlayThread.access$6(ViewPanel.gamePlayThread.this)).myPlayBar.getXpos(), barWidth = (ViewPanel.gamePlayThread.access$6(ViewPanel.gamePlayThread.this)).myPlayBar.getWidth();
/*     */         
/* 612 */         double mark20 = (20 * barWidth / 100);
/* 613 */         double mark48 = (48 * barWidth / 100);
/* 614 */         double mark52 = (52 * barWidth / 100);
/* 615 */         double mark80 = (80 * barWidth / 100);
/*     */         
/* 617 */         if (x <= barXpos + mark20) {
/*     */           
/* 619 */           ViewPanel.gamePlayThread.this.xshift = -2;
/*     */         }
/* 621 */         else if (x > barXpos + mark48 && x <= barXpos + mark52) {
/*     */           
/* 623 */           ViewPanel.gamePlayThread.this.xshift = 0;
/*     */         }
/* 625 */         else if (x > barXpos + mark80) {
/*     */           
/* 627 */           ViewPanel.gamePlayThread.this.xshift = 2;
/*     */ 
/*     */         
/*     */         }
/* 631 */         else if (ViewPanel.gamePlayThread.this.xshift == 0) {
/*     */           
/* 633 */           if (x < barXpos + mark48) {
/* 634 */             ViewPanel.gamePlayThread.this.xshift = -1;
/*     */           } else {
/* 636 */             ViewPanel.gamePlayThread.this.xshift = 1;
/*     */           } 
/*     */         } 
/*     */       }
/*     */     }
/*     */     
/*     */     public gamePlayThread(Point ballPos) {
/*     */       this.xshift = 1;
/*     */       this.yshift = -3;
/*     */       this.speed = 18;
/*     */       this.sleepQuantum = 30 - this.speed;
/*     */       this.ballPos = ballPos;
/*     */       this.collisionDetecter = new CollisionDetecter();
/*     */     }
/*     */     
/*     */     public void run() {
/*     */       try {
/*     */         while (!this.exit) {
/*     */           this.ballPos.x += this.xshift;
/*     */           this.ballPos.y += this.yshift;
/*     */           ViewPanel.this.myBall.setTopLeft(this.ballPos);
/*     */           if (ViewPanel.this.brickMatrixDirty) {
/*     */             ViewPanel.this.repaint(0, 40, ViewPanel.this.getWidth(), 84);
/*     */             ViewPanel.this.brickMatrixDirty = false;
/*     */           } 
/*     */           ViewPanel.this.repaint((ViewPanel.this.myBall.getTopLeft()).x - 5, (ViewPanel.this.myBall.getTopLeft()).y - 5, ViewPanel.this.myBall.getDiameter() + 10, ViewPanel.this.myBall.getDiameter() + 10);
/*     */           ViewPanel.this.repaint(ViewPanel.this.myPlayBar.getXpos() - ViewPanel.this.myPlayBar.getWidth(), ViewPanel.this.myPlayBar.getYPOS(), ViewPanel.this.myPlayBar.getWidth() * 3, ViewPanel.this.myPlayBar.getHeight());
/*     */           if (!this.collisionDetecter.checkGroundCollision()) {
/*     */             this.collisionDetecter.checkWallCollision();
/*     */             if (!this.collisionDetecter.checkAndApplyBarCollision() && !this.collisionDetecter.checkRoofCollision() && this.collisionDetecter.checkAndApplyForAnyBrickCollision())
/*     */               ViewPanel.this.brickMatrixDirty = true; 
/*     */           } 
/*     */           Thread.sleep(this.sleepQuantum);
/*     */         } 
/*     */       } catch (HeadlessException e) {
/*     */         e.printStackTrace();
/*     */       } catch (InterruptedException e) {
/*     */         e.printStackTrace();
/*     */       } finally {
/*     */         System.out.println("Thread exiting...");
/*     */         this.terminated = true;
/*     */       } 
/*     */     }
/*     */     
/*     */     public void exit() {
/*     */       this.exit = true;
/*     */     }
/*     */   }
/*     */   private static final Color DEFAULT_BGCOLOR = Color.BLACK;
/*     */   private static final int ROWS = 4;
/*     */   private static final int COLUMNS = 12;
/*     */   private static final int DEFAULT_CHANCES = 3;
/*     */   private static final int PLAYBAR_MOTION_QUANTUM = 9;
/*     */   private Color bgColor;
/*     */   private Ball myBall;
/*     */   ArrayList<Ball> Balls;
/*     */   private PlayBar myPlayBar;
/*     */   private Brick[][] BrickMatrix;
/*     */   private int matrixHeight;
/*     */   private int chances;
/*     */   private boolean keyListenerCollisionFlag;
/*     */   private boolean brickMatrixDirty;
/*     */   private gamePlayThread t;
/*     */   
/*     */   public ViewPanel() {
/*     */     this.bgColor = DEFAULT_BGCOLOR;
/*     */     this.Balls = new ArrayList<>();
/*     */     this.chances = 3;
/*     */     this.keyListenerCollisionFlag = false;
/*     */     this.brickMatrixDirty = false;
/*     */     setBackground(this.bgColor);
/*     */     setFocusable(true);
/*     */   }
/*     */   
/*     */   public void initGameComponents() {
/*     */     initBar();
/*     */     initBall();
/*     */     initBricks();
/*     */   }
/*     */   
/*     */   public void resetDynamicGameComponents() {
/*     */     initBar();
/*     */     initBall();
/*     */   }
/*     */   
/*     */   private void initBricks() {
/*     */     int size = 12;
/*     */     int[] special = new int[size];
/*     */     Random r = new Random();
/*     */     for (int i = 0; i < size; i++)
/*     */       special[i] = r.nextInt(48); 
/*     */     this.BrickMatrix = new Brick[4][12];
/*     */     int xpos = 0, ypos = 40;
/*     */     int counter = 0;
/*     */     for (int j = 0; j < 4; j++) {
/*     */       int k;
/*     */       for (k = 0; k < 12; k++) {
/*     */         boolean flag = false;
/*     */         byte b;
/*     */         int m, arrayOfInt[];
/*     */         for (m = (arrayOfInt = special).length, b = 0; b < m; ) {
/*     */           int c = arrayOfInt[b];
/*     */           if (c == counter) {
/*     */             flag = true;
/*     */             break;
/*     */           } 
/*     */           b++;
/*     */         } 
/*     */         if (flag) {
/*     */           this.BrickMatrix[j][k] = (Brick)new ToughBrick();
/*     */         } else {
/*     */           this.BrickMatrix[j][k] = new Brick();
/*     */         } 
/*     */         this.BrickMatrix[j][k].setTopLeft(new Point(xpos, ypos));
/*     */         xpos += this.BrickMatrix[j][k].getWidth() + 1;
/*     */         counter++;
/*     */       } 
/*     */       xpos = 0;
/*     */       ypos += this.BrickMatrix[j][k - 1].getHeight() + 1;
/*     */     } 
/*     */     this.matrixHeight = ypos - 1;
/*     */   }
/*     */   
/*     */   private void initBall() {
/*     */     this.myBall = new Ball();
/*     */     this.myBall.setTopLeft(new Point(this.myPlayBar.getXpos() + this.myPlayBar.getWidth() / 2 - this.myBall.getDiameter() / 2, this.myPlayBar.getYPOS() - this.myBall.getDiameter()));
/*     */     this.Balls.add(this.myBall);
/*     */   }
/*     */   
/*     */   private void initBar() {
/*     */     this.myPlayBar = new PlayBar(getHeight());
/*     */     this.myPlayBar.setXpos(getWidth() / 2 - this.myPlayBar.getWidth() / 2);
/*     */   }
/*     */   
/*     */   public void paintComponent(Graphics g) {
/*     */     super.paintComponent(g);
/*     */     this.myBall.draw(g);
/*     */     this.myPlayBar.draw(g);
/*     */     byte b;
/*     */     int i;
/*     */     Brick[][] arrayOfBrick;
/*     */     for (i = (arrayOfBrick = this.BrickMatrix).length, b = 0; b < i; ) {
/*     */       Brick[] brickRow = arrayOfBrick[b];
/*     */       byte b1;
/*     */       int j;
/*     */       Brick[] arrayOfBrick1;
/*     */       for (j = (arrayOfBrick1 = brickRow).length, b1 = 0; b1 < j; ) {
/*     */         Brick br = arrayOfBrick1[b1];
/*     */         if (!br.isEmpty())
/*     */           br.draw(g); 
/*     */         b1++;
/*     */       } 
/*     */       b++;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void startGame() {
/*     */     if (this.t == null) {
/*     */       this.t = new gamePlayThread(this.myBall.getTopLeft());
/*     */       this.t.start();
/*     */       if ((getKeyListeners()).length == 0)
/*     */         addKeyListener(this); 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void stopGame() {
/*     */     if (this.t != null) {
/*     */       removeKeyListener(this);
/*     */       this.t.exit();
/*     */       try {
/*     */         this.t.join();
/*     */       } catch (InterruptedException e) {
/*     */         e.printStackTrace();
/*     */       } 
/*     */       this.t = null;
/*     */       this.chances = 3;
/*     */       initGameComponents();
/*     */       repaint();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void nextAttempt() {
/*     */     this.t.exit();
/*     */     try {
/*     */       this.t.join();
/*     */     } catch (InterruptedException e) {
/*     */       e.printStackTrace();
/*     */     } 
/*     */     this.t = null;
/*     */     resetDynamicGameComponents();
/*     */     repaint();
/*     */     startGame();
/*     */   }
/*     */   
/*     */   private void gameCompleted() {
/*     */     stopGame();
/*     */   }
/*     */   
/*     */   private void pausePlayBar() throws InterruptedException {
/*     */     System.out.println("PlayBar paused...");
/*     */     Thread.sleep((20 * this.t.sleepQuantum));
/*     */     System.out.println("PlayBar resumed...");
/*     */   }
/*     */   
/*     */   public void mouseEntered(MouseEvent e) {
/*     */     System.out.println("mouse entered...");
/*     */     if (this.t != null && (getMouseMotionListeners()).length == 0)
/*     */       addMouseMotionListener(this); 
/*     */   }
/*     */   
/*     */   public void mouseExited(MouseEvent e) {
/*     */     System.out.println("mouse exited...");
/*     */     removeMouseMotionListener(this);
/*     */   }
/*     */   
/*     */   public void mouseMoved(MouseEvent e) {
/*     */     System.out.println("in mouse moved...");
/*     */     if (e.getX() + this.myPlayBar.getWidth() <= getWidth())
/*     */       this.myPlayBar.setXpos(e.getX()); 
/*     */   }
/*     */   
/*     */   public void keyPressed(KeyEvent e) {
/*     */     if (this.myPlayBar.checkCollisionWithBall(this.myBall) == 0) {
/*     */       int xpos = this.myPlayBar.getXpos();
/*     */       switch (e.getKeyCode()) {
/*     */         case 37:
/*     */           if (xpos >= 9) {
/*     */             this.myPlayBar.setXpos(xpos - 9);
/*     */             break;
/*     */           } 
/*     */           this.myPlayBar.setXpos(0);
/*     */           break;
/*     */         case 39:
/*     */           if (xpos + this.myPlayBar.getWidth() <= getWidth() - 9) {
/*     */             this.myPlayBar.setXpos(xpos + 9);
/*     */             break;
/*     */           } 
/*     */           this.myPlayBar.setXpos(getWidth() - this.myPlayBar.getWidth());
/*     */           break;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void keyTyped(KeyEvent e) {}
/*     */   
/*     */   public void mouseDragged(MouseEvent e) {}
/*     */   
/*     */   public void keyReleased(KeyEvent e) {}
/*     */   
/*     */   public void mouseClicked(MouseEvent e) {}
/*     */   
/*     */   public void mousePressed(MouseEvent e) {}
/*     */   
/*     */   public void mouseReleased(MouseEvent e) {}
/*     */ }


/* Location:              C:\Users\Rahul\Desktop\arkanoid source\!\gui\ViewPanel.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */