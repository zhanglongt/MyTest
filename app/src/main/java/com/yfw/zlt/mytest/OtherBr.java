package com.yfw.zlt.mytest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.yfw.zlt.commom.Constants;

public class OtherBr extends AppCompatActivity implements View.OnClickListener{
    private TextView textView;
    private Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_br);
        bt1= (Button) findViewById(R.id.bt1);
        bt1.setOnClickListener(this);
        textView= (TextView) findViewById(R.id.tvText);

    }
    private BroadcastReceiver mBro=new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if(action.equals(Constants.LOGIN_SUCCESS_URL)) {
                textView.setText("你好");
            }
        }
    };
    //注册广播
    public void registerBoradcastReceiver(){
        IntentFilter myIntentFilter = new IntentFilter();
        myIntentFilter.addAction(Constants.LOGIN_SUCCESS_URL);
        this.registerReceiver(mBro, myIntentFilter);  //注册广播
    }

    @Override
    protected void onStart() {
        super.onStart();
        registerBoradcastReceiver();
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.bt1){
            Intent i=new Intent(OtherBr.this,Anim.class);
            startActivity(i);
        }
    }
}
