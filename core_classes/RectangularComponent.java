/*     */ package core_classes;
/*     */ 
/*     */ import java.awt.Point;
/*     */ 
/*     */ public abstract class RectangularComponent
/*     */ {
/*     */   protected int width;
/*     */   protected int height;
/*     */   protected Point topLeft;
/*     */   
/*     */   public Point getTopLeft() {
/*  12 */     return new Point(this.topLeft);
/*     */   }
/*     */   
/*     */   public int getWidth() {
/*  16 */     return this.width;
/*     */   }
/*     */   
/*     */   public void setWidth(int width) {
/*  20 */     this.width = width;
/*     */   }
/*     */   
/*     */   public int getHeight() {
/*  24 */     return this.height;
/*     */   }
/*     */   
/*     */   public void setHeight(int height) {
/*  28 */     this.height = height;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected int findBallZone(Ball myBall) {
/*  34 */     Point ballCenter = myBall.getCenter(); int x = ballCenter.x, y = ballCenter.y;
/*  35 */     int zone = 0;
/*     */     
/*  37 */     if (y < this.topLeft.y && x < this.topLeft.x) {
/*  38 */       zone = 1;
/*  39 */     } else if (x >= this.topLeft.x && x <= this.topLeft.x + this.width && y + 0 <= this.topLeft.y) {
/*  40 */       zone = 2;
/*  41 */     } else if (x > this.topLeft.x + this.width && y < this.topLeft.y) {
/*  42 */       zone = 3;
/*  43 */     } else if (x + 0 <= this.topLeft.x && y >= this.topLeft.y && y <= this.topLeft.y + this.height) {
/*  44 */       zone = 4;
/*  45 */     } else if (x - 0 >= this.topLeft.x + this.width && y >= this.topLeft.y && y <= this.topLeft.y + this.height) {
/*  46 */       zone = 5;
/*  47 */     } else if (y > this.topLeft.y + this.height && x < this.topLeft.x) {
/*  48 */       zone = 6;
/*  49 */     } else if (x >= this.topLeft.x && x <= this.topLeft.x + this.width && y - 0 >= this.topLeft.y + this.height) {
/*  50 */       zone = 7;
/*  51 */     } else if (x > this.topLeft.x + this.width && y > this.topLeft.y + this.height) {
/*  52 */       zone = 8;
/*     */     } else {
/*     */       
/*  55 */       System.exit(1);
/*  56 */     }  return zone;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int checkCollisionWithBall(Ball myBall) {
/*  63 */     Point ballCenter = myBall.getCenter(); int x = ballCenter.x, y = ballCenter.y;
/*  64 */     int ballRadius = myBall.getRadius();
/*     */     
/*  66 */     int zone = findBallZone(myBall);
/*     */ 
/*     */     
/*  69 */     boolean flag = false;
/*  70 */     switch (zone) {
/*     */       case 1:
/*  72 */         if (x + ballRadius >= this.topLeft.x && y + ballRadius >= this.topLeft.y) {
/*     */           
/*  74 */           flag = true;
/*  75 */           return 1;
/*     */         } 
/*     */         break;
/*     */       case 2:
/*  79 */         if (y + ballRadius >= this.topLeft.y) {
/*     */           
/*  81 */           flag = true;
/*  82 */           return 2;
/*     */         } 
/*     */         break;
/*     */       case 3:
/*  86 */         if (x - ballRadius <= this.topLeft.x + this.width && y + ballRadius >= this.topLeft.y) {
/*     */           
/*  88 */           flag = true;
/*  89 */           return 3;
/*     */         } 
/*     */         break;
/*     */       case 4:
/*  93 */         if (x + ballRadius >= this.topLeft.x) {
/*     */           
/*  95 */           flag = true;
/*  96 */           return 4;
/*     */         } 
/*     */         break;
/*     */       case 5:
/* 100 */         if (x - ballRadius <= this.topLeft.x + this.width) {
/*     */           
/* 102 */           flag = true; return 5;
/*     */         } 
/*     */         break;
/*     */       case 6:
/* 106 */         if (x + ballRadius >= this.topLeft.x && y - ballRadius <= this.topLeft.y + this.height) {
/*     */           
/* 108 */           flag = true;
/* 109 */           return 6;
/*     */         } 
/*     */         break;
/*     */       case 7:
/* 113 */         if (y - ballRadius <= this.topLeft.y + this.height) {
/*     */           
/* 115 */           flag = true;
/* 116 */           return 7;
/*     */         } 
/*     */         break;
/*     */       case 8:
/* 120 */         if (x - ballRadius <= this.topLeft.x + this.width && y - ballRadius <= this.topLeft.y + this.height) {
/*     */           
/* 122 */           flag = true;
/* 123 */           return 8;
/*     */         } 
/*     */         break;
/*     */     } 
/* 127 */     return 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\Rahul\Desktop\arkanoid source\!\core_classes\RectangularComponent.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */