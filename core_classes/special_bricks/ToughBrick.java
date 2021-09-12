/*    */ package core_classes.special_bricks;
/*    */ 
/*    */ import core_classes.Brick;
/*    */ import java.awt.Color;
/*    */ import java.awt.Point;
/*    */ 
/*    */ public class ToughBrick
/*    */   extends Brick
/*    */ {
/* 10 */   public static final Color FIRST_DEFAULT_COLOR = Color.MAGENTA;
/* 11 */   public static final Color SECOND_DEFAULT_COLOR = Color.cyan;
/* 12 */   public static final Color THIRD_DEFAULT_COLOR = Color.GREEN;
/*    */   
/*    */   int lives;
/*    */ 
/*    */   
/*    */   public ToughBrick() {
/* 18 */     this.col = FIRST_DEFAULT_COLOR;
/* 19 */     this.lives = 3;
/*    */   }
/*    */   
/*    */   public ToughBrick(Point topLeft, int width, int height, Color col) {
/* 23 */     super(topLeft, width, height, col);
/* 24 */     this.lives = 3;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setEmpty(boolean empty) {
/* 29 */     if (empty) {
/*    */       
/* 31 */       this.lives--;
/* 32 */       if (this.lives == 0) {
/* 33 */         super.setEmpty(true);
/*    */       } else {
/*    */         
/* 36 */         this.col = (this.lives == 2) ? SECOND_DEFAULT_COLOR : THIRD_DEFAULT_COLOR;
/*    */       }
/*    */     
/*    */     } else {
/*    */       
/* 41 */       this.lives = 3;
/* 42 */       super.setEmpty(false);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Rahul\Desktop\arkanoid source\!\core_classes\special_bricks\ToughBrick.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */