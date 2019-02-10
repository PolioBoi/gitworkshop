package fileWriteRead;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

abstract public class FileWR {
	protected ArrayList<String[]> data = new ArrayList<String[]>();
	protected File file;
	protected BufferedReader reader=null;
	public FileWR() {
		readData();
		printData();
	}
	///////////////////////////////////////////////////////////////////
	protected abstract void readData();
	public abstract void writeData(String[] eve);
/////////////////////////////////////////////////////////////////////////
	private void printData() {
		for(int i=0; i<data.size();i++) {
			for(int j=0;j<data.get(i).length;j++)
				System.out.println(data.get(i)[j]);
			System.out.println("....................");
		}
	}
	/////////////////////////////////////////////////////////////////////
	public ArrayList<String[]> getData(){
		return data;
	}
}
