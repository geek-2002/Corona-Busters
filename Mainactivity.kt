package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

public class MainActivity extends AppCompatActivity{
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnplus,btnminus,btnmul,btndiv,btnequal,btndot;
    Button btnclear;
    EditText ed1;
    @override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}