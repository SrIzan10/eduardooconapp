package ml.srizan.eduardooconapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.window.SplashScreen;

public class splash_activity extends AppCompatActivity {

    private final int DURACION_SPLASH = 3000;

    @Override
    public void onCreate(Bundle saveInstanceState) {
        Bundle savedInstanceState = null;
        //si no funciona, quita lo de arriba
        super.onCreate(null);
        // cambia null a savedInstanceState si no funciona
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            public void run () {
                Intent intent = new Intent(splash_activity.this, MainActivity.class);
                // SplashScreen puede estar mal, prueba con SplashActivity.
                startActivity(intent);
                finish();
                };
            }, DURACION_SPLASH);
        }}
//    }
//}
//    @Override
//   protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_splash);
//    }
//}