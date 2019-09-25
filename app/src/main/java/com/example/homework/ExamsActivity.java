package com.example.homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class ExamsActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exams);
        listView = findViewById(R.id.bt_list);
        String[] data = {
                "Android应用程序开发",
                "移动应用程序测试",
                "高等数学",
                "高职英语",
                "Java程序设计语言",
                "Android游戏开发",
                "心理健康",
                "体育"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                data);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ExamsActivity.this,TextActivity.class);
                intent.putExtra("xxx","");
                startActivity(intent);
            }
        });
    }
}
