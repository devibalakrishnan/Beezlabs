package json;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadCsv {
	
	

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
	//path of csv files
		String file = "C:\\Users\\Admin\\Downloads\\Company_Data.csv";
		String file1 = "C:\\Users\\Admin\\Downloads\\Project_Data.csv";
		String file2 = "C:\\Users\\Admin\\Downloads\\Project_Lead.csv";
		
		
		
		
		try {
			//read company data csv file
			
			@SuppressWarnings("unused")
			String array[] = new String[10];
			
			
			String line = " ";
			BufferedReader reader1 = null;
			reader1 = new BufferedReader(new FileReader(file));
			while((line=reader1.readLine()) !=null) {
			String[] row = line.split(",");
			
				
				  Map<String, String> map = new HashMap<String, String>(); 
		          map.put("CompanyName", row[1]);
		          map.put("ProjectId", row[2]);
		          map.put("ProjectLeadId", row[3]);
		          System.out.println(map);	 		
		          
		       
				
		        
		      String line1= "";
		      BufferedReader reader2 = null;
			  reader2 = new BufferedReader(new FileReader(file1));
			  while((line1=reader2.readLine()) !=null) {
			  String[] row1 = line1.split(",");
			  
				
					Map<String, String> map1 = new HashMap<String, String>(); 
			        map1.put("projectId", row1[0]);
			        map1.put("projectName", row1[1]);
			        System.out.println(map1);	 		
			        
				
			        
					
			 String line2= "";  
			 BufferedReader reader3 = null; 
			 reader3 = new BufferedReader(new FileReader(file2)); 
			 while((line2=reader3.readLine())!=null) {  
			 String[] row2 = line2.split(","); 
			 
			 		
					Map<String, String> map2 = new HashMap<String, String>(); 
					map2.put("projectLeadId", row2[0]); 
					map2.put("projectName", row2[1]);
					
					System.out.println(map2);	 		 
					  }			
		}
		}}
		
		catch(IOException e){
			e.printStackTrace();
			
		}
		
		 
		}
		
	}
	

