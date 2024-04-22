package org.http;

public class EndpointResponse{
    private int _status;
    private String _response;
    public EndpointResponse(int status, String response){
        _status = status;
        _response = response;
    }
    public void print(){
        System.out.println(_status);
        System.out.println(_response);
    }
}