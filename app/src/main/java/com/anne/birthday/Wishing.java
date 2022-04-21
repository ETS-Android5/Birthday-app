package com.anne.birthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Wishing extends AppCompatActivity {
    private Button btnnt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishing);
        getSupportActionBar().setTitle("Birthday wishes");
        VideoView videoView = findViewById(R.id.video_view);
        btnnt = findViewById(R.id.gift);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.newvideo;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sample);
        btnnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                openlastpage();
            }
        });
    }
    public void openlastpage()
    {
        Intent intent5=new Intent(this,lastpage.class);
        startActivity(intent5);
    }


    }