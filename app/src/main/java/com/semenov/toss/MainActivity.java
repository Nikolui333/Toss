package com.semenov.toss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static androidx.recyclerview.widget.LinearLayoutManager.*;

public class MainActivity extends AppCompatActivity {

    //Обхявляем переменную RecyclerView
    RecyclerView recyclerView;
    RecyclerView recyclerView2;
    RecyclerView recyclerView3;
    RecyclerView recyclerView4;

    EditText num; // число, введённое в текстовую панель

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonToss(View view){
        try {
            //Присваиваем переменной наш RecyclerView
            recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
            recyclerView2 = (RecyclerView) findViewById(R.id.recycler_view2);
            recyclerView3 = (RecyclerView) findViewById(R.id.recycler_view3);
            recyclerView4 = (RecyclerView) findViewById(R.id.recycler_view4);

            //Получаем число из текстовой панели
            num = (EditText) findViewById(R.id.editText);
            int a = Integer.parseInt(num.getText().toString().trim());

            if (a>16){
                a=16;
                num.setText("16");
            }

            //Теперь нашему компоненту RecyclerView необходимо указать, отображать список вертикально или горизонтально
            //Для этого устанавливаем ему LayoutManager с нужным атрибутом
            recyclerView.setLayoutManager(new LinearLayoutManager(this, HORIZONTAL, false));
            recyclerView2.setLayoutManager(new LinearLayoutManager(this, HORIZONTAL, false));
            recyclerView3.setLayoutManager(new LinearLayoutManager(this, HORIZONTAL, false));
            recyclerView4.setLayoutManager(new LinearLayoutManager(this, HORIZONTAL, false));

            //Создаём список с данными
            ArrayList<Coins> coins = new ArrayList<Coins>();
            ArrayList<Coins> coins2 = new ArrayList<Coins>();
            ArrayList<Coins> coins3 = new ArrayList<Coins>();
            ArrayList<Coins> coins4 = new ArrayList<Coins>();
            int counter = 0;
            for (int i =0;i<a;i++){
                counter++;
                int rand = new Random().randomnicity();

                if (counter<=4){


                    if(rand>=0.5){
                        coins.add(new Coins(R.drawable.java));
                    }
                    if (rand<0.5){
                        coins.add(new Coins(R.drawable.python));
                    }

                }
                else  if(counter<=8){

                    if(rand>=0.5){
                        coins2.add(new Coins(R.drawable.java));
                    }
                    if (rand<0.5){
                        coins2.add(new Coins(R.drawable.python));
                    }

                }
                else  if(counter<=12){
                    if(rand>=0.5){
                        coins3.add(new Coins(R.drawable.java));
                    }
                    if (rand<0.5){
                        coins3.add(new Coins(R.drawable.python));
                    }
                }
                else{

                    if(rand>=0.5){
                        coins4.add(new Coins(R.drawable.java));
                    }
                    if (rand<0.5){
                        coins4.add(new Coins(R.drawable.python));
                    }

                }
            }

            //Создаём обект адаптера и передаём ему список данных
            DataAdapter coinAdapter = new DataAdapter(coins);
            DataAdapter coinAdapter2 = new DataAdapter(coins2);
            DataAdapter coinAdapter3 = new DataAdapter(coins3);
            DataAdapter coinAdapter4 = new DataAdapter(coins4);

            //Передаём в RecyclerView наш объект адаптера с данными.
            recyclerView.setAdapter(coinAdapter);
            recyclerView2.setAdapter(coinAdapter2);
            recyclerView3.setAdapter(coinAdapter3);
            recyclerView4.setAdapter(coinAdapter4);

        }catch (Exception ex){

        }
    }

}
