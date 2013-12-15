
public class application {
	/*初始化各式表單*/
	public static title frmtitle = new title();
	public static about frmabout = new about();
	public static playchoice frmpc = new playchoice();
	public static editchoice frmec = new editchoice();
	public static playboard frmpb = new playboard();
	public static editboard frmeb = new editboard();
	
	/*公用變數*/
	public static boolean player;
	public static String targettemplate;
	
		
	public static void main(String[] args) {
		frmtitle.setVisible(true);
	}
}
