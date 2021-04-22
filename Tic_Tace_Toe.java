package Game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class Tic_Tace_Toe {

private JFrame frame;
private String startGame = "X";
private int xCount = 0;
private int oCount = 0;
private final JLabel lblNewLabel = new JLabel("Tic Tac Toe");
private JTextField txtxCount;
private JTextField txtoCount;
private JLabel btn_1;
private JLabel btn_2;
private JLabel btn_3;
private JLabel btn_4;
private JLabel btn_5;
private JLabel btn_6;
private JLabel btn_7;
private JLabel btn_8;
private JLabel btn_9;

private void gameScore()
{
txtxCount.setText(String.valueOf(xCount));
txtoCount.setText(String.valueOf(oCount));

}

private void choosePlayer() {
if(startGame.equalsIgnoreCase("X")) {
startGame = "O";
}
else {
startGame = "X";
}
}



private void Winner() {
String b1 = btn_1.getText();
String b2 = btn_2.getText();
String b3 = btn_3.getText();
String b4 = btn_4.getText();
String b5 = btn_5.getText();
String b6 = btn_6.getText();
String b7 = btn_7.getText();
String b8 = btn_8.getText();
String b9 = btn_9.getText();



if (b1==("X") && b2 == ("X") && b3 == ("X"))
       {
           JOptionPane.showMessageDialog(null,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           xCount++;
           gameScore();
       }
       
       if (b4==("X") && b5 == ("X") && b6 == ("X"))
       {
           JOptionPane.showMessageDialog(null,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           xCount++;
           gameScore();
       }
       
       if (b7==("X") && b8 == ("X") && b9 == ("X"))
       {
           JOptionPane.showMessageDialog(null,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           xCount++;
           gameScore();
       }
       
       if (b1==("X") && b4 == ("X") && b7 == ("X"))
       {
           JOptionPane.showMessageDialog(null,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           oCount++;
           gameScore();
       }
       
       if (b2==("X") && b5 == ("X") && b8 == ("X"))
       {
           JOptionPane.showMessageDialog(null,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           xCount++;
           gameScore();
       }
       
       if (b3==("X") && b6 == ("X") && b9 == ("X"))
       {
           JOptionPane.showMessageDialog(null,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           xCount++;
           gameScore();
       }
       
       if (b1==("X") && b5 == ("X") && b9 == ("X"))
       {
           JOptionPane.showMessageDialog(null,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           xCount++;
           gameScore();
       }
       
       if (b3==("X") && b5 == ("X") && b7 == ("X"))
       {
           JOptionPane.showMessageDialog(null,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           xCount++;
           gameScore();
       
       }

if (b1==("O") && b2 == ("O") && b3 == ("O"))
       {
           JOptionPane.showMessageDialog(null,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           oCount++;
           gameScore();
       }
       
       if (b4==("O") && b5 == ("O") && b6 == ("O"))
       {
           JOptionPane.showMessageDialog(null,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           oCount++;
           gameScore();
       }
       
       if (b7==("O") && b8 == ("O") && b9 == ("O"))
       {
           JOptionPane.showMessageDialog(null,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           oCount++;
           gameScore();
       }
       
       if (b1==("O") && b4 == ("O") && b7 == ("O"))
       {
           JOptionPane.showMessageDialog(null,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           oCount++;
           gameScore();
       }
       
       if (b2==("O") && b5 == ("O") && b8 == ("O"))
       {
           JOptionPane.showMessageDialog(null,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           oCount++;
           gameScore();
       }
       
       if (b3==("O") && b6 == ("O") && b9 == ("O"))
       {
           JOptionPane.showMessageDialog(null,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           oCount++;
           gameScore();
       }
       
       if (b1==("O") && b5 == ("O") && b9 == ("O"))
       {
           JOptionPane.showMessageDialog(null,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           oCount++;
           gameScore();
       }
       
       if (b3==("O") && b5 == ("O") && b7 == ("O"))
       {
           JOptionPane.showMessageDialog(null,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           oCount++;
           gameScore();
       
       }
       
       

}






/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Tic_Tace_Toe window = new Tic_Tace_Toe();
window.frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the application.
*/
public Tic_Tace_Toe() {
initialize();

}




/**
* Initialize the contents of the frame.
* @return
*/
 

private void initialize() {
frame = new JFrame();
frame.setBounds(100, 100, 700, 478);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JSeparator separator = new JSeparator();
separator.setBounds(517, 62, -516, -3);
frame.getContentPane().add(separator);



JButton btn_1 = new JButton("");
btn_1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e) {
btn_1.setText(startGame);
btn_1.setFocusable(false);
if(startGame.equalsIgnoreCase("X")) {
btn_1.setForeground(Color.RED);
btn_1.setFont(new Font("Times New Roman",Font.BOLD,30));
}
else {
btn_1.setForeground(Color.BLUE);
btn_1.setFont(new Font("Times New Roman",Font.BOLD,30));
}
choosePlayer();
Winner();

}

});
btn_1.setBounds(20, 81, 85, 80);
frame.getContentPane().add(btn_1);

JButton btn_2 = new JButton("");
btn_2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e) {
btn_2.setText(startGame);
btn_2.setFocusable(false);
if(startGame.equalsIgnoreCase("X")) {
btn_2.setForeground(Color.RED);
btn_2.setFont(new Font("Times New Roman",Font.BOLD,30));
}
else {
btn_2.setForeground(Color.BLUE);
btn_2.setFont(new Font("Times New Roman",Font.BOLD,30));
}
choosePlayer();
Winner();

}

});
btn_2.setBounds(141, 81, 85, 80);
frame.getContentPane().add(btn_2);

JButton btn_3 = new JButton("");
btn_3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e) {
btn_3.setText(startGame);
btn_3.setFocusable(false);
if(startGame.equalsIgnoreCase("X")) {
btn_3.setForeground(Color.RED);
btn_3.setFont(new Font("Times New Roman",Font.BOLD,30));
}
else {
btn_3.setForeground(Color.BLUE);
btn_3.setFont(new Font("Times New Roman",Font.BOLD,30));
}
choosePlayer();
Winner();

}

});
btn_3.setBounds(266, 81, 85, 80);
frame.getContentPane().add(btn_3);

JButton btn_4 = new JButton("");
btn_4.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e) {
btn_4.setText(startGame);
btn_4.setFocusable(false);
if(startGame.equalsIgnoreCase("X")) {
btn_4.setForeground(Color.RED);
btn_4.setFont(new Font("Times New Roman",Font.BOLD,30));
}
else {
btn_4.setForeground(Color.BLUE);
btn_4.setFont(new Font("Times New Roman",Font.BOLD,30));
}
choosePlayer();
Winner();

}

});
btn_4.setBounds(20, 204, 85, 80);
frame.getContentPane().add(btn_4);

JButton btn_5 = new JButton("");
btn_5.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e) {
btn_5.setText(startGame);
btn_5.setFocusable(false);
if(startGame.equalsIgnoreCase("X")) {
btn_5.setForeground(Color.RED);
btn_5.setFont(new Font("Times New Roman",Font.BOLD,30));
}
else {
btn_5.setForeground(Color.BLUE);
btn_5.setFont(new Font("Times New Roman",Font.BOLD,30));
}
choosePlayer();
Winner();

}

});
btn_5.setBounds(141, 204, 85, 80);
frame.getContentPane().add(btn_5);



JButton btn_6 = new JButton("");
btn_6.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e) {
btn_6.setText(startGame);
btn_6.setFocusable(false);
if(startGame.equalsIgnoreCase("X")) {
btn_6.setForeground(Color.RED);
btn_6.setFont(new Font("Times New Roman",Font.BOLD,30));
}
else {
btn_6.setForeground(Color.BLUE);
btn_6.setFont(new Font("Times New Roman",Font.BOLD,30));
}
choosePlayer();
Winner();

}

});


btn_6.setBounds(266, 204, 85, 80);
frame.getContentPane().add(btn_6);

JButton btn_7 = new JButton("");
btn_7.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e) {
btn_7.setText(startGame);
btn_7.setFocusable(false);
if(startGame.equalsIgnoreCase("X")) {
btn_7.setForeground(Color.RED);
btn_7.setFont(new Font("Times New Roman",Font.BOLD,30));
}
else {
btn_7.setForeground(Color.BLUE);
btn_7.setFont(new Font("Times New Roman",Font.BOLD,30));
}
choosePlayer();
Winner();

}

});


btn_7.setBounds(20, 325, 85, 80);
frame.getContentPane().add(btn_7);

JButton btn_8 = new JButton("");
btn_8.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e) {
btn_8.setText(startGame);
btn_8.setFocusable(false);
if(startGame.equalsIgnoreCase("X")) {
btn_8.setForeground(Color.RED);
btn_8.setFont(new Font("Times New Roman",Font.BOLD,30));
}
else {
btn_8.setForeground(Color.BLUE);
btn_8.setFont(new Font("Times New Roman",Font.BOLD,30));
}
choosePlayer();
Winner();

}

});


btn_8.setBounds(141, 325, 85, 80);
frame.getContentPane().add(btn_8);

JButton btn_9 = new JButton("");
btn_9.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e) {
btn_9.setText(startGame);
btn_9.setFocusable(false);
if(startGame.equalsIgnoreCase("X")) {
btn_9.setForeground(Color.RED);
btn_9.setFont(new Font("Times New Roman",Font.BOLD,30));
}
else {
btn_9.setForeground(Color.BLUE);
btn_9.setFont(new Font("Times New Roman",Font.BOLD,30));
}
choosePlayer();
Winner();
}

});

btn_9.setBounds(266, 325, 85, 80);
frame.getContentPane().add(btn_9);
lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
lblNewLabel.setBounds(299, 3, 163, 35);
frame.getContentPane().add(lblNewLabel);

JLabel lblPlayer1 = new JLabel("Player 1");
lblPlayer1.setFont(new Font("Times New Roman", Font.BOLD, 18));
lblPlayer1.setBounds(407, 81, 129, 35);
frame.getContentPane().add(lblPlayer1);

txtxCount = new JTextField();
txtxCount.setHorizontalAlignment(SwingConstants.CENTER);
txtxCount.setFont(new Font("Times New Roman", Font.BOLD, 24));
txtxCount.setText("0");
txtxCount.setBounds(546, 81, 130, 35);
frame.getContentPane().add(txtxCount);
txtxCount.setColumns(10);

JLabel Player_2 = new JLabel("Player 2");
Player_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
Player_2.setBounds(407, 126, 129, 35);
frame.getContentPane().add(Player_2);

txtoCount = new JTextField();
txtoCount.setText("0");
txtoCount.setFont(new Font("Times New Roman", Font.BOLD, 24));
txtoCount.setHorizontalAlignment(SwingConstants.CENTER);
txtoCount.setColumns(10);
txtoCount.setBounds(546, 126, 130, 35);
frame.getContentPane().add(txtoCount);

JButton New_Game = new JButton("New Game");
New_Game.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e) {


btn_1.setText(null);
btn_2.setText(null);
btn_3.setText(null);
btn_4.setText(null);
btn_5.setText(null);
btn_6.setText(null);
btn_7.setText(null);
btn_8.setText(null);
btn_9.setText(null);
}
});
New_Game.setFont(new Font("Times New Roman", Font.BOLD, 18));
New_Game.setBounds(416, 235, 197, 49);
frame.getContentPane().add(New_Game);

JButton Exit = new JButton("Exit");
Exit.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent arg0) {
frame = new JFrame("Exit");
if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit", "Tic Tac Toe",
JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {

System.exit(0);
}
}

});
Exit.setFont(new Font("Times New Roman", Font.BOLD, 18));
Exit.setBounds(416, 339, 197, 49);
frame.getContentPane().add(Exit);
}

}