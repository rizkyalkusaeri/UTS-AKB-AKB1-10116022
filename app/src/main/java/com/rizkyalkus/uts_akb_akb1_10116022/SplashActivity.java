package com.rizkyalkus.uts_akb_akb1_10116022;

/* NIM : 10116022
   Nama : M Rizky Al Kusaeri
   Kelas : AKB-1
   Tanggal Pengerjaan : 20 Mei 2019
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {


    private ImageView logosplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        logosplash = (ImageView) findViewById(R.id.splash_logo);
        Animation logoanim = AnimationUtils.loadAnimation(this, R.anim.splash_transition);
        logosplash.startAnimation(logoanim);

        final Intent i = new Intent(this, IntroActivity.class);
        Thread timer = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {

                    startActivity(i);
                    finish();

                }
            }
        };

        timer.start();
    }
}
