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

public class MainActivity extends AppCompatActivity {
    private Button btnnt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Welcome to CSE2!!!");
        btnnt=findViewById(R.id.nxt);
        final MediaPlayer mp=MediaPlayer.create(this,R.raw.sample);
        btnnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                opensecondpage();
            }
        });

    }
    public void opensecondpage()
    {
        Intent intent=new Intent(this,secondpage.class);
        startActivity(intent);
    }
}