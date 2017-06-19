package com.pankaj.dev.Messenger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.pankaj.dev.Messenger.database.DatabaseClass;
import com.pankaj.dev.Messenger.model.MessageModel;
import com.pankaj.dev.Messenger.model.Profile;

public class MessageService {
	
	private  Map<Long,Profile> profiles=DatabaseClass.getProfiles();
	private  Map<Long,MessageModel> messages =DatabaseClass.getMessages();
	public List<MessageModel> getAllMessages(){
		return new ArrayList<MessageModel>(messages.values());
	}
	public List<Profile> getAllProfiles(){
		return new ArrayList<Profile>(profiles.values());
	}
	
	public MessageModel getMessage(long id){
		return messages.get(id);
	}
	public MessageModel addMessage(MessageModel message){
		message.setId(messages.size()+1);
		messages.put(message.getId(),message);
		return message;
	}
	public MessageModel updateMessage(MessageModel message){
		if(message.getId()<=0)
			return null;
		messages.put(message.getId(),message);
			return message;
	}
	public MessageModel removeMessage(MessageModel message){
		return messages.remove(message.getId());
	}
}
