package com.sps.seniordialer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//import static android.view.View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;


public class MainActivity extends AppCompatActivity {
    Button ChangeButtony;
    Button ChangeSpeedDial;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ChangeButtony = findViewById(R.id.ChangeToDialer);
        ChangeSpeedDial = findViewById(R.id.SpeedDial);

        ChangeButtony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        ChangeSpeedDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpeedDial();
            }
        });
    }

    //Hide System UI
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI();
        }
    }

    private void hideSystemUI() {

        /* Enables regular immersive mode.
        For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY */

        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        /* Set the content to appear under the system bars so that the
                         content doesn't resize when the system bars hide and show. */
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    public void openActivity2(){
        Intent intent = new Intent(this,Dialer.class);
        startActivity(intent);
    }

    public void openSpeedDial() {
        Intent openSpeedDialClass = new Intent(this, SpeedDial.class);
        startActivity(openSpeedDialClass);
    }
}

