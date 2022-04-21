package com.anne.birthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    private Button btnnext,btnwish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setTitle("Celebration!");
        textView = findViewById(R.id.text1);

        btnnext=findViewById(R.id.next);
        btnwish=findViewById(R.id.Wish);
        final MediaPlayer mp=MediaPlayer.create(this,R.raw.sample);

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                opencelebrate();
            }
        });
        btnwish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                openwishing();
            }
        });
    }
    public void opencelebrate()
    {
        Intent intent=new Intent(this,celebrate.class);
        startActivity(intent);
    }
    public void openwishing()
    {
        Intent intent2=new Intent(this,Wishing.class);
        startActivity(intent2);
    }


}
