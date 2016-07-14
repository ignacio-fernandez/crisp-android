package edu.upr.crisp_android;

/**
 * Created by ignacio on 07-07-16.
 */
public class User {
    private final String username;
    private final String password;
    private final int profile; // 1: Consumer, 2: Producer, 3: Prosumer
    private final String firstName;
    private final String lastName;
    private final String email;

    public User(String firstName, String lastName, String username, String email, String password, int profile) {
        this.username = username;
        this.password = password;
        this.profile = profile;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getUsername() { return this.username; }

    public String getPassword() { return this.password; }

    public int getProfile() { return this.profile; }
}
