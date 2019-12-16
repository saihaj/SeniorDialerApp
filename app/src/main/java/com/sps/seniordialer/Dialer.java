package com.sps.seniordialer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import static com.sps.seniordialer.SpeedDial.Num_1;
import static com.sps.seniordialer.SpeedDial.Num_2;
import static com.sps.seniordialer.SpeedDial.Num_3;
import static com.sps.seniordialer.SpeedDial.Num_4;
import static com.sps.seniordialer.SpeedDial.Num_5;
import static com.sps.seniordialer.SpeedDial.Num_6;
import static com.sps.seniordialer.SpeedDial.Num_7;
import static com.sps.seniordialer.SpeedDial.Num_8;
import static com.sps.seniordialer.SpeedDial.Num_9;

public class Dialer extends AppCompatActivity {

    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero, btnHash, btnStar, btnDelete, btnDial;
    EditText input;

    SharedPreferences sharedPreferences;

    Vibrator vibrator;

    private static final int REQUEST_CALL = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        setContentView(R.layout.activity_dialer);

        btnDelete = findViewById(R.id.buttonDelete);

        btnOne = findViewById(R.id.buttonOne);
        btnTwo = findViewById(R.id.buttonTwo);
        btnThree = findViewById(R.id.buttonThree);

        btnFour = findViewById(R.id.buttonFour);
        btnFive = findViewById(R.id.buttonFive);
        btnSix = findViewById(R.id.buttonSix);

        btnSeven = findViewById(R.id.buttonSeven);
        btnEight = findViewById(R.id.buttonEight);
        btnNine = findViewById(R.id.buttonNine);

        btnZero = findViewById(R.id.buttonZero);
        btnHash = findViewById(R.id.buttonHash);
        btnStar = findViewById(R.id.buttonStar);

        btnDial = findViewById(R.id.buttonDial);

        input = findViewById(R.id.editText);

        input.setShowSoftInputOnFocus(false);   //disables softKeyboard
        input.setCursorVisible(false);  //disables cursor

        final MediaPlayer SoundDial = MediaPlayer.create(this, R.raw.dial);

        Buttons();
        SpeedDial();

        //Makes call
        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundDial.start();
                onDial();
                onDelete(v);
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

    //Listener for dialer buttons
    private void Buttons(){

        final MediaPlayer SoundOne = MediaPlayer.create(this, R.raw.one);
        final MediaPlayer SoundTwo = MediaPlayer.create(this, R.raw.two);
        final MediaPlayer SoundThree = MediaPlayer.create(this, R.raw.three);
        final MediaPlayer SoundFour = MediaPlayer.create(this, R.raw.four);
        final MediaPlayer SoundFive = MediaPlayer.create(this, R.raw.five);
        final MediaPlayer SoundSix = MediaPlayer.create(this, R.raw.six);
        final MediaPlayer SoundSeven = MediaPlayer.create(this, R.raw.seven);
        final MediaPlayer SoundEight = MediaPlayer.create(this, R.raw.eight);
        final MediaPlayer SoundNine = MediaPlayer.create(this, R.raw.nine);
        final MediaPlayer SoundZero = MediaPlayer.create(this, R.raw.zero);
        final MediaPlayer SoundClear = MediaPlayer.create(this, R.raw.clear);
        final MediaPlayer SoundStar = MediaPlayer.create(this, R.raw.star);
        final MediaPlayer SoundHash = MediaPlayer.create(this, R.raw.hash);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundOne.start();
                one(v);
            }});

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundTwo.start();
                two(v);
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundThree.start();
                three(v);
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundFour.start();
                four(v);
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundFive.start();
                five(v);
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundSix.start();
                six(v);
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundSeven.start();
                seven(v);
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundEight.start();
                eight(v);
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nine(v);
                SoundNine.start();
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundZero.start();
                zero(v);
            }
        });

        btnStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundStar.start();
                star(v);
            }
        });

        btnHash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundHash.start();
                hash(v);
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundClear.start();
                onDelete(v);
            }
        });

    }

    //Long Hold Listener for Speed Dial buttons
    private void SpeedDial(){

        btnOne.setOnLongClickListener(new View.OnLongClickListener() {

            public boolean onLongClick(View v) {
                input.setText(sharedPreferences.getString(Num_1,""));
                onDial();
                onDelete(v);
                return true;
            }
        });

        btnTwo.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                input.setText(sharedPreferences.getString(Num_2,""));
                onDial();
                onDelete(v);
                return true;
            }
        });

        btnThree.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                input.setText(sharedPreferences.getString(Num_3,""));
                onDial();
                onDelete(v);
                return true;
            }
        });

        btnFour.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                input.setText(sharedPreferences.getString(Num_4,""));
                onDial();
                onDelete(v);
                return true;
            }
        });

        btnFive.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                input.setText(sharedPreferences.getString(Num_5,""));
                onDial();
                onDelete(v);
                return true;
            }
        });

        btnSix.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                input.setText(sharedPreferences.getString(Num_6,""));
                onDial();
                onDelete(v);
                return true;
            }
        });

        btnSeven.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                input.setText(sharedPreferences.getString(Num_7,""));
                onDial();
                onDelete(v);
                return true;
            }
        });

        btnEight.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                input.setText(sharedPreferences.getString(Num_8,""));
                onDial();
                onDelete(v);
                return true;
            }
        });

        btnNine.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                input.setText(sharedPreferences.getString(Num_9,""));
                onDial();
                onDelete(v);
                return true;
            }
        });
    }

    private void one (View v){
        OnButtonClick(btnOne, input, "1");
    }

    private void two (View v){
        OnButtonClick(btnTwo, input,"2");
    }

    private void three (View v){
        OnButtonClick(btnThree, input,"3");
    }

    private void four (View v){
        OnButtonClick(btnFour, input,"4");
    }

    private void five (View v){
        OnButtonClick(btnFive, input,"5");
    }

    private void six (View v){
        OnButtonClick(btnSix, input,"6");
    }

    private void seven (View v){
        OnButtonClick(btnSeven, input,"7");
    }

    private void eight (View v){
        OnButtonClick(btnEight, input, "8");
    }

    private void nine (View v){
        OnButtonClick(btnNine, input,"9" );
    }

    private void zero (View v){
        OnButtonClick(btnZero, input,"0");
    }

    private void star (View v){
        OnButtonClick(btnStar, input,"*");
    }

    private void hash (View v){
        OnButtonClick(btnHash, input,"#");
    }

    public void onDelete (View v){
        input.setText("");
    }

    public void onDial(){
        String number = input.getText().toString();

        if(number.trim().length()>0) {
            if(ContextCompat.checkSelfPermission(Dialer.this,
                    Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(Dialer.this,
                        new String[] {Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            }
            else {
                if(number.length()>=3) {
                    String dial = "tel:" + number;
                    startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                    }
                else{
                    Toast.makeText(Dialer.this, "Enter a valid phone number", Toast.LENGTH_SHORT).show();
                     }
            }
        }
        else {
            Toast.makeText(Dialer.this, "Enter Phone Number", Toast.LENGTH_SHORT).show();
        }

    }

    //Checks for permissions
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(requestCode == REQUEST_CALL) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                onDial();
            }else {
                Toast.makeText(this, "Permission DENIED", Toast.LENGTH_SHORT).show();
            }
        }
    }

    //sets the input to output field
    public void OnButtonClick(Button button, EditText inputNumber, String number){
        Log.v("stuff", "pressed button " + number);
        String cache = input.getText().toString();
        inputNumber.setText(cache + number);
    }

}
