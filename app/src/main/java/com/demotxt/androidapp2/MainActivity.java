package com.demotxt.androidapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {
    EditText etemail,etpass,etusername;
    Button btlogin;
    String stringemail,stringpassword,stringusername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btlogin=findViewById(R.id.btlogin);
        etemail=findViewById(R.id.etemail);
        etpass=findViewById(R.id.etpass);
        etusername=findViewById(R.id.etusername);

        btlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringemail =etemail.getText().toString();
                stringpassword =etpass.getText().toString();
                stringusername=etusername.getText().toString();

                if (stringemail.equals("abcd@gmail.com")&& stringpassword.equals("admin123")){


                   Intent mymovingIntent=new Intent(MainActivity.this,ActvityHome.class);

                   mymovingIntent.putExtra("mykey",stringemail);
                   mymovingIntent.putExtra("myuser",stringusername);

                   startActivity(mymovingIntent);

                }else {
                    Toast.makeText(MainActivity.this,"logonfail",Toast.LENGTH_LONG).show();
                }







            }
        });
    }
}
