package com.pankaj.dev.Messenger.database;

import java.util.HashMap;
import java.util.Map;

import com.pankaj.dev.Messenger.model.MessageModel;
import com.pankaj.dev.Messenger.model.Profile;

public class DatabaseClass {

	private static Map<Long,Profile> profiles=new HashMap<Long,Profile>();
	private static Map<Long,MessageModel> messages=new HashMap<Long,MessageModel>();
	public static  Map<Long,Profile> getProfiles()	{
		return profiles;
	}
	public static Map<Long,MessageModel> getMessages(){
		return messages;
	}
}
