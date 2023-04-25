package com.example.happyticketspb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText ticketNumberIn;
    private Button button;
    private TextView ticketNumberOut;

    private String ticketNumber = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ticketNumberIn = findViewById(R.id.ticketNumberIn);
        button = findViewById(R.id.Button);
        ticketNumberOut = findViewById(R.id.ticketNumberOut);

        button.setOnClickListener(listener);
    }


    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            ticketNumber = ticketNumberIn.getText().toString();
        }
    };
}