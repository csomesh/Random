package com.example.somesh.random;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int randomInteger(){
        double randomNum = Math.random();
        randomNum = randomNum*10 + 1;
        int randomInt = (int) randomNum;
        return randomInt;
    }
    //int fromInt=0;
    //int toInt=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  EditText from = (EditText) findViewById(R.id.from);
        //EditText to = (EditText) findViewById(R.id.to);
        Button submitButton = (Button) findViewById(R.id.submit);


           submitButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //fromInt = Integer.parseInt(from.getText().toString());
                    //toInt = Integer.parseInt(to.getText().toString());
                   /*if (fromInt > toInt) {
                        String warn = "INVALID RANGE";
                        ranInt.setText(warn);
                    } else {
                        ranInt.setText(randomInteger());
                    }*/
                    TextView ranInt = (TextView) findViewById(R.id.ran_int_textview);
                    ranInt.setText(String.valueOf(randomInteger()));
                }
            });




    }

}