package com.ambev.beerpoint.model;

/**
 * Created by matheuscatossi on 05/08/17.
 */

public class Response {

    private int status;
    private String response;

    public Response(int status, String response) {
        this.response = response;
        this.status = status;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
