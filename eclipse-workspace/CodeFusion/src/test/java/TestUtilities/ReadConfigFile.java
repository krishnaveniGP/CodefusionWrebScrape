//package TestUtilities;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Properties;
//public class ReadConfigFile 
//{
//	
//		private static Properties prop;
//		
//		public Properties initProp()
//		
//		{
//			prop=new Properties();
//			try {
//				FileInputStream fis=new FileInputStream("./src/test/resources/Configuration/config.properties");
//				prop.load(fis);
//			} catch (FileNotFoundException e) {
//				
//				e.printStackTrace();
//			} catch (IOException e) {
//				
//				e.printStackTrace();
//			}
//			return prop;
//			
//		}
//			
//		
//		public String getUrl1()
//		{   
//			
//			String getUrl=prop.getProperty("URL");
//			if(getUrl!=null)
//			{
//				return getUrl;
//			}else
//			{
//				System.out.println("url not mentioned in config properties");
//			}	return getUrl;	
//		}
//		
//		
//		
//		
//		
//		
////		public static String excelPath()
////		{
////			String ExcelPath=prop.getProperty("ExceldataPath");
////			if(ExcelPath!=null)		
////				return ExcelPath;
////				else throw new RuntimeException("Excel data path missing");
////			
////		}
//
//	}
//
//	
//
//
