package com.example.igamwana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class P1List extends AppCompatActivity {

    PDFView myPDFviewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p1_list);

        myPDFviewer = (PDFView)findViewById(R.id.pdfViewerp1);

        String getItem= getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("English")){

           myPDFviewer.fromAsset("P1/English P1.pdf").load();
        }

        if (getItem.equals("Math")){

            myPDFviewer.fromAsset("P1/Math P1.pdf").load();
        }

        if (getItem.equals("SET & ICT")){

            myPDFviewer.fromAsset("P1/SET & ICT Student Book P1.pdf").load();
        }

        if (getItem.equals("Kinyarwanda")){

            myPDFviewer.fromAsset("P1/Kinyarwanda Student Book P1.pdf").load();
        }

        if (getItem.equals("Social studies")){

            myPDFviewer.fromAsset("P1/P1 social student book.pdf").load();
        }
    }
}
