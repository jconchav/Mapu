package com.exj.jc.mapu;

import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.color.black;

public class colores extends AppCompatActivity implements View.OnClickListener{

    MediaPlayer mp = new MediaPlayer();
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.colores);


        findViewById(R.id.buttonRojo).setOnClickListener(this);
        findViewById(R.id.buttonAmarillo).setOnClickListener(this);
        findViewById(R.id.buttonCafe).setOnClickListener(this);
        findViewById(R.id.buttonBlanco).setOnClickListener(this);
        findViewById(R.id.buttonNegro).setOnClickListener(this);
        findViewById(R.id.buttonVerde).setOnClickListener(this);
        findViewById(R.id.buttonAzul).setOnClickListener(this);
        findViewById(R.id.buttonGris).setOnClickListener(this);
        findViewById(R.id.buttonMorado).setOnClickListener(this);
        findViewById(R.id.buttonNaranjo).setOnClickListener(this);

        textView = (TextView)findViewById(R.id.textViewColors);
        textView.setText("Fillke az");
        textView.setTextColor(getResources().getColor(R.color.colorDos));

    }


    @Override
    public void onClick(View v) {
        int color;

        View contenedor = v.getRootView();

        switch (v.getId()) {
            case R.id.buttonRojo:
                color = Color.parseColor("#F50F0F"); // Rojo

                mp.reset();
                mp.release();
                mp = MediaPlayer.create(this, R.raw.rojo);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.seekTo(0);
                mp.start();

                Toast.makeText(getApplicationContext(), "RED",Toast.LENGTH_SHORT).show();
                textView.setText(R.string.btn_rojo_mapu);
                textView.setTextColor(getResources().getColor(R.color.colorUno));

                break;
            case R.id.buttonAmarillo:
                color = Color.parseColor("#F7F305"); // Amarillo

                mp.reset();
                mp.release();
                mp = MediaPlayer.create(this, R.raw.amarillo);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.seekTo(0);
                mp.start();

                Toast.makeText(getApplicationContext(), "YELLOW",Toast.LENGTH_SHORT).show();
                textView.setText(R.string.btn_amarillo_mapu);
                textView.setTextColor(getResources().getColor(R.color.colorDos));
                break;
            case R.id.buttonCafe:
                color = Color.parseColor("#754005"); // Cafe

                mp.reset();
                mp.release();
                mp = MediaPlayer.create(this, R.raw.cafe);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.seekTo(0);
                mp.start();

                Toast.makeText(getApplicationContext(), "BROWN",Toast.LENGTH_SHORT).show();
                textView.setText(R.string.btn_cafe_mapu);
                textView.setTextColor(getResources().getColor(R.color.colorUno));
                break;
            case R.id.buttonBlanco:
                color = Color.parseColor("#FCFAF8"); // Blanco

                mp.reset();
                mp.release();
                mp = MediaPlayer.create(this, R.raw.blanco);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.seekTo(0);
                mp.start();

                Toast.makeText(getApplicationContext(), "WHITE",Toast.LENGTH_SHORT).show();
                textView.setText(R.string.btn_blanco_mapu);
                textView.setTextColor(getResources().getColor(R.color.colorDos));
                break;
            case R.id.buttonNegro:
                color = Color.parseColor("#111010"); // Negro

                mp.reset();
                mp.release();
                mp = MediaPlayer.create(this, R.raw.negro);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.seekTo(0);
                mp.start();

                Toast.makeText(getApplicationContext(), "BLACK",Toast.LENGTH_SHORT).show();
                textView.setText(R.string.btn_negro_mapu);
                textView.setTextColor(getResources().getColor(R.color.colorUno));
                break;
            case R.id.buttonVerde:
                color = Color.parseColor("#308B06"); // Verde

                mp.reset();
                mp.release();
                mp = MediaPlayer.create(this, R.raw.verde);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.seekTo(0);
                mp.start();
                Toast.makeText(getApplicationContext(), "GREEN",Toast.LENGTH_SHORT).show();
                textView.setText(R.string.btn_verde_mapu);
                textView.setTextColor(getResources().getColor(R.color.colorUno));

                break;
            case R.id.buttonAzul:
                color = Color.parseColor("#3317EC"); // Azul

                mp.reset();
                mp.release();
                mp = MediaPlayer.create(this, R.raw.azul);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.seekTo(0);
                mp.start();

                Toast.makeText(getApplicationContext(), "BLUE",Toast.LENGTH_SHORT).show();
                textView.setText(R.string.btn_azul_mapu);
                textView.setTextColor(getResources().getColor(R.color.colorUno));

                break;
            case R.id.buttonGris:
                color = Color.parseColor("#85848B"); // Gris

                mp.reset();
                mp.release();
                mp = MediaPlayer.create(this, R.raw.gris);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.seekTo(0);
                mp.start();

                Toast.makeText(getApplicationContext(), "GREY",Toast.LENGTH_SHORT).show();
                textView.setText(R.string.btn_gris_mapu);
                textView.setTextColor(getResources().getColor(R.color.colorUno));
                break;
            case R.id.buttonMorado:
                color = Color.parseColor("#7F10B7"); // Morado

                mp.reset();
                mp.release();
                mp = MediaPlayer.create(this, R.raw.morado);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.seekTo(0);
                mp.start();

                Toast.makeText(getApplicationContext(), "PURPLE",Toast.LENGTH_SHORT).show();
                textView.setText(R.string.btn_morado_mapu);
                textView.setTextColor(getResources().getColor(R.color.colorUno));
                break;
            case R.id.buttonNaranjo:
                color = Color.parseColor("#F87123"); // Naranjo

                mp.reset();
                mp.release();
                mp = MediaPlayer.create(this, R.raw.naranjo);
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mp.seekTo(0);
                mp.start();

                Toast.makeText(getApplicationContext(), "ORANGE",Toast.LENGTH_SHORT).show();
                textView.setText(R.string.btn_naranjo_mapu);
                textView.setTextColor(getResources().getColor(R.color.colorUno));
                break;

            default:
                color = Color.WHITE; // Blano

        }

        contenedor.setBackgroundColor(color);
    }

    }

