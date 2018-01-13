package pe.sbk.stt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by heat_ on 2017-12-03.
 */

public class IntroScreen extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);

        Thread timerThread = new Thread() {
            public void run() {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(IntroScreen.this, SpeechToTextActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

    @Override
    public void onBackPressed() {
        if(false) {
            super.onBackPressed();
        } else {

        }
    }
}
