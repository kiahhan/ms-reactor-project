package com.newegg.ec.search.ms.com.newegg.ec.search.ms.model;

public class HelloResponse {

    private String hello;

    public HelloResponse() {
        this.hello = "";
    }

    public HelloResponse(String hello) {
        this.hello = hello;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
