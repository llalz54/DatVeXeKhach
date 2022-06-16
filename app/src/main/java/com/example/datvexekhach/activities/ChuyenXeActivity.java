package com.example.datvexekhach.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;

import com.example.datvexekhach.ApiService;
import com.example.datvexekhach.R;
import com.example.datvexekhach.adapters.ChuyenXeAdapter;
import com.example.datvexekhach.models.ResponseChuyenXe;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ChuyenXeActivity extends AppCompatActivity {
    private RecyclerView rvChuyenXe;
    private ProgressDialog progressDialog;
    private ChuyenXeAdapter chuyenXeAdapter;
    private List<ResponseChuyenXe> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuyen_xe);
        setControl();
        initProgressDialog();
        initRecylcerView();
        initDataRecycleView();
        setEvent();
    }

    private void initProgressDialog() {
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading ...");
        progressDialog.setCancelable(false);
    }

    private void initDataRecycleView() {
        progressDialog.show();
        ApiService.API_SERVICE.getChuyenXe().enqueue(new Callback<List<ResponseChuyenXe>>() {
            @Override
            public void onResponse(Call<List<ResponseChuyenXe>> call, Response<List<ResponseChuyenXe>> response) {
                if (!response.isSuccessful()) {
                    progressDialog.dismiss();
                    return;
                }
                list.clear();
                list.addAll(response.body());
                progressDialog.dismiss();
                chuyenXeAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<ResponseChuyenXe>> call, Throwable t) {
                progressDialog.dismiss();
                Log.e("ErrorApi", t.getMessage());
            }
        });
    }

    private void initRecylcerView() {
        chuyenXeAdapter = new ChuyenXeAdapter(list);
        rvChuyenXe.setAdapter(chuyenXeAdapter);
        rvChuyenXe.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setEvent() {

    }

    private void setControl() {
        rvChuyenXe = findViewById(R.id.rvChuyenXe);
    }
}