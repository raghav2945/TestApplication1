package com.example.kumar.raghawendra.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    MyArc1 myArc1;
    MyArc2 myArc2;
    MyArc3 myArc3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        myArc1 = (MyArc1) findViewById(R.id.myArc1);
        myArc2 = (MyArc2) findViewById(R.id.myArc2);
        myArc3 = (MyArc3) findViewById(R.id.myArc3);
    }


    @Override
    public void onClick(View v) {

        int id = v.getId();
        switch (id){
            case R.id.myArc1 :
                String urlGoogle = "https://www.google.co.in";
                Intent ig = new Intent(Intent.ACTION_VIEW);
                ig.setData(Uri.parse(urlGoogle));
                startActivity(ig);
                break;
            case R.id.myArc2 :
                String urlFacebook = "https://www.facebook.com/";
                Intent iF = new Intent(Intent.ACTION_VIEW);
                iF.setData(Uri.parse(urlFacebook));
                startActivity(iF);
                break;
            case R.id.myArc3 :
                String urlTwitter = "https://twitter.com/";
                Intent it = new Intent(Intent.ACTION_VIEW);
                it.setData(Uri.parse(urlTwitter));
                startActivity(it);
                break;
            default:
                System.out.println("DEFAULT");
        }
    }
}
