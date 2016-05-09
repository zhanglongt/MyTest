package com.yfw.zlt.mytest;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.yfw.zlt.commom.Constants;

public class Anim extends AppCompatActivity implements View.OnClickListener{
    private AnimationDrawable animationDrawable;
    private ImageView animationIV;
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anim);
        bt= (Button) findViewById(R.id.bt);
        bt.setOnClickListener(this);
//        animationIV= (ImageView) findViewById(R.id.animationIV);
//        animationIV.setImageResource(R.drawable.loading);
//        animationDrawable = (AnimationDrawable) animationIV.getDrawable();
//        animationDrawable.start();


    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.bt){
            Intent mIntent = new Intent(Constants.LOGIN_SUCCESS_URL);
            sendBroadcast(mIntent);
            finish();
        }
    }
}
