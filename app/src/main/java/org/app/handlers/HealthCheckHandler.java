package org.app.handlers;

import java.io.IOException;

import org.app.AppController;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class HealthCheckHandler implements HttpHandler  {
  private final AppController _appController;

  public HealthCheckHandler(AppController appController) {
    _appController = appController;
  }
  
  @Override
  public void handle(HttpExchange exchange) throws IOException {
      String response = _appController.healthCheck();
      
      exchange.sendResponseHeaders(200, response.length());
      exchange.getResponseBody().write(response.getBytes());
      exchange.close();
  }
}
