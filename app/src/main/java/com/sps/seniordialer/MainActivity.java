package com.sps.seniordialer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.content.Intent.ACTION_CALL;

public class MainActivity extends AppCompatActivity {

    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero, btnHash, btnStar, btnDelete, btnDial;
    EditText input;

    private static final int REQUEST_CALL = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

     //Listner for buttons
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
            if(ContextCompat.checkSelfPermission(MainActivity.this,
                    Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(MainActivity.this,
                        new String[] {Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            }
            else {
                if(number.length()>=3) {

                    String dial = "tel:" + number;
                    startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                } else{
                    Toast.makeText(MainActivity.this, "Enter a valid phone number", Toast.LENGTH_SHORT).show();
                }
            }
        }
        else {
            Toast.makeText(MainActivity.this, "Enter Phone Number", Toast.LENGTH_SHORT).show();
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

