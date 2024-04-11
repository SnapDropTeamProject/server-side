package org.app;

import org.app.abstractions.IAppService;

public class AppService implements IAppService {
  public String healthCheck() {
    return "healthy";
  }
}