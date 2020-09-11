package com.example.igamwana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class P3Opener extends AppCompatActivity {

    PDFView myPDFviewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p3_opener);

        myPDFviewer = (PDFView)findViewById(R.id.pdfViewerp3);

        String getItem= getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("English")){

            myPDFviewer.fromAsset("P3/English P3.pdf").load();
        }

        if (getItem.equals("Math")){

            myPDFviewer.fromAsset("P3/Math P3.pdf").load();
        }

        if (getItem.equals("SET & ICT")){

            myPDFviewer.fromAsset("P3/SET & ICT P3.pdf").load();
        }

        if (getItem.equals("Social Studies")){

            myPDFviewer.fromAsset("P3/SST P3.pdf").load();
        }

        if (getItem.equals("Kinyarwanda")){

            myPDFviewer.fromAsset("P3/Kinyarwanda P3.pdf").load();
        }
    }
}
