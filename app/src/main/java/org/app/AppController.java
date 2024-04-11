package org.app;

import org.app.abstractions.IAppService;
import org.app.handlers.HealthCheckHandler;

import org.http.Endpoint;
import org.http.EndpointBuilder;

public class AppController {
  private final IAppService _appService;

  public AppController(IAppService appService) {
    _appService = appService;
  }

  public String healthCheck() {
    return _appService.healthCheck();
  }

  public Endpoint[] getEndpoints() {
    return new Endpoint[] {
      new EndpointBuilder()
      .path("/app/health")
      .handler(new HealthCheckHandler(this))
      .build()
    };
  }
}
