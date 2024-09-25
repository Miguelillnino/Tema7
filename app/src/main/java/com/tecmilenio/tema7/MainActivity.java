package com.tecmilenio.tema7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button ButtonUp;
    private Button ButtonRight;
    private Button ButtonLeft;
    private Button ButtonDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        ButtonUp = findViewById(R.id.ButtonUp);
        ButtonRight = findViewById(R.id.ButtonRight);
        ButtonLeft = findViewById(R.id.ButtonLeft);
        ButtonDown = findViewById(R.id.ButtonDown);

        ButtonUp.setOnClickListener(view -> {
            Intent myIntent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(myIntent);
        });

        ButtonRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(myIntent);
                //startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }
        });

        ButtonLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(myIntent);
            }
        });

        ButtonDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, MainActivity5.class);
                startActivity(myIntent);
            }
        });
    }
}