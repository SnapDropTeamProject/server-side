package org.abstractions;

import org.http.Endpoint;

import com.sun.net.httpserver.HttpServer;

public abstract class BaseModule {
  
  public abstract Endpoint[] getEndpoints();

  public void initialize(HttpServer server) {
    Endpoint[] endpoints = this.getEndpoints();

    for (Endpoint endpoint : endpoints) {
      server.createContext(endpoint.getPath(), endpoint.getHandler());
    }
  }

}
