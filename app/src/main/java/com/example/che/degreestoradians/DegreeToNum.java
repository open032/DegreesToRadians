package com.example.che.degreestoradians;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DegreeToNum extends Activity implements View.OnClickListener{
    private Button activityNumToDegree;
    private Button degreeToNum;
    private TextView showTextNum;
    private EditText editDegree;
    private EditText editMin;
    private EditText editSec;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_degree_to_num);

        showTextNum = (TextView) findViewById(R.id.textNum);
        editDegree = (EditText) findViewById(R.id.editDegreeAt);
        editMin = (EditText) findViewById(R.id.editMinAt);
        editSec = (EditText) findViewById(R.id.editSecAt);
        activityNumToDegree = (Button) findViewById(R.id.activityNumToDegreeAt);
        activityNumToDegree.setOnClickListener(this);
        degreeToNum = (Button) findViewById(R.id.degreeToNumAt);
        degreeToNum.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.activityNumToDegreeAt:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.degreeToNumAt:
                float grad;
                float min;
                float sec;
                float num;
                if (editDegree.length() != 0 && editMin.length() !=0 && editSec.length() != 0 ){
                    grad = Float.parseFloat(editDegree.getText().toString());
                    min = Float.parseFloat(editMin.getText().toString());
                    sec = Float.parseFloat(editSec.getText().toString());
                    num = (sec/3600) + (min/60) + grad;
                    showTextNum.setText("Number = " + num);
                }

        }
    }
}
