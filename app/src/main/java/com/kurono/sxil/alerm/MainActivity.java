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
    @Bind(R.id.sadBtn)
        Button sadBtn;
    @Bind(R.id.addBtn)
        Button addbutton;
    @Bind(R.id.clearBtn)
            Button clearBtn;
    public    int atai = 0;


    @OnClick({R.id.addBtn,R.id.sadBtn})

    void  onAtaiChangeBtn(Button changeBtn){


        switch (changeBtn.getId()) {
            case R.id.addBtn:
                data();
                atai++;
                break;
            case R.id.sadBtn:
                data();
                if(atai <=  0){
                }else {
                    atai--;
                }
                break;
            case R.id.clearBtn:
                data();
                if(atai!=0){
                    atai =0;
                    clearBtn.setEnabled(false);
                }
                break;
            default:
        }

        mtext.setText(String.valueOf(atai));
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        mtext.setTextSize(100);


        }
   public void  data(){
       if (this.atai !=0){
           clearBtn.setEnabled(true);
       }
   }

    }

