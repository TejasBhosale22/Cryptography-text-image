package com.example.securedata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class photocrypto extends AppCompatActivity {
    ImageView imageEncrypt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photocrypto);

        getSupportActionBar().hide();
        imageEncrypt=findViewById(R.id.img_encrypt);
        imageEncrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m2 =new Intent(photocrypto.this,ptocrypto.class);
                startActivity(m2);
            }
        });
    }
}