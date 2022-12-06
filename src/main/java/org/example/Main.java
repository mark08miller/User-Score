package org.example;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();
        int userScore = service.getUserScore(new String[] {"123:12", "івп:89", "youtte1F@gmail.com:34"}, "youtte1F@gmail.com");
    }
}
