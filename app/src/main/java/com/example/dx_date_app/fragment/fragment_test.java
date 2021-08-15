package com.example.dx_date_app.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.dx_date_app.R;

import org.jetbrains.annotations.NotNull;

public class fragment_test extends Fragment implements View.OnClickListener {

    private TextView tv_test_text_view;

    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_main_container, container, false);

        tv_test_text_view = view.findViewById(R.id.test_text_view);
        tv_test_text_view.setText("テストだけど変更した？");

        return view;
    }

    @Override
    public void onClick(View v) {

    }
}
