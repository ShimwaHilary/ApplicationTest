package com.example.igamwana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class P5Opener extends AppCompatActivity {

    PDFView myPDFviewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p5_opener);


        myPDFviewer = (PDFView)findViewById(R.id.pdfViewerp5);

        String getItem= getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("English")){

            myPDFviewer.fromAsset("P5/English P5 SB.pdf").load();
        }

        if (getItem.equals("Math")){

            myPDFviewer.fromAsset("P5/Rwanda Mathematics PB 5.pdf").load();
        }

        if (getItem.equals("SET")){

            myPDFviewer.fromAsset("P5/SET P5 SB.pdf").load();
        }

        if (getItem.equals("Creative Art")){

            myPDFviewer.fromAsset("P5/Creative Art P5.pdf").load();
        }

        if (getItem.equals("Kinyarwanda")){

            myPDFviewer.fromAsset("P5/KINYARWANDA P5 SB.pdf").load();
        }

        if (getItem.equals("French")){

            myPDFviewer.fromAsset("P5/FRENCH P5.pdf").load();
        }

        if (getItem.equals("Social Studies")){

            myPDFviewer.fromAsset("P5/SST P5 SB.pdf").load();
        }
    }
}
