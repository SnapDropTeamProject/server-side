package org.http;

import java.io.IOException;


import com.sun.net.httpserver.HttpExchange;

public class EndpointHandler{
    private String _response = "Hello";

    public EndpointHandler(){
        _response = "Hello";
    }

    public EndpointResponse handle(HttpExchange exchange) throws IOException{
        exchange.sendResponseHeaders(200, _response.length());
        exchange.getResponseBody().write(_response.getBytes());
        exchange.close();
        return new EndpointResponse(1, _response);
    }
}