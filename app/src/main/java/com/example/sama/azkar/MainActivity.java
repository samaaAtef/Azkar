package com.example.sama.azkar;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton imageButton1=(ImageButton)findViewById(R.id.imageButton);
        ImageButton imgabout=(ImageButton)findViewById(R.id.imgabout);
        ImageButton imgclose=(ImageButton)findViewById(R.id.imgclose);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
         Intent i=new Intent(MainActivity.this,page1.class);
                startActivity(i);
            }
        });

        imgabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,page2.class);
                startActivity(i);
            }
        });

        imgclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialog=new AlertDialog.Builder(MainActivity.this);
                alertDialog.setTitle("اغلاق التطبيق");
                alertDialog.setMessage("هل انت متاكد من اغلاق التطبيق :(");
                alertDialog.setPositiveButton("نعم", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                   finish();
                    }
                });
                alertDialog.setNegativeButton("لا", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
               alertDialog.show();
            }

        });
    }
}
