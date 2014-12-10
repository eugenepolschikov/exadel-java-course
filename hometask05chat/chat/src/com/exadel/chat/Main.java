package com.exadel.chat;

/**
 * Created by alex on 2014-12-09.
 */
public class Main {


    public static void main(String[] args) {
        Chat chat = new Chat();

        Member sergeyMember = new MemberImpl("Sergey", chat);
        Member evgeniyMemger = new MemberImpl("Evgeniy", chat);
        Member alexMember = new MemberImpl("Alex", chat);

        alexMember.sendMessage("Sergey", "Hello Segey");
        sergeyMember.sendMessage("Evgeniy", "Hello Evgeniy");
    }

}
