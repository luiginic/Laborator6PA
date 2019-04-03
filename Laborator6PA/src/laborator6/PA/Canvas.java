package laborator6.PA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class Canvas extends JPanel {
    BufferedImage image = new BufferedImage(500, 500, BufferedImage.TYPE_INT_ARGB);
    Graphics2D g = image.createGraphics();
    private int x,y,radius;
    private DrawingFrame frame;

    public Canvas(DrawingFrame frame){
        this.frame=frame;
        this.setBorder(BorderFactory.createTitledBorder("Canvas"));
        init();
    }

    public void init(){
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x=e.getX();
                y=e.getY();
                radius=(int)frame.toolbar.size.getValue();
                System.out.println("Radius="+radius+ " X="+x+" Y="+y);
                drawNode();
//                repaint();
            }

        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
//        drawNode();

    }

    public void drawNode(){

        String color = frame.toolbar.cols.getItemAt(frame.toolbar.cols.getSelectedIndex()).toString();
        System.out.println(color);

        switch (color){
            case "Red":
                g.setColor(new Color(0xFF0000));
                break;
            case "Blue":
                g.setColor(new Color(0xfff));
                break;
            case "Yellow":
                g.setColor(new Color(0xFFF700));
                break;
            case "Black":
                g.setColor(new Color(0x000000));
                break;
        }

        g.fillOval(this.x-radius/2 ,this.y-radius/2,radius,radius);
        this.getGraphics().drawImage(image,0,0,this);
    }
}
