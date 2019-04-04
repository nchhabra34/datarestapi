package test;



import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class NightData {

	

	public DBCollection mongoConnection(String buildtype)
	{
		
		MongoClient mongoClient = new MongoClient("localhost" , 27017 );
		
		try
		{
		mongoClient.getAddress();	
			
		}
		catch(Exception e)
		{
			System.out.println("Mongo is down");
		}
		
		DB database = mongoClient.getDB("BuildTimeApp");
		
		if(buildtype.equalsIgnoreCase("fsb"))
		{
		
		DBCollection nightdata =  database.getCollection("nightlydata");
		
		return nightdata;
		}
		else
		{
			DBCollection cidata =  database.getCollection("ci_data");
			return cidata;
		}
			
		
	}
	
	
	
	
	
}
