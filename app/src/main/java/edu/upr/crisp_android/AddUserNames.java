package edu.upr.crisp_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class AddUserNames extends AppCompatActivity {

    private static Intent intent;
    private int profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
        intent = new Intent(this, Login.class);
    }

    public void createConsumerProfile(View view) {
        profile = 1;
    }

    public void createProducerProfile(View view) {
        profile = 2;
    }

    public void createProsumerProfile(View view) {
        profile = 3;
    }

    public void addUser(View view) {
        final String username = ((EditText) findViewById(R.id.userNameText)).getText().toString();
        final String password = ((EditText) findViewById(R.id.passwordText)).getText().toString();
        final String confirmPassword = ((EditText) findViewById(R.id.confirmPasswordText)).getText().toString();
        intent = new Intent(this, Login.class);
        if (password.equals(confirmPassword)) {
            intent.putExtra("username", username);
            intent.putExtra("password", password);
            intent.putExtra("profile", profile);
            startActivity(intent);
        }
        else {
            throw new RuntimeException("Passwords do not match");
        }
    }
}
