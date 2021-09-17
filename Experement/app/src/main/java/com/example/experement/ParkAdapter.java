package com.example.experement;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ParkAdapter extends RecyclerView.Adapter<ParkAdapter.ViewHolder> {
    private ParkingLocation[] loc;
    private static Context context;

    @NonNull
    @Override
    public ParkAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.parkinglist,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ParkAdapter.ViewHolder holder, int position) {
        holder.parkname.setText(loc[position].getLocName());
        holder.Totslot.setText(loc[position].getTotalSlot());
        holder.availslot.setText(loc[position].getAvailableSlot());
        holder.notwo.setText(loc[position].getTwoWheel());
        holder.nofour.setText(loc[position].getFourWheel());
        holder.logo.setImageResource(loc[position].getLogo());

    }

    @Override
    public int getItemCount() {
        return loc.length;
    }

    public void setItems(ParkingLocation[] loc) {
        this.loc=loc;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView parkname;
        private final TextView Totslot;
        private final TextView availslot;
        private final TextView notwo;
        private final TextView nofour;
        private final ImageView logo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            parkname=itemView.findViewById(R.id.location);
            Totslot=itemView.findViewById(R.id.nslot);
            availslot=itemView.findViewById(R.id.navail);
            notwo=itemView.findViewById(R.id.ntwowheel);
            nofour=itemView.findViewById(R.id.mfourwheel);
            logo=itemView.findViewById(R.id.logo);
            Button book = itemView.findViewById(R.id.bslot);
            Button cancel = itemView.findViewById(R.id.cbook);

            book.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(context,sloatofparking.class);
                    context.startActivity(intent);
                }
            });

            cancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(context,ParkingCancel.class);
                    context.startActivity(intent);
                }
            });
        }
    }
}
