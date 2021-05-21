package com.example.myastrocode5;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.myastrocode5.fragment.ExpandableListMain2;


public class MainActivity extends AppCompatActivity {

    private ExpandableListMain2 forecast;

    private FragmentManager manager;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getSupportFragmentManager();
        forecast = new ExpandableListMain2();

    }

    public void onClickExpandableListMain(View view) {
        transaction = manager.beginTransaction();

        switch (view.getId()) {
            case R.id.button1:
                transaction.add(R.id.conteiner, forecast);
                break;

        }
        transaction.commit();
    }

}