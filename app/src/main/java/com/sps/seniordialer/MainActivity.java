package com.sps.seniordialer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Button;

//import static android.view.View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;


public class MainActivity extends AppCompatActivity {
    Button ChangeButtony;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ChangeButtony = findViewById(R.id.ChangeButton);


        ((Button) ChangeButtony).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    public void openActivity2(){
        Intent intent = new Intent(this,Dialer.class);
        startActivity(intent);
    }
}

