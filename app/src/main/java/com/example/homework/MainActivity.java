package com.example.homework;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et_username;
    private EditText et_password;
    private Button  et_login;
    private Button et_exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_exit=findViewById(R.id.et_exit);
        et_login=findViewById(R.id.et_login);
        et_password=findViewById(R.id.et_password);
        et_username=findViewById(R.id.et_username);
        et_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = ((EditText) findViewById(R.id.et_username)).getText().toString();
                String password = ((EditText) findViewById(R.id.et_password)).getText().toString();
                if(username.equals("cdh")&& password.equals("123123")){
                    Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                    intent.putExtra("xxx",username);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this,"账号或密码错误，请重新输入",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
