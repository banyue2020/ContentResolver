package com.example.contentresolver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ContentResolver resolver = getContentResolver();
        ContentValues values = new ContentValues();
        values.put("name","fwj");
        values.put("age","20");
        Uri uri = Uri.parse("content://fwj.ContentProvider/student");
        Button button =findViewById(R.id.button);
        button.setOnClickListener(v -> {
            resolver.insert(uri,values);




        });


    }
}