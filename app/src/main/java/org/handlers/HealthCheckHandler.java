package org.handlers;

import java.io.IOException;


import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class HealthCheckHandler implements HttpHandler  {
  @Override
  public void handle(HttpExchange exchange) throws IOException {
      String response = "Healty.";
      
      exchange.sendResponseHeaders(200, response.length());
      exchange.getResponseBody().write(response.getBytes());
      exchange.close();
  }
}
