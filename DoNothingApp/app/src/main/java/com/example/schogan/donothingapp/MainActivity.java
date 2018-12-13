package com.example.schogan.donothingapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayText(View view){
        // Get the text view
        TextView displayToSay = (TextView)
                findViewById(R.id.textView_preview);
        // Get the value of the text view
        String toSayString = displayToSay.getText().toString();
        // Add text to string
        //toSayString = toSayString + ' ' + "Red";
        //Convert value to a number and increment it
        //Integer count = Integer.parseInt(countString);
        //count++;
        //Display the new value in the text view
        Context context = getApplicationContext();
        CharSequence text = toSayString;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        //displayToSay.setText(toSayString);
    }
}
