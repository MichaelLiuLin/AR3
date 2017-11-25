package com.bignerdranch.android.ar3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        ImageView iv = (ImageView) findViewById(R.id.imageSwitcher2);

        TextView title=(TextView)findViewById(R.id.title);
        title.setText("Ultra Marine Matrix              ");

        TextView tv =(TextView)findViewById(R.id.textView);
        tv.setText("This turtle is on the verge of becoming a number in the matrix of extinct species. This artwork is to raise awareness and celebrate this stunning sea creature.");
    }
}
