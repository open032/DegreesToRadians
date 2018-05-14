package com.example.che.degreestoradians;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener{
    private Button numToDegree;
    private Button activityDegreeToNum;
    private TextView showTextDegree;
    private TextView showTextSec;
    private EditText enterTextNum;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        enterTextNum = (EditText) findViewById(R.id.enterTextNumAt);
        showTextDegree = (TextView) findViewById(R.id.showTextDegreeAt);
        showTextSec = (TextView) findViewById(R.id.enterTextNumSecAt);
        numToDegree = (Button) findViewById(R.id.numToDegreeAt);
        numToDegree.setOnClickListener(this);
        activityDegreeToNum = (Button) findViewById(R.id.degreeToNumAt);
        activityDegreeToNum.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.degreeToNumAt:
                Intent intent = new Intent(this, DegreeToNum.class);
                startActivity(intent);
                break;
            case R.id.numToDegreeAt:
                double i;
                double des;
                int grad;
                double min;
                int min_true;
                int sec;
                double sec_ture;


                if (enterTextNum.length() != 0){
                    i = Double.parseDouble(enterTextNum.getText().toString());
                    des = i;
                    grad = (int)des;
                    min = (des - grad)*60;
                    min_true = (int) min;
                    sec = (int) min_true;
                    sec_ture = (min - sec) * 60;
                    showTextDegree.setText("gradus = " + grad + "      min = " + min_true);
                    showTextSec.setText("sec =  " + (float)sec_ture);
                }
            default:
                break;
        }
    }


}
