package com.example.igamwana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class P6Opener extends AppCompatActivity {

    PDFView myPDFviewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p6_opener);


        myPDFviewer = (PDFView)findViewById(R.id.pdfViewerp6);

        String getItem= getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("English")){

            myPDFviewer.fromAsset("P6/ENG P6PB.pdf").load();
        }

        if (getItem.equals("Math")){

            myPDFviewer.fromAsset("P6/Maths P6 Book.pdf").load();
        }

        if (getItem.equals("SET")){

            myPDFviewer.fromAsset("P6/SET P6 SB.pdf").load();
        }


        if (getItem.equals("Kinyarwanda")){

            myPDFviewer.fromAsset("P6/KINYARWANDA P6 SB.pdf").load();
        }

        if (getItem.equals("French")){

            myPDFviewer.fromAsset("P6/French for Rwanda P6.pdf").load();
        }

    }
}
