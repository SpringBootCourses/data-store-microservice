package com.example.datastore.service;

public interface CDCEventConsumer {

    void handle(String message);

}
