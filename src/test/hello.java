package test;


import java.io.BufferedReader;
import java.io.InputStreamReader;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;




@SuppressWarnings("unused")
@Path("hello")
public class hello {

	@GET
	  @Produces(MediaType.TEXT_PLAIN)
	  public String sayPlainTextHello() {
	    return "Hello Jersey";
	  }
	
	@GET
	  @Produces(MediaType.TEXT_XML)
	  public String sayXMLHello() {
	    return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey!" + "</hello>";
	  }
	
	
   
     /*ArrayList list = new ArrayList();
     while (cursor.hasNext()) { 
            DBObject o = cursor.next();
            SaveData bools = new  SaveData();
            bools.setJobName((String) o.get("JobName"));
            bools.setCronTime((String) o.get("CronTime"));
            list.add(bools);
         }
     return list;*/
     
     
    
	
	}


