package com.example.mars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText massIn;
    private Button button;
    private TextView massOut;

    private String mass = "";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        massIn = findViewById(R.id.massIn);
        button = findViewById(R.id.button);
        massOut = findViewById(R.id.massOut);
        button.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            mass = massIn.getText().toString();

        }
    };
}