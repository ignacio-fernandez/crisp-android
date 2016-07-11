package edu.upr.crisp_android;

/**
 * Created by ignacio on 07-07-16.
 */
public class User {
    private final String username;
    private final String password;
    private final int profile; // 1: Consumer, 2: Producer, 3: Prosumer

    public User(String username, String password, int profile) {
        this.username = username;
        this.password = password;
        this.profile = profile;
    }

    public String getUsername() { return this.username; }

    public String getPassword() { return this.password; }

    public int getProfile() { return this.profile; }
}
