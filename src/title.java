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
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Frame;


public class title extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
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
	}*/

	/**
	 * Create the frame.
	 */
	public title() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("全民數獨通");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnPlay = new JButton("進入解題");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				application.frmpc.getsudokulist();
				application.frmtitle.setVisible(false);
				application.frmpc.setVisible(true);
			}
		});
		contentPane.add(btnPlay, BorderLayout.WEST);
		
		JButton btnEdit = new JButton("編輯題庫");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				application.frmec.getsudokulist();
				application.frmtitle.setVisible(false);
				application.frmec.setVisible(true);
			}
		});
		contentPane.add(btnEdit, BorderLayout.EAST);
		
		JButton btnAbout = new JButton("關於");
		btnAbout.setActionCommand("關於");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				application.frmabout.setVisible(true);
				application.frmtitle.setVisible(false);
			}
		});
		contentPane.add(btnAbout, BorderLayout.SOUTH);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("title.png"));
		contentPane.add(button, BorderLayout.CENTER);
	}

}
