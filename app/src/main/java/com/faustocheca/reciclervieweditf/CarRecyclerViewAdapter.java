package com.faustocheca.reciclervieweditf;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by faustocheca on 11/3/17.
 */

public class CarRecyclerViewAdapter  extends RecyclerView.Adapter<CarRecyclerViewAdapter.CarViewHolder>{

    ArrayList<Car>carArrayList;

    public CarRecyclerViewAdapter(ArrayList<Car> carArrayList) {
        this.carArrayList = carArrayList;
    }

    @Override
    public CarViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_car, parent, false);
        return new CarViewHolder(row);
    }

    @Override
    public void onBindViewHolder(CarViewHolder holder, int position) {
        Car car = carArrayList.get(position);
        holder.textViewName.setText(car.getMarca() +" "+ car.getModelo());
        holder.textViewPlate.setText(car.getMatricula());
        holder.textViewKm.setText(String.valueOf(car.getKm()));



    }

    @Override
    public int getItemCount() {
        return carArrayList.size();
    }

    public void addCar(Car car) {
        carArrayList.add(2, car);
        notifyDataSetChanged();
        notifyItemInserted(2);
        notifyItemRangeChanged(2, carArrayList.size()-2);


    }

    private void removeCar(int adapterPosition) {
        carArrayList.remove(adapterPosition);
        notifyItemRemoved(adapterPosition);
        notifyItemRangeChanged(adapterPosition, carArrayList.size()-adapterPosition);


    }


    // ViewHolder ¡¡¡¡¡

    public class CarViewHolder extends RecyclerView.ViewHolder{

        TextView textViewName, textViewPlate, textViewKm;
        View row;

        public CarViewHolder(View itemView) {
            super(itemView);

            row = itemView;
            textViewName = (TextView) itemView.findViewById(R.id.text_view_name);
            textViewPlate = (TextView) itemView.findViewById(R.id.text_view_plate);
            textViewKm = (TextView) itemView.findViewById(R.id.text_view_km);


            // muestra la posición en un Toast
            row.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(), String.valueOf(getAdapterPosition()), Toast.LENGTH_SHORT).show();

                }
            });

            // Borra la fila
            row.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    removeCar(getAdapterPosition());
                    return true;
                }
            });







        }
    }




}
