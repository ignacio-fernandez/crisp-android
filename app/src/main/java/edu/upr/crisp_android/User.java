package edu.upr.crisp_android;

/**
 * Created by ignacio on 07-07-16.
 */
public class User {
    private final String username;
    private final String password;
    private final String name;
    private final int profile; // 1: Consumer, 2: Producer, 3: Prosumer

    public User(String username, String password, String name, int profile) {
        this.username = username;
        this.password = password;
        this.name = name; 
        this.profile = profile;
    }

    public int getProfile() {
        return profile;
    }
}
