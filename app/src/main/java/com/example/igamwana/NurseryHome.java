package com.example.igamwana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NurseryHome extends AppCompatActivity implements View.OnClickListener {
    private CardView card_n1,card_n2,card_n3,card_n4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nursery_home);

        //defining cards
        card_n1=(CardView)findViewById(R.id.card_N1);
        card_n2=(CardView)findViewById(R.id.card_N2);
        card_n3=(CardView)findViewById(R.id.card_N3);
        card_n4=(CardView)findViewById(R.id.card_N4);

        //Add click listener to cards
        card_n1.setOnClickListener(this);
        card_n2.setOnClickListener(this);
        card_n3.setOnClickListener(this);
        card_n4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){

            case R.id.card_N1 : i=new Intent(this,BabyClass.class);startActivity(i);break;
            case R.id.card_N2 : i=new Intent(this,MiddleClass.class);startActivity(i);break;
            case R.id.card_N3 : i=new Intent(this,UpperClass.class);startActivity(i);break;
            case R.id.card_N4 : i=new Intent(this,Finish.class);startActivity(i);break;
            default: break;
        }

    }
}
