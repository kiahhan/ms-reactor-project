package com.newegg.ec.search.ms.com.newegg.ec.search.ms.model;

public class HelloRequest {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HelloRequest(String name) {
        this.name = name;
    }

    public HelloRequest() {
        this.name = "";
    }
}
