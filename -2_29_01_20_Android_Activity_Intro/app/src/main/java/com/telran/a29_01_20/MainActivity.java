package com.telran.a29_01_20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText inputMessage;
    private TextView resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button clickBtn = findViewById(R.id.clickBtn);
        clickBtn.setText("My button");
        clickBtn.setOnClickListener(this);
        Button secondBtn = findViewById(R.id.secondBtn);
        secondBtn.setOnClickListener(this);

        Button thirdBtn = findViewById(R.id.thirdBtn);
        thirdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MY_TAG", "onClick: thirdBtn");
            }
        });

        inputMessage = findViewById(R.id.inputMessage);
        resultTxt = findViewById(R.id.resultTxt);

        Button readBtn = findViewById(R.id.readBtn);
        readBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.clickBtn){
            Intent intent = new Intent(this,SecondActivity.class);
            startActivity(intent);
        }else if(v.getId() == R.id.secondBtn){
            Log.d("MY_TAG", "onClick: secondBtn");
        }else if(v.getId() == R.id.readBtn){
            String str = String.valueOf(inputMessage.getText());
            resultTxt.setText(str);
        }
    }

    public void fourClick(View v){
        Log.d("MY_TAG", "fourClick: ");
    }
}
