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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//Присваиваем переменной наш RecyclerView
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        //Теперь нашему компоненту RecyclerView необходимо указать, отображать список вертикально или горизонтально
        //Для этого устанавливаем ему LayoutManager с нужным атрибутом
        recyclerView.setLayoutManager(new LinearLayoutManager(this, HORIZONTAL, false));

        //Создаём список с данными
        ArrayList<Coins> coins = new ArrayList<Coins>();
        coins.add(new Coins(R.drawable.java));

        coins.add(new Coins(R.drawable.python));

        //Создаём обект адаптера и передаём ему список данных
        DataAdapter carAdapter = new DataAdapter(coins);

        //Передаём в RecyclerView наш объект адаптера с данными.
        recyclerView.setAdapter(carAdapter);
    }

}
