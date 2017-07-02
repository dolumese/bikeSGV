package com.mesch.android.bikesgv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class FormActivity extends AppCompatActivity {

    private ImageButton mTakePicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        mTakePicture = (ImageButton) findViewById(R.id.takePlaceImg);
        mTakePicture.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent takePic = new Intent(FormActivity.this, NewSite.class);
                startActivity(takePic);
            }
        });

 



    }
}
