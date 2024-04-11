package org.app;

import org.abstractions.BaseModule;
import org.app.abstractions.IAppService;

import org.http.Endpoint;

public class AppModule extends BaseModule {
  @Override
  public Endpoint[] getEndpoints() {
    IAppService appService = new AppService();
    AppController appController = new AppController(appService);

    return appController.getEndpoints();
  }
}
