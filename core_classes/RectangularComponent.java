package core_classes;

import java.awt.Point;

public abstract class RectangularComponent {
    protected int width;
    protected int height;
    protected Point topLeft;

    public Point getTopLeft() {
        return new Point(this.topLeft);
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    protected int findBallZone(Ball myBall) {
        Point ballCenter = myBall.getCenter();
        int x = ballCenter.x, y = ballCenter.y;
        int zone = 0;

        if (y < this.topLeft.y && x < this.topLeft.x) {
            zone = 1;
        } else if (x >= this.topLeft.x && x <= this.topLeft.x + this.width && y + 0 <= this.topLeft.y) {
            zone = 2;
        } else if (x > this.topLeft.x + this.width && y < this.topLeft.y) {
            zone = 3;
        } else if (x + 0 <= this.topLeft.x && y >= this.topLeft.y && y <= this.topLeft.y + this.height) {
            zone = 4;
        } else if (x - 0 >= this.topLeft.x + this.width && y >= this.topLeft.y && y <= this.topLeft.y + this.height) {
            zone = 5;
        } else if (y > this.topLeft.y + this.height && x < this.topLeft.x) {
            zone = 6;
        } else if (x >= this.topLeft.x && x <= this.topLeft.x + this.width && y - 0 >= this.topLeft.y + this.height) {
            zone = 7;
        } else if (x > this.topLeft.x + this.width && y > this.topLeft.y + this.height) {
            zone = 8;
        } else {

            System.exit(1);
        }
        return zone;
    }

    public int checkCollisionWithBall(Ball myBall) {
        Point ballCenter = myBall.getCenter();
        int x = ballCenter.x, y = ballCenter.y;
        int ballRadius = myBall.getRadius();

        int zone = findBallZone(myBall);

        boolean flag = false;
        switch (zone) {
            case 1:
                if (x + ballRadius >= this.topLeft.x && y + ballRadius >= this.topLeft.y) {

                    flag = true;
                    return 1;
                }
                break;
            case 2:
                if (y + ballRadius >= this.topLeft.y) {

                    flag = true;
                    return 2;
                }
                break;
            case 3:
                if (x - ballRadius <= this.topLeft.x + this.width && y + ballRadius >= this.topLeft.y) {

                    flag = true;
                    return 3;
                }
                break;
            case 4:
                if (x + ballRadius >= this.topLeft.x) {

                    flag = true;
                    return 4;
                }
                break;
            case 5:
                if (x - ballRadius <= this.topLeft.x + this.width) {

                    flag = true;
                    return 5;
                }
                break;
            case 6:
                if (x + ballRadius >= this.topLeft.x && y - ballRadius <= this.topLeft.y + this.height) {

                    flag = true;
                    return 6;
                }
                break;
            case 7:
                if (y - ballRadius <= this.topLeft.y + this.height) {

                    flag = true;
                    return 7;
                }
                break;
            case 8:
                if (x - ballRadius <= this.topLeft.x + this.width && y - ballRadius <= this.topLeft.y + this.height) {

                    flag = true;
                    return 8;
                }
                break;
        }
        return 0;
    }
}
