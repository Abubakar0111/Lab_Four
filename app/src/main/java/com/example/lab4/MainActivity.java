package com.example.lab4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            CheckBox simpleCheckBox  = (CheckBox) findViewById(R.id.Namaz);
            boolean flag = simpleCheckBox.isChecked();
            button = (Button) findViewById(R.id.Done);
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View arg0)

                {

                    Toast.makeText(getApplicationContext(),"Button is clicked: " + flag , Toast.LENGTH_LONG).show();

                }
            });
//
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setPositiveButton(R.string.app_name, new DialogInterface.OnClickListener() {
//            public void onClick(DialogInterface dialog, int id) {
//                // User clicked OK button
//            }
//        });
//        builder.setNegativeButton(R.string.app_name, new DialogInterface.OnClickListener() {
//            public void onClick(DialogInterface dialog, int id) {
//                // User cancelled the dialog
//            }
//        });
//        AlertDialog dialog = builder.create();

    }




    }
