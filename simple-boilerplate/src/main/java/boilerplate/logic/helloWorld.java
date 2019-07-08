package boilerplate.logic;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

// Specifies the path to the RESTful service
@Path("/helloworld")
public class helloWorld {
 
   // Specifies that the method processes HTTP GET requests 
   @GET
   @Produces("text/plain")
   public String sayHello() {
      return "Hello World!";
   }
   
   	@GET
	@Path("/ko")
	public Response getMsg()
	{
		String output = "Message requested";
		//Simply return the parameter passed as message
		return Response.status(200).entity(output).build();
	}
}