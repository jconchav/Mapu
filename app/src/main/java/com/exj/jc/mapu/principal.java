package com.exj.jc.mapu;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.johnpersano.supertoasts.library.Style;
import com.github.johnpersano.supertoasts.library.SuperActivityToast;
import com.github.johnpersano.supertoasts.library.utils.PaletteUtils;

import java.security.Principal;

public class principal extends AppCompatActivity {

    private Button btnNumero;
    private Button btnColores;
    private Button btnAnimales;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);

        //Toast.makeText(this, "Mari mari, kom pu che", Toast.LENGTH_LONG).show();
        SuperActivityToast.create(this, new Style(), Style.TYPE_BUTTON)
                .setOnButtonClickListener("good_tag_name", null, null)
                .setProgressBarColor(Color.WHITE)
                .setText("Mari mari kom pu che")
                .setDuration(Style.DURATION_LONG)
                .setFrame(Style.FRAME_LOLLIPOP)
                .setColor(PaletteUtils.getSolidColor(PaletteUtils.MATERIAL_PURPLE))
                .setAnimations(Style.ANIMATIONS_POP).show();

        btnNumero = (Button)findViewById(R.id.buttonNumero);

        btnNumero.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent btnNumero = new Intent(principal.this, Numeros.class);
                startActivity(btnNumero);
            }

        });

        btnColores = (Button)findViewById(R.id.buttonColores);

        btnColores.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent btnColores = new Intent(principal.this, colores.class);
                startActivity(btnColores);
            }

        });

        btnAnimales = (Button)findViewById(R.id.buttonAnimales);

        btnAnimales.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent btnAnimales = new Intent(principal.this, animales.class);
                startActivity(btnAnimales);
            }

        });
    }



}
