package com.kurono.sxil.alerm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;


public class MainActivity extends AppCompatActivity {
    @Bind(R.id.text)
        TextView mtext;
    @Bind(R.id.sadBtn)
        Button sadBtn;
    @Bind(R.id.addBtn)
        Button addbutton;
    @Bind(R.id.clearBtn)
            Button clearBtn;
   int atai = 0;

    private void onClickAdd(){
        atai++;

    }
    private void onClickSad(){
        atai--;
    }
    private void onClickClear(){
        if(atai==0) {
            clearBtn.setEnabled(false);
        }else {
            clearBtn.setEnabled(true);
        }
    }
    @OnClick({R.id.addBtn,R.id.sadBtn,R.id.clearBtn})

    void  onAtaiChangeBtn(Button changeBtn){

//
        switch (changeBtn.getId()) {
            case R.id.addBtn:
                onClickAdd();
                onClickClear();
                break;
            case R.id.sadBtn:

                if(atai <=  0){
                }else {
                    onClickSad();
                    onClickClear();
                }
                break;
            case R.id.clearBtn:
                if(atai!=0){
                    atai =0;
                    onClickClear();
                }
                break;
            default:
        }

        mtext.setText(String.valueOf(atai));
    }
    @OnLongClick({R.id.addBtn,R.id.sadBtn,R.id.clearBtn})

   boolean  onLongAtaiChangeBtn(Button changeBtn){

//
        switch (changeBtn.getId()) {
            case R.id.addBtn:
                onClickAdd();
                onClickClear();
                break;
            case R.id.sadBtn:

                if(atai <=  0){
                }else {
                    onClickSad();
                    onClickClear();
                }
                break;
            case R.id.clearBtn:
                if(atai!=0){
                    atai =0;
                    onClickClear();
                }
                break;
            default:
        }

        mtext.setText(String.valueOf(atai));
        return  true;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        onClickClear();
        mtext.setTextSize(100);


        }


    }

