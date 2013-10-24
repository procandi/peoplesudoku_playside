import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;


public class title extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					title frame = new title();
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
	public title() {
		setTitle("全民數獨通");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnPlay = new JButton("進入解題");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playchoice pc=new playchoice();
				pc.show();
			}
		});
		contentPane.add(btnPlay, BorderLayout.WEST);
		
		JButton btnEdit = new JButton("編輯題庫");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editchoice ec=new editchoice();
				ec.show();
			}
		});
		contentPane.add(btnEdit, BorderLayout.EAST);
		
		JButton btnExit = new JButton("離開");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		contentPane.add(btnExit, BorderLayout.SOUTH);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("title.png"));
		contentPane.add(button, BorderLayout.CENTER);
	}

}
