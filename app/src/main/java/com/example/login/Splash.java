package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.TestLooperManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        openApp();
        TextView banner = findViewById(R.id.bannerLabel);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.blink);
        banner.startAnimation(myanim);

        ImageView mSea = findViewById(R.id.backView);


        Glide.with(this)
                .load("https://img.freepik.com/foto-gratis/caida-crecimiento-helechos-frescos-barranco-bosque-tranquilo-generado-ia_188544-38323.jpg?w=2000&t=st=1700138002~exp=1700138602~hmac=2bbcfcf0123d6db977d1b373202d49949056692bebfa43b4817b9d760f948a19")

                .transition(DrawableTransitionOptions.withCrossFade(100))
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.green2)))
                .into(mSea);
    }

    private void openApp() {

        Handler handler = new Handler();
        handler.postDelayed(new Runnable()
        {
            @Override
            public void run() {
                Intent intent = new Intent(Splash
                        .this, Login.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);

            }
        }, 5000);


    }

}