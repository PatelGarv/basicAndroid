package progressbar.androidtut.jm.com.progressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        progressBar = findViewById(R.id.progressBar);
    }
    public void onClick(View view){
        Thread thread =new Thread(){
            @Override
            public void run(){
                super.run();
                for(int i=0;i<=100;){
                    try{
                        sleep(500);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    progressBar.setProgress(i);
                    i=i+10;
                }
            }
        };
        thread.start();
    }
}
