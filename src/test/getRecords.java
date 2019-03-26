package test;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.server.model.ModelValidationException;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

@Path("/getRecords")  
public class getRecords {

	
	@GET
	@Path("/fsb")  	
    @Produces(MediaType.APPLICATION_JSON)  
	@Consumes(MediaType.APPLICATION_JSON)
    public Response getRecords(){
     NightData nd = new NightData();
    
     
     String fsb="fsb";
	DBCollection coll =  nd.mongoConnection(fsb);
     DBCursor cursor = coll.find().sort(new BasicDBObject("by", 1));
     String json = null;
     //JSONArray list = new JSONArray();//<String>();
   LinkedList<SaveData> list=new LinkedList<SaveData>();
	while (cursor.hasNext()) { 
    	 DBObject o  = cursor.next();
    	 List<String> ls = (List<String>) o.get("CronDescription");
    	 SaveData sd = new SaveData();
    	 sd.setCronTime((String) o.get("CronTime"));
    	 sd.setJobName((String) o.get("JobName"));
    	 sd.setTimeDescription((String) o.get("TimeDescription"));
    	 sd.setServer((String) o.get("Server"));
    	 System.out.println(sd.getCronTime());
    	 sd.setJobStatus((String) o.get("JobStatus"));
    	 sd.setJobStatus((String) o.get("JobStatus"));
    	sd.setGetCrondescription(ls);
    	/* JSONObject jsonObj = new JSONObject( sd );
    	 list.add(jsonObj);*/
    	 list.add(sd);
    	 }
     System.out.println("VAl="+Arrays.asList(list));
     return Response.ok() //200
 			.entity(list)
 			.header("Access-Control-Allow-Origin", "*")
 			.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
 			.allow("OPTIONS").build();
 
    
     
	}
	
	@GET
	@Path("/ci")  	
    @Produces(MediaType.APPLICATION_JSON)  
	@Consumes(MediaType.APPLICATION_JSON)
    public Response getRecordsci(){
     NightData nd = new NightData();
    
     String ci="ci";
     DBCollection coll =  nd.mongoConnection(ci);
     DBCursor cursor = coll.find().sort(new BasicDBObject("by", 1));
     String json = null;
     //JSONArray list = new JSONArray();//<String>();
   LinkedList<SaveData> list=new LinkedList<SaveData>();
	while (cursor.hasNext()) { 
    	 DBObject o  = cursor.next();
    	 SaveData sd = new SaveData();
    	 sd.setCronTime((String) o.get("CronTime"));
    	 sd.setJobName((String) o.get("JobName"));  
    	 sd.setTimeDescription((String) o.get("TimeDescription"));
    	 sd.setServer((String) o.get("Server"));
    	 sd.setJobStatus((String) o.get("JobStatus"));
    	 System.out.println(sd.getJobStatus());
    	 List<String> ls = (List<String>) o.get("CronDescription");
    	 sd.setGetCrondescription(ls);
    	 //System.out.println(sd.getCronTime());
    	/* JSONObject jsonObj = new JSONObject( sd );
    	 list.add(jsonObj);*/
    	 list.add(sd);
    	 }
     System.out.println("VAl="+Arrays.asList(list));
     return Response.ok() //200
 			.entity(list)
 			.header("Access-Control-Allow-Origin", "*")
 			.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
 			.allow("OPTIONS").build();
 
    
     
	}
}
