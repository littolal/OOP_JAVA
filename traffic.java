import java.awt.*;
import java.awt.event.*;

public class traffic extends Frame implements ItemListener{
    Checkbox red,yellow,green;
    CheckboxGroup cbg;

    traffic() {
        cbg = new CheckboxGroup();
        red = new Checkbox("Red",cbg,false); 
        yellow = new Checkbox("Yellow",cbg,false);
        green = new Checkbox("Green",cbg,false);

        red.addItemListener(this);
        yellow.addItemListener(this);
        green.addItemListener(this);

        add(red);
        add(yellow);
        add(green);

        repaint();

        setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());
    }

    public void itemStateChanged(ItemEvent e)
    {
        repaint();
    }
    public void paint (Graphics g)
    {
        g.drawOval(130,80,50,50);
        g.drawOval(130,140,50,50);
        g.drawOval(130,200,50,50);
        g.drawRect(126,70,60,190);
        g.setColor(Color.GRAY);
        g.fillRect(126,70,60,190);

        if(cbg.getSelectedCheckbox()==red){
            g.setColor(Color.red);
            g.fillOval(130,80,50,50);            
        }
        else 
        if(cbg.getSelectedCheckbox()==yellow){
            g.setColor(Color.yellow);
            g.fillOval(130,140,50,50);
        }
        else 
        if(cbg.getSelectedCheckbox()==green){
            g.setColor(Color.green);
            g.fillOval(130,200,50,50);
        }
    }

    public static void main(String args[])
    {
        new traffic();
    }
}