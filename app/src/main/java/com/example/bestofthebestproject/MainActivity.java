package com.example.bestofthebestproject;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private String imageUrl = "https://q-cf.bstatic.com/images/hotel/max1024x768/190/190651404.jpg";
    private String[] autoTextItems;

    private EditText mUrlEditText;
    private AutoCompleteTextView mTagAutoTextView;
    private Button mInputButton;
    private ImageView mImageView;
    private TextView mHotelReviewTag;

    public static final String tagSeparator = "#";

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
        mHotelReviewTag = findViewById(R.id.hotel_review_tag);

        //Tag - searching
        mTagAutoTextView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, autoTextItems));

        // Get the image using Glide
        Glide.with(this).load(imageUrl).into(mImageView);

        mInputButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mHotelReviewTag.append(tagSeparator + mTagAutoTextView.getText().toString() + " ");
            }
        });

        mHotelReviewTag.setText(null);
    }
}
