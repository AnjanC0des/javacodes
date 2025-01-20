
package com.example.helidon;
import java.util.List;
import java.util.ArrayList;
public class Msg{
	private List<String> recipients;
	private String sender;
	private String message;
	
	public Msg(ArrayList<String> reci, String sender, String message){
		this.recipients=reci;
		this.sender=sender;
		this.message=message;
	}

	public List<String> getRecipients(){
		return this.recipients;
	}


	public String getSender(){
		return this.sender;
	}


	public String getMessage(){
		return this.message;
	}


}
