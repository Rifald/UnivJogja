package com.ribal.univjogja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DescriptionActivity extends AppCompatActivity {

    public static String SCREENSHOT = "SCREENSHOT";
    public static String DESCRIPTION = "DESCRIPTION";
    public static String NAMA = "NAMA";

    ImageView ivScreenshot;
    TextView nama, description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        setupEnv();
    }

    private void setupEnv() {
        String imgPath = getIntent().getStringExtra(SCREENSHOT);
        String desc = getIntent().getStringExtra(DESCRIPTION);
        String name = getIntent().getStringExtra(NAMA);

        nama= findViewById(R.id.nama_univ);
        ivScreenshot = findViewById(R.id.iv_screenshot);
        description = findViewById(R.id.tv_description);

        if (imgPath.isEmpty()) {
            ivScreenshot.setVisibility(View.GONE);
        } else {
            Glide.with(this)
                    .load(imgPath)
                    .into(ivScreenshot);
        }
        nama.setText(name);
        description.setText(desc);
    }

    public void back(View view) {
        finish();
    }
}