package com.example.igamwana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class BabyOpener extends AppCompatActivity {

    PDFView myPDFviewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baby_opener);

        myPDFviewer = (PDFView)findViewById(R.id.pdfViewerbaby);


        myPDFviewer = (PDFView)findViewById(R.id.pdfViewerbaby);

        String getItem= getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("Amatungo")){

            myPDFviewer.fromAsset("N1/Amatungo.pdf").load();
        }

        if (getItem.equals("Ibidukikije_ibiribwa")){

            myPDFviewer.fromAsset("N1/Ibidukikije_Ibiribwa.pdf").load();
        }

        if (getItem.equals("Ibigo n'imirimo")){

            myPDFviewer.fromAsset("N1/Ibigo nimirimo.pdf").load();
        }

        if (getItem.equals("Igitabo k'imibare")){

            myPDFviewer.fromAsset("N1/Igitabo kimibare.pdf").load();
        }

        if (getItem.equals("Ibonezabuzima")){

            myPDFviewer.fromAsset("N1/Ibonezabuzima.pdf").load();
        }

        if (getItem.equals("Ubumenyi bw'ibidukikije_1")){

            myPDFviewer.fromAsset("N1/Ubumenyi bwibidukikije_1.pdf").load();
        }
    }
}
