

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
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Vector;


public class playchoice extends JFrame {

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
		
		application.frmpc.listTemplate.setListData(v);
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
	public playchoice() {
		setResizable(false);
		setTitle("全民數獨通");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("選擇解題選單");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		listTemplate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textTemplate.setText((String)listTemplate.getSelectedValue());
			}
		});
		GridBagConstraints gbc_listTemplate = new GridBagConstraints();
		gbc_listTemplate.gridwidth = 2;
		gbc_listTemplate.gridheight = 7;
		gbc_listTemplate.fill = GridBagConstraints.BOTH;
		gbc_listTemplate.gridx = 1;
		gbc_listTemplate.gridy = 0;
		contentPane.add(listTemplate, gbc_listTemplate);
		
		textTemplate = new JTextField();
		GridBagConstraints gbc_textTemplate = new GridBagConstraints();
		gbc_textTemplate.insets = new Insets(0, 0, 5, 5);
		gbc_textTemplate.fill = GridBagConstraints.HORIZONTAL;
		gbc_textTemplate.gridx = 0;
		gbc_textTemplate.gridy = 2;
		contentPane.add(textTemplate, gbc_textTemplate);
		textTemplate.setColumns(10);
		
		JButton btnPlayer = new JButton("以玩家身份開始");
		btnPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*檢查看看此檔名是否已經存在，已存在的情況下，就把資料讀取出來*/
				application.targettemplate=textTemplate.getText();
			    File f;
			    f = new File(application.targettemplate+".sudoku");
				if(f.exists()){
					application.frmpb.loadtemplate();
				}else{
					application.frmpb.cleartemplate();
				}
				
				
				application.player=true;
				application.frmpb.setVisible(true);
				application.frmpc.setVisible(false);
			}
		});
		GridBagConstraints gbc_btnPlayer = new GridBagConstraints();
		gbc_btnPlayer.insets = new Insets(0, 0, 5, 5);
		gbc_btnPlayer.gridx = 0;
		gbc_btnPlayer.gridy = 3;
		contentPane.add(btnPlayer, gbc_btnPlayer);
		
		JButton btnComputer = new JButton("以電腦身份開始");
		btnComputer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*檢查看看此檔名是否已經存在，已存在的情況下，就把資料讀取出來*/
				application.targettemplate=textTemplate.getText();
			    File f;
			    f = new File(application.targettemplate+".sudoku");
				if(f.exists()){
					application.frmpb.loadtemplate();
				}else{
					application.frmpb.cleartemplate();
				}
				
				
				/*如果是電腦玩遊戲的話，讓電腦直接跑遞迴算出解答*/
				application.player=false;				
				application.frmpb.computerhandle();
				application.frmpb.setVisible(true);
				application.frmpc.setVisible(false);
			}
		});
		GridBagConstraints gbc_btnComputer = new GridBagConstraints();
		gbc_btnComputer.insets = new Insets(0, 0, 5, 5);
		gbc_btnComputer.gridx = 0;
		gbc_btnComputer.gridy = 4;
		contentPane.add(btnComputer, gbc_btnComputer);
		
		JButton btnReturn = new JButton("返回");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				application.frmtitle.setVisible(true);
				application.frmpc.setVisible(false);
			}
		});
		GridBagConstraints gbc_btnReturn = new GridBagConstraints();
		gbc_btnReturn.insets = new Insets(0, 0, 5, 5);
		gbc_btnReturn.gridx = 0;
		gbc_btnReturn.gridy = 5;
		contentPane.add(btnReturn, gbc_btnReturn);
	}

}
