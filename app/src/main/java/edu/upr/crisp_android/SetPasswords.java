package edu.upr.crisp_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SetPasswords extends AppCompatActivity {

    private static Intent intent;
    private String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_passwords);
        intent = getIntent();
        username = intent.getStringExtra("user name");
    }

    public void setProfileScreen(View view) {
        final String password = ((EditText) findViewById(R.id.passwordText)).getText().toString();
        final String confirmPassword = ((EditText) findViewById(R.id.confirmPasswordText)).getText().toString();
        if (password.equals(confirmPassword)) {
            Intent profileIntent = new Intent(this, SetProfile.class);
            profileIntent.putExtra("user name", username);
            profileIntent.putExtra("password", password);
            startActivity(profileIntent);
        }
    }
}
