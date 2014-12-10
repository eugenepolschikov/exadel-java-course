package com.exadel.chat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 2014-12-09.
 */
public class Chat {
    private List<Member> users = new ArrayList<Member>();

    public List<Member> getUsers() {
        return users;
    }

    public void setUsers(List<Member> users) {
        this.users = users;
    }

    public void sendMessage(String senderUsername, String recieverUsername, String message) {
        for (Member member : users) {
            if (member.getUsername().equals(recieverUsername)) {
                member.received(senderUsername, message);
            }
        }
    }
}
