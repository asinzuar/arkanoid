package core_classes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class PlayBar
        extends RectangularComponent {
    private static final int DEFAULT_WIDTH = 100;
    private static final int DEFAULT_HEIGHT = 20;
    private static final Color DEFAULT_COLOR = Color.BLUE;

    private int xpos;

    private final int YPOS;
    private Color col;

    public PlayBar(int ypos) {
        this.width = 100;
        this.height = 20;
        this.YPOS = ypos - this.height * 2;
        this.col = DEFAULT_COLOR;
        this.topLeft = new Point(this.xpos, this.YPOS);
    }


    public PlayBar(PlayBar b) {
        this.xpos = b.xpos;
        this.YPOS = b.YPOS;
        this.width = b.width;
        this.height = b.height;
        this.col = b.col;
        this.topLeft = new Point(this.xpos, this.YPOS);
    }


    public void draw(Graphics g) {
        Color oldcol = g.getColor();
        g.setColor(this.col);
        g.fill3DRect(this.xpos, this.YPOS, this.width, this.height, false);

        g.setColor(oldcol);
    }


    public int getXpos() {
        return this.xpos;
    }

    public void setXpos(int xpos) {
        this.xpos = xpos;
        this.topLeft.x = this.xpos;
    }

    public int getYPOS() {
        return this.YPOS;
    }


    public Color getCol() {
        return this.col;
    }

    public void setCol(Color col) {
        this.col = col;
    }
}
