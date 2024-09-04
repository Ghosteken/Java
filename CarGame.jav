import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CarGame extends JFrame {

    private int carX;
    private int carY;
    private int obstacleX;
    private int obstacleY;

    public CarGame() {
        setTitle("Car Game");
        setSize(400, 400);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        carX = 180;
        carY = 300;
        obstacleX = 200;
        obstacleY = 0;

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_LEFT) {
                    carX -= 10;
                } else if (keyCode == KeyEvent.VK_RIGHT) {
                    carX += 10;
                }
                repaint();
            }
        });

        Timer timer = new Timer(50, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                obstacleY += 5;
                if (obstacleY > 400) {
                    obstacleY = 0;
                    obstacleX = (int) (Math.random() * 360);
                }
                repaint();
            }
        });
        timer.start();

        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.BLUE);
        g.fillRect(carX, carY, 40, 80);

        g.setColor(Color.RED);
        g.fillRect(obstacleX, obstacleY, 40, 40);

        if (carX < obstacleX + 40 && carX + 40 > obstacleX && carY < obstacleY + 40 && carY + 80 > obstacleY) {
            // Collision detected
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 24));
            g.drawString("Game Over!", 150, 200);
        }
    }

    public static void main(String[] args) {
        new CarGame();
    }
}
