package com.example.sportsspeakerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private ImageButton imgBoxing;
    private ImageButton imgKickBoxing;
    private ImageButton imgJudo;
    private ImageButton imgKarate;
    private ImageButton imgAikido;
    private ImageButton imgTaekwondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgBoxing=findViewById(R.id.imgBoxing);
        imgKickBoxing=findViewById(R.id.imgKickBoxing);
        imgJudo=findViewById(R.id.imgJudo);
        imgKarate=findViewById(R.id.imgKarate);
        imgAikido=findViewById(R.id.imgAikido);
        imgTaekwondo=findViewById(R.id.imgTekwondo);

        imgBoxing.setOnClickListener(MainActivity.this);
        imgTaekwondo.setOnClickListener(MainActivity.this);
        imgAikido.setOnClickListener(MainActivity.this);
        imgKarate.setOnClickListener(MainActivity.this);
        imgJudo.setOnClickListener(MainActivity.this);
        imgKickBoxing.setOnClickListener(MainActivity.this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgBoxing:
                playSportName(imgBoxing.getTag().toString());
                break;
            case R.id.imgKickBoxing:
                playSportName(imgKickBoxing.getTag().toString());
                break;
            case R.id.imgJudo:
                playSportName(imgJudo.getTag().toString());
                break;
            case R.id.imgKarate:
                playSportName(imgKarate.getTag().toString());
                break;
            case R.id.imgAikido:
                playSportName(imgAikido.getTag().toString());
                break;
            case R.id.imgTekwondo:
                playSportName(imgTaekwondo.getTag().toString());
                break;
        }
    }

    private void playSportName(String sportName){

        MediaPlayer mediaPlayer=MediaPlayer.create(this,
                getResources().getIdentifier(sportName,
                "raw",getPackageName()));

        mediaPlayer.start();


    }
}
