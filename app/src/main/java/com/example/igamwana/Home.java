package com.example.igamwana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.text.Layout;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;

public class Home extends AppCompatActivity implements View.OnClickListener {

    private CardView itemPrimary,itemNursery,itemAbout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //defining cards
        itemPrimary=(CardView)findViewById(R.id.itemPrimary);
        itemNursery=(CardView)findViewById(R.id.itemNursery);
        itemAbout=(CardView)findViewById(R.id.itemAbout);


        //Add click listener to cards
        itemPrimary.setOnClickListener(this);
        itemNursery.setOnClickListener(this);
        itemAbout.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){

            case R.id.itemPrimary : i=new Intent(this,PrimaryHome.class);startActivity(i);break;
            case R.id.itemNursery : i=new Intent(this,NurseryHome.class);startActivity(i);break;
            case R.id.itemAbout : i=new Intent(this,AboutHome.class);startActivity(i);break;
            default: break;
        }

    }
}
