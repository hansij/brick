package com.zetcode;

/**
 * Created by Elev12 on 2016-06-14.
 */
import javax.swing.ImageIcon;

public class Brick extends Sprite {

    private boolean destroyed;
    private int width = 50;
    private int heigth = 10;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }



    public Brick(int x, int y) {

        this.x = x;
        this.y = y;

        ImageIcon ii = new ImageIcon("brick.png");
        image = ii.getImage();

        i_width = image.getWidth(null);
        i_heigth = image.getHeight(null);

        destroyed = false;
    }

    public boolean isDestroyed() {

        return destroyed;
    }

    public void setDestroyed(boolean val) {

        destroyed = val;
    }
}
