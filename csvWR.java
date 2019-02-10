package fileWriteRead;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;

public class csvWR extends FileWR{
	public void writeData(String[] eve) {
		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream(new File("Philippine Holidays.csv"), true));
			StringBuilder sb = new StringBuilder();		
			pw.println("");
		    sb.append(eve[0]);
		    sb.append('/');
		    sb.append(eve[1]);
		    sb.append('/');
		    sb.append(eve[2]);
		    sb.append(',');
		    sb.append(' ');
		    sb.append(eve[3]);
		    sb.append(',');
		    sb.append(' ');
		    sb.append(eve[4]);
			pw.append(sb.toString());
			pw.close();
		}catch(Exception e) {
			System.out.println("Failed to write data");
		}
	}
	/////////////////////////////////////////////////////////////////////////
	protected void readData() {
		try {
			file = new File("Philippine Holidays.csv");
			//System.out.println("Hi");
			reader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = reader.readLine()) != null) {
				//System.out.println("line:"+line);
		        String temp[] = line.split("[/,]");
		        for(int i=0;i<temp.length;i++) {
		        	if((temp[i]).charAt(0)==' ') {
		        		StringBuilder sb = new StringBuilder(temp[i]);
		        		sb.deleteCharAt(0);
		        		temp[i]=sb.toString();
		        	}	
		        }
                data.add(temp);
		    }	
			reader.close();
			file=null;
		}catch(Exception e) {
			System.out.println("Failed to load csv holidays");
		}
	}
}
