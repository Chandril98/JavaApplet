import java.applet.*; // applet package
import java.awt.*;
import java.awt.event.*; // to handle all the actions like buttons and methodes


 public class JavaCalc extends Applet implements ActionListener 
{
	 TextField T1,T2,T3;
	 Label L1,L2,L3;                   // variables
	 Button B1,B2,B3,B4;
	 
	 
    
            
	public void init()
	
	{
		setLayout(null);
		setBackground(Color.magenta);
	  
	   L1= new Label(" Enter First value: ");
	   L2= new Label(" Enter Second value: "); // Give them some names, they are not just variables anymore 
	   L3= new Label(" Result ");
	    
	    L1.setBounds (50,100,100,20);
	    L2.setBounds (50,140,100,20); // you don't want them to float on the page, so make some boundary for them
	    L3.setBounds (50,250,100,20);
	
	   T1=new TextField();
	   T2=new TextField();// to make the text-boxes ..  you can creat many more but i don't get too much excited
	   T3=new TextField();

		T1.setBounds (200,100,100,20);
		T2.setBounds (200,140,100,20);// they also need some boundaries
		T3.setBounds (200,250,100,20);	
	   
	   B1=new Button( "+" );
	   B2=new Button( "-" );// creat as much button u need .. just dont make self destract button 
	   B3=new Button( "*" );
	   B4=new Button( "/" );
	
                B1.setBounds (50,200,50,20);
	        B2.setBounds (110,200,50,20);
		B3.setBounds (170,200,50,20);// again boundaries .. boaring but u don't have to think much 
		B4.setBounds (230,200,50,20);
		
		
		
		add(L1);
		add(L2);
		add(L3);
		
		add(T1);                       // Now add everything on the frame 
		add(T2);
		add(T3);
		
		add(B1);
		add(B2);
		add(B3);
		add(B4);
		
		
		B1.addActionListener(this);             // "this" is a constructer .. I think you know that
		B2.addActionListener(this);
		B3.addActionListener(this);            // ActionListener is a interface .. we had it at line 6 .. u didn't notice ? it's ok
		B4.addActionListener(this);
		
		
		
		
    }
		
      public void actionPerformed (ActionEvent e)
		{
			int n1=Integer.parseInt(T1.getText());  
			int n2=Integer.parseInt(T2.getText());  // java don't recognise strings .. so u have to spoonfeed it with string to integer command
			
			if(e.getSource()==B1)
			{
				T3.setText(String.valueOf(n1+n2)); // addition method
			}
			
			if(e.getSource()==B2)
			{
				T3.setText(String.valueOf(n1-n2)); // substraction method
			}
			if(e.getSource()==B3)
			{
				T3.setText(String.valueOf(n1*n2)); // multiplication method
			}
			if(e.getSource()==B4)
			{
				T3.setText(String.valueOf(n1/n2)); // division method
			}
			
		}
		
	
	
} 
