package com.exj.jc.mapu;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.onClick;
import static com.exj.jc.mapu.R.raw.saludo;
import static com.exj.jc.mapu.R.raw.uno;

public class Numeros extends AppCompatActivity{

    MediaPlayer mp = new MediaPlayer();
    TextView textView, textViewCambia;

    private Button btnUno, btnDos, btnTres, btnCuatro,btnCinco,btnSeis,
    btnSiete,btnOcho,btnNueve,btnDiez,btnCien,btnMil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numeros);

        //mientras la aplicación este activa los botones de vol
        //dispositivo solo ajustaran vol de multimedia
       // setVolumeControlStream(AudioManager.STREAM_MUSIC);

         btnUno = (Button)findViewById(R.id.button1);
         btnDos = (Button)findViewById(R.id.button2);
         btnTres = (Button)findViewById(R.id.button3);
         btnCuatro = (Button)findViewById(R.id.button4);
         btnCinco = (Button)findViewById(R.id.button5);
         btnSeis = (Button)findViewById(R.id.button6);
         btnSiete = (Button)findViewById(R.id.button7);
         btnOcho = (Button)findViewById(R.id.button8);
         btnNueve = (Button)findViewById(R.id.button9);
         btnDiez = (Button)findViewById(R.id.button10);
         btnCien = (Button)findViewById(R.id.button100);
         btnMil = (Button)findViewById(R.id.button1000);


        textView = (TextView)findViewById(R.id.textViewNumbers);
        textView.setText("Rakin");

        textViewCambia = (TextView)findViewById(R.id.textviewCambia);

    }


    public void presionUno(View v) {
        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.uno);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Toast.makeText(getApplicationContext(), "ONE",Toast.LENGTH_SHORT).show();
        textView.setText(R.string.btn_uno_mapu);
        textViewCambia.setText("1");

    }

    public void presionDos(View v) {
        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.dos);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Toast.makeText(getApplicationContext(), "TWO",Toast.LENGTH_SHORT).show();
        textView.setText(R.string.btn_dos_mapu);
        textViewCambia.setText("2");
    }


    public void presionTres(View v) {
        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.tres);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Toast.makeText(getApplicationContext(), "THREE",Toast.LENGTH_SHORT).show();
        textView.setText(R.string.btn_tres_mapu);
        textViewCambia.setText("3");
    }


    public void presionCuatro(View v) {
        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.cuatro);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Toast.makeText(getApplicationContext(), "FOUR",Toast.LENGTH_SHORT).show();
        textView.setText(R.string.btn_cuatro_mapu);
        textViewCambia.setText("4");
    }


    public void presionCinco(View v) {
        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.cinco);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Toast.makeText(getApplicationContext(), "FIVE",Toast.LENGTH_SHORT).show();
        textView.setText(R.string.btn_cinco_mapu);
        textViewCambia.setText("5");
    }


    public void presionSeis(View v) {
        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.seis);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Toast.makeText(getApplicationContext(), "SIX",Toast.LENGTH_SHORT).show();
        textView.setText(R.string.btn_seis_mapu);
        textViewCambia.setText("6");
    }


    public void presionSiete(View v) {
        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.siete);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Toast.makeText(getApplicationContext(), "SEVEN",Toast.LENGTH_SHORT).show();
        textView.setText(R.string.btn_siete_mapu);
        textViewCambia.setText("7");
    }

    public void presionOcho(View v) {
        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.ocho);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Toast.makeText(getApplicationContext(), "EIGHT",Toast.LENGTH_SHORT).show();
        textView.setText(R.string.btn_ocho_mapu);
        textViewCambia.setText("8");
    }

    public void presionNueve(View v) {
        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.nueve);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Toast.makeText(getApplicationContext(), "NINE",Toast.LENGTH_SHORT).show();
        textView.setText(R.string.btn_nueve_mapu);
        textViewCambia.setText("9");
    }

    public void presionDiez(View v) {
        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.diez);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Toast.makeText(getApplicationContext(), "TEN",Toast.LENGTH_SHORT).show();
        textView.setText(R.string.btn_diez_mapu);
        textViewCambia.setText("10");
    }

    public void presionCien(View v) {
        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.cien);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Toast.makeText(getApplicationContext(), "ONE HUNDRED",Toast.LENGTH_SHORT).show();
        textView.setText(R.string.btn_cien_mapu);
        textViewCambia.setText("100");
    }

    public void presionMil(View v) {
        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.mil);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Toast.makeText(getApplicationContext(), "ONE THOUSAND",Toast.LENGTH_SHORT).show();
        textView.setText(R.string.btn_mil_mapu);
        textViewCambia.setText("1000");
    }



}

