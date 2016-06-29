package edu.upr.crisp_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //TODO fix this
    }

    EditText username = (EditText) findViewById(R.id.editText1); // TODO fix this
    EditText password = (EditText)findViewById(R.id.editText2);
    public void login(View view) {
        if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
            // TODO correct password
            Intent intent = new Intent(this, DisplayBidsActivity.class);
            startActivity(intent);
        }
        else {
            // TODO incorrect password
        }
    }
}
