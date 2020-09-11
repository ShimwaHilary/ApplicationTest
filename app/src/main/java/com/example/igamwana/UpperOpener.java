package com.example.igamwana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class UpperOpener extends AppCompatActivity {

    PDFView myPDFviewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upper_opener);

        myPDFviewer = (PDFView)findViewById(R.id.pdfViewerupper);

        String getItem= getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("Ibidukikije_ibiribwa")){

            myPDFviewer.fromAsset("N3/Ibidukikije_Ibiribwa.pdf").load();
        }

        if (getItem.equals("Ibigo n'imirimo")){

            myPDFviewer.fromAsset("N3/Ibigo nimirimo.pdf").load();
        }

        if (getItem.equals("Igitabo k'imibare")){

            myPDFviewer.fromAsset("N3/Igitabo kimibare.pdf").load();
        }

        if (getItem.equals("Ibonezabuzima")){

            myPDFviewer.fromAsset("N3/Ibonezabuzima.pdf").load();
        }

        if (getItem.equals("Ubumenyi bw'ibidukikije_3")){

            myPDFviewer.fromAsset("N3/Ubumenyi bwibidukikije_3.pdf").load();
        }
    }
}
