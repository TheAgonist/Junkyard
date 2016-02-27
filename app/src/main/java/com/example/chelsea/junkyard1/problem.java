package com.example.zambo.junkyard;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.net.Uri;


//import java.net.URI;
import java.net.URISyntaxException;

public class problem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.problems);


        FrameLayout myRoot = (FrameLayout) findViewById(R.id.my_root);
        FrameLayout a = new FrameLayout(this);

        ImageView thumbnail = new ImageView(this);
        try{
            thumbnail.setImageURI(new URI("urltu"));
        }catch (URISyntaxException e){}
        a.addView(view1);
        a.addView(view2);
        a.addView(view3);
        myRoot.addView(a);
    }
}
