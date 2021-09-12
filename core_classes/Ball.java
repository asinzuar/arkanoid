/*    */ package core_classes;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.Point;
/*    */ 
/*    */ public class Ball
/*    */ {
/*    */   public static final int DEFAULT_DIAM = 20;
/* 10 */   public static final Color DEFAULT_COLOR = Color.RED;
/*    */   
/*    */   private Point topLeft;
/*    */   
/*    */   private int diameter;
/*    */   
/*    */   private Color col;
/*    */   
/*    */   private int xdir;
/*    */   private int ydir;
/*    */   
/*    */   public Ball() {
/* 22 */     this.topLeft = new Point(0, 0);
/* 23 */     this.diameter = 20;
/* 24 */     this.col = DEFAULT_COLOR;
/*    */   }
/*    */   
/*    */   public Ball(Point topLeft, int diameter, Color col) {
/* 28 */     this.topLeft = topLeft;
/* 29 */     this.diameter = diameter;
/* 30 */     this.col = col;
/*    */   }
/*    */ 
/*    */   
/*    */   public Point getTopLeft() {
/* 35 */     return new Point(this.topLeft);
/*    */   }
/*    */   public void setTopLeft(Point topLeft) {
/* 38 */     this.topLeft.x = topLeft.x;
/* 39 */     this.topLeft.y = topLeft.y;
/*    */   }
/*    */   public int getDiameter() {
/* 42 */     return this.diameter;
/*    */   }
/*    */   public void setDiameter(int diameter) {
/* 45 */     this.diameter = diameter;
/*    */   }
/*    */   public Color getCol() {
/* 48 */     return this.col;
/*    */   }
/*    */   public void setCol(Color col) {
/* 51 */     this.col = col;
/*    */   }
/*    */   
/*    */   public int getXdir() {
/* 55 */     return this.xdir;
/*    */   }
/*    */   
/*    */   public void setXdir(int xdir) {
/* 59 */     this.xdir = xdir;
/*    */   }
/*    */   
/*    */   public int getYdir() {
/* 63 */     return this.ydir;
/*    */   }
/*    */   
/*    */   public void setYdir(int ydir) {
/* 67 */     this.ydir = ydir;
/*    */   }
/*    */   
/*    */   public int getRadius() {
/* 71 */     return this.diameter / 2;
/*    */   }
/*    */   
/*    */   public Point getCenter() {
/* 75 */     return new Point(this.topLeft.x + getRadius(), this.topLeft.y + getRadius());
/*    */   }
/*    */ 
/*    */   
/*    */   public void draw(Graphics g) {
/* 80 */     Color oldcol = g.getColor();
/* 81 */     g.setColor(this.col);
/* 82 */     g.fillOval(this.topLeft.x, this.topLeft.y, this.diameter, this.diameter);
/* 83 */     g.setColor(oldcol);
/*    */   }
/*    */ }


/* Location:              C:\Users\Rahul\Desktop\arkanoid source\!\core_classes\Ball.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */