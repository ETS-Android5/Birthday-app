package com.anne.birthday;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class secondpage extends AppCompatActivity {
    private Button btnntt;
    View screenView;
    int[] images;
    TextView textView1,txt2,text3;
    Button Faria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
        getSupportActionBar().setTitle("Mystery!");
        btnntt=findViewById(R.id.push);
        Faria=findViewById(R.id.faari);
        text3=findViewById(R.id.text3);
        txt2=findViewById(R.id.text1);
        images = new int[] {R.drawable.pandaaaddd};
        screenView =  findViewById(R.id.rView);
        final MediaPlayer mp=MediaPlayer.create(this,R.raw.sample);

        Faria.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                mp.start();
                Faria.setVisibility(View.GONE);
                int aryLength = images.length;
                Random random = new Random();
                int rNum = random.nextInt(aryLength);
                screenView.setBackground(ContextCompat.getDrawable(getApplicationContext(),images[rNum]));
                text3.setText("It's faria's birthday❣Click on the left    panda");
                txt2.setVisibility(View.GONE);

            }
        });

        btnntt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                openMainActivity2();
            }
        });
    }
    public void openMainActivity2()
    {
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}