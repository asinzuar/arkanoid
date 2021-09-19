package core_classes.special_bricks;

import core_classes.Brick;

import java.awt.Color;
import java.awt.Point;

public class ToughBrick
        extends Brick {
    public static final Color FIRST_DEFAULT_COLOR = Color.MAGENTA;
    public static final Color SECOND_DEFAULT_COLOR = Color.cyan;
    public static final Color THIRD_DEFAULT_COLOR = Color.GREEN;

    int lives;

    public ToughBrick() {
        this.col = FIRST_DEFAULT_COLOR;
        this.lives = 3;
    }

    public ToughBrick(Point topLeft, int width, int height, Color col) {
        super(topLeft, width, height, col);
        this.lives = 3;
    }

    public void setEmpty(boolean empty) {
        if (empty) {

            this.lives--;
            if (this.lives == 0) {
                super.setEmpty(true);
            } else {
                this.col = (this.lives == 2) ? SECOND_DEFAULT_COLOR : THIRD_DEFAULT_COLOR;
            }
        } else {

            this.lives = 3;
            super.setEmpty(false);
        }
    }
}
