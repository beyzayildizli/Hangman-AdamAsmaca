package adamasmacaswing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/**
 *
 * @author beyzayildizli10@gmail.com
 */
public class MyButton extends JButton {

    private boolean over;
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private Color borderColor;
    private int radius = 0;

    public void setOver(boolean over) {
        this.over = over;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    public void setColorClick(Color colorClick) {
        this.colorClick = colorClick;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public boolean isOver() {
        return over;
    }

    public Color getColor() {
        return color;
    }

    public Color getColorOver() {
        return colorOver;
    }

    public Color getColorClick() {
        return colorClick;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public int getRadius() {
        return radius;
    }

    public MyButton() {
        setColor(Color.WHITE);
        colorOver = new Color(102,102,102);
        colorClick = new Color(204,204,204);
        borderColor = new Color(0,51,51);
        setContentAreaFilled(false);
        addMouseListener(new MouseAdapter() {

            boolean renkDegis = true;

            public void mouseEntered(MouseEvent e) {
                if (renkDegis == true) {
                    setBackground(colorOver);
                }
                over = true;
            }

            public void mouseExited(MouseEvent e) {
                if (renkDegis == true) {
                    setBackground(color);
                }
                over = false;
            }

            public void mousePressed(MouseEvent e) {
                if (renkDegis == true) {
                setBackground(colorClick);
                }
                renkDegis = false;
            }
        });
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(borderColor);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        g2.setColor(getBackground());

        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);
        super.paintComponent(grphcs);
    }
}
