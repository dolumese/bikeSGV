package com.mesch.android.bikesgv;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Purgatory extends AppCompatActivity {

    private Button mAddSite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Hide the action bar.
        ActionBar action_bar =getSupportActionBar();
        action_bar.hide();
        setContentView(R.layout.activity_purgatory);

        mAddSite = (Button) findViewById(R.id.addSite);

        mAddSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // switch to NewSite
                Intent intent = new Intent(Purgatory.this, FormActivity.class);
                startActivity(intent);
            }
        });

    }



}
