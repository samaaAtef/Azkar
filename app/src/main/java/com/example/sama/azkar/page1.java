package com.example.sama.azkar;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class page1 extends AppCompatActivity {
    int size=20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        ImageView imgplay1=(ImageView)findViewById(R.id.imageplay1);
        ImageView imgplay2=(ImageView)findViewById(R.id.imageplay2);
        ImageView imgplay3=(ImageView)findViewById(R.id.imageplay3);
        ImageView imgpause1=(ImageView)findViewById(R.id.imagepause1);
        ImageView imgpause2=(ImageView)findViewById(R.id.imagepause2);
        ImageView imgpause3=(ImageView)findViewById(R.id.imagepause3);
        ImageView imgzoomin1=(ImageView)findViewById(R.id.imgzoomin1);
        ImageView imgzoomin2=(ImageView)findViewById(R.id.imgzoomin2);
        ImageView imgzoomin3=(ImageView)findViewById(R.id.imgzoomin3);
        ImageView imgzoomout1=(ImageView)findViewById(R.id.imgzoomout1);
        ImageView imgzoomout2=(ImageView)findViewById(R.id.imgzoomout2);
        ImageView imgzoomout3=(ImageView)findViewById(R.id.imgzoomout3);
        final TextView txt1=(TextView)findViewById(R.id.txt1);
        final TextView txt2=(TextView)findViewById(R.id.txt2);
        final TextView txt3=(TextView)findViewById(R.id.txt3);
        final MediaPlayer mp1=MediaPlayer.create(this,R.raw.mp01);
       final MediaPlayer mp2= MediaPlayer.create(this,R.raw.mp02);
       final MediaPlayer mp3=MediaPlayer.create(this,R.raw.mp03);

        imgplay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.start();
            }
        });
        imgplay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2.start();
            }
        });
        imgplay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp3.start();
            }
        });

        imgpause1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.pause();
            }
        });

        imgpause2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2.pause();
            }
        });

        imgpause3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp3.pause();
            }
        });


        imgzoomin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(size<40)
                {

                    txt1.setTextSize(++size);
                }
                else
                {
                    Toast.makeText(page1.this,"لا يمكن التكبير اكثر من ذلك",Toast.LENGTH_LONG).show();

                }

            }
        });imgzoomin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(size<40)
                {
                    txt2.setTextSize(++size);
                }
                else
                {
                    Toast.makeText(page1.this,"لا يمكن التكبير اكثر من ذلك",Toast.LENGTH_LONG).show();

                }

            }
        });imgzoomin3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(size<40)
                {

                    txt3.setTextSize(++size);
                }
                else
                {
                    Toast.makeText(page1.this,"لا يمكن التكبير اكثر من ذلك",Toast.LENGTH_LONG).show();

                }

            }
        });imgzoomout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(size>15)
                {
                    txt1.setTextSize(--size);
                }
                else
                {
                    Toast.makeText(page1.this,"لا يمكن التصغير اكثر من ذلك",Toast.LENGTH_LONG).show();

                }

            }
        });imgzoomout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(size>15)
                {

                    txt2.setTextSize(--size);
                }
                else
                {
                    Toast.makeText(page1.this,"لا يمكن التصغير اكثر من ذلك",Toast.LENGTH_LONG).show();

                }

            }
        });imgzoomout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(size>15)
                {

                    txt3.setTextSize(--size);
                }
                else
                {
                    Toast.makeText(page1.this,"لا يمكن التصغير اكثر من ذلك",Toast.LENGTH_LONG).show();

                }

            }
        });



    }
}
