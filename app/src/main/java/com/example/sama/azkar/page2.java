package com.example.sama.azkar;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        Button btnshare=(Button)findViewById(R.id.btnshare);



        btnshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_SUBJECT,"تطبيق اذكار");
                i.putExtra(Intent.EXTRA_TEXT, "تطبيق اذكارات منوعة , جرب التطبيق اكثر من رائع .. إلخ \n https://play.google.com/store/apps/details?id=com.andrody.azkar");
                startActivity(Intent.createChooser(i,"اختر التطبيق"));
            }
        });
    }
}
