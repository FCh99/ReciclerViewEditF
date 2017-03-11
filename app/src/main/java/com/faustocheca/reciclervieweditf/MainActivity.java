package com.faustocheca.reciclervieweditf;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

import static com.faustocheca.reciclervieweditf.R.attr.layoutManager;

public class MainActivity extends AppCompatActivity {

    ArrayList<Car> coches;
    FloatingActionButton fab;
    RecyclerView recycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coches = new ArrayList<Car>();

        coches.add(new Car("Toyota", "Verso", "5379HHP", 95000));
        coches.add(new Car("Toyota", "Auris", "5380HHP", 40000));
        coches.add(new Car("Opel", "Corsa", "5779HHP", 195000));
        coches.add(new Car("Kia", "Trans", "0079HHJ", 5000));
        coches.add(new Car("Toyota", "Verso", "5379HHP", 95000));
        coches.add(new Car("Toyota", "Auris", "5380HHP", 40000));
        coches.add(new Car("Opel", "Corsa", "5779HHP", 195000));
        coches.add(new Car("Kia", "Trans", "0079HHJ", 5000));
        coches.add(new Car("Toyota", "Verso", "5379HHP", 95000));
        coches.add(new Car("Toyota", "Auris", "5380HHP", 40000));
        coches.add(new Car("Opel", "Corsa", "5779HHP", 195000));
        coches.add(new Car("Kia", "Trans", "0079HHJ", 5000));
        coches.add(new Car("Toyota", "Verso", "5379HHP", 95000));
        coches.add(new Car("Toyota", "Auris", "5380HHP", 40000));
        coches.add(new Car("Opel", "Corsa", "5779HHP", 195000));
        coches.add(new Car("Kia", "Trans", "0079HHJ", 5000));
        coches.add(new Car("Toyota", "Verso", "5379HHP", 95000));
        coches.add(new Car("Toyota", "Auris", "5380HHP", 40000));
        coches.add(new Car("Opel", "Corsa", "5779HHP", 195000));
        coches.add(new Car("Kia", "Trans", "0079HHJ", 5000));
        coches.add(new Car("Toyota", "Verso", "5379HHP", 95000));
        coches.add(new Car("Toyota", "Auris", "5380HHP", 40000));
        coches.add(new Car("Opel", "Corsa", "5779HHP", 195000));
        coches.add(new Car("Kia", "Trans", "0079HHJ", 5000));







        // meter el array en un recycler, incluye adapter y viewholder
        // antes configurar el recycler

        fab = (FloatingActionButton) findViewById(R.id.fabId);
        recycler = (RecyclerView) findViewById(R.id.recycler);

        recycler.setLayoutManager(new LinearLayoutManager(this));






        CarRecyclerViewAdapter adapter = new CarRecyclerViewAdapter(coches);
        recycler.setAdapter(adapter);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // añadir un coche al array

                Car car = new Car("Car Añadido", "Añadido", "xxxxx", 1);
                /*
                coches.add(car);
                notify();
                */
                CarRecyclerViewAdapter adapter = (CarRecyclerViewAdapter) recycler.getAdapter();
                adapter.addCar (car);


            }
        });





    }
}
