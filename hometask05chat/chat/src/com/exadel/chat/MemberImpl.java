package com.exadel.chat;

/**
 * Created by alex on 2014-12-09.
 */
public class MemberImpl implements Member {

    private String username;
    private Chat chat;

    public MemberImpl(String username, Chat chat) {
        this.username = username;
        this.chat = chat;

        chat.getUsers().add(this);
    }

    @Override
    public void sendMessage(String username, String message) {
        chat.sendMessage(this.username, username, message);
    }

    @Override
    public void received(String username, String message) {
        System.out.println(username + " - " + message);
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
