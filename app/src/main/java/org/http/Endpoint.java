package org.http;

import java.io.IOException;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class Endpoint implements HttpHandler {
  private String _path;
  private HttpHandler _handler;

  public Endpoint(String path, HttpHandler handler) {
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

  public HttpHandler getHandler() {
    return _handler;
  }
}
