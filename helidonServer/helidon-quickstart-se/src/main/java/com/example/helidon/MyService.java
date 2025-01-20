package com.example.helidon;
import com.example.helidon.Msg;
import io.helidon.websocket.WsListener;
import io.helidon.websocket.WsSession;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import io.helidon.websocket.WsSession;
import java.util.List;
import java.net.URI;
import com.google.gson.Gson;
import java.util.Optional;
import io.helidon.http.HttpPrologue;
import io.helidon.http.Headers;
import io.helidon.websocket.WsUpgradeException;
public class MyService implements WsListener{
	private static final Gson gson=new Gson();
//	private final String clientid;
	//private final ConcurrentMap<String, WsSession> sessions;
	public MyService(ConcurrentHashMap<String,WsSession> sessions){
		//this.sessions=sessions;
        //this.clientid="dummyID";
	}

	@Override 
	public Optional<Headers> onHttpUpgrade(HttpPrologue prologue,
 Headers headers)throws WsUpgradeException{
		System.out.println(prologue.query().get("id"));
		return WsListener.super.onHttpUpgrade(prologue,headers);
	}
	
	@Override 
	public void onOpen(WsSession session){
		//sessions.put(clientid,session);
	//	System.out.println("Connected "+clientid);
	}
    @Override
    public void onMessage(WsSession session, String text, boolean last) {
		session.send(text,last);
    }
	@Override
	public void onClose(WsSession session,int statusCode, String reason){
		//sessions.remove(clientid);
	//	System.out.println("Disconnected "+clientid);
	}
}
