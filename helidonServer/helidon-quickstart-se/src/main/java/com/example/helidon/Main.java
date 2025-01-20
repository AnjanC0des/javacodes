
package com.example.helidon;

import io.helidon.logging.common.LogConfig;
import io.helidon.config.Config;
import io.helidon.webserver.WebServer;
import io.helidon.webserver.http.HttpRouting;
import io.helidon.webserver.websocket.WsRouting;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import io.helidon.websocket.WsListener;
import io.helidon.websocket.WsSession;
import io.helidon.webserver.websocket.WsRoute;
import io.helidon.webserver.websocket.WsConfig;
/**
 * The application main class.
 */
public class Main {

	private static final ConcurrentHashMap<String, WsSession> sessions= new ConcurrentHashMap<>();
	private String user;
    /**
     * Cannot be instantiated.
     */
    private Main() {
    }


    /**
     * Application main entry point.
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        // load logging configuration
        LogConfig.configureRuntime();

        // initialize global config from default configuration
        Config config = Config.create();
        Config.global(config);

		
        WebServer server = WebServer.builder()
                .config(config.get("server"))
                .routing(Main::routing)
   				.addRouting(WsRouting.builder()
                            .endpoint("/message", new MyService(sessions)))
				.build()
                .start();


        System.out.println("WEB server is up! http://localhost:" + server.port() + "/simple-greet");

    }


    /**
     * Updates HTTP Routing.
     */
    static void routing(HttpRouting.Builder routing) {
        routing
               .register("/greet", new GreetService())
               .get("/simple-greet", (req, res) -> res.send("Hello World!")); 
			   
    }


}
