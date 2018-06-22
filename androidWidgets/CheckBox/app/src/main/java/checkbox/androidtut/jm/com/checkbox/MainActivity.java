package checkbox.androidtut.jm.com.checkbox;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    CheckBox chkBox1, chkBox2, chkBox3;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        chkBox1 = findViewById(R.id.checkBox);
        chkBox2 = findViewById(R.id.checkBox2);
        chkBox3 = findViewById(R.id.checkBox3);
    }

    public void onClick(View view){

        if(chkBox1.isChecked() == true && chkBox2.isChecked() == true && chkBox3.isChecked() == true){
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFFFF"));
        }else

        if(chkBox1.isChecked() == true && chkBox2.isChecked() == true && chkBox3.isChecked() == false){
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFF00"));
        }else

        if(chkBox1.isChecked() == true && chkBox2.isChecked() == false && chkBox3.isChecked() == true){
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF00FF"));
        }else

        if(chkBox1.isChecked() == false && chkBox2.isChecked() == true && chkBox3.isChecked() == true){
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#00FFFF"));
        }else

        if(chkBox1.isChecked() == true){
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF0000"));
        }else
        if(chkBox2.isChecked() == true){
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#00FF00"));
        }else
        if(chkBox3.isChecked() == true){
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#0000FF"));
        }else
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFFFF"));

    }
}
