import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;


public class clsFile {

  /*�����ɮ�*/
  public static boolean MoveFile(String SourcePath, String TargetPath) {
    int ch;
    FileInputStream fins;
    FileOutputStream fouts;
    File SourceFileList;
    File TargetFileList;

    try {
      SourceFileList = new File(SourcePath);
      TargetFileList = new File(TargetPath);

      if (SourceFileList.exists()) {
        fins = new FileInputStream(SourceFileList);
        fouts = new FileOutputStream(TargetFileList);

        ch = 0;
        while ( (ch = fins.read()) != -1) {
          fouts.write(ch);
        }

        fins.close();
        fouts.close();

        SourceFileList.delete();

        return true;
      }

      return false;
    }catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }
  /**/
  
  /*�ƻs�ɮ�*/
  public static boolean CopyFile(String SourcePath, String TargetPath) {
    int ch;
    FileInputStream fins;
    FileOutputStream fouts;
    File SourceFileList;
    File TargetFileList;

    try {
      SourceFileList = new File(SourcePath);
      TargetFileList = new File(TargetPath);

      if (SourceFileList.exists()) {
        fins = new FileInputStream(SourceFileList);
        fouts = new FileOutputStream(TargetFileList);

        ch = 0;
        while ( (ch = fins.read()) != -1) {
          fouts.write(ch);
        }

        fins.close();
        fouts.close();

        return true;
      }

      return false;
    }catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }
  /**/
  
  
  /*�Ψt�ΩR�O�Ӳ����ɮ�*/
  public static boolean CommandMoveFile(String SourcePath, String TargetPath) {
    try {
      Runtime.getRuntime().exec("move " + SourcePath + " " + TargetPath);
      return true;
    }catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }
  /**/
  
  /*�Ψt�ΩR�O�ӽƻs�ɮ�*/
  public static boolean CommandCopyFile(String SourcePath, String TargetPath) {
    try {
        Runtime.getRuntime().exec("copy " + SourcePath + " " + TargetPath);
        return true;
    }catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }
  /**/
  
  /*�g�J��r���ɮ�*/
  public static boolean WriteTextFile(String FilePath, String FileBody, boolean Append) {
    try {	
      BufferedWriter bw = null;
      File f = new File(FilePath);
	  FileWriter fw=new FileWriter(f,Append);
	  bw = new BufferedWriter(fw);
      
	  bw.write(FileBody);   
	  
	  bw.flush();
	  bw.close();
	
	  return true;
    }catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }
  /**/
  
  /*�q�ɮ�Ū����r*/
  public static String ReadTextFile(String FilePath){
	try {
		BufferedReader br = null;
		File f = new File(FilePath);
		FileReader fr=new FileReader(f);
		br = new BufferedReader(fr);
		String str;
		String strsum;		  
		
		strsum="";
		while ((str = br.readLine()) != null) {	
			strsum+=str;
		}
		
		br.close();
		fr.close();
		return strsum;
	}catch (Exception e) {
    	e.printStackTrace();
    	return "error";
    }
  }
  /**/
  
  /*Ū���ɮײM��*/
  public static String[] GetFileList(String FilePath){
	  int i,count;
	  String[] fileInList;
	  File f = new File(FilePath);
	  File[] fs = f.listFiles();
	  
	  fileInList=new String[fs.length];
	  for(count=0,i=0;i<fs.length;i++){ 
		  fileInList[count++]=fs[i].toString();
	  }
	  
	  return fileInList;
  }
  /**/

  /*�����ɮ׸��|���r��A���ɮ׸��|�B�ɮצW�١B�ɮ����O�����X�ӡAChoiceReturn��0�N��Ǹ��|�B1�N��ǦW�١B2�N������O*/
  public static String DivisionFilePath(String InputPath, int ChoiceReturn) {
    String Output_File_Path = "";
    String Output_File_Name = "";
    String Output_File_Class = "";

    int i;

    for (i = InputPath.length(); i > 0; i--) {
      if (InputPath.substring(i - 1, i).equals(".")) {
        Output_File_Name = InputPath.substring(0, i - 1);
        Output_File_Class = InputPath.substring(i, InputPath.length());
        break;
      }
    }

    for (i = Output_File_Name.length(); i > 0; i--) {
      if (Output_File_Name.substring(i - 1, i).equals("\\")) {
        Output_File_Path = InputPath.substring(0, i - 1);
        Output_File_Name = Output_File_Name.substring(i,Output_File_Name.length());
        break;
      }
    }

    switch (ChoiceReturn) {
      case 0:
        return Output_File_Path;
      case 1:
        return Output_File_Name;
      case 2:
        return Output_File_Class;
      default:
        return "";
    }
  }

  /**/

}
