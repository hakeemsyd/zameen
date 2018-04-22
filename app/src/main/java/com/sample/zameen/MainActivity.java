package com.sample.zameen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mLengthEditText;
    private Button mCalculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLengthEditText = (EditText) this.findViewById(R.id.edittext_length);
        mCalculateButton = (Button) this.findViewById(R.id.btn_calculate);
        mCalculateButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_calculate) {
            String lenth = mLengthEditText.getText().toString();
            if(!lenth.equals("")) {
                double l = Double.parseDouble(lenth);
                Toast.makeText(this, "Current Length: " + l, Toast.LENGTH_SHORT).show();
            }
        }
    }
}
