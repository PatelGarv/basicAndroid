package checkedtextview.androidtut.jm.com.checkedtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;

public class MainActivity extends AppCompatActivity {
    CheckedTextView checkedTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkedTextView = findViewById(R.id.checkedTextView);
        checkedTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkedTextView.toggle();
            }
        });
    }
}
