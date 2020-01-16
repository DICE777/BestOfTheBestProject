package com.example.bestofthebestproject;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private String url = "http://www.booking.com/Share-kJfXaQb";

    private String[] autoTextItems;

    private EditText mUrlEditText;
    private AutoCompleteTextView mTagAutoTextView;
    private Button mInputButton;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoTextItems = new String[] {
             "very cheap", "very expensive", "good view", "nice", "luxury", "good service"
        };

        mUrlEditText = findViewById(R.id.url_edit_text);
        mTagAutoTextView = findViewById(R.id.tag_autoCompleteTextView);
        mInputButton = findViewById(R.id.button_input);
        mImageView =  findViewById(R.id.hotel_main_image);

        mTagAutoTextView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, autoTextItems));
    }
}
