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
import javax.swing.JEditorPane;
import java.awt.Font;
import java.awt.Color;


public class about extends JFrame {

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
	public about() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("全民數獨通");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JEditorPane dtrpnXxxx = new JEditorPane();
		dtrpnXxxx.setBackground(Color.PINK);
		dtrpnXxxx.setForeground(Color.BLUE);
		dtrpnXxxx.setFont(new Font("標楷體", Font.BOLD, 18));
		dtrpnXxxx.setText("\u5168\u6C11\u6578\u7368\u901A\r\n\r\n\u6307\u5C0E\u6559\u6388:\r\n\u590F\u90ED\u8CE2\r\n\r\n\u88FD\u4F5C\u5718\u968A:\r\n\u5442\u540D\u9E92\r\n\u6797\u61B2\u714C\r\n\u5442\u6C38\u7965\r\n\u694A\u666F\u667A");
		contentPane.add(dtrpnXxxx, BorderLayout.CENTER);
		
		JButton btnReturn = new JButton("\u8FD4\u56DE");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				application.frmtitle.setVisible(true);
				application.frmabout.setVisible(false);
			}
		});
		contentPane.add(btnReturn, BorderLayout.EAST);
	}

}
