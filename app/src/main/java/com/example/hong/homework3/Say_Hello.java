package com.example.hong.homework3;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Say_Hello extends AppCompatActivity {

    private EditText et_name;
    private Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say__hello);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        et_name = (EditText)findViewById(R.id.et_name);
        btn_back = (Button)findViewById(R.id.btn_back);

        btn_back.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String input_str = et_name.getText().toString();
                input_str =  "Hello " + input_str;
                //Toast.makeText(Say_Hello.this,input_str,Toast.LENGTH_SHORT).show();

                Intent intent = new Intent();
                intent.putExtra("KEY_NAME",input_str);
                setResult(RESULT_OK,intent);
                finish();

            }
        });



    }

private View.OnClickListener back = new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        finish();
    }
};
}
