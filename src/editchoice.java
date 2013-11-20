import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JList;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class editchoice extends JFrame {

	private JPanel contentPane;
	private JTextField textTemplate;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					playchoice frame = new playchoice();
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
	public editchoice() {
		setResizable(false);
		setTitle("全民數獨通");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("編輯題庫選單");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JList listTemplate = new JList();
		GridBagConstraints gbc_listTemplate = new GridBagConstraints();
		gbc_listTemplate.gridwidth = 2;
		gbc_listTemplate.gridheight = 7;
		gbc_listTemplate.fill = GridBagConstraints.BOTH;
		gbc_listTemplate.gridx = 3;
		gbc_listTemplate.gridy = 0;
		contentPane.add(listTemplate, gbc_listTemplate);
		
		textTemplate = new JTextField();
		GridBagConstraints gbc_textTemplate = new GridBagConstraints();
		gbc_textTemplate.gridwidth = 3;
		gbc_textTemplate.insets = new Insets(0, 0, 5, 5);
		gbc_textTemplate.fill = GridBagConstraints.HORIZONTAL;
		gbc_textTemplate.gridx = 0;
		gbc_textTemplate.gridy = 2;
		contentPane.add(textTemplate, gbc_textTemplate);
		textTemplate.setColumns(10);
		
		JButton btnEdit = new JButton("編輯此題庫");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				application.frmeb.setVisible(true);
				application.frmec.setVisible(false);
			}
		});
		GridBagConstraints gbc_btnEdit = new GridBagConstraints();
		gbc_btnEdit.gridwidth = 3;
		gbc_btnEdit.insets = new Insets(0, 0, 5, 5);
		gbc_btnEdit.gridx = 0;
		gbc_btnEdit.gridy = 3;
		contentPane.add(btnEdit, gbc_btnEdit);
		
		JButton btnDelete = new JButton("刪除此題庫");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int result=JOptionPane.showOptionDialog(null,"是否確定要刪除？","請確認",0,0,null,null,null);
				
				//若點點的是決定要移除
				if(result==0){
					
				}
			}
		});
		GridBagConstraints gbc_btnDelete = new GridBagConstraints();
		gbc_btnDelete.gridwidth = 3;
		gbc_btnDelete.insets = new Insets(0, 0, 5, 5);
		gbc_btnDelete.gridx = 0;
		gbc_btnDelete.gridy = 4;
		contentPane.add(btnDelete, gbc_btnDelete);
		
		JButton btnReturn = new JButton("返回");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				application.frmtitle.setVisible(true);
				application.frmec.setVisible(false);
			}
		});
		GridBagConstraints gbc_btnReturn = new GridBagConstraints();
		gbc_btnReturn.gridwidth = 3;
		gbc_btnReturn.insets = new Insets(0, 0, 5, 5);
		gbc_btnReturn.gridx = 0;
		gbc_btnReturn.gridy = 5;
		contentPane.add(btnReturn, gbc_btnReturn);
		
		JLabel label = new JLabel("題型:");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 0, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 6;
		contentPane.add(label, gbc_label);
		
		JRadioButton rdbtnTemplate3 = new JRadioButton("3x3");
		rdbtnTemplate3.setSelected(true);
		GridBagConstraints gbc_rdbtnTemplate3 = new GridBagConstraints();
		gbc_rdbtnTemplate3.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnTemplate3.gridx = 1;
		gbc_rdbtnTemplate3.gridy = 6;
		contentPane.add(rdbtnTemplate3, gbc_rdbtnTemplate3);
		
		JRadioButton rdbtnTemplate5 = new JRadioButton("5x5");
		GridBagConstraints gbc_rdbtnTemplate5 = new GridBagConstraints();
		gbc_rdbtnTemplate5.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnTemplate5.gridx = 2;
		gbc_rdbtnTemplate5.gridy = 6;
		contentPane.add(rdbtnTemplate5, gbc_rdbtnTemplate5);
	}

}
