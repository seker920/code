package com.example.domrab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    float stPalto = 70;      //стоимость пальто
    float skPalto = 77;      //скидка на пальто
    float stShlapa = 25;     //стоимость шляпы
    float skShlapa = 37;     //скидка на шляпу
    float stSorochka = 19;   //стоимость сорочки
    float stDelCost = 53;    //стоимость костюма
    float skDelCost = 44;    //скидка на костюм
    float stTuf = 41;    //стоимость туфлей
    float skTuf = 32;    //скидка на туфли
    float account = 312; //баланс






    private float calculation() {
        float count = (stPalto*(100-skPalto)+stShlapa*(100-skShlapa)+stDelCost*(100-skDelCost)+stSorochka
                +stTuf*(100-skTuf));
        return count;
    }






    private boolean possibility() {
        if (calculation() <= account) {
            return true;
        }else {
            return false;
        }

    }




    private float balance() {
        if(possibility()) {
            return account - calculation();
        }else{
            return - 1;
        }
    }






    private TextView possibilityOut;
    private TextView balanceOut;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}