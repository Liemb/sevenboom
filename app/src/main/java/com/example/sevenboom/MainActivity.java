package com.example.sevenboom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
    }

    int x=0;
    public void btnclick(View view) {
        if ((x/10==7) || (x%10==7)) {
            btn.setText ("BOOM!");
        }
        else btn.setText ("This is a click number:" + x);
        x++;
    }
}
