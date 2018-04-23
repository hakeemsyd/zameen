package com.sample.zameen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mLengthEditText1;
    private EditText mLengthEditText2;
    private EditText mWidthEditText1;
    private EditText mWidthEditText2;
    private TextView mMarlatextview;
    private TextView mKanaltextview;
    private Button mCalculateButton;
    private Button mClsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLengthEditText1 = (EditText) this.findViewById(R.id.edittext_length1);
        mLengthEditText2 = (EditText) this.findViewById(R.id.edittext_length2);
        mWidthEditText1 = (EditText) this.findViewById(R.id.edittext_width1);
        mWidthEditText2 = (EditText) this.findViewById(R.id.edittext_width2);
        mMarlatextview = (TextView) this.findViewById(R.id.textview_marla);
        mKanaltextview = (TextView) this.findViewById(R.id.textview_kanal);

        mCalculateButton = (Button) this.findViewById(R.id.btn_calculate);
        mCalculateButton.setOnClickListener(this);
        mClsButton = (Button) this.findViewById(R.id.btn_cls);
        mClsButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_cls) {
            mLengthEditText1.setText("");
            mLengthEditText2.setText("");
            mWidthEditText1.setText("");
            mWidthEditText2.setText("");
            mMarlatextview.setText("");
            mKanaltextview.setText("");

        }
        if (v.getId() == R.id.btn_calculate) {
            String lenth1 = mLengthEditText1.getText().toString();
            String lenth2 = mLengthEditText2.getText().toString();
            String width1 = mWidthEditText1.getText().toString();
            String width2 = mWidthEditText2.getText().toString();
            if (!lenth1.equals("") && !lenth2.equals("") && !width1.equals("") && !width2.equals("")) {
                double l1 = Double.parseDouble(lenth1);
                double l2 = Double.parseDouble(lenth2);
                double w1 = Double.parseDouble(width1);
                double w2 = Double.parseDouble(width2);
                double fl = (l1 + l2) / 2;
                double fw = (w1 + w2) / 2;
                double marla = (fl * fw) / 272;
                double kanal = marla / 20;
                String m = marla + "";
                String k = kanal + "";

                mMarlatextview.setText(m);
                mKanaltextview.setText(k);


                Toast.makeText(this, "Current Length: " + fl, Toast.LENGTH_SHORT).show();
            }
        }
    }
}


