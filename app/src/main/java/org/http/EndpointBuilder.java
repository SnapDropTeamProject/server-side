package org.http;

import com.sun.net.httpserver.HttpHandler;

public class EndpointBuilder {
    private String _path;
    private HttpHandler _handler;

    public EndpointBuilder() { }

    public EndpointBuilder path(String path) {
        _path = path;
        return this;
    }

    public EndpointBuilder handler(HttpHandler handler) {
        _handler = handler;
        return this;
    }

    public Endpoint build() {
        return new Endpoint(_path, _handler);
    }
}
