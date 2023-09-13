import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class MiniStatement extends JFrame{

    //String pinnumber;

    MiniStatement(String pinnumber)
    {
        //this.pinnumber=pinnumber;
        setLayout(null);
        setTitle("Mini Statement");

        JLabel mini=new JLabel();
        mini.setBounds(20, 140, 400, 200);
        add(mini);

        JLabel bank=new JLabel("HDFC Bank");
        bank.setBounds(150, 20, 100, 20);
        add(bank);

        JLabel card=new JLabel();
        card.setBounds(20, 80, 300, 20);
        add(card);

        JLabel balance=new JLabel();
        balance.setBounds(20, 400, 300, 20);
        add(balance);

        try
        {
            Conn conn=new Conn();
            ResultSet res=conn.s.executeQuery("select * from login where pin = '"+pinnumber+"'");
            while(res.next())
            {
                card.setText("Card Number: "+res.getString("cardnumber").substring(0,4)+"XXXXXXXX"+res.getString("cardnumber").substring(12));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }


        try
        {
            Conn conn=new Conn();
            int amt=0;
            ResultSet res=conn.s.executeQuery("select * from bankd where pin = '"+pinnumber+"'");
            while(res.next())
            {
                mini.setText(mini.getText()+ "<html>" +res.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + res.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+res.getString("amount")+"<br><br><html>");
                if(res.getString("type").equals("Deposite"))
                    {
                        amt += Integer.parseInt(res.getString("amount"));
                    }
                else
                    {
                        amt -=Integer.parseInt(res.getString("amount"));
                    }
            }
            balance.setText("Your current balance is Rs: "+amt);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        
        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MiniStatement("");
    }
}
