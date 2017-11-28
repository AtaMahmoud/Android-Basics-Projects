package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity
{
    int quantity=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view)
    {
        int numberOfCoffes=quantity;
        display(numberOfCoffes);
        displayPrice(numberOfCoffes*5);
    }
    private void display(int number)
    {
        TextView quantityTextView =(TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(""+number);
    }
    /**

     * This method displays the given price on the screen.

     */

    private void displayPrice(int number) {

        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);

        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));

    }

    public void increment(View view)
    {

        quantity += 1;
        display(quantity);
    }

    public void decrement(View view)
    {
        quantity -= 1;

        display(quantity);
    }
}
