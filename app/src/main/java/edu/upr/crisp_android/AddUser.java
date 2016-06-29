package edu.upr.crisp_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddUser extends AppCompatActivity {

    public static String username;
    public static String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
    }

    public void addUser(View view) {
        Intent intent = getIntent();
        username = ((EditText) findViewById(R.id.user)).getText().toString();
        password = ((EditText) findViewById(R.id.pass)).getText().toString();
        String confirmPassword = ((EditText) findViewById(R.id.confPass)).getText().toString();
        // TODO check that username is not already taken
        if (password.equals(confirmPassword)) {
            // TODO passwords match
            intent.putExtra("username", username);
            intent.putExtra("password", password);
        }
        else {
            // TODO passwords do not match
        }
    }
}
