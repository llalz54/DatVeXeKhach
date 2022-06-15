package com.example.datvexekhach;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class XeKhachThuongActivity extends AppCompatActivity{
    private RecyclerView rvGheXeTang1;
    private RecyclerView rvGheXeTang2;
    private RecyclerViewAdapter adapterTang1;
    private RecyclerViewAdapter adapterTang2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xe_khach_thuong);
        setControl();
        setEvent();
    }

    private void setEvent() {
        initRecyclerView();
    }

    private void initRecyclerView() {
        adapterTang1 = new RecyclerViewAdapter(new onClickSetStatusGheXe() {
            @Override
            public void setStatusGheXe(GheXe gheXe) {
                setStatusTang1(gheXe);
            }
        }, initData());
        adapterTang2 = new RecyclerViewAdapter(new onClickSetStatusGheXe() {
            @Override
            public void setStatusGheXe(GheXe gheXe) {
                setStatusTang2(gheXe);
            }
        }, initDataTang2());
        rvGheXeTang1.setLayoutManager(new GridLayoutManager(this,3));
        rvGheXeTang1.setAdapter(adapterTang1);
        rvGheXeTang2.setLayoutManager(new GridLayoutManager(this,3));
        rvGheXeTang2.setAdapter(adapterTang2);
    }

    private void setStatusTang1(GheXe gheXe) {
        if(gheXe.isTrangThaiGhe()) {
            gheXe.setTrangThaiGhe(false);
        }else{
            gheXe.setTrangThaiGhe(true);
        }
        adapterTang1.setStatus(gheXe);
        adapterTang1.notifyDataSetChanged();
    }

    private void setStatusTang2(GheXe gheXe) {
        if(gheXe.isTrangThaiGhe()) {
            gheXe.setTrangThaiGhe(false);
        }else{
            gheXe.setTrangThaiGhe(true);
        }
        adapterTang2.setStatus(gheXe);
        adapterTang2.notifyDataSetChanged();
    }

    private List<GheXe> initData() {
        List<GheXe> list = new ArrayList<>();
        list.add(new GheXe("A1",false));
        list.add(new GheXe("A2",false));
        list.add(new GheXe("A3",false));
        list.add(new GheXe("A4",false));
        list.add(new GheXe("A5",false));
        list.add(new GheXe("A6",false));
        list.add(new GheXe("A7",false));
        list.add(new GheXe("A8",false));
        list.add(new GheXe("A9",false));
        list.add(new GheXe("A10",false));
        list.add(new GheXe("A11",false));
        list.add(new GheXe("A12",false));
        list.add(new GheXe("A13",false));
        return list;
    }

    private List<GheXe> initDataTang2() {
        List<GheXe> list = new ArrayList<>();
        list.add(new GheXe("A1",false));
        list.add(new GheXe("A2",false));
        list.add(new GheXe("A3",false));
        list.add(new GheXe("A4",false));
        list.add(new GheXe("A5",false));
        list.add(new GheXe("A6",false));
        list.add(new GheXe("A7",false));
        list.add(new GheXe("A8",false));
        list.add(new GheXe("A9",false));
        list.add(new GheXe("A10",false));
        list.add(new GheXe("A11",false));
        list.add(new GheXe("A12",false));
        list.add(new GheXe("A13",false));
        return list;
    }

    private void setControl() {
        rvGheXeTang1 = findViewById(R.id.rvGheXeTang1);
        rvGheXeTang2 = findViewById(R.id.rvGheXeTang2);
    }

}