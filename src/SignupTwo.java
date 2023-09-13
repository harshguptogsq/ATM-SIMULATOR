
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{

    long random;
    JTextField panTextField,aadharTextField;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox<String> religion,category,occupation,education,income;
    String formno;

    SignupTwo(String formno)
    {
        this.formno=formno;
        setLayout(null);

        setTitle("NEW ACCOUNT APPILICATION FORM - PAGE 2");

        JLabel additionalDetails=new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);

        JLabel name=new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        String valReligion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        religion=new JComboBox<>(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        JLabel fname=new JLabel("Category:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

        String valCategory[]={"General","OBC","SC","ST","Other"};
        category= new JComboBox<>(valCategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);


        JLabel dob=new JLabel("Income:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

        String incomeCategory[]={"NULL","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
        income= new JComboBox<>(incomeCategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel gender=new JLabel("Educational");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);

        JLabel email=new JLabel("Qualification:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);

        String educationValues[]={"Non Gradudate","Graduate","Post Graduate","Doctrate","Others"};
        education= new JComboBox<>(educationValues);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);

        JLabel marital=new JLabel("Occupation:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);

        String occupationValues[]={"Salaried","Self-Employed","Bussiness","Student","Retired","Others"};
        occupation= new JComboBox<>(occupationValues);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        JLabel pan=new JLabel("Pan Number:");
        pan.setFont(new Font("Raleway",Font.BOLD,20));
        pan.setBounds(100,440,200,30);
        add(pan);

        panTextField=new JTextField();
        panTextField.setFont(new Font("Raleway",Font.BOLD,14));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);

        JLabel aadhar=new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway",Font.BOLD,20));
        aadhar.setBounds(100,490,200,30);
        add(aadhar);

        aadharTextField=new JTextField();
        aadharTextField.setFont(new Font("Raleway",Font.BOLD,14));
        aadharTextField.setBounds(300,490,400,30);
        add(aadharTextField);

        JLabel state=new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);

        syes=new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno=new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup seniorgroup =new ButtonGroup();
        seniorgroup.add(syes);
        seniorgroup.add(sno);

        JLabel pincode=new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);

        eyes=new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno=new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup ismember =new ButtonGroup();
        ismember.add(eyes);
        ismember.add(eno);

        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,645,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible (true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String sreligion = (String) religion.getSelectedItem();
        String scategory=(String) category.getSelectedItem();
        String sincome= (String) income.getSelectedItem();
        String seducation= (String) education.getSelectedItem();
        String soccupation=(String) occupation.getSelectedItem();

        String seniorcitizen=null;
        if(syes.isSelected())
            seniorcitizen="Yes";
        else if(sno.isSelected())
            seniorcitizen="No";
        else seniorcitizen="";

        String existAccount=null;
        if(eyes.isSelected())
            existAccount="Yes";
        else if(eno.isSelected())
            existAccount="No";
        else existAccount="";

        String span=panTextField.getText();
        String saadhar=aadharTextField.getText();

        try
        {
            // if(name.equals(""))
            //     JOptionPane.showMessageDialog(null, "Nmae is Required");

            // else if(fname.equals(""))
            //     JOptionPane.showMessageDialog(null, "Father's Nmae is Required");

            // else if(dob.equals(""))
            //     JOptionPane.showMessageDialog(null, "DOB is Required");

            // else if(gender.equals(""))
            //     JOptionPane.showMessageDialog(null, "GENDER is Required");

            // else if(email.equals(""))
            //     JOptionPane.showMessageDialog(null, "email is Required");

            // else if(marital.equals(""))
            //     JOptionPane.showMessageDialog(null, "MARITAL is Required");

            // else if(address.equals(""))
            //     JOptionPane.showMessageDialog(null, "ADDRESS is Required");

            // else if(city.equals(""))
            //     JOptionPane.showMessageDialog(null, "CITY Nmae is Required");

            // else if(state.equals(""))
            //     JOptionPane.showMessageDialog(null, "STATE Nmae is Required");

            // else if(pin.equals(""))
            //     JOptionPane.showMessageDialog(null, "PIN CODE is Required");

            // else
            // {
                Conn c=new Conn();
                String query="insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"','"+existAccount+"')";
                c.s.executeUpdate(query);

                setVisible(false);
                new SignupThree(formno).setVisible(true);


            //}
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }

    public static void main(String args[])
    {
        new SignupTwo("");
    }
    
}
