package com.semenov.toss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView toss;

    EditText num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonToss(View view){

        Random random = new Random();

        toss = (TextView) findViewById(R.id.main);

        num = (EditText) findViewById(R.id.editText);

        int a = Integer.parseInt(num.getText().toString().trim());


        String res = "";

        for (int i = 0;i<a;i++){
            res += random.randomnicity()+" ";
        }

        toss.setText(res);
    }
}
