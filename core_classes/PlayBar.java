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
/*    */ public class PlayBar
/*    */   extends RectangularComponent
/*    */ {
/*    */   private static final int DEFAULT_WIDTH = 100;
/*    */   private static final int DEFAULT_HEIGHT = 20;
/* 16 */   private static final Color DEFAULT_COLOR = Color.BLUE;
/*    */   
/*    */   private int xpos;
/*    */   
/*    */   private final int YPOS;
/*    */   private Color col;
/*    */   
/*    */   public PlayBar(int ypos) {
/* 24 */     this.width = 100; this.height = 20;
/* 25 */     this.YPOS = ypos - this.height * 2;
/* 26 */     this.col = DEFAULT_COLOR;
/* 27 */     this.topLeft = new Point(this.xpos, this.YPOS);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public PlayBar(PlayBar b) {
/* 33 */     this.xpos = b.xpos;
/* 34 */     this.YPOS = b.YPOS;
/* 35 */     this.width = b.width;
/* 36 */     this.height = b.height;
/* 37 */     this.col = b.col;
/* 38 */     this.topLeft = new Point(this.xpos, this.YPOS);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void draw(Graphics g) {
/* 44 */     Color oldcol = g.getColor();
/* 45 */     g.setColor(this.col);
/* 46 */     g.fill3DRect(this.xpos, this.YPOS, this.width, this.height, false);
/*    */     
/* 48 */     g.setColor(oldcol);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getXpos() {
/* 55 */     return this.xpos;
/*    */   }
/*    */   
/*    */   public void setXpos(int xpos) {
/* 59 */     this.xpos = xpos;
/* 60 */     this.topLeft.x = this.xpos;
/*    */   }
/*    */   
/*    */   public int getYPOS() {
/* 64 */     return this.YPOS;
/*    */   }
/*    */ 
/*    */   
/*    */   public Color getCol() {
/* 69 */     return this.col;
/*    */   }
/*    */   
/*    */   public void setCol(Color col) {
/* 73 */     this.col = col;
/*    */   }
/*    */ }


/* Location:              C:\Users\Rahul\Desktop\arkanoid source\!\core_classes\PlayBar.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */