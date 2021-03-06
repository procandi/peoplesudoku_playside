import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;


public class playboard extends JFrame {

	private JPanel contentPane;
	private JTextField textKeyinValue;
	
	/*記錄電腦是否有求出解答*/
	boolean computerresult;
	
	/*每個位置是否能按的陣列*/
	boolean[] slck=new boolean[82];
	
	/*儲存結果的多維陣列*/
	String[][][][] res=new String[4][4][4][4];
	
	JButton button1111 = new JButton("   ");
	JButton button1121 = new JButton("   ");
	JButton button1131 = new JButton("   ");
	JButton button1112 = new JButton("   ");
	JButton button1122 = new JButton("   ");
	JButton button1132 = new JButton("   ");
	JButton button1113 = new JButton("   ");
	JButton button1123 = new JButton("   ");
	JButton button1133 = new JButton("   ");
	JButton button2111 = new JButton("   ");
	JButton button2121 = new JButton("   ");
	JButton button2131 = new JButton("   ");
	JButton button2112 = new JButton("   ");
	JButton button2122 = new JButton("   ");
	JButton button2132 = new JButton("   ");
	JButton button2113 = new JButton("   ");
	JButton button2123 = new JButton("   ");
	JButton button2133 = new JButton("   ");
	JButton button3111 = new JButton("   ");
	JButton button3121 = new JButton("   ");
	JButton button3131 = new JButton("   ");
	JButton button3112 = new JButton("   ");
	JButton button3122 = new JButton("   ");
	JButton button3132 = new JButton("   ");
	JButton button3113 = new JButton("   ");
	JButton button3123 = new JButton("   ");
	JButton button3133 = new JButton("   ");
	JButton button1211 = new JButton("   ");
	JButton button1221 = new JButton("   ");
	JButton button1231 = new JButton("   ");
	JButton button1212 = new JButton("   ");
	JButton button1222 = new JButton("   ");
	JButton button1232 = new JButton("   ");
	JButton button1213 = new JButton("   ");
	JButton button1223 = new JButton("   ");
	JButton button1233 = new JButton("   ");
	JButton button2211 = new JButton("   ");
	JButton button2221 = new JButton("   ");
	JButton button2231 = new JButton("   ");
	JButton button2212 = new JButton("   ");
	JButton button2222 = new JButton("   ");
	JButton button2232 = new JButton("   ");
	JButton button2213 = new JButton("   ");
	JButton button2223 = new JButton("   ");
	JButton button2233 = new JButton("   ");
	JButton button3211 = new JButton("   ");
	JButton button3221 = new JButton("   ");
	JButton button3231 = new JButton("   ");
	JButton button3212 = new JButton("   ");
	JButton button3222 = new JButton("   ");
	JButton button3232 = new JButton("   ");
	JButton button3213 = new JButton("   ");
	JButton button3223 = new JButton("   ");
	JButton button3233 = new JButton("   ");
	JButton button1311 = new JButton("   ");
	JButton button1321 = new JButton("   ");
	JButton button1331 = new JButton("   ");
	JButton button1312 = new JButton("   ");
	JButton button1322 = new JButton("   ");
	JButton button1332 = new JButton("   ");
	JButton button1313 = new JButton("   ");
	JButton button1323 = new JButton("   ");
	JButton button1333 = new JButton("   ");
	JButton button2311 = new JButton("   ");
	JButton button2321 = new JButton("   ");
	JButton button2331 = new JButton("   ");
	JButton button2312 = new JButton("   ");
	JButton button2322 = new JButton("   ");
	JButton button2332 = new JButton("   ");
	JButton button2313 = new JButton("   ");
	JButton button2323 = new JButton("   ");
	JButton button2333 = new JButton("   ");
	JButton button3311 = new JButton("   ");
	JButton button3321 = new JButton("   ");
	JButton button3331 = new JButton("   ");
	JButton button3312 = new JButton("   ");
	JButton button3322 = new JButton("   ");
	JButton button3332 = new JButton("   ");
	JButton button3313 = new JButton("   ");
	JButton button3323 = new JButton("   ");
	JButton button3333 = new JButton("   ");

	
	/*讀取編輯的遊戲面版*/
	public static void loadtemplate(){
		int i;
		String[] s=new String[82];
		String templatebody;
		
		templatebody=clsFile.ReadTextFile(application.targettemplate+".sudoku");
		for(i=1;i<82;i++){
			s[i]=Integer.toString(templatebody.charAt(i)-48);
			if(s[i].equals("0")){
				s[i]="   ";
				application.frmpb.slck[i]=false;
			}else{
				application.frmpb.slck[i]=true;
			}
		}
		
		application.frmpb.button1111.setText(s[1]);
		application.frmpb.res[1][1][1][1]=s[1];
		application.frmpb.button1112.setText(s[2]);
		application.frmpb.res[1][1][1][2]=s[2];
		application.frmpb.button1113.setText(s[3]);
		application.frmpb.res[1][1][1][3]=s[3];
		application.frmpb.button1121.setText(s[4]);
		application.frmpb.res[1][1][2][1]=s[4];
		application.frmpb.button1122.setText(s[5]);
		application.frmpb.res[1][1][2][2]=s[5];
		application.frmpb.button1123.setText(s[6]);
		application.frmpb.res[1][1][2][3]=s[6];
		application.frmpb.button1131.setText(s[7]);
		application.frmpb.res[1][1][3][1]=s[7];
		application.frmpb.button1132.setText(s[8]);
		application.frmpb.res[1][1][3][2]=s[8];
		application.frmpb.button1133.setText(s[9]);
		application.frmpb.res[1][1][3][3]=s[9];
		
		application.frmpb.button1211.setText(s[10]);
		application.frmpb.res[1][2][1][1]=s[10];
		application.frmpb.button1212.setText(s[11]);
		application.frmpb.res[1][2][1][2]=s[11];
		application.frmpb.button1213.setText(s[12]);
		application.frmpb.res[1][2][1][3]=s[12];
		application.frmpb.button1221.setText(s[13]);
		application.frmpb.res[1][2][2][1]=s[13];
		application.frmpb.button1222.setText(s[14]);
		application.frmpb.res[1][2][2][2]=s[14];
		application.frmpb.button1223.setText(s[15]);
		application.frmpb.res[1][2][2][3]=s[15];
		application.frmpb.button1231.setText(s[16]);
		application.frmpb.res[1][2][3][1]=s[16];
		application.frmpb.button1232.setText(s[17]);
		application.frmpb.res[1][2][3][2]=s[17];
		application.frmpb.button1233.setText(s[18]);
		application.frmpb.res[1][2][3][3]=s[18];
		application.frmpb.button1311.setText(s[19]);
		application.frmpb.res[1][3][1][1]=s[19];
		application.frmpb.button1312.setText(s[20]);
		application.frmpb.res[1][3][1][2]=s[20];
		application.frmpb.button1313.setText(s[21]);
		application.frmpb.res[1][3][1][3]=s[21];
		application.frmpb.button1321.setText(s[22]);
		application.frmpb.res[1][3][2][1]=s[22];
		application.frmpb.button1322.setText(s[23]);
		application.frmpb.res[1][3][2][2]=s[23];
		application.frmpb.button1323.setText(s[24]);
		application.frmpb.res[1][3][2][3]=s[24];
		application.frmpb.button1331.setText(s[25]);
		application.frmpb.res[1][3][3][1]=s[25];
		application.frmpb.button1332.setText(s[26]);
		application.frmpb.res[1][3][3][2]=s[26];
		application.frmpb.button1333.setText(s[27]);
		application.frmpb.res[1][3][3][3]=s[27];
		
		application.frmpb.button2111.setText(s[28]);
		application.frmpb.res[2][1][1][1]=s[28];
		application.frmpb.button2112.setText(s[29]);
		application.frmpb.res[2][1][1][2]=s[29];
		application.frmpb.button2113.setText(s[30]);
		application.frmpb.res[2][1][1][3]=s[30];
		application.frmpb.button2121.setText(s[31]);
		application.frmpb.res[2][1][2][1]=s[31];
		application.frmpb.button2122.setText(s[32]);
		application.frmpb.res[2][1][2][2]=s[32];
		application.frmpb.button2123.setText(s[33]);
		application.frmpb.res[2][1][2][3]=s[33];
		application.frmpb.button2131.setText(s[34]);
		application.frmpb.res[2][1][3][1]=s[34];
		application.frmpb.button2132.setText(s[35]);
		application.frmpb.res[2][1][3][2]=s[35];
		application.frmpb.button2133.setText(s[36]);
		application.frmpb.res[2][1][3][3]=s[36];
		
		application.frmpb.button2211.setText(s[37]);
		application.frmpb.res[2][2][1][1]=s[37];
		application.frmpb.button2212.setText(s[38]);
		application.frmpb.res[2][2][1][2]=s[38];
		application.frmpb.button2213.setText(s[39]);
		application.frmpb.res[2][2][1][3]=s[39];
		application.frmpb.button2221.setText(s[40]);
		application.frmpb.res[2][2][2][1]=s[40];
		application.frmpb.button2222.setText(s[41]);
		application.frmpb.res[2][2][2][2]=s[41];
		application.frmpb.button2223.setText(s[42]);
		application.frmpb.res[2][2][2][3]=s[42];
		application.frmpb.button2231.setText(s[43]);
		application.frmpb.res[2][2][3][1]=s[43];
		application.frmpb.button2232.setText(s[44]);
		application.frmpb.res[2][2][3][2]=s[44];
		application.frmpb.button2233.setText(s[45]);
		application.frmpb.res[2][2][3][3]=s[45];
		
		application.frmpb.button2311.setText(s[46]);
		application.frmpb.res[2][3][1][1]=s[46];
		application.frmpb.button2312.setText(s[47]);
		application.frmpb.res[2][3][1][2]=s[47];
		application.frmpb.button2313.setText(s[48]);
		application.frmpb.res[2][3][1][3]=s[48];
		application.frmpb.button2321.setText(s[49]);
		application.frmpb.res[2][3][2][1]=s[49];
		application.frmpb.button2322.setText(s[50]);
		application.frmpb.res[2][3][2][2]=s[50];
		application.frmpb.button2323.setText(s[51]);
		application.frmpb.res[2][3][2][3]=s[51];
		application.frmpb.button2331.setText(s[52]);
		application.frmpb.res[2][3][3][1]=s[52];
		application.frmpb.button2332.setText(s[53]);
		application.frmpb.res[2][3][3][2]=s[53];
		application.frmpb.button2333.setText(s[54]);
		application.frmpb.res[2][3][3][3]=s[54];
		
		application.frmpb.button3111.setText(s[55]);
		application.frmpb.res[3][1][1][1]=s[55];
		application.frmpb.button3112.setText(s[56]);
		application.frmpb.res[3][1][1][2]=s[56];
		application.frmpb.button3113.setText(s[57]);
		application.frmpb.res[3][1][1][3]=s[57];
		application.frmpb.button3121.setText(s[58]);
		application.frmpb.res[3][1][2][1]=s[58];
		application.frmpb.button3122.setText(s[59]);
		application.frmpb.res[3][1][2][2]=s[59];
		application.frmpb.button3123.setText(s[60]);
		application.frmpb.res[3][1][2][3]=s[60];
		application.frmpb.button3131.setText(s[61]);
		application.frmpb.res[3][1][3][1]=s[61];
		application.frmpb.button3132.setText(s[62]);
		application.frmpb.res[3][1][3][2]=s[62];
		application.frmpb.button3133.setText(s[63]);
		application.frmpb.res[3][1][3][3]=s[63];
		
		application.frmpb.button3211.setText(s[64]);
		application.frmpb.res[3][2][1][1]=s[64];
		application.frmpb.button3212.setText(s[65]);
		application.frmpb.res[3][2][1][2]=s[65];
		application.frmpb.button3213.setText(s[66]);
		application.frmpb.res[3][2][1][3]=s[66];
		application.frmpb.button3221.setText(s[67]);
		application.frmpb.res[3][2][2][1]=s[67];
		application.frmpb.button3222.setText(s[68]);
		application.frmpb.res[3][2][2][2]=s[68];
		application.frmpb.button3223.setText(s[69]);
		application.frmpb.res[3][2][2][3]=s[69];
		application.frmpb.button3231.setText(s[70]);
		application.frmpb.res[3][2][3][1]=s[70];
		application.frmpb.button3232.setText(s[71]);
		application.frmpb.res[3][2][3][2]=s[71];
		application.frmpb.button3233.setText(s[72]);
		application.frmpb.res[3][2][3][3]=s[72];
		
		application.frmpb.button3311.setText(s[73]);
		application.frmpb.res[3][3][1][1]=s[73];
		application.frmpb.button3312.setText(s[74]);
		application.frmpb.res[3][3][1][2]=s[74];
		application.frmpb.button3313.setText(s[75]);
		application.frmpb.res[3][3][1][3]=s[75];
		application.frmpb.button3321.setText(s[76]);
		application.frmpb.res[3][3][2][1]=s[76];
		application.frmpb.button3322.setText(s[77]);
		application.frmpb.res[3][3][2][2]=s[77];
		application.frmpb.button3323.setText(s[78]);
		application.frmpb.res[3][3][2][3]=s[78];
		application.frmpb.button3331.setText(s[79]);
		application.frmpb.res[3][3][3][1]=s[79];
		application.frmpb.button3332.setText(s[80]);
		application.frmpb.res[3][3][3][2]=s[80];
		application.frmpb.button3333.setText(s[81]);
		application.frmpb.res[3][3][3][3]=s[81];
		
	}
	
	
	/*清除編輯的遊戲面版*/
	public static void cleartemplate(){
		int i;
		
		for(i=1;i<82;i++){
			application.frmpb.slck[i]=false;
		}
		
		application.frmpb.button1111.setText("   ");
		application.frmpb.res[1][1][1][1]="   ";
		application.frmpb.button1112.setText("   ");
		application.frmpb.res[1][1][1][2]="   ";
		application.frmpb.button1113.setText("   ");
		application.frmpb.res[1][1][1][3]="   ";
		application.frmpb.button1121.setText("   ");
		application.frmpb.res[1][1][2][1]="   ";
		application.frmpb.button1122.setText("   ");
		application.frmpb.res[1][1][2][2]="   ";
		application.frmpb.button1123.setText("   ");
		application.frmpb.res[1][1][2][3]="   ";
		application.frmpb.button1131.setText("   ");
		application.frmpb.res[1][1][3][1]="   ";
		application.frmpb.button1132.setText("   ");
		application.frmpb.res[1][1][3][2]="   ";
		application.frmpb.button1133.setText("   ");
		application.frmpb.res[1][1][3][3]="   ";
		
		application.frmpb.button1211.setText("   ");
		application.frmpb.res[1][2][1][1]="   ";
		application.frmpb.button1212.setText("   ");
		application.frmpb.res[1][2][1][2]="   ";
		application.frmpb.button1213.setText("   ");
		application.frmpb.res[1][2][1][3]="   ";
		application.frmpb.button1221.setText("   ");
		application.frmpb.res[1][2][2][1]="   ";
		application.frmpb.button1222.setText("   ");
		application.frmpb.res[1][2][2][2]="   ";
		application.frmpb.button1223.setText("   ");
		application.frmpb.res[1][2][2][3]="   ";
		application.frmpb.button1231.setText("   ");
		application.frmpb.res[1][2][3][1]="   ";
		application.frmpb.button1232.setText("   ");
		application.frmpb.res[1][2][3][2]="   ";
		application.frmpb.button1233.setText("   ");
		application.frmpb.res[1][2][3][3]="   ";
		application.frmpb.button1311.setText("   ");
		application.frmpb.res[1][3][1][1]="   ";
		application.frmpb.button1312.setText("   ");
		application.frmpb.res[1][3][1][2]="   ";
		application.frmpb.button1313.setText("   ");
		application.frmpb.res[1][3][1][3]="   ";
		application.frmpb.button1321.setText("   ");
		application.frmpb.res[1][3][2][1]="   ";
		application.frmpb.button1322.setText("   ");
		application.frmpb.res[1][3][2][2]="   ";
		application.frmpb.button1323.setText("   ");
		application.frmpb.res[1][3][2][3]="   ";
		application.frmpb.button1331.setText("   ");
		application.frmpb.res[1][3][3][1]="   ";
		application.frmpb.button1332.setText("   ");
		application.frmpb.res[1][3][3][2]="   ";
		application.frmpb.button1333.setText("   ");
		application.frmpb.res[1][3][3][3]="   ";
		
		application.frmpb.button2111.setText("   ");
		application.frmpb.res[2][1][1][1]="   ";
		application.frmpb.button2112.setText("   ");
		application.frmpb.res[2][1][1][2]="   ";
		application.frmpb.button1113.setText("   ");
		application.frmpb.res[2][1][1][3]="   ";
		application.frmpb.button2121.setText("   ");
		application.frmpb.res[2][1][2][1]="   ";
		application.frmpb.button2122.setText("   ");
		application.frmpb.res[2][1][2][2]="   ";
		application.frmpb.button2123.setText("   ");
		application.frmpb.res[2][1][2][3]="   ";
		application.frmpb.button2131.setText("   ");
		application.frmpb.res[2][1][3][1]="   ";
		application.frmpb.button2132.setText("   ");
		application.frmpb.res[2][1][3][2]="   ";
		application.frmpb.button2133.setText("   ");
		application.frmpb.res[2][1][3][3]="   ";
		
		application.frmpb.button2211.setText("   ");
		application.frmpb.res[2][2][1][1]="   ";
		application.frmpb.button2212.setText("   ");
		application.frmpb.res[2][2][1][2]="   ";
		application.frmpb.button2213.setText("   ");
		application.frmpb.res[2][2][1][3]="   ";
		application.frmpb.button2221.setText("   ");
		application.frmpb.res[2][2][2][1]="   ";
		application.frmpb.button2222.setText("   ");
		application.frmpb.res[2][2][2][2]="   ";
		application.frmpb.button2223.setText("   ");
		application.frmpb.res[2][2][2][3]="   ";
		application.frmpb.button2231.setText("   ");
		application.frmpb.res[2][2][3][1]="   ";
		application.frmpb.button2232.setText("   ");
		application.frmpb.res[2][2][3][2]="   ";
		application.frmpb.button2233.setText("   ");
		application.frmpb.res[2][2][3][3]="   ";
		
		application.frmpb.button2311.setText("   ");
		application.frmpb.res[2][3][1][1]="   ";
		application.frmpb.button2312.setText("   ");
		application.frmpb.res[2][3][1][2]="   ";
		application.frmpb.button2313.setText("   ");
		application.frmpb.res[2][3][1][3]="   ";
		application.frmpb.button2321.setText("   ");
		application.frmpb.res[2][3][2][1]="   ";
		application.frmpb.button2322.setText("   ");
		application.frmpb.res[2][3][2][2]="   ";
		application.frmpb.button2323.setText("   ");
		application.frmpb.res[2][3][2][3]="   ";
		application.frmpb.button2331.setText("   ");
		application.frmpb.res[2][3][3][1]="   ";
		application.frmpb.button2332.setText("   ");
		application.frmpb.res[2][3][3][2]="   ";
		application.frmpb.button2333.setText("   ");
		application.frmpb.res[2][3][3][3]="   ";
		
		application.frmpb.button3111.setText("   ");
		application.frmpb.res[3][1][1][1]="   ";
		application.frmpb.button3112.setText("   ");
		application.frmpb.res[3][1][1][2]="   ";
		application.frmpb.button3113.setText("   ");
		application.frmpb.res[3][1][1][3]="   ";
		application.frmpb.button3121.setText("   ");
		application.frmpb.res[3][1][2][1]="   ";
		application.frmpb.button3122.setText("   ");
		application.frmpb.res[3][1][2][2]="   ";
		application.frmpb.button3123.setText("   ");
		application.frmpb.res[3][1][2][3]="   ";
		application.frmpb.button3131.setText("   ");
		application.frmpb.res[3][1][3][1]="   ";
		application.frmpb.button3132.setText("   ");
		application.frmpb.res[3][1][3][2]="   ";
		application.frmpb.button3133.setText("   ");
		application.frmpb.res[3][1][3][3]="   ";
		
		application.frmpb.button3211.setText("   ");
		application.frmpb.res[3][2][1][1]="   ";
		application.frmpb.button3212.setText("   ");
		application.frmpb.res[3][2][1][2]="   ";
		application.frmpb.button3213.setText("   ");
		application.frmpb.res[3][2][1][3]="   ";
		application.frmpb.button3221.setText("   ");
		application.frmpb.res[3][2][2][1]="   ";
		application.frmpb.button3222.setText("   ");
		application.frmpb.res[3][2][2][2]="   ";
		application.frmpb.button3223.setText("   ");
		application.frmpb.res[3][2][2][3]="   ";
		application.frmpb.button3231.setText("   ");
		application.frmpb.res[3][2][3][1]="   ";
		application.frmpb.button3232.setText("   ");
		application.frmpb.res[3][2][3][2]="   ";
		application.frmpb.button3233.setText("   ");
		application.frmpb.res[3][2][3][3]="   ";
		
		application.frmpb.button3311.setText("   ");
		application.frmpb.res[3][3][1][1]="   ";
		application.frmpb.button3312.setText("   ");
		application.frmpb.res[3][3][1][2]="   ";
		application.frmpb.button3313.setText("   ");
		application.frmpb.res[3][3][1][3]="   ";
		application.frmpb.button3321.setText("   ");
		application.frmpb.res[3][3][2][1]="   ";
		application.frmpb.button3322.setText("   ");
		application.frmpb.res[3][3][2][2]="   ";
		application.frmpb.button3323.setText("   ");
		application.frmpb.res[3][3][2][3]="   ";
		application.frmpb.button3331.setText("   ");
		application.frmpb.res[3][3][3][1]="   ";
		application.frmpb.button3332.setText("   ");
		application.frmpb.res[3][3][3][2]="   ";
		application.frmpb.button3333.setText("   ");
		application.frmpb.res[3][3][3][3]="   ";
		
	}
	
	
	/*判斷此局遊戲是否獲勝*/
	boolean checkwin(){
		boolean flag=true;
		boolean[] area=new boolean[10];
		int v;		
		int i=0,j=0,k=0,l=0;
		
		
		/*先驗每個子矩陣的資料是否皆為數字，且是不是都是一到九沒有重複的數字*/
		for(i=1;i<4;i++){
			for(j=1;j<4;j++){
				/*清除所有子矩陣的資料*/
				for(k=1;k<10;k++){
					area[k]=false;
				}
				
				/*驗證子矩陣的資料是不是一到九都有，並且非一到九的資料也不會丟進資料庫*/
				for(k=1;k<4;k++){
					for(l=1;l<4;l++){
						if(res[i][j][k][l]!=null){
							if((res[i][j][k][l]).equals("1") || (res[i][j][k][l]).equals("2") || (res[i][j][k][l]).equals("3") || (res[i][j][k][l]).equals("4") || (res[i][j][k][l]).equals("5") || (res[i][j][k][l]).equals("6") || (res[i][j][k][l]).equals("7") || (res[i][j][k][l]).equals("8") || (res[i][j][k][l]).equals("9")){
								v=Integer.parseInt(res[i][j][k][l]);
								area[v]=true;
							}
						}
					}
				}
				
				/*檢查子矩陣的資料是否都已經填上數字，也一到九的數字都有*/
				for(k=1;k<10;k++){
					if(!area[k]){
						flag=false;						
						break;
					}
				}
				
				if(!flag)
					break;
			}
			
			if(!flag)
				break;
		}
		
		
		/*如果上面的子矩陣驗證通過，再來驗證每個直排及橫排的加總*/
		if(flag){
			int colsum,rowsum;
			
			/*判斷每個橫列及直列的加總是否都為45*/
			for(i=1;i<4;i++){			
				for(l=1;l<4;l++){
					/*初始化計算總合*/
					colsum=0;
					rowsum=0;
					
					/*計算每一個橫列的總合*/
					for(j=1;j<4;j++){
						for(k=1;k<4;k++){
							colsum+=Integer.parseInt(res[j][i][k][l]);
						}
					}
					
					/*計算每一個直列的總合*/
					for(j=1;j<4;j++){
						for(k=1;k<4;k++){
							rowsum+=Integer.parseInt(res[i][j][l][k]);
						}
					}
					
					if(colsum!=45 || rowsum!=45){
						flag=false;
						break;
					}
				}
				
				if(!flag)
					break;
			}
		}
		
		
		/*如果以上的驗證都通過，代表已經得出了解答*/
		if(flag){
			return true;
		}else{
			return false;
		}
	}
	
	/*把結果回填到畫面*/
	void signvalue(){
		application.frmpb.button1111.setText(res[1][1][1][1]);
		application.frmpb.button1112.setText(res[1][1][1][2]);
		application.frmpb.button1113.setText(res[1][1][1][3]);
		application.frmpb.button1121.setText(res[1][1][2][1]);
		application.frmpb.button1122.setText(res[1][1][2][2]);
		application.frmpb.button1123.setText(res[1][1][2][3]);
		application.frmpb.button1131.setText(res[1][1][3][1]);
		application.frmpb.button1132.setText(res[1][1][3][2]);
		application.frmpb.button1133.setText(res[1][1][3][3]);
		application.frmpb.button1211.setText(res[1][2][1][1]);
		application.frmpb.button1212.setText(res[1][2][1][2]);
		application.frmpb.button1213.setText(res[1][2][1][3]);
		application.frmpb.button1221.setText(res[1][2][2][1]);
		application.frmpb.button1222.setText(res[1][2][2][2]);
		application.frmpb.button1223.setText(res[1][2][2][3]);
		application.frmpb.button1231.setText(res[1][2][3][1]);
		application.frmpb.button1232.setText(res[1][2][3][2]);
		application.frmpb.button1233.setText(res[1][2][3][3]);
		application.frmpb.button1311.setText(res[1][3][1][1]);
		application.frmpb.button1312.setText(res[1][3][1][2]);
		application.frmpb.button1313.setText(res[1][3][1][3]);
		application.frmpb.button1321.setText(res[1][3][2][1]);
		application.frmpb.button1322.setText(res[1][3][2][2]);
		application.frmpb.button1323.setText(res[1][3][2][3]);
		application.frmpb.button1331.setText(res[1][3][3][1]);
		application.frmpb.button1332.setText(res[1][3][3][2]);
		application.frmpb.button1333.setText(res[1][3][3][3]);
		
		application.frmpb.button2111.setText(res[2][1][1][1]);
		application.frmpb.button2112.setText(res[2][1][1][2]);
		application.frmpb.button2113.setText(res[2][1][1][3]);
		application.frmpb.button2121.setText(res[2][1][2][1]);
		application.frmpb.button2122.setText(res[2][1][2][2]);
		application.frmpb.button2123.setText(res[2][1][2][3]);
		application.frmpb.button2131.setText(res[2][1][3][1]);
		application.frmpb.button2132.setText(res[2][1][3][2]);
		application.frmpb.button2133.setText(res[2][1][3][3]);
		application.frmpb.button2211.setText(res[2][2][1][1]);
		application.frmpb.button2212.setText(res[2][2][1][2]);
		application.frmpb.button2213.setText(res[2][2][1][3]);
		application.frmpb.button2221.setText(res[2][2][2][1]);
		application.frmpb.button2222.setText(res[2][2][2][2]);
		application.frmpb.button2223.setText(res[2][2][2][3]);
		application.frmpb.button2231.setText(res[2][2][3][1]);
		application.frmpb.button2232.setText(res[2][2][3][2]);
		application.frmpb.button2233.setText(res[2][2][3][3]);
		application.frmpb.button2311.setText(res[2][3][1][1]);
		application.frmpb.button2312.setText(res[2][3][1][2]);
		application.frmpb.button2313.setText(res[2][3][1][3]);
		application.frmpb.button2321.setText(res[2][3][2][1]);
		application.frmpb.button2322.setText(res[2][3][2][2]);
		application.frmpb.button2323.setText(res[2][3][2][3]);
		application.frmpb.button2331.setText(res[2][3][3][1]);
		application.frmpb.button2332.setText(res[2][3][3][2]);
		application.frmpb.button2333.setText(res[2][3][3][3]);
		
		application.frmpb.button3111.setText(res[3][1][1][1]);
		application.frmpb.button3112.setText(res[3][1][1][2]);
		application.frmpb.button3113.setText(res[3][1][1][3]);
		application.frmpb.button3121.setText(res[3][1][2][1]);
		application.frmpb.button3122.setText(res[3][1][2][2]);
		application.frmpb.button3123.setText(res[3][1][2][3]);
		application.frmpb.button3131.setText(res[3][1][3][1]);
		application.frmpb.button3132.setText(res[3][1][3][2]);
		application.frmpb.button3133.setText(res[3][1][3][3]);
		application.frmpb.button3211.setText(res[3][2][1][1]);
		application.frmpb.button3212.setText(res[3][2][1][2]);
		application.frmpb.button3213.setText(res[3][2][1][3]);
		application.frmpb.button3221.setText(res[3][2][2][1]);
		application.frmpb.button3222.setText(res[3][2][2][2]);
		application.frmpb.button3223.setText(res[3][2][2][3]);
		application.frmpb.button3231.setText(res[3][2][3][1]);
		application.frmpb.button3232.setText(res[3][2][3][2]);
		application.frmpb.button3233.setText(res[3][2][3][3]);
		application.frmpb.button3311.setText(res[3][3][1][1]);
		application.frmpb.button3312.setText(res[3][3][1][2]);
		application.frmpb.button3313.setText(res[3][3][1][3]);
		application.frmpb.button3321.setText(res[3][3][2][1]);
		application.frmpb.button3322.setText(res[3][3][2][2]);
		application.frmpb.button3323.setText(res[3][3][2][3]);
		application.frmpb.button3331.setText(res[3][3][3][1]);
		application.frmpb.button3332.setText(res[3][3][3][2]);
		application.frmpb.button3333.setText(res[3][3][3][3]);
	}
	
	/*確認一下現在所在的直列及橫列是否有重複的值，或者該黃列及直列任一樣加上目前的值是否已超過45，若有其中之一的情況則傳回false，反之傳回true*/
	boolean needsign(int i,int j, int k,int l,String[][][][] tempres,int t){
		int x,y;
		int v;
		int colsum=0,rowsum=0;
		boolean flag=true;
		
		for(x=1;x<4;x++){
			for(y=1;y<4;y++){
				//檢查橫列
				if(!tempres[x][j][y][l].equals("   ")){
					v=Integer.parseInt(tempres[x][j][y][l]);
					colsum+=v;
					if(v==t){
						flag=false;
						break;
					}
				}
				
				//檢查直列
				if(!tempres[i][x][k][y].equals("   ")){
					v=Integer.parseInt(tempres[i][x][k][y]);
					rowsum+=v;
					if(v==t){
						flag=false;
						break;
					}
				}
			}
			
			if(!flag)
				break;
		}
		
		if(colsum+t>45 || rowsum+t>45)
			flag=false;
		
		return flag;
	}
	
	/*印出目前的數值資料*/
	void dumparray(String[][][][] tempres){
		for(int q=1;q<4;q++){
			for(int w=1;w<4;w++){
				for(int e=1;e<4;e++){
					for(int r=1;r<4;r++){
						if(tempres[q][w][e][r].equals("   ")){
							System.out.print("0");
						}else{
							System.out.print(tempres[q][w][e][r]);
						}
					}
				}
				System.out.println();
			}
		}
	}
	
	/*電腦遞迴的函式*/
	void computerrecursion(int i,int j,String[][][][] localres,int depth){
		/*如果已求出解答，則不需要再進遞迴了*/
		if(!computerresult){
			int x,y,m,n;
			int t;
			boolean eversign;
			boolean interrupt=false;
			boolean[] area=new boolean[10];
			
			
			/*另外製作一個給遞歸用，儲存本次結果的多維陣列*/
			String[][][][] tempres=new String[4][4][4][4];
			
			/*初始化資料，從父層把資料傳進來*/
			for(x=1;x<4;x++){
				for(y=1;y<4;y++){
					for(m=1;m<4;m++){
						for(n=1;n<4;n++){
							tempres[x][y][m][n]=localres[x][y][m][n];
						}
					}
				}
			}
				
			
			/*檢查現階段還有哪些值未填*/
			for(t=1;t<10;t++){
				if(!(tempres[i][j][1][1]).equals(Integer.toString(t)) && !(tempres[i][j][2][1]).equals(Integer.toString(t)) && !(tempres[i][j][3][1]).equals(Integer.toString(t)) && !(tempres[i][j][1][2]).equals(Integer.toString(t)) && !(tempres[i][j][2][2]).equals(Integer.toString(t)) && !(tempres[i][j][3][2]).equals(Integer.toString(t)) && !(tempres[i][j][1][3]).equals(Integer.toString(t)) && !(tempres[i][j][2][3]).equals(Integer.toString(t)) && !(tempres[i][j][3][3]).equals(Integer.toString(t))){
					interrupt=true;
					area[t]=false;
				}else{
					area[t]=true;
				}
			}
			
			
			/*檢查是否有中斷過，若仍有還未填入的值，就針對此小框框做遞迴。否則若找不到空位了，就自動跳下一個大框框*/
			if(interrupt){
				/*找出小框框內每一個還沒填入的*/
				for(eversign=true,x=1;x<4;x++){
					for(y=1;y<4;y++){
						if((tempres[i][j][x][y]).equals("   ")){
							
							/*拿所有還未填的值，跳下去嘗試做遞迴。並且把曾進來的記錄eversign清空，如果這格空白找不到任何可填的解，則直接把這條線斷了就好了*/
							eversign=false;
							for(t=9;t>0;t--){
								if(!area[t]){
									
									/*比較要填入的值的該橫列及直列，如果沒有重複的數值，才是有必要填入去嘗試的數值*/
									if(needsign(i,j,x,y,tempres,t)){
										eversign=true;
										
										//System.out.println("*"+depth+"*");
										//dumparray(tempres);
										tempres[i][j][x][y]=Integer.toString(t);
										computerrecursion(i,j,tempres,depth);
										//System.out.println("**"+depth+"**");
										//dumparray(tempres);
									}
								}
							}
						}
						
						if(!eversign)
							break;
					}
					
					if(!eversign)
						break;
				}
			}else{
				/*檢查是否已經是最後一個大框框了，如果是的話，把現有的結果填入檢測用的res，並呼叫函式checkwin來檢查是否獲勝了*/
				if(i==3 && j==3){
					/*將目前電腦解出的結果放到驗證用的四維陣列*/
					for(x=1;x<4;x++){
						for(y=1;y<4;y++){
							for(m=1;m<4;m++){
								for(n=1;n<4;n++){
									res[x][y][m][n]=tempres[x][y][m][n];
								}
							}
						}
					}					
					
					/*如果有求出任何一組解，則將已求解的變數改為on，以結束之後所有的遞迴。並且把畫面上的格子填上結果*/
					if(checkwin()){		
						signvalue();
						computerresult=true;
					}
				}else{
					/*如果橫列到底了，就往直列發展*/
					if(j<3){
						//System.out.println("col");
						computerrecursion(i,j+1,tempres,depth+1);
					}else{
						//System.out.println("row");
						computerrecursion(i+1,1,tempres,depth+1);
					}
				}
			}
		}
	}
	
	/*電腦思考解答*/
	void computerhandle(){
		/*讀取模版檔*/
		loadtemplate();

		/*設定初始為還未找出解答，並開始由電腦思考*/
		computerresult=false;
		computerrecursion(1,1,res,0);
		
		/*顯示電腦思考的結果*/
		if(computerresult){			
			JOptionPane.showMessageDialog(null, "電腦已得出正確解答！");
		}else{
			JOptionPane.showMessageDialog(null, "此題電腦求不出解答！");
		}
		application.frmpc.setVisible(true);
		application.frmpb.setVisible(false);
	}
	

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					playboard frame = new playboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public playboard() {
		setResizable(false);
		setTitle("全民數獨通");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 380);
		contentPane = new JPanel();
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("數獨解題");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JButton btnGiveup = new JButton("放棄解題");
		btnGiveup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				application.frmpc.setVisible(true);
				application.frmpb.setVisible(false);
			}
		});
		GridBagConstraints gbc_btnGiveup = new GridBagConstraints();
		gbc_btnGiveup.insets = new Insets(0, 0, 5, 0);
		gbc_btnGiveup.gridx = 2;
		gbc_btnGiveup.gridy = 0;
		contentPane.add(btnGiveup, gbc_btnGiveup);
		
		JPanel panel11 = new JPanel();
		panel11.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.RED, Color.MAGENTA, Color.RED, new Color(255, 0, 255)));
		GridBagConstraints gbc_panel11 = new GridBagConstraints();
		gbc_panel11.insets = new Insets(0, 0, 5, 5);
		gbc_panel11.fill = GridBagConstraints.BOTH;
		gbc_panel11.gridx = 0;
		gbc_panel11.gridy = 1;
		contentPane.add(panel11, gbc_panel11);
		GridBagLayout gbl_panel11 = new GridBagLayout();
		gbl_panel11.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel11.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel11.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel11.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel11.setLayout(gbl_panel11);
		
		//final JButton button1111 = new JButton("   ");
		button1111.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[1]){
					button1111.setText(textKeyinValue.getText());
					res[1][1][1][1]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button1111 = new GridBagConstraints();
		gbc_button1111.insets = new Insets(0, 0, 5, 5);
		gbc_button1111.gridx = 0;
		gbc_button1111.gridy = 0;
		panel11.add(button1111, gbc_button1111);
		
		//final JButton button1121 = new JButton("   ");
		button1121.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[2]){
					button1121.setText(textKeyinValue.getText());
					res[1][1][2][1]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button1121 = new GridBagConstraints();
		gbc_button1121.insets = new Insets(0, 0, 5, 5);
		gbc_button1121.gridx = 1;
		gbc_button1121.gridy = 0;
		panel11.add(button1121, gbc_button1121);
		
		//final JButton button1131 = new JButton("   ");
		button1131.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[3]){
					button1131.setText(textKeyinValue.getText());
					res[1][1][3][1]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button1131 = new GridBagConstraints();
		gbc_button1131.insets = new Insets(0, 0, 5, 0);
		gbc_button1131.gridx = 2;
		gbc_button1131.gridy = 0;
		panel11.add(button1131, gbc_button1131);
		
		//final JButton button1112 = new JButton("   ");
		button1112.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[4]){
					button1112.setText(textKeyinValue.getText());
					res[1][1][1][2]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}	
			}
		});
		GridBagConstraints gbc_button1112 = new GridBagConstraints();
		gbc_button1112.insets = new Insets(0, 0, 5, 5);
		gbc_button1112.gridx = 0;
		gbc_button1112.gridy = 1;
		panel11.add(button1112, gbc_button1112);
		
		//final JButton button1122 = new JButton("   ");
		button1122.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[5]){
					button1122.setText(textKeyinValue.getText());
					res[1][1][2][2]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button1122 = new GridBagConstraints();
		gbc_button1122.insets = new Insets(0, 0, 5, 5);
		gbc_button1122.gridx = 1;
		gbc_button1122.gridy = 1;
		panel11.add(button1122, gbc_button1122);
		
		//final JButton button1132 = new JButton("   ");
		button1132.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[6]){
					button1132.setText(textKeyinValue.getText());
					res[1][1][3][2]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button1132 = new GridBagConstraints();
		gbc_button1132.insets = new Insets(0, 0, 5, 0);
		gbc_button1132.gridx = 2;
		gbc_button1132.gridy = 1;
		panel11.add(button1132, gbc_button1132);
		
		//final JButton button1113 = new JButton("   ");
		button1113.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[7]){
					button1113.setText(textKeyinValue.getText());
					res[1][1][1][3]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button1113 = new GridBagConstraints();
		gbc_button1113.insets = new Insets(0, 0, 0, 5);
		gbc_button1113.gridx = 0;
		gbc_button1113.gridy = 2;
		panel11.add(button1113, gbc_button1113);
		
		//final JButton button1123 = new JButton("   ");
		button1123.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[8]){
					button1123.setText(textKeyinValue.getText());
					res[1][1][2][3]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button1123 = new GridBagConstraints();
		gbc_button1123.insets = new Insets(0, 0, 0, 5);
		gbc_button1123.gridx = 1;
		gbc_button1123.gridy = 2;
		panel11.add(button1123, gbc_button1123);
		
		//final JButton button1133 = new JButton("   ");
		button1133.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[9]){
					button1133.setText(textKeyinValue.getText());
					res[1][1][3][3]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button1133 = new GridBagConstraints();
		gbc_button1133.gridx = 2;
		gbc_button1133.gridy = 2;
		panel11.add(button1133, gbc_button1133);
		
		JPanel panel21 = new JPanel();
		panel21.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.RED, new Color(255, 0, 255), Color.RED, new Color(255, 0, 255)));
		GridBagConstraints gbc_panel21 = new GridBagConstraints();
		gbc_panel21.insets = new Insets(0, 0, 5, 5);
		gbc_panel21.fill = GridBagConstraints.BOTH;
		gbc_panel21.gridx = 1;
		gbc_panel21.gridy = 1;
		contentPane.add(panel21, gbc_panel21);
		GridBagLayout gbl_panel21 = new GridBagLayout();
		gbl_panel21.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel21.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel21.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel21.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel21.setLayout(gbl_panel21);
		
		//final JButton button2111 = new JButton("   ");
		button2111.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[10]){
					button2111.setText(textKeyinValue.getText());
					res[2][1][1][1]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button2111 = new GridBagConstraints();
		gbc_button2111.insets = new Insets(0, 0, 5, 5);
		gbc_button2111.gridx = 0;
		gbc_button2111.gridy = 0;
		panel21.add(button2111, gbc_button2111);
		
		//final JButton button2121 = new JButton("   ");
		button2121.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				////if(!application.frmpb.slck[11]){
					button2121.setText(textKeyinValue.getText());
					res[2][1][2][1]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button2121 = new GridBagConstraints();
		gbc_button2121.insets = new Insets(0, 0, 5, 5);
		gbc_button2121.gridx = 1;
		gbc_button2121.gridy = 0;
		panel21.add(button2121, gbc_button2121);
		
		//final JButton button2131 = new JButton("   ");
		button2131.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[12]){
					button2131.setText(textKeyinValue.getText());
					res[2][1][3][1]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button2131 = new GridBagConstraints();
		gbc_button2131.insets = new Insets(0, 0, 5, 0);
		gbc_button2131.gridx = 2;
		gbc_button2131.gridy = 0;
		panel21.add(button2131, gbc_button2131);
		
		//final JButton button2112 = new JButton("   ");
		button2112.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[13]){
					button2112.setText(textKeyinValue.getText());
					res[2][1][1][2]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button2112 = new GridBagConstraints();
		gbc_button2112.insets = new Insets(0, 0, 5, 5);
		gbc_button2112.gridx = 0;
		gbc_button2112.gridy = 1;
		panel21.add(button2112, gbc_button2112);
		
		//final JButton button2122 = new JButton("   ");
		button2122.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[14]){
					button2122.setText(textKeyinValue.getText());
					res[2][1][2][2]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button2122 = new GridBagConstraints();
		gbc_button2122.insets = new Insets(0, 0, 5, 5);
		gbc_button2122.gridx = 1;
		gbc_button2122.gridy = 1;
		panel21.add(button2122, gbc_button2122);
		
		//final JButton button2132 = new JButton("   ");
		button2132.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[15]){
					button2132.setText(textKeyinValue.getText());
					res[2][1][3][2]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button2132 = new GridBagConstraints();
		gbc_button2132.insets = new Insets(0, 0, 5, 0);
		gbc_button2132.gridx = 2;
		gbc_button2132.gridy = 1;
		panel21.add(button2132, gbc_button2132);
		
		//final JButton button2113 = new JButton("   ");
		button2113.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				////if(!application.frmpb.slck[16]){
					button2113.setText(textKeyinValue.getText());
					res[2][1][1][3]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button2113 = new GridBagConstraints();
		gbc_button2113.insets = new Insets(0, 0, 0, 5);
		gbc_button2113.gridx = 0;
		gbc_button2113.gridy = 2;
		panel21.add(button2113, gbc_button2113);
		
		//final JButton button2123 = new JButton("   ");
		button2123.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[17]){
					button2123.setText(textKeyinValue.getText());
					res[2][1][2][3]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button2123 = new GridBagConstraints();
		gbc_button2123.insets = new Insets(0, 0, 0, 5);
		gbc_button2123.gridx = 1;
		gbc_button2123.gridy = 2;
		panel21.add(button2123, gbc_button2123);
		
		//final JButton button2133 = new JButton("   ");
		button2133.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[18]){
					button2133.setText(textKeyinValue.getText());
					res[2][1][3][3]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button2133 = new GridBagConstraints();
		gbc_button2133.gridx = 2;
		gbc_button2133.gridy = 2;
		panel21.add(button2133, gbc_button2133);
		
		JPanel panel31 = new JPanel();
		panel31.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.RED, new Color(255, 0, 255), Color.RED, new Color(255, 0, 255)));
		GridBagConstraints gbc_panel31 = new GridBagConstraints();
		gbc_panel31.insets = new Insets(0, 0, 5, 0);
		gbc_panel31.fill = GridBagConstraints.BOTH;
		gbc_panel31.gridx = 2;
		gbc_panel31.gridy = 1;
		contentPane.add(panel31, gbc_panel31);
		GridBagLayout gbl_panel31 = new GridBagLayout();
		gbl_panel31.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel31.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel31.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel31.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel31.setLayout(gbl_panel31);
		
		//final JButton button3111 = new JButton("   ");
		button3111.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[19]){
					button3111.setText(textKeyinValue.getText());
					res[3][1][1][1]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button3111 = new GridBagConstraints();
		gbc_button3111.insets = new Insets(0, 0, 5, 5);
		gbc_button3111.gridx = 0;
		gbc_button3111.gridy = 0;
		panel31.add(button3111, gbc_button3111);
		
		//final JButton button3121 = new JButton("   ");
		button3121.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[20]){
					button3121.setText(textKeyinValue.getText());
					res[3][1][2][1]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button3121 = new GridBagConstraints();
		gbc_button3121.insets = new Insets(0, 0, 5, 5);
		gbc_button3121.gridx = 1;
		gbc_button3121.gridy = 0;
		panel31.add(button3121, gbc_button3121);
		
		//final JButton button3131 = new JButton("   ");
		button3131.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[21]){
					button3131.setText(textKeyinValue.getText());
					res[3][1][3][1]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button3131 = new GridBagConstraints();
		gbc_button3131.insets = new Insets(0, 0, 5, 0);
		gbc_button3131.gridx = 2;
		gbc_button3131.gridy = 0;
		panel31.add(button3131, gbc_button3131);
		
		//final JButton button3112 = new JButton("   ");
		button3112.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[22]){
					button3112.setText(textKeyinValue.getText());
					res[3][1][1][2]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button3112 = new GridBagConstraints();
		gbc_button3112.insets = new Insets(0, 0, 5, 5);
		gbc_button3112.gridx = 0;
		gbc_button3112.gridy = 1;
		panel31.add(button3112, gbc_button3112);
		
		//final JButton button3122 = new JButton("   ");
		button3122.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[23]){
					button3122.setText(textKeyinValue.getText());
					res[3][1][2][2]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button3122 = new GridBagConstraints();
		gbc_button3122.insets = new Insets(0, 0, 5, 5);
		gbc_button3122.gridx = 1;
		gbc_button3122.gridy = 1;
		panel31.add(button3122, gbc_button3122);
		
		//final JButton button3132 = new JButton("   ");
		button3132.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[24]){
					button3132.setText(textKeyinValue.getText());
					res[3][1][3][2]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button3132 = new GridBagConstraints();
		gbc_button3132.insets = new Insets(0, 0, 5, 0);
		gbc_button3132.gridx = 2;
		gbc_button3132.gridy = 1;
		panel31.add(button3132, gbc_button3132);
		
		//final JButton button3113 = new JButton("   ");
		button3113.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[25]){
					button3113.setText(textKeyinValue.getText());
					res[3][1][1][3]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button3113 = new GridBagConstraints();
		gbc_button3113.insets = new Insets(0, 0, 0, 5);
		gbc_button3113.gridx = 0;
		gbc_button3113.gridy = 2;
		panel31.add(button3113, gbc_button3113);
		
		//final JButton button3123 = new JButton("   ");
		button3123.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[26]){
					button3123.setText(textKeyinValue.getText());
					res[3][1][2][3]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button3123 = new GridBagConstraints();
		gbc_button3123.insets = new Insets(0, 0, 0, 5);
		gbc_button3123.gridx = 1;
		gbc_button3123.gridy = 2;
		panel31.add(button3123, gbc_button3123);
		
		//final JButton button3133 = new JButton("   ");
		button3133.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[27]){
					button3133.setText(textKeyinValue.getText());
					res[3][1][3][3]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button3133 = new GridBagConstraints();
		gbc_button3133.gridx = 2;
		gbc_button3133.gridy = 2;
		panel31.add(button3133, gbc_button3133);
		
		JPanel panel12 = new JPanel();
		panel12.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.RED, new Color(255, 0, 255), Color.RED, new Color(255, 0, 255)));
		GridBagConstraints gbc_panel12 = new GridBagConstraints();
		gbc_panel12.insets = new Insets(0, 0, 5, 5);
		gbc_panel12.fill = GridBagConstraints.BOTH;
		gbc_panel12.gridx = 0;
		gbc_panel12.gridy = 2;
		contentPane.add(panel12, gbc_panel12);
		GridBagLayout gbl_panel12 = new GridBagLayout();
		gbl_panel12.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel12.rowHeights = new int[]{0, 0, 0};
		gbl_panel12.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel12.rowWeights = new double[]{0.0, Double.MIN_VALUE, 0.0};
		panel12.setLayout(gbl_panel12);
		
		//final JButton button1211 = new JButton("   ");
		button1211.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[28]){
					button1211.setText(textKeyinValue.getText());
					res[1][2][1][1]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button1211 = new GridBagConstraints();
		gbc_button1211.insets = new Insets(0, 0, 5, 5);
		gbc_button1211.gridx = 0;
		gbc_button1211.gridy = 0;
		panel12.add(button1211, gbc_button1211);
		
		//final JButton button1221 = new JButton("   ");
		button1221.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[29]){
					button1221.setText(textKeyinValue.getText());
					res[1][2][2][1]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button1221 = new GridBagConstraints();
		gbc_button1221.insets = new Insets(0, 0, 5, 5);
		gbc_button1221.gridx = 1;
		gbc_button1221.gridy = 0;
		panel12.add(button1221, gbc_button1221);
		
		//final JButton button1231 = new JButton("   ");
		button1231.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[30]){
					button1231.setText(textKeyinValue.getText());
					res[1][2][3][1]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button1231 = new GridBagConstraints();
		gbc_button1231.insets = new Insets(0, 0, 5, 0);
		gbc_button1231.gridx = 2;
		gbc_button1231.gridy = 0;
		panel12.add(button1231, gbc_button1231);
		
		//final JButton button1212 = new JButton("   ");
		button1212.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[31]){
					button1212.setText(textKeyinValue.getText());
					res[1][2][1][2]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button1212 = new GridBagConstraints();
		gbc_button1212.insets = new Insets(0, 0, 5, 5);
		gbc_button1212.gridx = 0;
		gbc_button1212.gridy = 2;
		panel12.add(button1212, gbc_button1212);
		
		//final JButton button1222 = new JButton("   ");
		button1222.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[32]){
					button1222.setText(textKeyinValue.getText());
					res[1][2][2][2]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button1222 = new GridBagConstraints();
		gbc_button1222.insets = new Insets(0, 0, 5, 5);
		gbc_button1222.gridx = 1;
		gbc_button1222.gridy = 2;
		panel12.add(button1222, gbc_button1222);
		
		//final JButton button1232 = new JButton("   ");
		button1232.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[33]){
					button1232.setText(textKeyinValue.getText());
					res[1][2][3][2]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button1232 = new GridBagConstraints();
		gbc_button1232.insets = new Insets(0, 0, 5, 0);
		gbc_button1232.gridx = 2;
		gbc_button1232.gridy = 2;
		panel12.add(button1232, gbc_button1232);
		
		//final JButton button1213 = new JButton("   ");
		button1213.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[34]){
					button1213.setText(textKeyinValue.getText());
					res[1][2][1][3]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button1213 = new GridBagConstraints();
		gbc_button1213.insets = new Insets(0, 0, 0, 5);
		gbc_button1213.gridx = 0;
		gbc_button1213.gridy = 3;
		panel12.add(button1213, gbc_button1213);
		
		//final JButton button1223 = new JButton("   ");
		button1223.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[35]){
					button1223.setText(textKeyinValue.getText());
					res[1][2][2][3]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button1223 = new GridBagConstraints();
		gbc_button1223.insets = new Insets(0, 0, 0, 5);
		gbc_button1223.gridx = 1;
		gbc_button1223.gridy = 3;
		panel12.add(button1223, gbc_button1223);
		
		//final JButton button1233 = new JButton("   ");
		button1233.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[36]){
					button1233.setText(textKeyinValue.getText());
					res[1][2][3][3]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button1233 = new GridBagConstraints();
		gbc_button1233.gridx = 2;
		gbc_button1233.gridy = 3;
		panel12.add(button1233, gbc_button1233);
		
		JPanel panel22 = new JPanel();
		panel22.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.RED, new Color(255, 0, 255), Color.RED, new Color(255, 0, 255)));
		GridBagConstraints gbc_panel22 = new GridBagConstraints();
		gbc_panel22.insets = new Insets(0, 0, 5, 5);
		gbc_panel22.fill = GridBagConstraints.BOTH;
		gbc_panel22.gridx = 1;
		gbc_panel22.gridy = 2;
		contentPane.add(panel22, gbc_panel22);
		GridBagLayout gbl_panel22 = new GridBagLayout();
		gbl_panel22.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel22.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel22.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel22.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel22.setLayout(gbl_panel22);
		
		//final JButton button2211 = new JButton("   ");
		button2211.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[37]){
					button2211.setText(textKeyinValue.getText());
					res[2][2][1][1]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button2211 = new GridBagConstraints();
		gbc_button2211.insets = new Insets(0, 0, 5, 5);
		gbc_button2211.gridx = 0;
		gbc_button2211.gridy = 0;
		panel22.add(button2211, gbc_button2211);
		
		//final JButton button2221 = new JButton("   ");
		button2221.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[38]){
					button2221.setText(textKeyinValue.getText());
					res[2][2][2][1]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button2221 = new GridBagConstraints();
		gbc_button2221.insets = new Insets(0, 0, 5, 5);
		gbc_button2221.gridx = 1;
		gbc_button2221.gridy = 0;
		panel22.add(button2221, gbc_button2221);
		
		//final JButton button2231 = new JButton("   ");
		button2231.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[39]){
					button2231.setText(textKeyinValue.getText());
					res[2][2][3][1]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button2231 = new GridBagConstraints();
		gbc_button2231.insets = new Insets(0, 0, 5, 0);
		gbc_button2231.gridx = 2;
		gbc_button2231.gridy = 0;
		panel22.add(button2231, gbc_button2231);
		
		//final JButton button2212 = new JButton("   ");
		button2212.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[40]){
					button2212.setText(textKeyinValue.getText());
					res[2][2][1][2]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button2212 = new GridBagConstraints();
		gbc_button2212.insets = new Insets(0, 0, 5, 5);
		gbc_button2212.gridx = 0;
		gbc_button2212.gridy = 1;
		panel22.add(button2212, gbc_button2212);
		
		//final JButton button2222 = new JButton("   ");
		button2222.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[41]){
					button2222.setText(textKeyinValue.getText());
					res[2][2][2][2]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button2222 = new GridBagConstraints();
		gbc_button2222.insets = new Insets(0, 0, 5, 5);
		gbc_button2222.gridx = 1;
		gbc_button2222.gridy = 1;
		panel22.add(button2222, gbc_button2222);
		
		//final JButton button2232 = new JButton("   ");
		button2232.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[42]){
					button2232.setText(textKeyinValue.getText());
					res[2][2][3][2]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button2232 = new GridBagConstraints();
		gbc_button2232.insets = new Insets(0, 0, 5, 0);
		gbc_button2232.gridx = 2;
		gbc_button2232.gridy = 1;
		panel22.add(button2232, gbc_button2232);
		
		//final JButton button2213 = new JButton("   ");
		button2213.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[43]){
					button2213.setText(textKeyinValue.getText());
					res[2][2][1][3]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button2213 = new GridBagConstraints();
		gbc_button2213.insets = new Insets(0, 0, 0, 5);
		gbc_button2213.gridx = 0;
		gbc_button2213.gridy = 2;
		panel22.add(button2213, gbc_button2213);
		
		//final JButton button2223 = new JButton("   ");
		button2223.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[44]){
					button2223.setText(textKeyinValue.getText());
					res[2][2][2][3]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button2223 = new GridBagConstraints();
		gbc_button2223.insets = new Insets(0, 0, 0, 5);
		gbc_button2223.gridx = 1;
		gbc_button2223.gridy = 2;
		panel22.add(button2223, gbc_button2223);
		
		//final JButton button2233 = new JButton("   ");
		button2233.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[45]){	
					button2233.setText(textKeyinValue.getText());
					res[2][2][3][3]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button2233 = new GridBagConstraints();
		gbc_button2233.gridx = 2;
		gbc_button2233.gridy = 2;
		panel22.add(button2233, gbc_button2233);
		
		JPanel panel32 = new JPanel();
		panel32.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.RED, new Color(255, 0, 255), Color.RED, new Color(255, 0, 255)));
		GridBagConstraints gbc_panel32 = new GridBagConstraints();
		gbc_panel32.insets = new Insets(0, 0, 5, 0);
		gbc_panel32.fill = GridBagConstraints.BOTH;
		gbc_panel32.gridx = 2;
		gbc_panel32.gridy = 2;
		contentPane.add(panel32, gbc_panel32);
		GridBagLayout gbl_panel32 = new GridBagLayout();
		gbl_panel32.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel32.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel32.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel32.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel32.setLayout(gbl_panel32);
		
		//final JButton button3211 = new JButton("   ");
		button3211.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[46]){
					button3211.setText(textKeyinValue.getText());
					res[3][2][1][1]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button3211 = new GridBagConstraints();
		gbc_button3211.insets = new Insets(0, 0, 5, 5);
		gbc_button3211.gridx = 0;
		gbc_button3211.gridy = 0;
		panel32.add(button3211, gbc_button3211);
		
		//final JButton button3221 = new JButton("   ");
		button3221.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[47]){
					button3221.setText(textKeyinValue.getText());
					res[3][2][2][1]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button3221 = new GridBagConstraints();
		gbc_button3221.insets = new Insets(0, 0, 5, 5);
		gbc_button3221.gridx = 1;
		gbc_button3221.gridy = 0;
		panel32.add(button3221, gbc_button3221);
		
		//final JButton button3231 = new JButton("   ");
		button3231.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[48]){
					button3231.setText(textKeyinValue.getText());
					res[3][2][3][1]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button3231 = new GridBagConstraints();
		gbc_button3231.insets = new Insets(0, 0, 5, 0);
		gbc_button3231.gridx = 2;
		gbc_button3231.gridy = 0;
		panel32.add(button3231, gbc_button3231);
		
		//final JButton button3212 = new JButton("   ");
		button3212.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[49]){
					button3212.setText(textKeyinValue.getText());
					res[3][2][1][2]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button3212 = new GridBagConstraints();
		gbc_button3212.insets = new Insets(0, 0, 5, 5);
		gbc_button3212.gridx = 0;
		gbc_button3212.gridy = 1;
		panel32.add(button3212, gbc_button3212);
		
		//final JButton button3222 = new JButton("   ");
		button3222.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[50]){
					button3222.setText(textKeyinValue.getText());
					res[3][2][2][2]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button3222 = new GridBagConstraints();
		gbc_button3222.insets = new Insets(0, 0, 5, 5);
		gbc_button3222.gridx = 1;
		gbc_button3222.gridy = 1;
		panel32.add(button3222, gbc_button3222);
		
		//final JButton button3232 = new JButton("   ");
		button3232.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[51]){
					button3232.setText(textKeyinValue.getText());
					res[3][2][3][2]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button3232 = new GridBagConstraints();
		gbc_button3232.insets = new Insets(0, 0, 5, 0);
		gbc_button3232.gridx = 2;
		gbc_button3232.gridy = 1;
		panel32.add(button3232, gbc_button3232);
		
		//final JButton button3213 = new JButton("   ");
		button3213.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[52]){
					button3213.setText(textKeyinValue.getText());
					res[3][2][1][3]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button3213 = new GridBagConstraints();
		gbc_button3213.insets = new Insets(0, 0, 0, 5);
		gbc_button3213.gridx = 0;
		gbc_button3213.gridy = 2;
		panel32.add(button3213, gbc_button3213);
		
		//final JButton button3223 = new JButton("   ");
		button3223.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[53]){
					button3223.setText(textKeyinValue.getText());
					res[3][2][2][3]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button3223 = new GridBagConstraints();
		gbc_button3223.insets = new Insets(0, 0, 0, 5);
		gbc_button3223.gridx = 1;
		gbc_button3223.gridy = 2;
		panel32.add(button3223, gbc_button3223);
		
		//final JButton button3233 = new JButton("   ");
		button3233.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[54]){
					button3233.setText(textKeyinValue.getText());
					res[3][2][3][3]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button3233 = new GridBagConstraints();
		gbc_button3233.gridx = 2;
		gbc_button3233.gridy = 2;
		panel32.add(button3233, gbc_button3233);
		
		JPanel panel13 = new JPanel();
		panel13.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.RED, new Color(255, 0, 255), Color.RED, new Color(255, 0, 255)));
		GridBagConstraints gbc_panel13 = new GridBagConstraints();
		gbc_panel13.insets = new Insets(0, 0, 5, 5);
		gbc_panel13.fill = GridBagConstraints.BOTH;
		gbc_panel13.gridx = 0;
		gbc_panel13.gridy = 3;
		contentPane.add(panel13, gbc_panel13);
		GridBagLayout gbl_panel13 = new GridBagLayout();
		gbl_panel13.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel13.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel13.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel13.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel13.setLayout(gbl_panel13);
		
		//final JButton button1311 = new JButton("   ");
		button1311.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[55]){
					button1311.setText(textKeyinValue.getText());
					res[1][3][1][1]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button1311 = new GridBagConstraints();
		gbc_button1311.insets = new Insets(0, 0, 5, 5);
		gbc_button1311.gridx = 0;
		gbc_button1311.gridy = 0;
		panel13.add(button1311, gbc_button1311);
		
		//final JButton button1321 = new JButton("   ");
		button1321.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[56]){
					button1321.setText(textKeyinValue.getText());
					res[1][3][2][1]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button1321 = new GridBagConstraints();
		gbc_button1321.insets = new Insets(0, 0, 5, 5);
		gbc_button1321.gridx = 1;
		gbc_button1321.gridy = 0;
		panel13.add(button1321, gbc_button1321);
		
		//final JButton button1331 = new JButton("   ");
		button1331.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[57]){
					button1331.setText(textKeyinValue.getText());
					res[1][3][3][1]=textKeyinValue.getText();
					if(checkwin()){					
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);	
					}
				//}
			}
		});
		GridBagConstraints gbc_button1331 = new GridBagConstraints();
		gbc_button1331.insets = new Insets(0, 0, 5, 0);
		gbc_button1331.gridx = 2;
		gbc_button1331.gridy = 0;
		panel13.add(button1331, gbc_button1331);
		
		//final JButton button1312 = new JButton("   ");
		button1312.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[58]){
					button1312.setText(textKeyinValue.getText());
					res[1][3][1][2]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button1312 = new GridBagConstraints();
		gbc_button1312.insets = new Insets(0, 0, 5, 5);
		gbc_button1312.gridx = 0;
		gbc_button1312.gridy = 1;
		panel13.add(button1312, gbc_button1312);
		
		//final JButton button1322 = new JButton("   ");
		button1322.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[59]){
					button1322.setText(textKeyinValue.getText());
					res[1][3][2][2]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button1322 = new GridBagConstraints();
		gbc_button1322.insets = new Insets(0, 0, 5, 5);
		gbc_button1322.gridx = 1;
		gbc_button1322.gridy = 1;
		panel13.add(button1322, gbc_button1322);
		
		//final JButton button1332 = new JButton("   ");
		button1332.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(!application.frmpb.slck[60]){
					button1332.setText(textKeyinValue.getText());
					res[1][3][3][2]=textKeyinValue.getText();
					if(checkwin()){
						JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
						application.frmpc.setVisible(true);
						application.frmpb.setVisible(false);
					}
				//}
			}
		});
		GridBagConstraints gbc_button1332 = new GridBagConstraints();
		gbc_button1332.insets = new Insets(0, 0, 5, 0);
		gbc_button1332.gridx = 2;
		gbc_button1332.gridy = 1;
		panel13.add(button1332, gbc_button1332);
		
		//final JButton button1313 = new JButton("   ");
		button1313.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button1313.setText(textKeyinValue.getText());
				res[1][3][1][3]=textKeyinValue.getText();
				if(checkwin()){
					JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
					application.frmpc.setVisible(true);
					application.frmpb.setVisible(false);
				}
			}
		});
		GridBagConstraints gbc_button1313 = new GridBagConstraints();
		gbc_button1313.insets = new Insets(0, 0, 0, 5);
		gbc_button1313.gridx = 0;
		gbc_button1313.gridy = 2;
		panel13.add(button1313, gbc_button1313);
		
		//final JButton button1323 = new JButton("   ");
		button1323.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button1323.setText(textKeyinValue.getText());
				res[1][3][2][3]=textKeyinValue.getText();
				if(checkwin()){
					JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
					application.frmpc.setVisible(true);
					application.frmpb.setVisible(false);
				}
			}
		});
		GridBagConstraints gbc_button1323 = new GridBagConstraints();
		gbc_button1323.insets = new Insets(0, 0, 0, 5);
		gbc_button1323.gridx = 1;
		gbc_button1323.gridy = 2;
		panel13.add(button1323, gbc_button1323);
		
		//final JButton button1333 = new JButton("   ");
		button1333.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button1333.setText(textKeyinValue.getText());
				res[1][3][3][3]=textKeyinValue.getText();
				if(checkwin()){
					JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
					application.frmpc.setVisible(true);
					application.frmpb.setVisible(false);
				}
			}
		});
		GridBagConstraints gbc_button1333 = new GridBagConstraints();
		gbc_button1333.gridx = 2;
		gbc_button1333.gridy = 2;
		panel13.add(button1333, gbc_button1333);
		
		JPanel panel23 = new JPanel();
		panel23.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.RED, new Color(255, 0, 255), Color.RED, new Color(255, 0, 255)));
		GridBagConstraints gbc_panel23 = new GridBagConstraints();
		gbc_panel23.insets = new Insets(0, 0, 5, 5);
		gbc_panel23.fill = GridBagConstraints.BOTH;
		gbc_panel23.gridx = 1;
		gbc_panel23.gridy = 3;
		contentPane.add(panel23, gbc_panel23);
		GridBagLayout gbl_panel23 = new GridBagLayout();
		gbl_panel23.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel23.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel23.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel23.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel23.setLayout(gbl_panel23);
		
		//final JButton button2311 = new JButton("   ");
		button2311.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button2311.setText(textKeyinValue.getText());
				res[2][3][1][1]=textKeyinValue.getText();
				if(checkwin()){
					JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
					application.frmpc.setVisible(true);
					application.frmpb.setVisible(false);
				}
			}
		});
		GridBagConstraints gbc_button2311 = new GridBagConstraints();
		gbc_button2311.insets = new Insets(0, 0, 5, 5);
		gbc_button2311.gridx = 0;
		gbc_button2311.gridy = 0;
		panel23.add(button2311, gbc_button2311);
		
		//final JButton button2321 = new JButton("   ");
		button2321.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button2321.setText(textKeyinValue.getText());
				res[2][3][2][1]=textKeyinValue.getText();
				if(checkwin()){
					JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
					application.frmpc.setVisible(true);
					application.frmpb.setVisible(false);
				}
			}
		});
		GridBagConstraints gbc_button2321 = new GridBagConstraints();
		gbc_button2321.insets = new Insets(0, 0, 5, 5);
		gbc_button2321.gridx = 1;
		gbc_button2321.gridy = 0;
		panel23.add(button2321, gbc_button2321);
		
		//final JButton button2331 = new JButton("   ");
		button2331.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button2331.setText(textKeyinValue.getText());
				res[2][3][3][1]=textKeyinValue.getText();
				if(checkwin()){
					JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
					application.frmpc.setVisible(true);
					application.frmpb.setVisible(false);
				}
			}
		});
		GridBagConstraints gbc_button2331 = new GridBagConstraints();
		gbc_button2331.insets = new Insets(0, 0, 5, 0);
		gbc_button2331.gridx = 2;
		gbc_button2331.gridy = 0;
		panel23.add(button2331, gbc_button2331);
		
		//final JButton button2312 = new JButton("   ");
		button2312.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button2312.setText(textKeyinValue.getText());
				res[2][3][1][2]=textKeyinValue.getText();
				if(checkwin()){
					JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
					application.frmpc.setVisible(true);
					application.frmpb.setVisible(false);
				}
			}
		});
		GridBagConstraints gbc_button2312 = new GridBagConstraints();
		gbc_button2312.insets = new Insets(0, 0, 5, 5);
		gbc_button2312.gridx = 0;
		gbc_button2312.gridy = 1;
		panel23.add(button2312, gbc_button2312);
		
		//final JButton button2322 = new JButton("   ");
		button2322.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button2322.setText(textKeyinValue.getText());
				res[2][3][2][2]=textKeyinValue.getText();
				if(checkwin()){
					JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
					application.frmpc.setVisible(true);
					application.frmpb.setVisible(false);
				}
			}
		});
		GridBagConstraints gbc_button2322 = new GridBagConstraints();
		gbc_button2322.insets = new Insets(0, 0, 5, 5);
		gbc_button2322.gridx = 1;
		gbc_button2322.gridy = 1;
		panel23.add(button2322, gbc_button2322);
		
		//final JButton button2332 = new JButton("   ");
		button2332.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button2332.setText(textKeyinValue.getText());
				res[2][3][3][2]=textKeyinValue.getText();
				if(checkwin()){
					JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
					application.frmpc.setVisible(true);
					application.frmpb.setVisible(false);
				}
			}
		});
		GridBagConstraints gbc_button2332 = new GridBagConstraints();
		gbc_button2332.insets = new Insets(0, 0, 5, 0);
		gbc_button2332.gridx = 2;
		gbc_button2332.gridy = 1;
		panel23.add(button2332, gbc_button2332);
		
		//final JButton button2313 = new JButton("   ");
		button2313.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button2313.setText(textKeyinValue.getText());
				res[2][3][1][3]=textKeyinValue.getText();
				if(checkwin()){
					JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
					application.frmpc.setVisible(true);
					application.frmpb.setVisible(false);
				}
			}
		});
		GridBagConstraints gbc_button2313 = new GridBagConstraints();
		gbc_button2313.insets = new Insets(0, 0, 0, 5);
		gbc_button2313.gridx = 0;
		gbc_button2313.gridy = 2;
		panel23.add(button2313, gbc_button2313);
		
		//final JButton button2323 = new JButton("   ");
		button2323.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button2323.setText(textKeyinValue.getText());
				res[2][3][2][3]=textKeyinValue.getText();
				if(checkwin()){
					JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
					application.frmpc.setVisible(true);
					application.frmpb.setVisible(false);
				}
			}
		});
		GridBagConstraints gbc_button2323 = new GridBagConstraints();
		gbc_button2323.insets = new Insets(0, 0, 0, 5);
		gbc_button2323.gridx = 1;
		gbc_button2323.gridy = 2;
		panel23.add(button2323, gbc_button2323);
		
		//final JButton button2333 = new JButton("   ");
		button2333.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button2333.setText(textKeyinValue.getText());
				res[2][3][3][3]=textKeyinValue.getText();
				if(checkwin()){
					JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
					application.frmpc.setVisible(true);
					application.frmpb.setVisible(false);
				}
			}
		});
		GridBagConstraints gbc_button2333 = new GridBagConstraints();
		gbc_button2333.gridx = 2;
		gbc_button2333.gridy = 2;
		panel23.add(button2333, gbc_button2333);

		JPanel panel33 = new JPanel();
		panel33.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.RED, new Color(255, 0, 255), Color.RED, new Color(255, 0, 255)));
		GridBagConstraints gbc_panel33 = new GridBagConstraints();
		gbc_panel33.insets = new Insets(0, 0, 5, 0);
		gbc_panel33.fill = GridBagConstraints.BOTH;
		gbc_panel33.gridx = 2;
		gbc_panel33.gridy = 3;
		contentPane.add(panel33, gbc_panel33);
		GridBagLayout gbl_panel33 = new GridBagLayout();
		gbl_panel33.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel33.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel33.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel33.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel33.setLayout(gbl_panel33);
		
		//final JButton button3311 = new JButton("   ");
		button3311.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button3311.setText(textKeyinValue.getText());
				res[3][3][1][1]=textKeyinValue.getText();
				if(checkwin()){
					JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
					application.frmpc.setVisible(true);
					application.frmpb.setVisible(false);
				}
			}
		});
		GridBagConstraints gbc_button3311 = new GridBagConstraints();
		gbc_button3311.insets = new Insets(0, 0, 5, 5);
		gbc_button3311.gridx = 0;
		gbc_button3311.gridy = 0;
		panel33.add(button3311, gbc_button3311);
		
		//final JButton button3321 = new JButton("   ");
		button3321.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button3321.setText(textKeyinValue.getText());
				res[3][3][2][1]=textKeyinValue.getText();
				if(checkwin()){
					JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
					application.frmpc.setVisible(true);
					application.frmpb.setVisible(false);
				}
			}
		});
		GridBagConstraints gbc_button3321 = new GridBagConstraints();
		gbc_button3321.insets = new Insets(0, 0, 5, 5);
		gbc_button3321.gridx = 1;
		gbc_button3321.gridy = 0;
		panel33.add(button3321, gbc_button3321);
		
		//final JButton button3331 = new JButton("   ");
		button3331.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button3331.setText(textKeyinValue.getText());
				res[3][3][3][1]=textKeyinValue.getText();
				if(checkwin()){
					JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
					application.frmpc.setVisible(true);
					application.frmpb.setVisible(false);
				}
			}
		});
		GridBagConstraints gbc_button3331 = new GridBagConstraints();
		gbc_button3331.insets = new Insets(0, 0, 5, 0);
		gbc_button3331.gridx = 2;
		gbc_button3331.gridy = 0;
		panel33.add(button3331, gbc_button3331);
		
		//final JButton button3312 = new JButton("   ");
		button3312.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button3312.setText(textKeyinValue.getText());
				res[3][3][1][2]=textKeyinValue.getText();
				if(checkwin()){
					JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
					application.frmpc.setVisible(true);
					application.frmpb.setVisible(false);
				}
			}
		});
		GridBagConstraints gbc_button3312 = new GridBagConstraints();
		gbc_button3312.insets = new Insets(0, 0, 5, 5);
		gbc_button3312.gridx = 0;
		gbc_button3312.gridy = 1;
		panel33.add(button3312, gbc_button3312);
		
		//final JButton button3322 = new JButton("   ");
		button3322.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button3322.setText(textKeyinValue.getText());
				res[3][3][2][2]=textKeyinValue.getText();
				if(checkwin()){
					JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
					application.frmpc.setVisible(true);
					application.frmpb.setVisible(false);
				}
			}
		});
		GridBagConstraints gbc_button3322 = new GridBagConstraints();
		gbc_button3322.insets = new Insets(0, 0, 5, 5);
		gbc_button3322.gridx = 1;
		gbc_button3322.gridy = 1;
		panel33.add(button3322, gbc_button3322);
		
		//final JButton button3332 = new JButton("   ");
		button3332.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button3332.setText(textKeyinValue.getText());
				res[3][3][3][2]=textKeyinValue.getText();
				if(checkwin()){
					JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
					application.frmpc.setVisible(true);
					application.frmpb.setVisible(false);
				}
			}
		});
		GridBagConstraints gbc_button3332 = new GridBagConstraints();
		gbc_button3332.insets = new Insets(0, 0, 5, 0);
		gbc_button3332.gridx = 2;
		gbc_button3332.gridy = 1;
		panel33.add(button3332, gbc_button3332);
		
		//final JButton button3313 = new JButton("   ");
		button3313.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button3313.setText(textKeyinValue.getText());
				res[3][3][1][3]=textKeyinValue.getText();
				if(checkwin()){
					JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
					application.frmpc.setVisible(true);
					application.frmpb.setVisible(false);
				}
			}
		});
		GridBagConstraints gbc_button3313 = new GridBagConstraints();
		gbc_button3313.insets = new Insets(0, 0, 0, 5);
		gbc_button3313.gridx = 0;
		gbc_button3313.gridy = 2;
		panel33.add(button3313, gbc_button3313);
		
		//final JButton button3323 = new JButton("   ");
		button3323.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button3323.setText(textKeyinValue.getText());
				res[3][3][2][3]=textKeyinValue.getText();
				if(checkwin()){
					JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
					application.frmpc.setVisible(true);
					application.frmpb.setVisible(false);
				}
			}
		});
		GridBagConstraints gbc_button3323 = new GridBagConstraints();
		gbc_button3323.insets = new Insets(0, 0, 0, 5);
		gbc_button3323.gridx = 1;
		gbc_button3323.gridy = 2;
		panel33.add(button3323, gbc_button3323);
		
		//final JButton button3333 = new JButton("   ");
		button3333.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button3333.setText(textKeyinValue.getText());
				res[3][3][3][3]=textKeyinValue.getText();
				if(checkwin()){
					JOptionPane.showMessageDialog(null, "玩家已得出正確解答！");
					application.frmpc.setVisible(true);
					application.frmpb.setVisible(false);
				}
			}
		});
		GridBagConstraints gbc_button3333 = new GridBagConstraints();
		gbc_button3333.gridx = 2;
		gbc_button3333.gridy = 2;
		panel33.add(button3333, gbc_button3333);
		
		JLabel lblNewLabel_1 = new JLabel("填入數值:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 4;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textKeyinValue = new JTextField();
		textKeyinValue.setText("1");
		GridBagConstraints gbc_textKeyinValue = new GridBagConstraints();
		gbc_textKeyinValue.insets = new Insets(0, 0, 5, 0);
		gbc_textKeyinValue.fill = GridBagConstraints.HORIZONTAL;
		gbc_textKeyinValue.gridx = 2;
		gbc_textKeyinValue.gridy = 4;
		contentPane.add(textKeyinValue, gbc_textKeyinValue);
		textKeyinValue.setColumns(10);
	}
}
