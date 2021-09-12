/*    */ package core_classes;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.Point;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Brick
/*    */   extends RectangularComponent
/*    */ {
/*    */   public static final int DEFAULT_WIDTH = 49;
/*    */   public static final int DEFAULT_HEIGHT = 20;
/* 16 */   public static final Color DEFAULT_COLOR = Color.YELLOW;
/*    */   
/*    */   protected Color col;
/*    */   
/*    */   protected boolean empty;
/*    */ 
/*    */   
/*    */   public void setEmpty(boolean empty) {
/* 24 */     this.empty = empty;
/*    */   }
/*    */   
/*    */   public boolean isEmpty() {
/* 28 */     return this.empty;
/*    */   }
/*    */ 
/*    */   
/*    */   public Brick(Point topLeft, int width, int height, Color col) {
/* 33 */     this.topLeft = topLeft;
/* 34 */     this.width = width;
/* 35 */     this.height = height;
/* 36 */     this.col = col;
/*    */   }
/*    */ 
/*    */   
/*    */   public Brick() {
/* 41 */     this.topLeft = new Point(0, 0);
/* 42 */     this.width = 49; this.height = 20;
/* 43 */     this.col = DEFAULT_COLOR;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void draw(Graphics g) {
/* 49 */     Color oldcol = g.getColor();
/* 50 */     g.setColor(this.col);
/* 51 */     g.fillRect(this.topLeft.x, this.topLeft.y, this.width, this.height);
/* 52 */     g.setColor(oldcol);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setTopLeft(Point topLeft) {
/* 57 */     this.topLeft = topLeft;
/*    */   }
/*    */   
/*    */   public Color getCol() {
/* 61 */     return this.col;
/*    */   }
/*    */   
/*    */   public void setCol(Color col) {
/* 65 */     this.col = col;
/*    */   }
/*    */ }


/* Location:              C:\Users\Rahul\Desktop\arkanoid source\!\core_classes\Brick.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */