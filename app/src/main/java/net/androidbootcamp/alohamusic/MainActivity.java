package net.androidbootcamp.alohamusic;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimerTask task = new TimerTask() {
            @Override
            public void run()
            {
                finish();
                startActivity(new Intent(MainActivity.this, PlayMusic.class));
            }
        };
        Timer opening = new Timer();
        opening.schedule(task,5000);
    }
}
