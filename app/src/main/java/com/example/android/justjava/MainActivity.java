package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */ int i = 0;
        int j = 0;
        int k = 0;
        public void submitOrder (View view){
            int t;
            t=i*268+j*218+k*188;
        String priceMessage = "Total Money $" + t;
            displayMessager(priceMessage);
    }
    public void reset (View view)
    {
        i=0;
        j=0;
        k=0;
        displayr(i);
        displayb(j);
        displayp(k);
        displayPricer(i);
        displayPriceb(j);
        displayPricep(k);
    }
    public void increment(View view) {

            i++;
            displayr(i);
            displayPricer(i * 268);

    }

    public void decrement(View view) {

            i--;
            displayr(i);
            displayPricer(i * 268);

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayr(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_viewr);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPricer(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_viewr);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessager(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_viewt);
        priceTextView.setText(message);
    }
    /**
     * This method is called when the order button is clicked.
     */

    public void incrementb(View view) {

        j++;
        displayb(j);
        displayPriceb(j * 218);

    }

    public void decrementb(View view) {

        j--;
        displayb(j);
        displayPriceb(j * 218);

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayb(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_viewb);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPriceb(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_viewb);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    /**
     * This method displays the given text on the screen.
     */
    /*private void displayMessageb(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_viewb);
        priceTextView.setText(message);
    }*/
    /**
     * This method displays the given quantity value on the screen.
     */
    /**
     * This method is called when the order button is clicked.
     */
    public void incrementp(View view) {

        k++;
        displayp(k);
        displayPricep(k * 188);

    }

    public void decrementp(View view) {

        k--;
        displayp(k);
        displayPricep(k * 188);

    }

    private void displayp(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_viewp);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPricep(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_viewp);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    /**
     * This method displays the given text on the screen.
     */
   /* private void displayMessagep(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_viewp);
        priceTextView.setText(message);
    }*/
}