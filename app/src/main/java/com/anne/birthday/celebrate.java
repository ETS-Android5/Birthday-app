package com.anne.birthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class celebrate extends AppCompatActivity {
    private Button btnprevbirthday;
    private Button btnshilpo;
    private Button btnothers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celebrate);
        getSupportActionBar().setTitle("Memories");
        btnprevbirthday=findViewById(R.id.prev);
        final MediaPlayer mp=MediaPlayer.create(this,R.raw.sample);

        btnprevbirthday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                openprevious();
            }
        });
        btnshilpo=findViewById(R.id.shilpo);
        btnshilpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                openshilpo();
            }
        });
        btnothers=findViewById(R.id.others);
        btnothers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                openothers();
            }
        });
    }
    public void openprevious()
    {
        Intent intent3=new Intent(this,previous.class);
        startActivity(intent3);
    }
    public void openshilpo()
    {
        Intent intent4=new Intent(this,shilpo.class);
        startActivity(intent4);
    }
    public void openothers()
    {
        Intent intent5=new Intent(this,others.class);
        startActivity(intent5);
    }
}