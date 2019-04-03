package laborator6.PA;

import javax.naming.ldap.Control;
import javax.swing.*;
import java.awt.*;

public class DrawingFrame extends JFrame {

    protected Canvas canvas =new Canvas(this);
    protected Toolbar toolbar = new Toolbar(this);
    protected ControlPanel controlPanel = new ControlPanel(this);

    public DrawingFrame(String name){

        super(name);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());
        this.add(canvas,BorderLayout.CENTER);
        this.add(toolbar,BorderLayout.NORTH);
        this.add(controlPanel,BorderLayout.SOUTH);
        this.pack();
        this.setVisible(true);
        this.setBounds(10,10,500,400);
    }
}
