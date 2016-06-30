package edu.upr.crisp_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.HashMap;
import java.util.Map;

public class Login extends AppCompatActivity {

    private final Map<String, String> userPassMap = new HashMap<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void login(View view) {
        final String username = ((EditText) findViewById(R.id.editText)).getText().toString();
        final String password = ((EditText)findViewById(R.id.editText2)).getText().toString();
        if (userPassMap.keySet().contains(username) && password.equals(userPassMap.get(username))) {
            Intent bidsIntent = new Intent(this, User.class);
            startActivity(bidsIntent);
        }
        else {
            // TODO incorrect password
        }
    }

    public void addUser(View view) {
        Intent intent = new Intent(this, AddUser.class);
        startActivity(intent);
        Intent intent2 = getIntent();
        String username = intent2.getStringExtra("username");
        String password = intent2.getStringExtra("password");
        userPassMap.put(username, password);
        System.out.println(userPassMap);
    }
}
