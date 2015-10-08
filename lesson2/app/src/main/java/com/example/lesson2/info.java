package com.example.lesson2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Влад on 03.10.2015.
 */
public class info extends MainActivity {
    protected Button btn;
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.info);
        btn = (Button)findViewById(R.id.button);
    }
    public void OnClickButtonBack(View view){
        Intent intent = new Intent(info.this, MainActivity.class);
        startActivity(intent);
    }
}

