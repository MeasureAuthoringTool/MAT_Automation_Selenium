package pages;

import  java.sql.Connection;		
import  java.sql.Statement;		
import  java.sql.ResultSet;		
import  java.sql.DriverManager;		
import  java.sql.SQLException;	

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
	public class  SQLConnector {				
	    	public static void  main(String[] args) throws  ClassNotFoundException, SQLException {													
					//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
	                String dbUrl = "jdbc:mysql://dmmattmyq01.telligen.us:3306/MAT_APP2_New";					

					//Database Username		
					String username = "cbajikar";	
	                
					//Database Password		
					String password = "Trump2016";				

					//Query to Execute		
					//String query = "SELECT * FROM MAT_APP2_New.QDM_ATTRIBUTES";	
					
					// Measure XMl Copy
					
					String query = "SELECT * FROM MAT_APP2_New.MEASURE_XML where MEASURE_ID = '2c91c3865c2244ee015c2253c5170042'";
	                
	         	    //Load mysql jdbc driver		
	           	    Class.forName("com.mysql.jdbc.Driver");			
	           
	           		//Create Connection to DB		
	            	Connection con = DriverManager.getConnection(dbUrl,username,password);
	          
	          		//Create Statement Object		
	        	   Statement stmt = con.createStatement();					
	       
	       			// Execute the SQL Query. Store results in ResultSet		
	         		ResultSet rs= stmt.executeQuery(query);							
	         
	         		// While Loop to iterate through all data and print results		
					while (rs.next()){
				        		String myId = rs.getString(1);								        
	                            String myXMLName = rs.getString(3);	
	                            System. out.println(myXMLName);	
	                            
	                            //String xmlString = "<?xml version=\"1.0\" encoding=\"utf-8\"?><a><b></b><c></c></a>";  
	                            Document doc = convertStringToDocument(myXMLName);
	                            
	                            String str = convertDocumentToString(doc);
	                            System.out.println(str);
	                            
	                            String UUID=doc.getElementsByTagName("uuid").item(0).getTextContent();
	                            String Title=doc.getElementsByTagName("title").item(0).getTextContent();
	                            System.out.println("UUID:::" + UUID);
	                            System.out.println("Title:::" + Title);
	                            
	                           XPath xpath = XPathFactory.newInstance().newXPath();
	                           String expression = "//entry/link/@href";
	                        /*  XPathExpression xp = XPathFactory.newInstance().newXPath().compile("//entry/link/@href");
	                            NodeList links = (NodeList) xp.evaluate(doc, XPathConstants.NODESET);*/
	                           //nodeList = (NodeList) xpath.compile(expression).evaluate(doc, XPathConstants.NODESET);
	                   
	                 
	                            
	                            
	                         
	                    }		
	      			 // closing DB Connection		
	      			con.close();			
			}
	    	
	    	
	    	
	    	 private static String convertDocumentToString(Document doc) {
	    	        TransformerFactory tf = TransformerFactory.newInstance();
	    	        Transformer transformer;
	    	        try {
	    	            transformer = tf.newTransformer();
	    	            // below code to remove XML declaration
	    	            // transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
	    	            StringWriter writer = new StringWriter();
	    	            transformer.transform(new DOMSource(doc), new StreamResult(writer));
	    	            String output = writer.getBuffer().toString();
	    	            return output;
	    	        } catch (TransformerException e) {
	    	            e.printStackTrace();
	    	        }
	    	        
	    	        return null;
	    	    }

	    	    private static Document convertStringToDocument(String xmlStr) {
	    	        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
	    	        DocumentBuilder builder;  
	    	        try  
	    	        {  
	    	            builder = factory.newDocumentBuilder();  
	    	            Document doc = builder.parse( new InputSource( new StringReader( xmlStr ) ) ); 
	    	            return doc;
	    	        } catch (Exception e) {  
	    	            e.printStackTrace();  
	    	        } 
	    	        return null;
	    	    }

}
	


