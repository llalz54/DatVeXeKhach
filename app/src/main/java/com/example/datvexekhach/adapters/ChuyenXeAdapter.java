package com.example.datvexekhach.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.datvexekhach.R;
import com.example.datvexekhach.RecyclerViewAdapter;
import com.example.datvexekhach.models.ResponseChuyenXe;

import java.util.List;

public class ChuyenXeAdapter extends RecyclerView.Adapter<ChuyenXeAdapter.ViewHolder> {
    private List<ResponseChuyenXe> list;

    public ChuyenXeAdapter(List<ResponseChuyenXe> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ChuyenXeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chuyen_xe,parent,false);
        return new ChuyenXeAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChuyenXeAdapter.ViewHolder holder, int position) {
        setEvent(holder, position);
    }

    private void setEvent(ViewHolder holder, int position) {
        ResponseChuyenXe chuyenXe = list.get(position);
        holder.tvMaChuyenXe.setText(chuyenXe.getMaCX());
        holder.tvNoiDi.setText(chuyenXe.getNoiDi());
        holder.tvNoiDen.setText(chuyenXe.getNoiDen());
        holder.tvNgayDi.setText(chuyenXe.getNgayDi());
        holder.tvGiaChuyenXe.setText(String.valueOf(chuyenXe.getGia()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvMaChuyenXe, tvNoiDi, tvNoiDen, tvNgayDi, tvGiaChuyenXe;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            setControl(itemView);
        }

        private void setControl(View itemView) {
            tvMaChuyenXe = itemView.findViewById(R.id.tvMaChuyenXe);
            tvNoiDi = itemView.findViewById(R.id.tvNoiDi);
            tvNoiDen = itemView.findViewById(R.id.tvNoiDen);
            tvNgayDi = itemView.findViewById(R.id.tvNgayDi);
            tvGiaChuyenXe = itemView.findViewById(R.id.tvGiaChuyenXe);
        }
    }
}
