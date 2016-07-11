package edu.upr.crisp_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SetProfile extends AppCompatActivity {

    private static Intent intent;
    private static Intent loginIntent;
    private String username;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_profile);
        intent = getIntent();
        username = intent.getStringExtra("user name");
        password = intent.getStringExtra("password");
        loginIntent = new Intent(this, Login.class);
        loginIntent.putExtra("username", username);
        loginIntent.putExtra("password", password);
    }

    public void setConsumerProfile(View view) {
        loginIntent.putExtra("profile", 1);
        startActivity(loginIntent);
    }

    public void setProducerProfile(View view) {
        loginIntent.putExtra("profile", 2);
        startActivity(loginIntent);
    }

    public void setProsumerProfile(View view) {
        loginIntent.putExtra("profile", 3);
        startActivity(loginIntent);
    }
}
