package com.example.managerhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManagerHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_home);
        Button goToConsumerInformationButton = findViewById(R.id.goToConsumerInformation);
        goToConsumerInformationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(ManagerHome.this, ConsumerInformation.class);
                startActivity(intent);
            }
        });

        Button goToSetItemsButton = findViewById(R.id.goToSetItem);
        goToSetItemsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(ManagerHome.this, SetItems.class);
                startActivity(intent);
            }
        });

        Button goToSetSuperButton = findViewById(R.id.goToSetSuper);
        goToSetSuperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(ManagerHome.this, SetSuper.class);
                startActivity(intent);
            }
        });

    }
}