package org.handlers;

import java.io.IOException;


import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class EndpointHandler{
    private String _response = "Hello";
    private HttpHandler _handler;

    public EndpointHandler(){
        _response = "Hello";
        _handler = new HealthCheckHandler();
    }

    public EndpointResponse handle(HttpExchange exchange) throws IOException{
        exchange.sendResponseHeaders(200, _response.length());
        exchange.getResponseBody().write(_response.getBytes());
        exchange.close();
        return new EndpointResponse(1, _response);
    }
    
    public HttpHandler getHandler(){
        return _handler;
    }
}