package com.sps.seniordialer;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.content.SharedPreferences;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class SpeedDial extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor SPEditor;

    Button saveOne;
    EditText ValueAtTextField;

    static final String Num_1 = "NumSavedAtSpeedDialFor1";
    static final String Num_2 = "NumSavedAtSpeedDialFor2";
    static final String Num_3 = "NumSavedAtSpeedDialFor3";
    static final String Num_4 = "NumSavedAtSpeedDialFor4";
    static final String Num_5 = "NumSavedAtSpeedDialFor5";
    static final String Num_6 = "NumSavedAtSpeedDialFor6";
    static final String Num_7 = "NumSavedAtSpeedDialFor7";
    static final String Num_8 = "NumSavedAtSpeedDialFor8";
    static final String Num_9 = "NumSavedAtSpeedDialFor9";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed_dial);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        SPEditor = sharedPreferences.edit();

        ValueAtTextField = findViewById(R.id.SpeedDialTextField);

    }

    public void SaveForOne(View view){
        if(ValueAtTextField.length()>=3){
            SPEditor.putString(Num_1,ValueAtTextField.getText().toString());
            SPEditor.commit();
            ValueAtTextField.setText("");
            Toast.makeText(this,"Saved to 1",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,"Enter a Valid number",Toast.LENGTH_SHORT).show();
        }
    }

    public void SaveForTwo(View view){
        if(ValueAtTextField.length()>=3){
            SPEditor.putString(Num_2,ValueAtTextField.getText().toString());
            SPEditor.commit();
            ValueAtTextField.setText("");
            Toast.makeText(this,"Saved to 2",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,"Enter a Valid number",Toast.LENGTH_SHORT).show();
        }
    }

    public void SaveForThree(View view){
        if(ValueAtTextField.length()>=3){
            SPEditor.putString(Num_3,ValueAtTextField.getText().toString());
            SPEditor.commit();
            ValueAtTextField.setText("");
            Toast.makeText(this,"Saved to 3",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,"Enter a Valid number",Toast.LENGTH_SHORT).show();
        }
    }

    public void SaveForFour(View view){
        if(ValueAtTextField.length()>=3){
            SPEditor.putString(Num_4,ValueAtTextField.getText().toString());
            SPEditor.commit();
            ValueAtTextField.setText("");
            Toast.makeText(this,"Saved to 4",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,"Enter a Valid number",Toast.LENGTH_SHORT).show();
        }
    }

    public void SaveForFive(View view){
        if(ValueAtTextField.length()>=3){
            SPEditor.putString(Num_5,ValueAtTextField.getText().toString());
            SPEditor.commit();
            ValueAtTextField.setText("");
            Toast.makeText(this,"Saved to 5",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,"Enter a Valid number",Toast.LENGTH_SHORT).show();
        }
    }

    public void SaveForSix(View view){
        if(ValueAtTextField.length()>=3){
            SPEditor.putString(Num_6,ValueAtTextField.getText().toString());
            SPEditor.commit();
            ValueAtTextField.setText("");
            Toast.makeText(this,"Saved to 6",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,"Enter a Valid number",Toast.LENGTH_SHORT).show();
        }
    }

    public void SaveForSeven(View view){
        if(ValueAtTextField.length()>=3){
            SPEditor.putString(Num_7,ValueAtTextField.getText().toString());
            SPEditor.commit();
            ValueAtTextField.setText("");
            Toast.makeText(this,"Saved to 7",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,"Enter a Valid number",Toast.LENGTH_SHORT).show();
        }
    }

    public void SaveForEight(View view){
        if(ValueAtTextField.length()>=3){
            SPEditor.putString(Num_8,ValueAtTextField.getText().toString());
            SPEditor.commit();
            ValueAtTextField.setText("");
            Toast.makeText(this,"Saved to 8",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,"Enter a Valid number",Toast.LENGTH_SHORT).show();
        }
    }

    public void SaveForNine(View view){
        if(ValueAtTextField.length()>=3){
            SPEditor.putString(Num_9,ValueAtTextField.getText().toString());
            SPEditor.commit();
            ValueAtTextField.setText("");
            Toast.makeText(this,"Saved to 9",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,"Enter a Valid number",Toast.LENGTH_SHORT).show();
        }
    }

    public void RetrieveForOne(View view){
        if (sharedPreferences.contains(Num_1)){
            ValueAtTextField.setText(sharedPreferences.getString(Num_1,""));
        }
    }

    public void RetrieveForTwo(View view){
        if (sharedPreferences.contains(Num_2)){
            ValueAtTextField.setText(sharedPreferences.getString(Num_2,""));
        }
    }

    public void RetrieveForThree(View view){
        if (sharedPreferences.contains(Num_3)){
            ValueAtTextField.setText(sharedPreferences.getString(Num_3,""));
        }
    }

    public void RetrieveForFour(View view){
        if (sharedPreferences.contains(Num_4)){
            ValueAtTextField.setText(sharedPreferences.getString(Num_4,""));
        }
    }

    public void RetrieveForFive(View view){
        if (sharedPreferences.contains(Num_5)){
            ValueAtTextField.setText(sharedPreferences.getString(Num_5,""));
        }
    }

    public void RetrieveForSix(View view){
        if (sharedPreferences.contains(Num_6)){
            ValueAtTextField.setText(sharedPreferences.getString(Num_6,""));
        }
    }

    public void RetrieveForSeven(View view){
        if (sharedPreferences.contains(Num_7)){
            ValueAtTextField.setText(sharedPreferences.getString(Num_7,""));
        }
    }

    public void RetrieveForEight(View view){
        if (sharedPreferences.contains(Num_8)){
            ValueAtTextField.setText(sharedPreferences.getString(Num_8,""));
        }
    }

    public void RetrieveForNine(View view){
        if (sharedPreferences.contains(Num_9)){
            ValueAtTextField.setText(sharedPreferences.getString(Num_9,""));
        }
    }
}
