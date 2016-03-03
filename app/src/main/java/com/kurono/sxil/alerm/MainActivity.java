package com.kurono.sxil.alerm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {
    @Bind(R.id.text)
    TextView mtext;
    @Bind(R.id.button)
    Button button;
    int d = 0;
    @OnClick(R.id.button)

    void onClickButton(Button button) {
        d++;
       mtext.setText(String.valueOf(d));

    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);


        }

    }

