package testClsPackage;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;

import cmnFunctionsPackage.API_Common_Function;
import cmnFunctionsPackage.Utility_Common_Function;
import io.restassured.path.json.JsonPath;
import reqRepositoryPackage.Post_req_repo;

public class Post_TC_2 {
	@Test
	public static void execute() throws IOException {
		
		for(int i=0 ; i<5 ; i++) 
		{
			String baseURI = Post_req_repo.Base_URI();
			String resource = Post_req_repo.Post_Resource() ;
			String requestbody = Post_req_repo.Post_TC2();
			int statusCode = API_Common_Function.Response_statusCode(baseURI, requestbody, resource);
			System.out.println(statusCode);
			if(statusCode == 200) 
			{	
				String responseBody = API_Common_Function.Response_body(baseURI, requestbody, resource);
				System.out.println(responseBody);
				Post_TC_2.validator(responseBody, statusCode);
				Utility_Common_Function.Evidence_File_Creator("Post_TC_2", Post_req_repo.Post_Resource(), responseBody);
				break;
			}
			else 
			{
				System.out.println("Correct StatusCode is not found. Hence retrying the API ");
			}
			
		}	
	}	
			
		
	public static void validator(String responseBody, int statusCode) throws IOException  {
		
		// Step 4: Parse the response body
		JsonPath jsp = new JsonPath(responseBody);
		String res_name = jsp.getString("name");
		String res_year = jsp.getString("data.year");
		Object res_price = jsp.getString("data.price");
		String res_CPU_model = jsp.getString("data.CPU_model");
		String res_Hard_disk_size = jsp.getString("data.Hard_disk_size");
		
		String res_id = jsp.getString("id");
		String res_createdAt = jsp.getString("createdAt");

		// Step 5: Parse request body and it's parameters
		JsonPath jspreq = new JsonPath(Post_req_repo.Post_TC2());
		String req_name = jspreq.getString("name");
		String req_year = jspreq.getString("data.year");
		Object req_price = jspreq.getString("data.price");
		String req_CPU_model = jspreq.getString("data.CPU_model");
		String req_Hard_disk_size = jspreq.getString("data.Hard_disk_size");
		
		// Step 6: Validate the response body parameters
		AssertJUnit.assertEquals(statusCode, 200);
		AssertJUnit.assertEquals(res_name, req_name);
		AssertJUnit.assertEquals(res_year, req_year);
		AssertJUnit.assertEquals(res_price, req_price);
		AssertJUnit.assertEquals(res_CPU_model, req_CPU_model);
		AssertJUnit.assertEquals(res_Hard_disk_size, req_Hard_disk_size);

		// Validate "id" and "createdAt" using Assert
		Assert.assertNotNull(res_id);
		Assert.assertNotNull(res_createdAt);
		
		// Validate "createdAt" using slice method for date
        String expectedDate = new java.util.Date().toInstant().toString().substring(0, 10);
        String actualDate = res_createdAt.substring(0, 10);
        AssertJUnit.assertEquals(actualDate, expectedDate);

	}

}
