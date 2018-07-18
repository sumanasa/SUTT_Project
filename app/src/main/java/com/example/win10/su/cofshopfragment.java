package com.example.win10.su;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import java.text.NumberFormat;


public class cofshopfragment extends Fragment {
    private View cofshopView;
    private int quantity = 0;
    private TextView quantityview;
    private TextView price;
    Button inc, dec, order;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        cofshopView = inflater.inflate(R.layout.fragment_coffee, container, false);
        return cofshopView;
    }

    @Override
    public void onStart() {
        super.onStart();
        initControls();
    }

    private void initControls() {


        inc = (Button) getView().findViewById(R.id.increament);
        dec = (Button) getView().findViewById(R.id.decreament);
        order = (Button) getView().findViewById(R.id.order);
        inc.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                increament();
            }
        });
        dec.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                decreament();
            }
        });
        order.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                submitOrder();
            }
        });
    }


    public void submitOrder() {
        String show = "Total: $" + quantity * 5 + "\n\t\t\t\t\t\tYour Order is received" + "\n\t\t\t\t\t\tThank you!";
        displayMessage(show);
    }

    public void increament() {

        quantity = quantity + 1;
        String show = "Total: $" + quantity * 2 ;
        display(quantity);
        displayMessage(show);
    }


    public void decreament() {

        if(quantity>0){
        quantity = quantity - 1;}
        String show = "Total: $" + quantity * 2 ;
        display(quantity);
        displayMessage(show);
    }

    private void display(int number) {
        TextView quantityview = (TextView) getView().findViewById(R.id.quantityview);
        quantityview.setText(String.valueOf("" + number));
    }

    private void displayPrice(int number) {
        TextView price = (TextView) getView().findViewById(R.id.price);
        price.setText(String.valueOf(number));
    }

    private void displayMessage(String message) {
        TextView price = (TextView) getView().findViewById(R.id.price);
        price.setText(String.valueOf(message));
    }

}


