package com.mesch.android.bikesgv;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartingPage extends AppCompatActivity {

    private Button mSignInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Hide the action bar.
        ActionBar action_bar =getSupportActionBar();
        action_bar.hide();
        setContentView(R.layout.activity_starting_page);

        // Set up Sign In Button Logic to Purgatory Page
        mSignInButton = (Button) findViewById(R.id.signIn);
        mSignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (signIn()){
                    // switch to Purgatory
                    Intent intent = new Intent(StartingPage.this, Purgatory.class);
                    startActivity(intent);
                }
            }
        });
    }

    private boolean signIn(){
        // TODO: Add Sign In Logic
        return true;
    }
}
