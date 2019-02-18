package com.example.caterpillar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickUser(View view) {
        Intent intent = new Intent(this, pillbox.class);
        startActivity(intent);
    }

    public void onClickCareGiver(View view) {
        Intent intent = new Intent(this, CareGiverActivity.class);
        startActivity(intent);
    }
}
