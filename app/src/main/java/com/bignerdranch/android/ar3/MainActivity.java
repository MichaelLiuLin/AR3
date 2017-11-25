package com.bignerdranch.android.ar3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
        TextView tv =(TextView)findViewById(R.id.textView);
        Button  button2018=(Button) findViewById(R.id.button2018);
        Button  button2017=(Button) findViewById(R.id.button2017);
        Button  button2016=(Button) findViewById(R.id.button2016);
        Button  button2015=(Button) findViewById(R.id.button2015);


        button2017.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

              }
        });


        title.setText("Ultra Marine Matrix              ");
        tv.setText("This turtle is on the verge of becoming a number in the matrix of extinct species. This artwork is to raise awareness and celebrate this stunning sea creature.");
    }
}
