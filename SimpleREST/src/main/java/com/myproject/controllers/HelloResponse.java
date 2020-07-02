package com.myproject.controllers;

public class HelloResponse {
    private String hello="Hello,world!";

    public void setHello(String hello) {
        this.hello = hello;
    }

    public String getHello() {
        return hello;
    }

    @Override
    public String toString() {
        return "HelloResponse{" +
                "hello='" + hello + '\'' +
                '}';
    }
}