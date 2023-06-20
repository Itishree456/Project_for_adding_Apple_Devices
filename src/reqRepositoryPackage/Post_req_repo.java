package reqRepositoryPackage;

import java.io.IOException;
import java.util.ArrayList;

import cmnFunctionsPackage.Utility_Common_Function;

public class Post_req_repo {
	
	public static String Base_URI() {

		String BaseURI = "https://api.restful-api.dev/";

		return BaseURI;

	}

	public static String Post_Resource() {

		String Resource = "objects";

		return Resource;

	}
	
	public static String Post_TC1() throws IOException {

		ArrayList<Object> data = Utility_Common_Function.ReadDataExcel("Post_Test_Data", "Post_TC_1");
		Object req_name = data.get(1);
		Object req_year = data.get(2);
		Object req_price = data.get(3);
		Object req_CPU_model = data.get(4);
		Object req_Hard_disk_size = data.get(5);
		String RequestBody = "{\r\n"
				+ "   \"name\": \""+req_name+"\",\r\n"
				+ "   \"data\": {\r\n"
				+ "      \"year\": "+req_year+",\r\n"
				+ "      \"price\": "+req_price+",\r\n"
				+ "      \"CPU_model\": \""+req_CPU_model+"\",\r\n"
				+ "      \"Hard_disk_size\": \""+req_Hard_disk_size+"\"\r\n"
				+ "   }\r\n"
				+ "}";
		
		return RequestBody;

	}

   
	public static String Post_TC2() throws IOException {

		ArrayList<Object> data = Utility_Common_Function.ReadDataExcel("Post_Test_Data", "Post_TC_2");
		Object req_name = data.get(1);
		Object req_year = data.get(2);
		Object req_price = data.get(3);
		Object req_CPU_model = data.get(4);
		Object req_Hard_disk_size = data.get(5);
		String RequestBody = "{\r\n"
				+ "   \"name\": \""+req_name+"\",\r\n"
				+ "   \"data\": {\r\n"
				+ "      \"year\": "+req_year+",\r\n"
				+ "      \"price\": "+req_price+",\r\n"
				+ "      \"CPU_model\": \""+req_CPU_model+"\",\r\n"
				+ "      \"Hard_disk_size\": \""+req_Hard_disk_size+"\"\r\n"
				+ "   }\r\n"
				+ "}";
		
		return RequestBody;


	}

	public static String Post_TC3() throws IOException {

		ArrayList<Object> data = Utility_Common_Function.ReadDataExcel("Post_Test_Data", "Post_TC_3");
		Object req_name = data.get(1);
		Object req_year = data.get(2);
		Object req_price = data.get(3);
		Object req_CPU_model = data.get(4);
		Object req_Hard_disk_size = data.get(5);
		String RequestBody = "{\r\n"
				+ "   \"name\": \""+req_name+"\",\r\n"
				+ "   \"data\": {\r\n"
				+ "      \"year\": "+req_year+",\r\n"
				+ "      \"price\": "+req_price+",\r\n"
				+ "      \"CPU_model\": \""+req_CPU_model+"\",\r\n"
				+ "      \"Hard_disk_size\": \""+req_Hard_disk_size+"\"\r\n"
				+ "   }\r\n"
				+ "}";
		
		return RequestBody;

	}
	
	public static String Post_TC4() throws IOException {

		ArrayList<Object> data = Utility_Common_Function.ReadDataExcel("Post_Test_Data", "Post_TC_4");
		Object req_name = data.get(1);
		Object req_year = data.get(2);
		Object req_price = data.get(3);
		Object req_CPU_model = data.get(4);
		Object req_Hard_disk_size = data.get(5);
		String RequestBody = "{\r\n"
				+ "   \"name\": \""+req_name+"\",\r\n"
				+ "   \"data\": {\r\n"
				+ "      \"year\": "+req_year+",\r\n"
				+ "      \"price\": "+req_price+",\r\n"
				+ "      \"CPU_model\": \""+req_CPU_model+"\",\r\n"
				+ "      \"Hard_disk_size\": \""+req_Hard_disk_size+"\"\r\n"
				+ "   }\r\n"
				+ "}";
		
		return RequestBody;

	}

}
