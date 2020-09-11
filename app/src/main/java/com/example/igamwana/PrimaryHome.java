package com.example.igamwana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class PrimaryHome extends AppCompatActivity implements View.OnClickListener {
    private CardView card_p1, card_p2,card_p3,card_p4, card_p5, card_p6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary_home);

        //defining cards
        card_p1=(CardView)findViewById(R.id.card_P1);
        card_p2=(CardView)findViewById(R.id.card_P2);
        card_p3=(CardView)findViewById(R.id.card_P3);
        card_p4=(CardView)findViewById(R.id.card_P4);
        card_p5=(CardView)findViewById(R.id.card_P5);
        card_p6=(CardView)findViewById(R.id.card_P6);

        //Add click listener to cards
        card_p1.setOnClickListener(this);
        card_p2.setOnClickListener(this);
        card_p3.setOnClickListener(this);
        card_p4.setOnClickListener(this);
        card_p5.setOnClickListener(this);
        card_p6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){

            case R.id.card_P1 : i=new Intent(this,PrimaryOne.class); startActivity(i);break;
            case R.id.card_P2 : i=new Intent(this,PrimaryTwo.class); startActivity(i);break;
            case R.id.card_P3 : i=new Intent(this,PrimaryThree.class); startActivity(i);break;
            case R.id.card_P4 : i=new Intent(this,PrimaryFour.class); startActivity(i);break;
            case R.id.card_P5 : i=new Intent(this,Primaryfive.class); startActivity(i);break;
            case R.id.card_P6 : i=new Intent(this,PrimarySix.class); startActivity(i);break;
            default:break;
        }

    }
}
