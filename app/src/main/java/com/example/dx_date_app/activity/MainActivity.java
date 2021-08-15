package com.example.dx_date_app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.dx_date_app.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //バックグランドに遷移した時
    @Override
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Log.i("onUserLeaveHint","バックグランドに遷移");
    }
    //起動
    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i("onNewIntent","アプリ起動");
    }

    @Override
    public void onClick(View v) {

    }
}