package com.example.www.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    /*
    火钳刘明
    前排前排前排前排前排前排前排前排前排前排前排前排前排前排前排
    2楼瓜子
    3楼卖瓜
    4楼不明情况的观众
    ----------------------------蒋胜达  2014011539
     */

    private EditText EtQQ;
    private EditText EtPwd;
    private Button Btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EtQQ = (EditText)findViewById(R.id.EtQQ);
        EtPwd = (EditText)findViewById(R.id.EtPwd);
        Btnlogin = (Button)findViewById(R.id.BtnLogin);
        Btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EtQQ.getText().toString().equals("395238")
                        &&EtPwd.getText().toString().equals("123456")){
                    Toast.makeText(LoginActivity.this,"登录成功！",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(LoginActivity.this,"登录失败！",Toast.LENGTH_SHORT).show();
                }
                //白浩然提交了一行注释
            }
        });
    }
}
