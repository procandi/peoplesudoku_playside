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
import java.io.File;
import java.util.Vector;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class editchoice extends JFrame {

	private JPanel contentPane;
	private JTextField textTemplate;
	
	JList listTemplate = new JList();	
	
	
	/*取得樣版清單*/
	public static void getsudokulist(){
		int i;
		String regex;
		String[] filelist;
		Vector v=new Vector();
		
		filelist=clsFile.GetFileList(".");
		regex="^.+.sudoku$";
				
		for(i=0;i<filelist.length;i++){
			if(filelist[i].matches(regex)){
				v.add(filelist[i].replace(".\\", "").replace(".sudoku", ""));
			}
		}
		
		application.frmec.listTemplate.setListData(v);
	}
	
	

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
		
		GridBagConstraints gbc_listTemplate = new GridBagConstraints();
		gbc_listTemplate.gridwidth = 2;
		gbc_listTemplate.gridheight = 7;
		gbc_listTemplate.fill = GridBagConstraints.BOTH;
		gbc_listTemplate.gridx = 3;
		gbc_listTemplate.gridy = 0;
		listTemplate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textTemplate.setText((String)listTemplate.getSelectedValue());
			}
		});
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
				/*檢查看看此檔名是否已經存在，已存在的情況下，就把資料讀取出來*/
				application.targettemplate=textTemplate.getText();
			    File f;
			    f = new File(application.targettemplate+".sudoku");
				if(f.exists()){
					application.frmeb.loadtemplate();
				}else{
					application.frmeb.cleartemplate();
				}
				
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
				    File f;
				    f = new File((String)listTemplate.getSelectedValue()+".sudoku");
					if(f.exists()){
						f.delete();
						application.frmec.getsudokulist();	//需要重整清單
					}
					
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
	}

}
