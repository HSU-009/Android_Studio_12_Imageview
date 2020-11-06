package com.example.android_studio_12_imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setOnClickListener(photo1);
    }

    private View.OnClickListener photo1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ImageView imageView2 = (ImageView) findViewById(R.id.imageView);
            imageView2.setImageResource(R.mipmap.photo2);
        }
    };
}

