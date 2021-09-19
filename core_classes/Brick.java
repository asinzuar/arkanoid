package core_classes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Brick
        extends RectangularComponent {
    public static final int DEFAULT_WIDTH = 49;
    public static final int DEFAULT_HEIGHT = 20;
    public static final Color DEFAULT_COLOR = Color.YELLOW;

    protected Color col;

    protected boolean empty;


    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public boolean isEmpty() {
        return this.empty;
    }


    public Brick(Point topLeft, int width, int height, Color col) {
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
        this.col = col;
    }


    public Brick() {
        this.topLeft = new Point(0, 0);
        this.width = 49;
        this.height = 20;
        this.col = DEFAULT_COLOR;
    }


    public void draw(Graphics g) {
        Color oldcol = g.getColor();
        g.setColor(this.col);
        g.fillRect(this.topLeft.x, this.topLeft.y, this.width, this.height);
        g.setColor(oldcol);
    }


    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public Color getCol() {
        return this.col;
    }

    public void setCol(Color col) {
        this.col = col;
    }
}
