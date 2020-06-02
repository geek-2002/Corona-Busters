package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

public class MainActivity extends AppCompatActivity{
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnAdd,btnSub,btnmul,btndiv,btnequal,btndot;
    Button btnclear;
    EditText ed1;
    float res1,res2;
    boolean Add,Sub,Mul,Div
    @override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn0=(Button)findViewById(R.id.btn0);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnSub=(Button)findViewById(R.id.btnSub);
        btnmul=(Button)findViewById(R.id.btnmul);
        btndiv=(Button)findViewById(R.id.btndiv);
        btnequal=(Button)findViewById(R.id.btnequal);
        btndot=(Button)findViewById(R.id.btndot);
        btnclear=(Button)findViewById(R.id.btnclear);
        ed1=(EditText)findViewById(R.id.editText);
        btn1.setOnClickListener(new View.OnClickListener(){
            @override
            public void OnClick(View v){
                ed1.setText(ed1.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
            @override
            public void OnClick(View v){
                ed1.setText(ed1.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){
            @override
            public void OnClick(View v){
                ed1.setText(ed1.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){
            @override
            public void OnClick(View v){
                ed1.setText(ed1.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener(){
            @override
            public void OnClick(View v){
                ed1.setText(ed1.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener(){
            @override
            public void OnClick(View v){
                ed1.setText(ed1.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener(){
            @override
            public void OnClick(View v){
                ed1.setText(ed1.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener(){
            @override
            public void OnClick(View v){
                ed1.setText(ed1.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener(){
            @override
            public void OnClick(View v){
                ed1.setText(ed1.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener(){
            @override
            public void OnClick(View v){
                ed1.setText(ed1.getText()+"0");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener(){
            @override
            public void OnClick(View v){
                ed1.setText(ed1.getText()+".");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener(){
            @override
            public void OnClick(View v){
                if(ed1==null){
                    ed1.setText=" ";
                }
                else{
                    res1=Float.parseFloat(ed1.getText()+"");
                    Add=true;
                    ed1.setText(null);
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener(){
            @override
            public void OnClick(View v){
                if(ed1==null){
                    ed1.setText=" ";
                }
                else{
                    res1=Float.parseFloat(ed1.getText()+"");
                    Sub=true;
                    ed1.setText(null);
                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener(){
            @override
            public void OnClick(View v){
                if(ed1==null){
                    ed1.setText=" ";
                }
                else{
                    res1=Float.parseFloat(ed1.getText()+"");
                    Mul=true;
                    ed1.setText(null);
                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener(){
            @override
            public void OnClick(View v){
                if(ed1==null){
                    ed1.setText=" ";
                }
                else{
                    res1=Float.parseFloat(ed1.getText()+"");
                    Div=true;
                    ed1.setText(null);
                }
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener(){
            @override
            public void OnClick(View v){
                res2=Float.parseFloat(ed1.getText()+"");
                if(Add==true){
                    ed1.setText(res1+res2+"");
                    Add=false;
                }
                if(Sub==true){
                    ed1.setText(res1-res2+"");
                    Sub=false;
                }
                if(Mul==true){
                    ed1.setText(res1*res2+"");
                    Mul=false;
                }
                if(Div==true){
                    ed1.setText(res1/res2+"");
                    Div=false;
                }
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener(){
            @override
            public void OnClick(View v){
                ed1.setText("");
            }
        })
    }
}