package com.exadel.chat;

/**
 * Created by alex on 2014-12-09.
 */
public interface Member {
    String getUsername();
    void sendMessage(String username, String message);
    void received(String username, String message);
}
