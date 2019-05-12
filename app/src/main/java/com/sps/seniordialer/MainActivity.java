package com.sps.seniordialer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
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

        Buttons();

        //Makes
        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onDial();
                onDelete(v);
            }
        });
    }


    //Listner for buttons
    private void Buttons(){

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one(v);
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                two(v);
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                three(v);
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                four(v);
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                five(v);
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                six(v);
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seven(v);
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eight(v);
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nine(v);
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zero(v);
            }
        });

        btnStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                star(v);
            }
        });

        btnHash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hash(v);
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
