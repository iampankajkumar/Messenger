package com.pankaj.dev.Messenger.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.pankaj.dev.Messenger.model.MessageModel;
import com.pankaj.dev.Messenger.service.MessageService;

/**
 * Root resource (exposed at "messenger" path)
 */
@Path("/messenger")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	MessageService m=new MessageService();
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MessageModel> getIt() {
        return m.getAllMessages();
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public MessageModel addMessage(MessageModel message){
    	return  m.addMessage(message);
    }
    @GET
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    public MessageModel getMessage(@PathParam("messageId") Long messageId){
    	return m.getMessage(messageId);
    }
}
