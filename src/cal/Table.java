package cal;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

class Table implements ActionListener {
    JFrame frame=new JFrame("Table");
    Container con=frame.getContentPane();
    JLabel lInputNumber,lhead;
    JTextField tInputNumber;
    JTextArea ttable;
    JButton Submit;
    Table()
    {

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setBounds(200,200,800,300);
        frame.setBackground(Color.yellow);
        con.setLayout(null);
        frame.setLayout(null);

        Font f=new Font("Arial",Font.BOLD,20);
        lhead=new JLabel("Table");
        lhead.setBounds(300,20,80,30);
        lhead.setBackground(Color.yellow);
        lhead.setFont(f);
        con.add(lhead);

        Font ff=new Font("Arial",Font.BOLD,15);
        lInputNumber=new JLabel("Input the number");
        lInputNumber.setBounds(50,50,150,30);
        con.add(lInputNumber);
        lInputNumber.setFont(ff);

        tInputNumber=new JTextField();
        tInputNumber.setBounds(250,50,130,30);
        con.add(tInputNumber);
        tInputNumber.setFont(ff);

        Submit=new JButton("Submit");
        con.add(Submit);
        Submit.setBounds(200,120,80,30);
        Submit.addActionListener(this);

        Font fff=new Font("Arial",Font.BOLD,15);
        ttable=new JTextArea();
        ttable.setBounds(400,50,400,400);
        ttable.setEditable(false);
        ttable.setFont(fff);
        ttable.setVisible(true);
        con.add(ttable);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String ch=e.getActionCommand();
        if(ch=="Submit")
        {
            int num=Integer.parseInt(tInputNumber.getText());
            String[] numb = new String[10];
            for(int i=1;i<=10;i++)
            {
               int multiply=num*i;
               String ab=("\n"+num+"x"+i+"="+multiply+"\n");

               numb[i-1]=ab;
            }

            ttable.setText(Arrays.toString(numb));


        }
        else
        {
            ttable.setText("Noooo!!!");
        }
    }
}
