package edu.upr.crisp_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.HashMap;
import java.util.Map;

public class Login extends AppCompatActivity {

    private final Map<String, User> userPassMap = new HashMap<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        final String username = intent.getStringExtra("username");
        final String password = intent.getStringExtra("password");
        final String firstName = intent.getStringExtra("first name");
        final String lastName = intent.getStringExtra("last name");
        final String email = intent.getStringExtra("email");
        final int profile = intent.getIntExtra("profile", 1);
        final User user = new User(firstName, lastName, username, email, password, profile);
        userPassMap.put(user.getUsername(), user);
    }


    public void login(View view) {
        final String username = ((EditText) findViewById(R.id.usernameText)).getText().toString();
        final String password = ((EditText)findViewById(R.id.passwordText)).getText().toString();
        User user = userPassMap.get(username);
        Intent intent;
        if (password.equals(user.getPassword())) {
            final int profile = user.getProfile();
            if (profile == 1) {
                intent = new Intent(this, Consumer.class);
            }
            else if (profile == 2) {
                intent = new Intent(this, Producer.class);
            }
            else {
                intent = new Intent(this, Prosumer.class);
            }
            startActivity(intent);
        }
        else {
            throw new RuntimeException("Incorrect username/password");
        }
    }

    public void addUser(View view) {
        Intent intent = new Intent(this, AddUserNames.class);
        startActivity(intent);
    }
}
