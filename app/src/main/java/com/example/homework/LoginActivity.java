package com.example.homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private TextView Title;
    private ImageView course;
    private ImageView tools;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Title = findViewById(R.id.Title);
        Intent intent = getIntent();
        String name = intent.getStringExtra("xxx");
        if (name != null){
            Title.setText("欢迎"+name+"来到您的空间");
        }
        course = findViewById(R.id.course);
        tools = findViewById(R.id.tools);

        course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, ExamsActivity.class);
                startActivity(intent);
            }
        });
    }
}
