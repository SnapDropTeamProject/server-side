package org.http;

import java.io.IOException;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.handlers.EndpointHandler;

public class Endpoint implements HttpHandler {
  private String _path;
  private EndpointHandler _handler;

  public Endpoint(String path, EndpointHandler handler) {
    _path = path;
    _handler = handler;
  }

  @Override
  public void handle(HttpExchange exchange) throws IOException {
    _handler.handle(exchange);    
  }

  public String getPath() {
    return _path;
  }

  public EndpointHandler getHandler() {
    return _handler;
  }
}
