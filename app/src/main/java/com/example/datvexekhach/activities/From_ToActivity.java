package com.example.datvexekhach.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import com.example.datvexekhach.ApiService;
import com.example.datvexekhach.R;
import com.example.datvexekhach.adapters.SpinnerAdapter;
import com.example.datvexekhach.models.ResponseChuyenXe;
import com.example.datvexekhach.models.ResponseLoTrinh;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class From_ToActivity extends AppCompatActivity {
    private AutoCompleteTextView actvChuyenDi;
    private SpinnerAdapter spinnerAdapter;
    private List<String> listSpinner = new ArrayList<>();
    private ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from_to);
        setControl();
        initProgressDialog();
        initAdapter();
        initDataSpinner();
        setEvent();
    }

    private void initProgressDialog() {
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading ...");
        progressDialog.setCancelable(false);
    }

    private void initDataSpinner() {
        progressDialog.show();
        ApiService.API_SERVICE.getLoTrinh().enqueue(new Callback<List<ResponseLoTrinh>>() {
            @Override
            public void onResponse(Call<List<ResponseLoTrinh>> call, Response<List<ResponseLoTrinh>> response) {
                if(!response.isSuccessful()) {
                    progressDialog.dismiss();
                    return;
                }
                listSpinner.clear();
                for (ResponseLoTrinh responseLoTrinh : response.body()) {
                    listSpinner.add(new String(responseLoTrinh.noiDiNoiDen()));
                    Log.e("ErrorApi",responseLoTrinh.noiDiNoiDen());
                }
                spinnerAdapter.notifyDataSetChanged();
                progressDialog.dismiss();
            }

            @Override
            public void onFailure(Call<List<ResponseLoTrinh>> call, Throwable t) {
                progressDialog.dismiss();
            }
        });
    }

    private void initAdapter() {
        spinnerAdapter = new SpinnerAdapter(this, 0, listSpinner);
        actvChuyenDi.setAdapter(spinnerAdapter);
    }

    private void setEvent() {

    }

    private void setControl() {
        actvChuyenDi = findViewById(R.id.actvChuyenDi);
    }


}