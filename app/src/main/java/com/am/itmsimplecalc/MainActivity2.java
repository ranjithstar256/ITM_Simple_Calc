package com.am.itmsimplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView2;
    Animation animationobj;
    Animation animationob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView=findViewById(R.id.imageView);
        imageView2=findViewById(R.id.imageView2);
        animationobj= AnimationUtils.loadAnimation(MainActivity2.this,R.anim.kxy);
        animationob= AnimationUtils.loadAnimation(MainActivity2.this,R.anim.kmjhvjghfvg);
         }

    public void imagecl(View view) {
        imageView.startAnimation(animationobj);
        imageView2.startAnimation(animationob);
    }
}