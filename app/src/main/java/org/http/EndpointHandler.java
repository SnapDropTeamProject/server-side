package org.http;

import java.io.IOException;


import com.sun.net.httpserver.HttpExchange;

public class EndpointHandler{
    private String _response = "Hello";

    public EndpointHandler(){
        _response = "Hello";
    }

    public EndpointResponse handle(HttpExchange exchange) throws IOException{
        String response = "Hey";
      
        exchange.sendResponseHeaders(200, response.length());
        exchange.getResponseBody().write(response.getBytes());
        exchange.close();
        return new EndpointResponse(1, _response);
    }
}