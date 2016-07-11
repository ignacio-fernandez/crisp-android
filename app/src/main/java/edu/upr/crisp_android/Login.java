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
        final int profile = intent.getIntExtra("profile", 1);
        final User user = new User(username, password, profile);
        userPassMap.put(user.getUsername(), user);
    }


    public void login(View view) {
        final String username = ((EditText) findViewById(R.id.editText)).getText().toString();
        final String password = ((EditText)findViewById(R.id.editText2)).getText().toString();
        if (userPassMap.containsKey(username)) {
            final User user = userPassMap.get(username);
            if (user.getPassword().equals(password)) {
                final int profile = user.getProfile();
                if (profile == 1) {
                    Intent intent = new Intent(this, Consumer.class);
                    startActivity(intent);
                }
                else if (profile == 2) {
                    Intent intent = new Intent(this, Producer.class);
                    startActivity(intent);
                }
                else {
                    Intent intent = new Intent(this, Prosumer.class);
                    startActivity(intent);
                }
            }
            else {
                throw new RuntimeException("Incorrect password!");
            }
        }
        else {
            throw new RuntimeException("Incorrect username!");
        }
    }

    public void addUser(View view) {
        Intent intent = new Intent(this, AddUserNames.class);
        startActivity(intent);
    }
}
