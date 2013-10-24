import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
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
import javax.swing.JTextField;


public class editboard extends JFrame {

	private JPanel contentPane;
	private JTextField textKeyinValue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					editboard frame = new editboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public editboard() {
		setTitle("全民數獨通");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 400);
		contentPane = new JPanel();
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("編輯題庫");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JButton btnCommit = new JButton("確認儲存");
		btnCommit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnCommit = new GridBagConstraints();
		gbc_btnCommit.insets = new Insets(0, 0, 5, 5);
		gbc_btnCommit.gridx = 1;
		gbc_btnCommit.gridy = 0;
		contentPane.add(btnCommit, gbc_btnCommit);
		
		JButton btnGiveup = new JButton("放棄編輯");
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
		
		JButton button1111 = new JButton("   ");
		GridBagConstraints gbc_button1111 = new GridBagConstraints();
		gbc_button1111.insets = new Insets(0, 0, 5, 5);
		gbc_button1111.gridx = 0;
		gbc_button1111.gridy = 0;
		panel11.add(button1111, gbc_button1111);
		
		JButton button1121 = new JButton("   ");
		GridBagConstraints gbc_button1121 = new GridBagConstraints();
		gbc_button1121.insets = new Insets(0, 0, 5, 5);
		gbc_button1121.gridx = 1;
		gbc_button1121.gridy = 0;
		panel11.add(button1121, gbc_button1121);
		
		JButton button1131 = new JButton("   ");
		GridBagConstraints gbc_button1131 = new GridBagConstraints();
		gbc_button1131.insets = new Insets(0, 0, 5, 0);
		gbc_button1131.gridx = 2;
		gbc_button1131.gridy = 0;
		panel11.add(button1131, gbc_button1131);
		
		JButton button1112 = new JButton("   ");
		GridBagConstraints gbc_button1112 = new GridBagConstraints();
		gbc_button1112.insets = new Insets(0, 0, 5, 5);
		gbc_button1112.gridx = 0;
		gbc_button1112.gridy = 1;
		panel11.add(button1112, gbc_button1112);
		
		JButton button1122 = new JButton("   ");
		GridBagConstraints gbc_button1122 = new GridBagConstraints();
		gbc_button1122.insets = new Insets(0, 0, 5, 5);
		gbc_button1122.gridx = 1;
		gbc_button1122.gridy = 1;
		panel11.add(button1122, gbc_button1122);
		
		JButton button1132 = new JButton("   ");
		GridBagConstraints gbc_button1132 = new GridBagConstraints();
		gbc_button1132.insets = new Insets(0, 0, 5, 0);
		gbc_button1132.gridx = 2;
		gbc_button1132.gridy = 1;
		panel11.add(button1132, gbc_button1132);
		
		JButton button1113 = new JButton("   ");
		GridBagConstraints gbc_button1113 = new GridBagConstraints();
		gbc_button1113.insets = new Insets(0, 0, 0, 5);
		gbc_button1113.gridx = 0;
		gbc_button1113.gridy = 2;
		panel11.add(button1113, gbc_button1113);
		
		JButton button1123 = new JButton("   ");
		GridBagConstraints gbc_button1123 = new GridBagConstraints();
		gbc_button1123.insets = new Insets(0, 0, 0, 5);
		gbc_button1123.gridx = 1;
		gbc_button1123.gridy = 2;
		panel11.add(button1123, gbc_button1123);
		
		JButton button1133 = new JButton("   ");
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
		
		JButton button2111 = new JButton("   ");
		GridBagConstraints gbc_button2111 = new GridBagConstraints();
		gbc_button2111.insets = new Insets(0, 0, 5, 5);
		gbc_button2111.gridx = 0;
		gbc_button2111.gridy = 0;
		panel21.add(button2111, gbc_button2111);
		
		JButton button2121 = new JButton("   ");
		GridBagConstraints gbc_button2121 = new GridBagConstraints();
		gbc_button2121.insets = new Insets(0, 0, 5, 5);
		gbc_button2121.gridx = 1;
		gbc_button2121.gridy = 0;
		panel21.add(button2121, gbc_button2121);
		
		JButton button2131 = new JButton("   ");
		GridBagConstraints gbc_button2131 = new GridBagConstraints();
		gbc_button2131.insets = new Insets(0, 0, 5, 0);
		gbc_button2131.gridx = 2;
		gbc_button2131.gridy = 0;
		panel21.add(button2131, gbc_button2131);
		
		JButton button2112 = new JButton("   ");
		GridBagConstraints gbc_button2112 = new GridBagConstraints();
		gbc_button2112.insets = new Insets(0, 0, 5, 5);
		gbc_button2112.gridx = 0;
		gbc_button2112.gridy = 1;
		panel21.add(button2112, gbc_button2112);
		
		JButton button2122 = new JButton("   ");
		GridBagConstraints gbc_button2122 = new GridBagConstraints();
		gbc_button2122.insets = new Insets(0, 0, 5, 5);
		gbc_button2122.gridx = 1;
		gbc_button2122.gridy = 1;
		panel21.add(button2122, gbc_button2122);
		
		JButton button2132 = new JButton("   ");
		GridBagConstraints gbc_button2132 = new GridBagConstraints();
		gbc_button2132.insets = new Insets(0, 0, 5, 0);
		gbc_button2132.gridx = 2;
		gbc_button2132.gridy = 1;
		panel21.add(button2132, gbc_button2132);
		
		JButton button2113 = new JButton("   ");
		GridBagConstraints gbc_button2113 = new GridBagConstraints();
		gbc_button2113.insets = new Insets(0, 0, 0, 5);
		gbc_button2113.gridx = 0;
		gbc_button2113.gridy = 2;
		panel21.add(button2113, gbc_button2113);
		
		JButton button2123 = new JButton("   ");
		GridBagConstraints gbc_button2123 = new GridBagConstraints();
		gbc_button2123.insets = new Insets(0, 0, 0, 5);
		gbc_button2123.gridx = 1;
		gbc_button2123.gridy = 2;
		panel21.add(button2123, gbc_button2123);
		
		JButton button2133 = new JButton("   ");
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
		
		JButton button3111 = new JButton("   ");
		GridBagConstraints gbc_button3111 = new GridBagConstraints();
		gbc_button3111.insets = new Insets(0, 0, 5, 5);
		gbc_button3111.gridx = 0;
		gbc_button3111.gridy = 0;
		panel31.add(button3111, gbc_button3111);
		
		JButton button3121 = new JButton("   ");
		GridBagConstraints gbc_button3121 = new GridBagConstraints();
		gbc_button3121.insets = new Insets(0, 0, 5, 5);
		gbc_button3121.gridx = 1;
		gbc_button3121.gridy = 0;
		panel31.add(button3121, gbc_button3121);
		
		JButton button3131 = new JButton("   ");
		GridBagConstraints gbc_button3131 = new GridBagConstraints();
		gbc_button3131.insets = new Insets(0, 0, 5, 0);
		gbc_button3131.gridx = 2;
		gbc_button3131.gridy = 0;
		panel31.add(button3131, gbc_button3131);
		
		JButton button3112 = new JButton("   ");
		GridBagConstraints gbc_button3112 = new GridBagConstraints();
		gbc_button3112.insets = new Insets(0, 0, 5, 5);
		gbc_button3112.gridx = 0;
		gbc_button3112.gridy = 1;
		panel31.add(button3112, gbc_button3112);
		
		JButton button3122 = new JButton("   ");
		GridBagConstraints gbc_button3122 = new GridBagConstraints();
		gbc_button3122.insets = new Insets(0, 0, 5, 5);
		gbc_button3122.gridx = 1;
		gbc_button3122.gridy = 1;
		panel31.add(button3122, gbc_button3122);
		
		JButton button3132 = new JButton("   ");
		GridBagConstraints gbc_button3132 = new GridBagConstraints();
		gbc_button3132.insets = new Insets(0, 0, 5, 0);
		gbc_button3132.gridx = 2;
		gbc_button3132.gridy = 1;
		panel31.add(button3132, gbc_button3132);
		
		JButton button3113 = new JButton("   ");
		GridBagConstraints gbc_button3113 = new GridBagConstraints();
		gbc_button3113.insets = new Insets(0, 0, 0, 5);
		gbc_button3113.gridx = 0;
		gbc_button3113.gridy = 2;
		panel31.add(button3113, gbc_button3113);
		
		JButton button3123 = new JButton("   ");
		GridBagConstraints gbc_button3123 = new GridBagConstraints();
		gbc_button3123.insets = new Insets(0, 0, 0, 5);
		gbc_button3123.gridx = 1;
		gbc_button3123.gridy = 2;
		panel31.add(button3123, gbc_button3123);
		
		JButton button3133 = new JButton("   ");
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
				
				JButton button1211 = new JButton("   ");
				GridBagConstraints gbc_button1211 = new GridBagConstraints();
				gbc_button1211.insets = new Insets(0, 0, 5, 5);
				gbc_button1211.gridx = 0;
				gbc_button1211.gridy = 0;
				panel12.add(button1211, gbc_button1211);
				
				JButton button1221 = new JButton("   ");
				GridBagConstraints gbc_button1221 = new GridBagConstraints();
				gbc_button1221.insets = new Insets(0, 0, 5, 5);
				gbc_button1221.gridx = 1;
				gbc_button1221.gridy = 0;
				panel12.add(button1221, gbc_button1221);
				
				JButton button1231 = new JButton("   ");
				GridBagConstraints gbc_button1231 = new GridBagConstraints();
				gbc_button1231.insets = new Insets(0, 0, 5, 0);
				gbc_button1231.gridx = 2;
				gbc_button1231.gridy = 0;
				panel12.add(button1231, gbc_button1231);
				
				JButton button1212 = new JButton("   ");
				GridBagConstraints gbc_button1212 = new GridBagConstraints();
				gbc_button1212.insets = new Insets(0, 0, 5, 5);
				gbc_button1212.gridx = 0;
				gbc_button1212.gridy = 2;
				panel12.add(button1212, gbc_button1212);
				
				JButton button1222 = new JButton("   ");
				GridBagConstraints gbc_button1222 = new GridBagConstraints();
				gbc_button1222.insets = new Insets(0, 0, 5, 5);
				gbc_button1222.gridx = 1;
				gbc_button1222.gridy = 2;
				panel12.add(button1222, gbc_button1222);
				
				JButton button1232 = new JButton("   ");
				GridBagConstraints gbc_button1232 = new GridBagConstraints();
				gbc_button1232.insets = new Insets(0, 0, 5, 0);
				gbc_button1232.gridx = 2;
				gbc_button1232.gridy = 2;
				panel12.add(button1232, gbc_button1232);
				
				JButton button1213 = new JButton("   ");
				GridBagConstraints gbc_button1213 = new GridBagConstraints();
				gbc_button1213.insets = new Insets(0, 0, 0, 5);
				gbc_button1213.gridx = 0;
				gbc_button1213.gridy = 3;
				panel12.add(button1213, gbc_button1213);
				
				JButton button1223 = new JButton("   ");
				GridBagConstraints gbc_button1223 = new GridBagConstraints();
				gbc_button1223.insets = new Insets(0, 0, 0, 5);
				gbc_button1223.gridx = 1;
				gbc_button1223.gridy = 3;
				panel12.add(button1223, gbc_button1223);
				
				JButton button1233 = new JButton("   ");
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
				
				JButton button2211 = new JButton("   ");
				GridBagConstraints gbc_button2211 = new GridBagConstraints();
				gbc_button2211.insets = new Insets(0, 0, 5, 5);
				gbc_button2211.gridx = 0;
				gbc_button2211.gridy = 0;
				panel22.add(button2211, gbc_button2211);
				
				JButton button2221 = new JButton("   ");
				GridBagConstraints gbc_button2221 = new GridBagConstraints();
				gbc_button2221.insets = new Insets(0, 0, 5, 5);
				gbc_button2221.gridx = 1;
				gbc_button2221.gridy = 0;
				panel22.add(button2221, gbc_button2221);
				
				JButton button2231 = new JButton("   ");
				GridBagConstraints gbc_button2231 = new GridBagConstraints();
				gbc_button2231.insets = new Insets(0, 0, 5, 0);
				gbc_button2231.gridx = 2;
				gbc_button2231.gridy = 0;
				panel22.add(button2231, gbc_button2231);
				
				JButton button2212 = new JButton("   ");
				GridBagConstraints gbc_button2212 = new GridBagConstraints();
				gbc_button2212.insets = new Insets(0, 0, 5, 5);
				gbc_button2212.gridx = 0;
				gbc_button2212.gridy = 1;
				panel22.add(button2212, gbc_button2212);
				
				JButton button2222 = new JButton("   ");
				GridBagConstraints gbc_button2222 = new GridBagConstraints();
				gbc_button2222.insets = new Insets(0, 0, 5, 5);
				gbc_button2222.gridx = 1;
				gbc_button2222.gridy = 1;
				panel22.add(button2222, gbc_button2222);
				
				JButton button2232 = new JButton("   ");
				GridBagConstraints gbc_button2232 = new GridBagConstraints();
				gbc_button2232.insets = new Insets(0, 0, 5, 0);
				gbc_button2232.gridx = 2;
				gbc_button2232.gridy = 1;
				panel22.add(button2232, gbc_button2232);
				
				JButton button2213 = new JButton("   ");
				GridBagConstraints gbc_button2213 = new GridBagConstraints();
				gbc_button2213.insets = new Insets(0, 0, 0, 5);
				gbc_button2213.gridx = 0;
				gbc_button2213.gridy = 2;
				panel22.add(button2213, gbc_button2213);
				
				JButton button2223 = new JButton("   ");
				GridBagConstraints gbc_button2223 = new GridBagConstraints();
				gbc_button2223.insets = new Insets(0, 0, 0, 5);
				gbc_button2223.gridx = 1;
				gbc_button2223.gridy = 2;
				panel22.add(button2223, gbc_button2223);
				
				JButton button2233 = new JButton("   ");
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
				
				JButton button3211 = new JButton("   ");
				GridBagConstraints gbc_button3211 = new GridBagConstraints();
				gbc_button3211.insets = new Insets(0, 0, 5, 5);
				gbc_button3211.gridx = 0;
				gbc_button3211.gridy = 0;
				panel32.add(button3211, gbc_button3211);
				
				JButton button3221 = new JButton("   ");
				GridBagConstraints gbc_button3221 = new GridBagConstraints();
				gbc_button3221.insets = new Insets(0, 0, 5, 5);
				gbc_button3221.gridx = 1;
				gbc_button3221.gridy = 0;
				panel32.add(button3221, gbc_button3221);
				
				JButton button3231 = new JButton("   ");
				GridBagConstraints gbc_button3231 = new GridBagConstraints();
				gbc_button3231.insets = new Insets(0, 0, 5, 0);
				gbc_button3231.gridx = 2;
				gbc_button3231.gridy = 0;
				panel32.add(button3231, gbc_button3231);
				
				JButton button3212 = new JButton("   ");
				GridBagConstraints gbc_button3212 = new GridBagConstraints();
				gbc_button3212.insets = new Insets(0, 0, 5, 5);
				gbc_button3212.gridx = 0;
				gbc_button3212.gridy = 1;
				panel32.add(button3212, gbc_button3212);
				
				JButton button3222 = new JButton("   ");
				GridBagConstraints gbc_button3222 = new GridBagConstraints();
				gbc_button3222.insets = new Insets(0, 0, 5, 5);
				gbc_button3222.gridx = 1;
				gbc_button3222.gridy = 1;
				panel32.add(button3222, gbc_button3222);
				
				JButton button3232 = new JButton("   ");
				GridBagConstraints gbc_button3232 = new GridBagConstraints();
				gbc_button3232.insets = new Insets(0, 0, 5, 0);
				gbc_button3232.gridx = 2;
				gbc_button3232.gridy = 1;
				panel32.add(button3232, gbc_button3232);
				
				JButton button3213 = new JButton("   ");
				GridBagConstraints gbc_button3213 = new GridBagConstraints();
				gbc_button3213.insets = new Insets(0, 0, 0, 5);
				gbc_button3213.gridx = 0;
				gbc_button3213.gridy = 2;
				panel32.add(button3213, gbc_button3213);
				
				JButton button3223 = new JButton("   ");
				GridBagConstraints gbc_button3223 = new GridBagConstraints();
				gbc_button3223.insets = new Insets(0, 0, 0, 5);
				gbc_button3223.gridx = 1;
				gbc_button3223.gridy = 2;
				panel32.add(button3223, gbc_button3223);
				
				JButton button3233 = new JButton("   ");
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
				
				JButton button1311 = new JButton("   ");
				GridBagConstraints gbc_button1311 = new GridBagConstraints();
				gbc_button1311.insets = new Insets(0, 0, 5, 5);
				gbc_button1311.gridx = 0;
				gbc_button1311.gridy = 0;
				panel13.add(button1311, gbc_button1311);
				
				JButton button1321 = new JButton("   ");
				GridBagConstraints gbc_button1321 = new GridBagConstraints();
				gbc_button1321.insets = new Insets(0, 0, 5, 5);
				gbc_button1321.gridx = 1;
				gbc_button1321.gridy = 0;
				panel13.add(button1321, gbc_button1321);
				
				JButton button1331 = new JButton("   ");
				GridBagConstraints gbc_button1331 = new GridBagConstraints();
				gbc_button1331.insets = new Insets(0, 0, 5, 0);
				gbc_button1331.gridx = 2;
				gbc_button1331.gridy = 0;
				panel13.add(button1331, gbc_button1331);
				
				JButton button1312 = new JButton("   ");
				GridBagConstraints gbc_button1312 = new GridBagConstraints();
				gbc_button1312.insets = new Insets(0, 0, 5, 5);
				gbc_button1312.gridx = 0;
				gbc_button1312.gridy = 1;
				panel13.add(button1312, gbc_button1312);
				
				JButton button1322 = new JButton("   ");
				GridBagConstraints gbc_button1322 = new GridBagConstraints();
				gbc_button1322.insets = new Insets(0, 0, 5, 5);
				gbc_button1322.gridx = 1;
				gbc_button1322.gridy = 1;
				panel13.add(button1322, gbc_button1322);
				
				JButton button1332 = new JButton("   ");
				GridBagConstraints gbc_button1332 = new GridBagConstraints();
				gbc_button1332.insets = new Insets(0, 0, 5, 0);
				gbc_button1332.gridx = 2;
				gbc_button1332.gridy = 1;
				panel13.add(button1332, gbc_button1332);
				
				JButton button1313 = new JButton("   ");
				GridBagConstraints gbc_button1313 = new GridBagConstraints();
				gbc_button1313.insets = new Insets(0, 0, 0, 5);
				gbc_button1313.gridx = 0;
				gbc_button1313.gridy = 2;
				panel13.add(button1313, gbc_button1313);
				
				JButton button1323 = new JButton("   ");
				GridBagConstraints gbc_button1323 = new GridBagConstraints();
				gbc_button1323.insets = new Insets(0, 0, 0, 5);
				gbc_button1323.gridx = 1;
				gbc_button1323.gridy = 2;
				panel13.add(button1323, gbc_button1323);
				
				JButton button1333 = new JButton("   ");
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
				
				JButton button2311 = new JButton("   ");
				GridBagConstraints gbc_button2311 = new GridBagConstraints();
				gbc_button2311.insets = new Insets(0, 0, 5, 5);
				gbc_button2311.gridx = 0;
				gbc_button2311.gridy = 0;
				panel23.add(button2311, gbc_button2311);
				
				JButton button2321 = new JButton("   ");
				GridBagConstraints gbc_button2321 = new GridBagConstraints();
				gbc_button2321.insets = new Insets(0, 0, 5, 5);
				gbc_button2321.gridx = 1;
				gbc_button2321.gridy = 0;
				panel23.add(button2321, gbc_button2321);
				
				JButton button2331 = new JButton("   ");
				GridBagConstraints gbc_button2331 = new GridBagConstraints();
				gbc_button2331.insets = new Insets(0, 0, 5, 0);
				gbc_button2331.gridx = 2;
				gbc_button2331.gridy = 0;
				panel23.add(button2331, gbc_button2331);
				
				JButton button2312 = new JButton("   ");
				GridBagConstraints gbc_button2312 = new GridBagConstraints();
				gbc_button2312.insets = new Insets(0, 0, 5, 5);
				gbc_button2312.gridx = 0;
				gbc_button2312.gridy = 1;
				panel23.add(button2312, gbc_button2312);
				
				JButton button2322 = new JButton("   ");
				GridBagConstraints gbc_button2322 = new GridBagConstraints();
				gbc_button2322.insets = new Insets(0, 0, 5, 5);
				gbc_button2322.gridx = 1;
				gbc_button2322.gridy = 1;
				panel23.add(button2322, gbc_button2322);
				
				JButton button2332 = new JButton("   ");
				GridBagConstraints gbc_button2332 = new GridBagConstraints();
				gbc_button2332.insets = new Insets(0, 0, 5, 0);
				gbc_button2332.gridx = 2;
				gbc_button2332.gridy = 1;
				panel23.add(button2332, gbc_button2332);
				
				JButton button2313 = new JButton("   ");
				GridBagConstraints gbc_button2313 = new GridBagConstraints();
				gbc_button2313.insets = new Insets(0, 0, 0, 5);
				gbc_button2313.gridx = 0;
				gbc_button2313.gridy = 2;
				panel23.add(button2313, gbc_button2313);
				
				JButton button2323 = new JButton("   ");
				GridBagConstraints gbc_button2323 = new GridBagConstraints();
				gbc_button2323.insets = new Insets(0, 0, 0, 5);
				gbc_button2323.gridx = 1;
				gbc_button2323.gridy = 2;
				panel23.add(button2323, gbc_button2323);
				
				JButton button2333 = new JButton("   ");
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
				
				JButton button3311 = new JButton("   ");
				GridBagConstraints gbc_button3311 = new GridBagConstraints();
				gbc_button3311.insets = new Insets(0, 0, 5, 5);
				gbc_button3311.gridx = 0;
				gbc_button3311.gridy = 0;
				panel33.add(button3311, gbc_button3311);
				
				JButton button3321 = new JButton("   ");
				GridBagConstraints gbc_button3321 = new GridBagConstraints();
				gbc_button3321.insets = new Insets(0, 0, 5, 5);
				gbc_button3321.gridx = 1;
				gbc_button3321.gridy = 0;
				panel33.add(button3321, gbc_button3321);
				
				JButton button3331 = new JButton("   ");
				GridBagConstraints gbc_button3331 = new GridBagConstraints();
				gbc_button3331.insets = new Insets(0, 0, 5, 0);
				gbc_button3331.gridx = 2;
				gbc_button3331.gridy = 0;
				panel33.add(button3331, gbc_button3331);
				
				JButton button3312 = new JButton("   ");
				GridBagConstraints gbc_button3312 = new GridBagConstraints();
				gbc_button3312.insets = new Insets(0, 0, 5, 5);
				gbc_button3312.gridx = 0;
				gbc_button3312.gridy = 1;
				panel33.add(button3312, gbc_button3312);
				
				JButton button3322 = new JButton("   ");
				GridBagConstraints gbc_button3322 = new GridBagConstraints();
				gbc_button3322.insets = new Insets(0, 0, 5, 5);
				gbc_button3322.gridx = 1;
				gbc_button3322.gridy = 1;
				panel33.add(button3322, gbc_button3322);
				
				JButton button3332 = new JButton("   ");
				GridBagConstraints gbc_button3332 = new GridBagConstraints();
				gbc_button3332.insets = new Insets(0, 0, 5, 0);
				gbc_button3332.gridx = 2;
				gbc_button3332.gridy = 1;
				panel33.add(button3332, gbc_button3332);
				
				JButton button3313 = new JButton("   ");
				GridBagConstraints gbc_button3313 = new GridBagConstraints();
				gbc_button3313.insets = new Insets(0, 0, 0, 5);
				gbc_button3313.gridx = 0;
				gbc_button3313.gridy = 2;
				panel33.add(button3313, gbc_button3313);
				
				JButton button3323 = new JButton("   ");
				GridBagConstraints gbc_button3323 = new GridBagConstraints();
				gbc_button3323.insets = new Insets(0, 0, 0, 5);
				gbc_button3323.gridx = 1;
				gbc_button3323.gridy = 2;
				panel33.add(button3323, gbc_button3323);
				
				JButton button3333 = new JButton("   ");
				GridBagConstraints gbc_button3333 = new GridBagConstraints();
				gbc_button3333.gridx = 2;
				gbc_button3333.gridy = 2;
				panel33.add(button3333, gbc_button3333);
				
				JLabel label = new JLabel("填入數值:");
				GridBagConstraints gbc_label = new GridBagConstraints();
				gbc_label.insets = new Insets(0, 0, 5, 5);
				gbc_label.anchor = GridBagConstraints.EAST;
				gbc_label.gridx = 1;
				gbc_label.gridy = 4;
				contentPane.add(label, gbc_label);
				
				textKeyinValue = new JTextField();
				GridBagConstraints gbc_textKeyinValue = new GridBagConstraints();
				gbc_textKeyinValue.insets = new Insets(0, 0, 5, 0);
				gbc_textKeyinValue.fill = GridBagConstraints.HORIZONTAL;
				gbc_textKeyinValue.gridx = 2;
				gbc_textKeyinValue.gridy = 4;
				contentPane.add(textKeyinValue, gbc_textKeyinValue);
				textKeyinValue.setColumns(10);
	}

}
