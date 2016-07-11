package edu.upr.crisp_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddUserNames extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_names);
    }

    public void setPasswordScreen(View view) {
        Intent intent = new Intent(this, SetPasswords.class);
        final String username = ((EditText) findViewById(R.id.userName)).getText().toString();
        intent.putExtra("user name", username);
        startActivity(intent);
    }
}
