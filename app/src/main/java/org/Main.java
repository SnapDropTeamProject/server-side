package org;
/*
 * This source file was generated by the Gradle 'init' task
 */


import java.net.InetSocketAddress;

import org.abstractions.BaseModule;

import org.app.AppModule;

import com.sun.net.httpserver.HttpServer;

public class Main {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        BaseModule[] modules = new BaseModule[] {
            new AppModule()
        };
        
        try {
            HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

            for (BaseModule module : modules) {
                module.initialize(server);
            }
            
            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
}
