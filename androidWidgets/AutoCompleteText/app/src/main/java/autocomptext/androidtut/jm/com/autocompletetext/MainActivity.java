package autocomptext.androidtut.jm.com.autocompletetext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
AutoCompleteTextView autoCompTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompTextView = findViewById(R.id.autoCompleteTextView);


        String [] names = {"Aaa","Bbb","Ccc","Ddd","Eee","Fff","Ggg"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,names);
        autoCompTextView.setAdapter(adapter);
    }

}
