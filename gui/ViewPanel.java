package gui;

import core_classes.Ball;
import core_classes.Brick;
import core_classes.PlayBar;
import core_classes.special_bricks.ToughBrick;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ViewPanel
        extends JPanel
        implements MouseMotionListener, KeyListener, MouseListener {
    private static final long serialVersionUID = -793809479896346230L;

    class gamePlayThread
            extends Thread {
        private static final int DEFAULT_XSHIFT = 1;
        private static final int DEFAULT_YSHIFT = 3;
        private static final int DEFAULT_SPEED = 18;
        private static final int SLEEP_CONSTANT = 30;
        private boolean exit;
        private boolean terminated;
        private int xshift;
        private int yshift;
        private Point ballPos;
        private int speed;
        private int sleepQuantum;
        CollisionDetecter collisionDetecter;

        class CollisionDetecter {
            public boolean checkGroundCollision() {
                if (ViewPanel.gamePlayThread.this.ballPos.y + ViewPanel.this.myBall.getDiameter() >= ViewPanel.this.getHeight()) {

                    if ((ViewPanel.this.chances == 0)) {

                        JOptionPane.showMessageDialog(null, "Game Over");
                        (new Thread(new Runnable() {
                            public void run() {
                                ViewPanel.this.stopGame();
                            }
                        })).start();
                    } else {

                        ViewPanel.this.chances--;
                        JOptionPane.showMessageDialog(null, ViewPanel.this.chances + " chance(s) left");

                        (new Thread(new Runnable() {
                            public void run() {
                                ViewPanel.this.nextAttempt();
                            }
                        })).start();
                    }
                    return true;
                }
                return false;
            }


            public boolean checkRoofCollision() {
                if (ViewPanel.gamePlayThread.this.ballPos.y <= 0) {

                    ViewPanel.gamePlayThread.this.yshift = ViewPanel.gamePlayThread.this.yshift * -1;
                    return true;
                }
                return false;
            }


            public boolean checkWallCollision() {
                if (ViewPanel.gamePlayThread.this.ballPos.x + ViewPanel.this.myBall.getDiameter() >= ViewPanel.this.getWidth() || ViewPanel.gamePlayThread.this.ballPos.x <= 0) {

                    ViewPanel.gamePlayThread.this.xshift = ViewPanel.gamePlayThread.this.xshift * -1;
                    return true;
                }
                return false;
            }


            public boolean checkAndApplyForAnyBrickCollision() {
                boolean matrix_empty = true;
                byte b;
                int i;
                Brick[][] arrayOfBrick;
                for (i = (arrayOfBrick = ViewPanel.this.BrickMatrix).length, b = 0; b < i; ) {
                    Brick[] brickRow = arrayOfBrick[b];
                    byte b1;
                    int j;
                    Brick[] arrayOfBrick1;
                    for (j = (arrayOfBrick1 = brickRow).length, b1 = 0; b1 < j; ) {
                        Brick br = arrayOfBrick1[b1];

                        if (!br.isEmpty()) {

                            matrix_empty = false;

                            if (checkAndApplySingleBrickCollision(br))
                                return true;
                        }
                        b1++;
                    }
                    b++;
                }

                if (matrix_empty) {

                    JOptionPane.showMessageDialog(null, "Congratulations, you have finished the game!!");

                    (new Thread(new Runnable() {

                        public void run() {
                            ViewPanel.this.gameCompleted();
                        }
                    })).start();
                }
                return false;
            }

            public boolean checkAndApplySingleBrickCollision(Brick br) {
                int c = br.checkCollisionWithBall(ViewPanel.this.myBall);
                switch (c) {

                    case 1:
                        ViewPanel.gamePlayThread.this.xshift = -1;
                        ViewPanel.gamePlayThread.this.yshift = -3;
                        br.setEmpty(true);
                        break;
                    case 2:
                        ViewPanel.gamePlayThread.this.yshift = ViewPanel.gamePlayThread.this.yshift * -1;
                        br.setEmpty(true);
                        break;
                    case 3:
                        ViewPanel.gamePlayThread.this.xshift = 1;
                        ViewPanel.gamePlayThread.this.yshift = -3;
                        br.setEmpty(true);
                        break;
                    case 4:
                        ViewPanel.gamePlayThread.this.xshift = ViewPanel.gamePlayThread.this.xshift * -1;
                        br.setEmpty(true);
                        break;
                    case 5:
                        ViewPanel.gamePlayThread.this.xshift = ViewPanel.gamePlayThread.this.xshift * -1;
                        br.setEmpty(true);
                        break;
                    case 6:
                        ViewPanel.gamePlayThread.this.xshift = -1;
                        ViewPanel.gamePlayThread.this.yshift = 3;
                        br.setEmpty(true);
                        break;
                    case 7:
                        ViewPanel.gamePlayThread.this.yshift = ViewPanel.gamePlayThread.this.yshift * -1;
                        br.setEmpty(true);
                        break;
                    case 8:
                        ViewPanel.gamePlayThread.this.xshift = 1;
                        ViewPanel.gamePlayThread.this.yshift = 3;
                        br.setEmpty(true);
                        break;
                    case 0:
                        return false;
                }
                return true;
            }


            public boolean checkAndApplyBarCollision() {
                int c = ViewPanel.this.myPlayBar.checkCollisionWithBall(ViewPanel.this.myBall);
                switch (c) {

                    case 1:
                        ViewPanel.gamePlayThread.this.xshift = -2;
                        ViewPanel.gamePlayThread.this.yshift = -3;
                        break;
                    case 2:
                        ViewPanel.gamePlayThread.this.yshift = ViewPanel.gamePlayThread.this.yshift * -1;

                        impartDirection();
                        break;
                    case 3:
                        ViewPanel.gamePlayThread.this.xshift = 2;
                        ViewPanel.gamePlayThread.this.yshift = -3;
                        break;
                    case 4:
                        ViewPanel.gamePlayThread.this.xshift = ViewPanel.gamePlayThread.this.xshift * -1;
                        break;
                    case 5:
                        ViewPanel.gamePlayThread.this.xshift = ViewPanel.gamePlayThread.this.xshift * -1;
                        break;
                    case 6:
                        ViewPanel.gamePlayThread.this.xshift = -2;
                        ViewPanel.gamePlayThread.this.yshift = 3;
                        break;
                    case 7:
                        ViewPanel.gamePlayThread.this.yshift = ViewPanel.gamePlayThread.this.yshift * -1;
                        break;
                    case 8:
                        ViewPanel.gamePlayThread.this.xshift = 2;
                        ViewPanel.gamePlayThread.this.yshift = 3;
                        break;
                    case 0:
                        return false;
                }
                return true;
            }

            private void impartDirection() {
                Point ballCenter = ViewPanel.this.myBall.getCenter();
                int x = ballCenter.x;
                int barXpos = ViewPanel.this.myPlayBar.getXpos(), barWidth = ViewPanel.this.myPlayBar.getWidth();

                double mark20 = (20 * barWidth / 100);
                double mark48 = (48 * barWidth / 100);
                double mark52 = (52 * barWidth / 100);
                double mark80 = (80 * barWidth / 100);

                if (x <= barXpos + mark20) {

                    ViewPanel.gamePlayThread.this.xshift = -2;
                } else if (x > barXpos + mark48 && x <= barXpos + mark52) {

                    ViewPanel.gamePlayThread.this.xshift = 0;
                } else if (x > barXpos + mark80) {

                    ViewPanel.gamePlayThread.this.xshift = 2;


                } else if (ViewPanel.gamePlayThread.this.xshift == 0) {

                    if (x < barXpos + mark48) {
                        ViewPanel.gamePlayThread.this.xshift = -1;
                    } else {
                        ViewPanel.gamePlayThread.this.xshift = 1;
                    }
                }
            }
        }

        public gamePlayThread(Point ballPos) {
            this.xshift = 1;
            this.yshift = -3;
            this.speed = 18;
            this.sleepQuantum = 30 - this.speed;
            this.ballPos = ballPos;
            this.collisionDetecter = new CollisionDetecter();
        }

        public void run() {
            try {
                while (!this.exit) {
                    this.ballPos.x += this.xshift;
                    this.ballPos.y += this.yshift;
                    ViewPanel.this.myBall.setTopLeft(this.ballPos);
                    if (ViewPanel.this.brickMatrixDirty) {
                        ViewPanel.this.repaint(0, 40, ViewPanel.this.getWidth(), 84);
                        ViewPanel.this.brickMatrixDirty = false;
                    }
                    ViewPanel.this.repaint((ViewPanel.this.myBall.getTopLeft()).x - 5, (ViewPanel.this.myBall.getTopLeft()).y - 5, ViewPanel.this.myBall.getDiameter() + 10, ViewPanel.this.myBall.getDiameter() + 10);
                    ViewPanel.this.repaint(ViewPanel.this.myPlayBar.getXpos() - ViewPanel.this.myPlayBar.getWidth(), ViewPanel.this.myPlayBar.getYPOS(), ViewPanel.this.myPlayBar.getWidth() * 3, ViewPanel.this.myPlayBar.getHeight());
                    if (!this.collisionDetecter.checkGroundCollision()) {
                        this.collisionDetecter.checkWallCollision();
                        if (!this.collisionDetecter.checkAndApplyBarCollision() && !this.collisionDetecter.checkRoofCollision() && this.collisionDetecter.checkAndApplyForAnyBrickCollision())
                            ViewPanel.this.brickMatrixDirty = true;
                    }
                    Thread.sleep(this.sleepQuantum);
                }
            } catch (HeadlessException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Thread exiting...");
                this.terminated = true;
            }
        }

        public void exit() {
            this.exit = true;
        }
    }

    private static final Color DEFAULT_BGCOLOR = Color.BLACK;
    private static final int ROWS = 4;
    private static final int COLUMNS = 12;
    private static final int DEFAULT_CHANCES = 3;
    private static final int PLAYBAR_MOTION_QUANTUM = 9;
    private Color bgColor;
    private Ball myBall;
    ArrayList<Ball> Balls;
    private PlayBar myPlayBar;
    private Brick[][] BrickMatrix;
    private int matrixHeight;
    private int chances;
    private boolean keyListenerCollisionFlag;
    private boolean brickMatrixDirty;
    private gamePlayThread t;

    public ViewPanel() {
        this.bgColor = DEFAULT_BGCOLOR;
        this.Balls = new ArrayList<>();
        this.chances = 3;
        this.keyListenerCollisionFlag = false;
        this.brickMatrixDirty = false;
        setBackground(this.bgColor);
        setFocusable(true);
    }

    public void initGameComponents() {
        initBar();
        initBall();
        initBricks();
    }

    public void resetDynamicGameComponents() {
        initBar();
        initBall();
    }

    private void initBricks() {
        int size = 12;
        int[] special = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++)
            special[i] = r.nextInt(48);
        this.BrickMatrix = new Brick[4][12];
        int xpos = 0, ypos = 40;
        int counter = 0;
        for (int j = 0; j < 4; j++) {
            int k;
            for (k = 0; k < 12; k++) {
                boolean flag = false;
                byte b;
                int m, arrayOfInt[];
                for (m = (arrayOfInt = special).length, b = 0; b < m; ) {
                    int c = arrayOfInt[b];
                    if (c == counter) {
                        flag = true;
                        break;
                    }
                    b++;
                }
                if (flag) {
                    this.BrickMatrix[j][k] = (Brick) new ToughBrick();
                } else {
                    this.BrickMatrix[j][k] = new Brick();
                }
                this.BrickMatrix[j][k].setTopLeft(new Point(xpos, ypos));
                xpos += this.BrickMatrix[j][k].getWidth() + 1;
                counter++;
            }
            xpos = 0;
            ypos += this.BrickMatrix[j][k - 1].getHeight() + 1;
        }
        this.matrixHeight = ypos - 1;
    }

    private void initBall() {
        this.myBall = new Ball();
        this.myBall.setTopLeft(new Point(this.myPlayBar.getXpos() + this.myPlayBar.getWidth() / 2 - this.myBall.getDiameter() / 2, this.myPlayBar.getYPOS() - this.myBall.getDiameter()));
        this.Balls.add(this.myBall);
    }

    private void initBar() {
        this.myPlayBar = new PlayBar(getHeight());
        this.myPlayBar.setXpos(getWidth() / 2 - this.myPlayBar.getWidth() / 2);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.myBall.draw(g);
        this.myPlayBar.draw(g);
        byte b;
        int i;
        Brick[][] arrayOfBrick;
        for (i = (arrayOfBrick = this.BrickMatrix).length, b = 0; b < i; ) {
            Brick[] brickRow = arrayOfBrick[b];
            byte b1;
            int j;
            Brick[] arrayOfBrick1;
            for (j = (arrayOfBrick1 = brickRow).length, b1 = 0; b1 < j; ) {
                Brick br = arrayOfBrick1[b1];
                if (!br.isEmpty())
                    br.draw(g);
                b1++;
            }
            b++;
        }
    }

    public void startGame() {
        if (this.t == null) {
            this.t = new gamePlayThread(this.myBall.getTopLeft());
            this.t.start();
            if ((getKeyListeners()).length == 0)
                addKeyListener(this);
        }
    }

    public void stopGame() {
        if (this.t != null) {
            removeKeyListener(this);
            this.t.exit();
            try {
                this.t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.t = null;
            this.chances = 3;
            initGameComponents();
            repaint();
        }
    }

    public void nextAttempt() {
        this.t.exit();
        try {
            this.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.t = null;
        resetDynamicGameComponents();
        repaint();
        startGame();
    }

    private void gameCompleted() {
        stopGame();
    }

    private void pausePlayBar() throws InterruptedException {
        System.out.println("PlayBar paused...");
        Thread.sleep((20 * this.t.sleepQuantum));
        System.out.println("PlayBar resumed...");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("mouse entered...");
        if (this.t != null && (getMouseMotionListeners()).length == 0)
            addMouseMotionListener(this);
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("mouse exited...");
        removeMouseMotionListener(this);
    }

    public void mouseMoved(MouseEvent e) {
        System.out.println("in mouse moved...");
        if (e.getX() + this.myPlayBar.getWidth() <= getWidth())
            this.myPlayBar.setXpos(e.getX());
    }

    public void keyPressed(KeyEvent e) {
        if (this.myPlayBar.checkCollisionWithBall(this.myBall) == 0) {
            int xpos = this.myPlayBar.getXpos();
            switch (e.getKeyCode()) {
                case 37:
                    if (xpos >= 9) {
                        this.myPlayBar.setXpos(xpos - 9);
                        break;
                    }
                    this.myPlayBar.setXpos(0);
                    break;
                case 39:
                    if (xpos + this.myPlayBar.getWidth() <= getWidth() - 9) {
                        this.myPlayBar.setXpos(xpos + 9);
                        break;
                    }
                    this.myPlayBar.setXpos(getWidth() - this.myPlayBar.getWidth());
                    break;
            }
        }
    }

    public void keyTyped(KeyEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }
}

