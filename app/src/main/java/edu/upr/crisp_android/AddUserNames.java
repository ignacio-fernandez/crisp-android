package edu.upr.crisp_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class AddUserNames extends AppCompatActivity {

    private static Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
        intent = new Intent(this, Login.class);
    }

    public void setProfile(View view) {
        final String firstName = ((EditText) findViewById(R.id.firstNameText)).getText().toString();
        final String lastName = ((EditText) findViewById(R.id.lastNameText)).getText().toString();
        final String username = ((EditText) findViewById(R.id.userNameText)).getText().toString();
        final String email = ((EditText) findViewById(R.id.emailText)).getText().toString();
        final String password = ((EditText) findViewById(R.id.passwordText)).getText().toString();
        final String confirmPassword = ((EditText) findViewById(R.id.confirmPasswordText)).getText().toString();
        final int profile = view.getId();
        intent.putExtra("first name", firstName);
        intent.putExtra("last name", lastName);
        intent.putExtra("username", username);
        intent.putExtra("email", email);
        if (password.equals(confirmPassword)) {
            intent.putExtra("password", password);
            if (profile == R.id.consumerButton) {
                intent.putExtra("profile", 1);
            }
            else if (profile == R.id.producerButton) {
                intent.putExtra("profile", 2);
            }
            else {
                intent.putExtra("profile", 3);
            }
            startActivity(intent);
        }
        else {
            throw new RuntimeException("Passwords do not match");
        }
    }
}
