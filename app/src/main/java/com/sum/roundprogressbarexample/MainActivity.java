package com.sum.roundprogressbarexample;

import android.app.Activity;
import android.os.Bundle;

import com.sum.roundprogressbar.RoundProgressBar;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends Activity {

    private RoundProgressBar progressBar1;
    private RoundProgressBar progressBar2;
    private RoundProgressBar progressBar3;
    private Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar1 = (RoundProgressBar)findViewById(R.id.progress1);
        progressBar2 = (RoundProgressBar)findViewById(R.id.progress2);
        progressBar3 = (RoundProgressBar)findViewById(R.id.progress3);


        // 刷新时间要大于500ms  因为有延迟动画
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        progressBar1.setProgress(progressBar1.getProgress() + 10);
                        progressBar2.setProgress(progressBar2.getProgress() + 10);
                        progressBar3.setProgress(progressBar3.getProgress() + 10);
                    }
                });
            }
        }, 1000, 1000);

    }
}
