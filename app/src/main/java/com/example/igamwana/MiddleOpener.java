package com.example.igamwana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MiddleOpener extends AppCompatActivity {

    PDFView myPDFviewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_middle_opener);

        myPDFviewer = (PDFView)findViewById(R.id.pdfViewermiddle);

        String getItem= getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("Ibidukikije_ibiribwa")){

            myPDFviewer.fromAsset("N2/Ibidukikije_Ibiribwa.pdf").load();
        }

        if (getItem.equals("Ibigo n'imirimo")){

            myPDFviewer.fromAsset("N2/Ibigo nimirimo.pdf").load();
        }

        if (getItem.equals("Igitabo k'imibare")){

            myPDFviewer.fromAsset("N2/Igitabo kimibare.pdf").load();
        }

        if (getItem.equals("Ibonezabuzima")){

            myPDFviewer.fromAsset("N2/Ibonezabuzima.pdf").load();
        }

        if (getItem.equals("Ubumenyi bw'ibidukikije_2")){

            myPDFviewer.fromAsset("N2/Ubumenyi bwibidukikije_2.pdf").load();
        }
    }
}
