package com.example.datvexekhach;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private onClickSetStatusGheXe listener;
    private List<GheXe> list;

    public RecyclerViewAdapter(onClickSetStatusGheXe listener, List<GheXe> list) {
        this.listener = listener;
        this.list = list;
    }

    public void setStatus(GheXe gheXe){
        for (GheXe xe : list) {
            if(xe.getMaGhe().equalsIgnoreCase(gheXe.getMaGhe())){
                xe.setTrangThaiGhe(gheXe.isTrangThaiGhe());
                break;
            }
        }
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ghe_xe,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        setEvent(holder, position);
    }

    private void setEvent(ViewHolder holder, int position) {
        GheXe gheXe = list.get(position);
        holder.statusGheXe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.setStatusGheXe(gheXe);
            }
        });
        if(gheXe.isTrangThaiGhe() == 1){
            holder.statusGheXe.setColorFilter(Color.BLACK);
        }else if(gheXe.isTrangThaiGhe() == 0){
            holder.statusGheXe.setColorFilter(Color.DKGRAY);
        }else {
            holder.statusGheXe.setColorFilter(Color.GREEN);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView statusGheXe;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            setControl(itemView);
        }

        private void setControl(View itemView) {
            statusGheXe = itemView.findViewById(R.id.statusGheXe);
        }

    }
}
