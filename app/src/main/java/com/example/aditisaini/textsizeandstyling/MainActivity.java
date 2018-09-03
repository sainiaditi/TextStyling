package com.example.aditisaini.textsizeandstyling;

import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.TypefaceSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textViewID);
        String firstWord = "first ";
        String secondWord = "second";

// Create a new spannable with the two strings
        Spannable spannable = new SpannableString(textView.getText());

// Set the custom typeface to span over a section of the spannable object
        spannable.setSpan( new CustomStyling("sans-serif",Typeface.DEFAULT_BOLD), 0, 5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable.setSpan( new CustomStyling("sans-serif",Typeface.MONOSPACE), 6, 10, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable.setSpan( new CustomStyling("monospace",Typeface.SERIF), 11, 22, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

// Set the text of a textView with the spannable object
        textView.setText( spannable );
    }

}
