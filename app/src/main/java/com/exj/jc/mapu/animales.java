package com.exj.jc.mapu;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class animales extends AppCompatActivity {

    MediaPlayer mp = new MediaPlayer();

    private ImageButton btnCaballo, btnCabra, btnCerdo, btnCulebra,btnGallina,btnGato,
            btnNandu,btnOveja,btnPerro,btnPudu,btnVaca,btnZorro;

    private TextView textView;

    private ImageView imageContenedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animales);


         btnCaballo = (ImageButton)findViewById(R.id.button1);
         btnCabra = (ImageButton)findViewById(R.id.button2);
         btnCerdo = (ImageButton)findViewById(R.id.button3);
         btnCulebra = (ImageButton)findViewById(R.id.button4);
         btnGallina = (ImageButton)findViewById(R.id.button5);
         btnGato = (ImageButton)findViewById(R.id.button6);
         btnNandu = (ImageButton)findViewById(R.id.button7);
         btnOveja = (ImageButton)findViewById(R.id.button8);
         btnPerro = (ImageButton)findViewById(R.id.button9);
         btnPudu = (ImageButton)findViewById(R.id.button10);
         btnVaca = (ImageButton)findViewById(R.id.button100);
         btnZorro = (ImageButton)findViewById(R.id.button1000);

        textView = (TextView)findViewById(R.id.textViewAnimals);
        textView.setText("Fillke Kulliñ");
        imageContenedor = (ImageView)findViewById(R.id.image_contenedor);
    }

    public void presionUno(View v) {
        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.caballo);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Toast.makeText(getApplicationContext(), "CABALLO / HORSE",Toast.LENGTH_SHORT).show();
        textView.setText(R.string.btn_caballo);
        imageContenedor.setImageResource(R.drawable.caballo);

    }

    public void presionDos(View v) {
        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.cabra);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Toast.makeText(getApplicationContext(), "CABRA / GOAT",Toast.LENGTH_SHORT).show();
        textView.setText(R.string.btn_cabra);
        imageContenedor.setImageResource(R.drawable.cabra);
    }


    public void presionTres(View v) {
        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.cerdo);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Toast.makeText(getApplicationContext(), "CERDO / PIG",Toast.LENGTH_SHORT).show();
        textView.setText(R.string.btn_cerdo);
        imageContenedor.setImageResource(R.drawable.cerdo);
    }


    public void presionCuatro(View v) {
        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.culebra);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Toast.makeText(getApplicationContext(), "CULEBRA / SNAKE",Toast.LENGTH_SHORT).show();
        textView.setText(R.string.btn_culebra);
        imageContenedor.setImageResource(R.drawable.culebra);
    }


    public void presionCinco(View v) {
        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.gallina);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Toast.makeText(getApplicationContext(), "GALLINA / CHIKEN",Toast.LENGTH_SHORT).show();
        textView.setText(R.string.btn_gallina);
        imageContenedor.setImageResource(R.drawable.gallina);
    }


    public void presionSeis(View v) {
        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.gato);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Toast.makeText(getApplicationContext(), "GATO / ÑARKI",Toast.LENGTH_SHORT).show();
        textView.setText(R.string.btn_gato);
        imageContenedor.setImageResource(R.drawable.gato);
    }


    public void presionSiete(View v) {
        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.nandu);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Toast.makeText(getApplicationContext(), "ÑANDU ",Toast.LENGTH_SHORT).show();
        textView.setText(R.string.btn_nandu);
        imageContenedor.setImageResource(R.drawable.nandu);
    }

    public void presionOcho(View v) {
        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.oveja);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Toast.makeText(getApplicationContext(), "OVEJA / SHEEP",Toast.LENGTH_SHORT).show();
        textView.setText(R.string.btn_oveja);
        imageContenedor.setImageResource(R.drawable.oveja);
    }

    public void presionNueve(View v) {
        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.perro);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Toast.makeText(getApplicationContext(), "PERRO / DOG",Toast.LENGTH_SHORT).show();
        textView.setText(R.string.btn_perro);
        imageContenedor.setImageResource(R.drawable.perro);
    }

    public void presionDiez(View v) {
        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.pudu);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Toast.makeText(getApplicationContext(), "PUDÚ",Toast.LENGTH_SHORT).show();
        textView.setText(R.string.btn_pudu);
        imageContenedor.setImageResource(R.drawable.pudu);
    }

    public void presionCien(View v) {
        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.vaca);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Toast.makeText(getApplicationContext(), "VACA / COW",Toast.LENGTH_SHORT).show();
        textView.setText(R.string.btn_vaca);
        imageContenedor.setImageResource(R.drawable.vaca);
    }

    public void presionMil(View v) {
        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.zorro);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Toast.makeText(getApplicationContext(), "ZORRO / FOX",Toast.LENGTH_SHORT).show();
        textView.setText(R.string.btn_zorro);
        imageContenedor.setImageResource(R.drawable.zorro);
    }

}
