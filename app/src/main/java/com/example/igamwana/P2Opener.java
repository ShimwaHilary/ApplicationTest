package com.example.igamwana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class P2Opener extends AppCompatActivity {

    PDFView myPDFviewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2_opener);

        myPDFviewer = (PDFView)findViewById(R.id.pdfViewerp2);

        String getItem= getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("English")){

            myPDFviewer.fromAsset("P2/ENG P2.pdf").load();
        }

        if (getItem.equals("Math")){

            myPDFviewer.fromAsset("P2/Math P2.pdf").load();
        }

        if (getItem.equals("SET & ICT")){

            myPDFviewer.fromAsset("P2/SET & ICT P2.pdf").load();
        }

        if (getItem.equals("Social Studies")){

            myPDFviewer.fromAsset("P2/SST P2.pdf").load();
        }
    }
}
