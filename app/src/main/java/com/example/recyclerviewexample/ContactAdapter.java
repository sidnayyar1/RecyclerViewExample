package com.example.recyclerviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.MyViewHolder> {
    Context context;
    ArrayList<Contacts> arrayList1 ;

    public ContactAdapter(Context context, ArrayList<Contacts> arrayList1) {
        this.context = context;
        this.arrayList1 = arrayList1;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact,parent,false);

        return new MyViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        final Contacts contact1 = arrayList1.get(position);
        holder.image1.setImageResource(contact1.getImage());

        holder.text1.setText(contact1.getName());

        holder.text2.setText(contact1.getPhone());

    }

    @Override
    public int getItemCount() {
        return arrayList1.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{


        ImageView image1;
        TextView text1;
        TextView text2;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image1 = (ImageView)itemView.findViewById(R.id.image1);
            text1 = (TextView)itemView.findViewById(R.id.textv1);
            text2 = (TextView)itemView.findViewById(R.id.textv2);

        }
    }
}
