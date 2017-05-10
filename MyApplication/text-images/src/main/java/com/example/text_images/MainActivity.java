package com.example.text_images;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img = (ImageView) findViewById(R.id.ImgFoto);
        img.setImageResource(R.drawable.ic_launcher);

        final TextView lblEtiqueta = (TextView) findViewById(R.id.LblEtiqueta);
        String texto = lblEtiqueta.getText().toString();
        texto += "123";
        lblEtiqueta.setText(texto);
        lblEtiqueta.setBackgroundColor(Color.BLUE);

        EditText txtTexto = (EditText)findViewById(R.id.TxtBasico);
        String texto2 = txtTexto.getText().toString();
        txtTexto.setText("Hola mundo!");
    }
}
