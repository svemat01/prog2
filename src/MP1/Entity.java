package MP1;

import se.egy.graphics.Drawable;

import java.awt.*;

public class Entity implements Drawable {
    private int x;
    private int y;
    private Image img;
    public Entity(Image img, int x, int y) {
        this.x = x;
        this.y = y;
        this.img = img;
    }

    public void draw(Graphics2D g) {
        g.drawImage(img, x, y, null);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getWidth() {
    	return img.getWidth(null);
    }

    public int getHeight() {
    	return img.getHeight(null);
    }
}
