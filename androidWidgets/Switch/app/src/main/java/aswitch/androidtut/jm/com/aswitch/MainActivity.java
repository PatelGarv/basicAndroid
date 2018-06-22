package aswitch.androidtut.jm.com.aswitch;

import android.icu.text.UnicodeSetSpanner;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Switch aSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aSwitch= findViewById(R.id.switch1);
    }

    public void onClick(View view){
        if(aSwitch.isChecked()){
            Toast.makeText(getApplicationContext(),"Toggle ON", Toast.LENGTH_SHORT).show();
        }else
            Toast.makeText(getApplicationContext(),"Toggle OFF",Toast.LENGTH_SHORT).show();
    }
}
