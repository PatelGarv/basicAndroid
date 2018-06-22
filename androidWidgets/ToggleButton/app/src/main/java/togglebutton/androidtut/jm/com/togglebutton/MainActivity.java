package togglebutton.androidtut.jm.com.togglebutton;

import android.icu.text.UnicodeSetSpanner;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tBtn = findViewById(R.id.toggleButton);
    }

    public void onClick(View view){
        if(tBtn.isChecked()) {
            Toast.makeText(getApplicationContext(), "Toggle ON", Toast.LENGTH_SHORT).show();
        }
        else{
                Toast.makeText(getApplicationContext(),"Toggle OFF", Toast.LENGTH_SHORT).show();

        }
    }
}
