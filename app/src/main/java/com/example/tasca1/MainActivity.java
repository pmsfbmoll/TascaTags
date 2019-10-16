package com.example.tasca1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("tagtag","--------------");
        Log.d("tagtag","onCreate");
    }

    public void onStart(){
        super.onStart();
        Log.d("tagtag","onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tagtag","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tagtag","onDestroy");
    }

    protected void onRestart(){
        super.onRestart();
        Log.d("tagtag","onRestart");
    }

    protected void onResume(){
        super.onResume();
        Log.d("tagtag","onResume");
    }
}
