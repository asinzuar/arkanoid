package core_classes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Ball {
    public static final int DEFAULT_DIAM = 20;
    public static final Color DEFAULT_COLOR = Color.RED;

    private Point topLeft;

    private int diameter;

    private Color col;

    private int xdir;
    private int ydir;

    public Ball() {
        this.topLeft = new Point(0, 0);
        this.diameter = 20;
        this.col = DEFAULT_COLOR;
    }

    public Ball(Point topLeft, int diameter, Color col) {
        this.topLeft = topLeft;
        this.diameter = diameter;
        this.col = col;
    }


    public Point getTopLeft() {
        return new Point(this.topLeft);
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft.x = topLeft.x;
        this.topLeft.y = topLeft.y;
    }

    public int getDiameter() {
        return this.diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public Color getCol() {
        return this.col;
    }

    public void setCol(Color col) {
        this.col = col;
    }

    public int getXdir() {
        return this.xdir;
    }

    public void setXdir(int xdir) {
        this.xdir = xdir;
    }

    public int getYdir() {
        return this.ydir;
    }

    public void setYdir(int ydir) {
        this.ydir = ydir;
    }

    public int getRadius() {
        return this.diameter / 2;
    }

    public Point getCenter() {
        return new Point(this.topLeft.x + getRadius(), this.topLeft.y + getRadius());
    }


    public void draw(Graphics g) {
        Color oldcol = g.getColor();
        g.setColor(this.col);
        g.fillOval(this.topLeft.x, this.topLeft.y, this.diameter, this.diameter);
        g.setColor(oldcol);
    }
}
