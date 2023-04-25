package com.example.telescoup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    float telescoupPrice = 14_000;
    int account = 1_000;
    float wage = 2_500;
    float percentFree = 50;
    float percentBank = 5;
    float[] monthlyPayments = new float[120];


    private float telescoupPriceWithContribution() {
        return telescoupPrice - account;
    }

    public float mortgageCosts(float amount, int percent) {
        return (amount*percent)/100;
    }

    public int countMonth(float total, float mortgageCosts, float percentBankYear) {

        float percentBankMonth = percentBankYear/12;
        int count = 0;

        while (total>0) {
            count++;
            total = (total+(total*percentBankMonth)/100) - mortgageCosts;

            if (total > mortgageCosts) {
                monthlyPayments[count-1] = mortgageCosts;
            } else {
                monthlyPayments[count-1] = total;
            }
        }

        return count;
    }

    private TextView countOut;
    private TextView manyMonthOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countOut = findViewById(R.id.countOut);
        manyMonthOut = findViewById(R.id.manyMonthOut);

        countOut.setText("Телескоп будет покупаться" + countMonth(telescoupPriceWithContribution(), mortgageCosts(wage, percentFree), percentBank + "месяцев"));

        String monthlyPaymentsList = "";
        for (float list : monthlyPayments) {
            if (list > 0) {
                monthlyPaymentsList = monthlyPaymentsList + Float.toString(list) + "монет";

            } else {
                break;
            }
        }
    }

    manyMonthOut.setText("Первоначальный взнос" + account + "монет, ежемесячные выплаты" + monthlyPaymentsList);
}