import java.awt.*;
import java.awt.event.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Random;

import javax.swing.*;
public class fingerguessinggame {
	static boolean st=false;
	static JFrame frm = new JFrame("paper!scissors!stone!");
	static Label Players=new Label("Player ",Label.CENTER);
	static Label computer=new Label("Computer ",Label.CENTER);
	static JButton Playersres = new JButton();
	static JButton computerres= new JButton();
	static Label judgeres = new Label("",Label.CENTER);	
	static Label NumberofBoard = new Label("Inning：",Label.CENTER);
	static Label drawn = new Label("Tie：",Label.CENTER);
	static Label Lose = new Label("You Lose：",Label.CENTER);
	static Label Win = new Label("You win：",Label.CENTER);
	static Button end = new Button("End");
	static Button con = new Button("Continue");
	static URL urlscissor,urlpaper,urlrock ;
	static ImageIcon Scissor,paper,rock,PScissor,Ppaper,Prock;
	static URL Purlscissor,Purlpaper,Purlrock ;
	public static void main(String[] args) {
		int C=1;
		int b=0;
		Label NumberofBoard1 = new Label(""+C,Label.CENTER);
		Label drawn1 = new Label(""+b,Label.CENTER);
		Label Lose1 = new Label(""+b,Label.CENTER);
		Label Win1 = new Label(""+b,Label.CENTER);
		computerres.setEnabled(false);
		Playersres.setEnabled(false);
		//視窗設置大小及顏色
		frm.setSize(900,650);
		frm.getContentPane().setBackground(Color.cyan);
		frm.setLayout(null);
		try {
			//電腦
			 urlscissor= fingerguessinggame.class.getResource("剪刀.png");
			 urlpaper = fingerguessinggame.class.getResource("布.png");
			 urlrock = fingerguessinggame.class.getResource("石頭.png");
			 Scissor= new ImageIcon(urlscissor);
			 paper= new ImageIcon(urlpaper);
			 rock= new ImageIcon(urlrock );
			//玩家 
			 Purlscissor= fingerguessinggame.class.getResource("剪刀.jpg");
			 Purlpaper = fingerguessinggame.class.getResource("布.jpg");
			 Purlrock = fingerguessinggame.class.getResource("石頭.jpg");
			 PScissor= new ImageIcon(Purlscissor);
			 Ppaper= new ImageIcon(Purlpaper);
			 Prock= new ImageIcon(Purlrock);	 
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Random rdm;
		rdm=new Random();
		//玩家設置
         Players.setBounds(150, 80, 200, 35);
         Players.setBackground(Color.BLACK);
         Font fontplayer = new Font(Font.DIALOG_INPUT, Font.BOLD, 20);
         Players.setFont(fontplayer);
         Players.setForeground(Color.white);
         //電腦設置
         computer.setBounds(550, 80, 200,35);
         computer.setBackground(Color.BLACK);
         Font fontcomputer = new Font(Font.DIALOG_INPUT, Font.BOLD,20);
         computer.setFont(fontcomputer);
         computer.setForeground(Color.white);
         Font fontres = new Font(Font.DIALOG, Font.BOLD, 30);
         judgeres.setFont(fontres);
	    //按鈕(剪刀)
	    JButton Scissorjbutton1 = new JButton();
	    Scissorjbutton1.setSize(89,83);
	    Scissorjbutton1.setLocation(200, 135);
	    Scissorjbutton1.setIcon(PScissor);
	    frm.add(Scissorjbutton1);
	    //按鈕(石頭)
	    frm.setLayout(null);
	    JButton rockjbutton2 = new JButton( );
	    rockjbutton2.setSize(89,83);
	    rockjbutton2.setLocation(305,135);
	    rockjbutton2.setIcon(Prock);
	    frm.add(rockjbutton2);
	    //按鈕(布)
	    JButton paperjbutton = new JButton( );
	    paperjbutton.setSize(82,83);
	    paperjbutton.setLocation(100, 135);
	    paperjbutton.setIcon(Ppaper);
	    frm.add(paperjbutton);
	    //玩家結果顯示區設置
	    Playersres.setBounds(140, 240, 226, 210);
	    Playersres.setBackground(Color.white);	
	  	//電腦結果顯示區設置	
	    computerres.setBounds(535, 240, 226, 210);
	    computerres.setBackground(Color.white);	
	  	//輸贏顯示區
	    judgeres.setBounds(205, 470,500, 50);
	    judgeres.setBackground(Color.white);
	    Font fontNumberofBoard7 = new Font(Font.DIALOG_INPUT, Font.BOLD, 30);
	    judgeres.setFont(fontNumberofBoard7);
	  	//結束按鈕
	  	end.setBounds(250, 550, 150, 30);
	  	end.setBackground(Color.BLACK);	
	  	end.setForeground(Color.white);
	  	Font fontNumberofBoard4 = new Font(Font.DIALOG_INPUT, Font.BOLD, 20 );
	  	end.setFont(fontNumberofBoard4);
	  	//繼續按鈕
	  	con.setBounds(500, 550, 150, 30);
	  	con.setBackground(Color.BLACK);	
	  	con.setForeground(Color.white);
	  	Font fontNumberofBoard6 = new Font(Font.DIALOG_INPUT, Font.BOLD, 20);
	  	con.setFont(fontNumberofBoard6);
	  	//局數
	  	NumberofBoard.setBounds(80, 0, 90, 30);
	  	NumberofBoard.setBackground(Color.cyan);	
	  	NumberofBoard.setForeground(Color.BLACK);
	  	Font fontNumberofBoard = new Font(Font.DIALOG_INPUT, Font.BOLD, 20 );
	  	NumberofBoard.setFont(fontNumberofBoard);
	  	NumberofBoard1.setBounds(170, 0, 35, 30);
	  	NumberofBoard1.setBackground(Color.cyan);	
	  	NumberofBoard1.setForeground(Color.BLACK);
	  	Font fontNumberofBoard1 = new Font(Font.DIALOG, Font.BOLD, 20);
	  	NumberofBoard1.setFont(fontNumberofBoard1);	  	
	  	//贏的次數	  	
	  	Win.setBounds(260, 0, 115, 30);
		Win.setBackground(Color.cyan);	
		Win.setForeground(Color.BLUE);
	  	Font fontWin = new Font(Font.DIALOG_INPUT, Font.BOLD, 20);
	  	Win.setFont(fontWin);
	  	Win1.setBounds(375,0, 35, 30);
		Win1.setBackground(Color.cyan);	
		Win1.setForeground(Color.BLUE);
	  	Font fontWin1 = new Font(Font.DIALOG, Font.BOLD, 20);
	  	Win1.setFont(fontWin1);
	  	
	  	//輸的次數		
		Lose.setBounds(480, 0, 120, 30);
		Lose.setBackground(Color.cyan);	
		Lose.setForeground(Color.RED);
	  	Font fontLose = new Font(Font.DIALOG_INPUT, Font.BOLD, 20);
	  	Lose.setFont(fontLose); 
	  	Lose1.setBounds(605,0, 35, 30);
	  	Lose1.setBackground(Color.cyan);	
	  	Lose1.setForeground(Color.RED);
	  	Font fontLose1 = new Font(Font.DIALOG, Font.BOLD, 20);
	  	Lose1.setFont(fontLose1);
		
		//和局次數
		drawn.setBounds(700, 0, 55, 30);
		drawn.setBackground(Color.cyan);	
		drawn.setForeground(Color.black);
	  	Font fontdrawn = new Font(Font.DIALOG_INPUT, Font.BOLD,20);
	  	drawn.setFont(fontdrawn); 
	  	drawn1.setBounds(760, 0, 35, 30);
		drawn1.setBackground(Color.cyan);	
		drawn1.setForeground(Color.BLACK);
	  	Font fontdrawn1 = new Font(Font.DIALOG, Font.BOLD,20);
	  	drawn1.setFont(fontdrawn1); 
		
	  	
		
	  	rockjbutton2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Playersres.setIcon(rock);
				st=true;
				int com;
				com=rdm.nextInt(3);
				showres(judgment(2,comturn(com)));
				
				//System.out.println(""+comturn(com));
				paperjbutton.setEnabled(false);
				Scissorjbutton1.setEnabled(false);
				rockjbutton2.setEnabled(false);
				if(comturn(com)==1)
				{
					int b=Integer.parseInt(Win1.getText());
					b++;
					Win1.setText(""+b);
				}
				else if(comturn(com)==2)
				{
					int b=Integer.parseInt(drawn1.getText());
					b++;
					drawn1.setText(""+b);
				}
				else
				{
					int b=Integer.parseInt(Lose1.getText());
					b++;
					Lose1.setText(""+b);
				}
				
			}});
	  	Scissorjbutton1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				Playersres.setIcon(Scissor);
				st=true;
				int com;
				com=rdm.nextInt(3);
				showres(judgment(1,comturn(com)));
				//System.out.println(""+comturn(com));
				paperjbutton.setEnabled(false);
				Scissorjbutton1.setEnabled(false);
				rockjbutton2.setEnabled(false);
				if(comturn(com)==0)
				{
					int b=Integer.parseInt(Win1.getText());
					b++;
					Win1.setText(""+b);
				}
				else if(comturn(com)==1)
				{
					int b=Integer.parseInt(drawn1.getText());
					b++;
					drawn1.setText(""+b);
				}
				else
				{
					int b=Integer.parseInt(Lose1.getText());
					b++;
					Lose1.setText(""+b);
				}
			}});
	  	paperjbutton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Playersres.setIcon( paper);
				st=true;
				int com;
				com=rdm.nextInt(3);
				showres(judgment(0,comturn(com)));
				//System.out.println(""+comturn(com));
				paperjbutton.setEnabled(false);
				Scissorjbutton1.setEnabled(false);
				rockjbutton2.setEnabled(false);
				if(comturn(com)==2)
				{
					int b=Integer.parseInt(Win1.getText());
					b++;
					Win1.setText(""+b);
				}
				else if(comturn(com)==0)
				{
					int b=Integer.parseInt(drawn1.getText());
					b++;
					drawn1.setText(""+b);
				}
				else
				{
					int b=Integer.parseInt(Lose1.getText());
					b++;
					Lose1.setText(""+b);
				}
			}});
	  
	  	
		frm.add(Players);
		frm.add(computer);
		frm.add(Playersres);
		frm.add(computerres);
		frm.add(judgeres);
		frm.add(end);
		frm.add(Win);
		frm.add(drawn);		
		frm.add(Lose);
		frm.add(Win1);
		frm.add(drawn1);	
		frm.add(Lose1);
		frm.add(con);
		frm.add(NumberofBoard);
		frm.add(NumberofBoard1);
		
		
		frm.setVisible(true);
		//按結束離開
		end.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}			
		});
		  //視窗關閉事件
	    frm.addWindowListener(new WindowAdapter()
	    {
	      public void windowClosing(WindowEvent e)
	      {
	        System.exit(0);
	      }
	    });
	    con.addActionListener(new ActionListener (){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub			
				Playersres.setIcon(null);
				computerres.setIcon(null);
				judgeres.setText(null);
				paperjbutton.setEnabled(true);
				Scissorjbutton1.setEnabled(true);
				rockjbutton2.setEnabled(true);
				st=false;
				int C=Integer.parseInt(NumberofBoard1.getText());
				C++;
				NumberofBoard1.setText(""+C);
				
			}});
		animate();
		
		
	}
	//電腦出牌
	public static int comturn(int i)
	{
		switch(i)
		{
			case 0:
				computerres.setIcon(paper);
			break;
			case 1:
				computerres.setIcon(Scissor);
			break;
			case 2:
				computerres.setIcon(rock);
			break;
		}
		return i;
	}
	//電腦動畫
	public static void animate()
	{
		  int i=0;
		    
		    while(true)
		    {
		    	if(i<3)
		    		i++;
		    	else
		    		i=0;
		    	try {
		    		if(!st)
		    		switch(i)
		    		{
		    		case 0:
		    			computerres.setIcon(paper);
		    			break;
		    		case 1:
		    			computerres.setIcon(Scissor);
		    			break;
		    		case 2:
		    			computerres.setIcon(rock);
		    			break;
		    		}		    				    		
					Thread.sleep(50);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		    }
	}
	//判斷勝負
	public static int judgment(int player,int computer)
	{
		int is=-1;
		//0布 1剪刀 2石頭 
		//0=玩家贏 1平手 2玩家輸
		if(player==0)//布
		{
			switch(computer)
			{
				case 0://0布
					is=1;
					break;
				case 1:
					is=2;//1剪刀
					break;
				case 2://2石頭
					is=0;
					break;
			}
		}
		else if(player==1)//剪刀
		{
			switch(computer)
			{
				case 0:
					is=0;
					break;
				case 1:
					is=1;
					break;
				case 2:
					is=2;
					break;
			}
		}
		else //石頭
		{
			switch(computer)
			{
				case 0:
					is=2;
					break;
				case 1:
					is=0;
					break;
				case 2:
					is=1;
					break;
			}
		}
		return is;
	}

	public static void showres(int i)
	{
		//0=玩家贏 1平手 2玩家輸
		switch(i)
		{
			case 0:
				judgeres.setText("You Win ! ! ! !");
				
				break;
			case 1:
				judgeres.setText("The game has tie ! ! ! !");
				break;
			case 2:
				judgeres.setText("You Lose ! ! ! !");
				break;
		}
	}
	
	

}
