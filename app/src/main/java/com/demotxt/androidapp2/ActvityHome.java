package com.demotxt.androidapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActvityHome extends AppCompatActivity {
    String myReceivedEmail;
    String myReceivedName;
    TextView txuseremail,tusername,Welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actvity_home);
        myReceivedEmail=getIntent().getStringExtra("mykey");

        myReceivedName=getIntent().getStringExtra("myuser");

        txuseremail=findViewById(R.id.txuseremail);
        txuseremail.setText(myReceivedEmail);

        tusername=findViewById(R.id.tusername);
        tusername.setText(myReceivedName);

        Welcome=findViewById(R.id.Welcome);
        Welcome.setText( "Welcome" + myReceivedName);
    }
}
