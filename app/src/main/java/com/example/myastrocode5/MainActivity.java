package com.example.myastrocode5;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.myastrocode5.fragment.ExpandableListMain2;
import com.example.myastrocode5.fragment.MyDialogFragment;

import java.util.Calendar;
import java.util.Date;


public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3,button4,button5;
//    private ImageButton imageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.conteiner, new ExpandableListMain2()).commit();
            }
        });

//
//        imageButton = (ImageButton) findViewById(R.id.imageButton2);
//        imageButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast toast = Toast.makeText(getApplicationContext(), " я тут", Toast.LENGTH_SHORT);
//                toast.setGravity(Gravity.CENTER, 0, 0);
//                toast.show();
//            }
//
//        });

//        button2 = (Button)findViewById(R.id.btn2);
//        button3 = (Button)findViewById(R.id.btn3);
//        button4 = (Button)findViewById(R.id.btn4);
//        button5 = (Button)findViewById(R.id.btn5);


    }

    public void btn_calendar(View view) {
        DialogFragment fragment = new MyDialogFragment();
        fragment.show(getSupportFragmentManager(), "date picker");
    }

    public enum Day {
        Ночь,Утро,День,Вечер
    }

    public enum Month {
        День, Неделя, Две_недели, Месяц
    }


    public enum Period {
        Day, Month
    }

    public void configure (Date date, Period period){
        switch (period){
            case Day:

                break;
        }
    }

}
