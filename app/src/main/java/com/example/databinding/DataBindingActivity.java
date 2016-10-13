package com.example.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.R;

/**
 * Created by YUSH on 2016-10-12.
 */

public class DataBindingActivity extends AppCompatActivity {

    private com.example.databinding.ActivityDataBindingBinding mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding);

        mBinding.txtHello.setText("Hello");
    }
}
