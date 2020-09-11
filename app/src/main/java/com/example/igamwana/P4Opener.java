package com.example.igamwana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class P4Opener extends AppCompatActivity {

    PDFView myPDFviewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p4_opener);

        myPDFviewer = (PDFView)findViewById(R.id.pdfViewerp4);

        String getItem= getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("English")){

            myPDFviewer.fromAsset("P4/English P4 SB.pdf").load();
        }

        if (getItem.equals("Math")){

            myPDFviewer.fromAsset("P4/Maths P4 SB.pdf").load();
        }

        if (getItem.equals("SET & ICT")){

            myPDFviewer.fromAsset("P4/SET & ICT P4 SB.pdf").load();
        }

        if (getItem.equals("Creative Art")){

            myPDFviewer.fromAsset("P4/Creative Arts P4.pdf").load();
        }

        if (getItem.equals("Kinyarwanda")){

            myPDFviewer.fromAsset("P4/Kinyarwanda P4 SB.pdf").load();
        }

        if (getItem.equals("French")){

            myPDFviewer.fromAsset("P4/FRENCH LB P4.pdf").load();
        }
    }
}
