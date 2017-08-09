package com.ehappy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public TextView questext;
    public EditText input;
    public String S;
    public String drink;
    private RadioGroup rGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.layout_test);
        ImageView image01 = (ImageView)findViewById(R.id.image01);
        ImageView image02 = (ImageView)findViewById(R.id.image02);
        questext = (TextView) findViewById(R.id.questext);

        Log.d("Tag01","Hello");



        RadioButton BlackTeaBtn = (RadioButton)findViewById(R.id.BlackTeaBtn);
        RadioButton GreenTeaBtn = (RadioButton)findViewById(R.id.GreenTeaBtn);
        Button btn = (Button)findViewById(R.id.OrderBtn);
        btn.setOnClickListener(this);
        rGroup = (RadioGroup)findViewById(R.id.radioGroup);
        rGroup.setOnCheckedChangeListener(listener);
    }



    private RadioGroup.OnCheckedChangeListener listener=new RadioGroup.OnCheckedChangeListener(){
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId){
            if (checkedId == R.id.BlackTeaBtn)
            {
                drink="Balck Tea";
            }
            else if (checkedId == R.id.GreenTeaBtn)
            {
                drink="Green Tea";
            }
        }
    };
    @Override
    public void onClick(View view) {
        Log.d("Click","Click");
        input = (EditText)findViewById(R.id.editText3);
        S = input.getText().toString();
        questext.setText(S+"Order:"+drink);
        Toast.makeText(this,S+"Order:"+drink,Toast.LENGTH_SHORT).show();
    }
//    public void click(View v){
//        Log.d("Click","Click");
//        input = (EditText)findViewById(R.id.editText3);
//        S = input.getText().toString();
//        questtext.setText(S);
//        Toast.makeText(this,"Hello~~"+S,Toast.LENGTH_SHORT).show();
//    }
}
