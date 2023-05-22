package com.hftamayo.kotlinuserscrud;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText name, age, email;
    Button insert, view;
    DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        age = findViewById(R.id.age);
        insert = findViewById(R.id.btnInsert);
        view = findViewById(R.id.btnView);

        db = new DBHelper(this);

        view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, UserList.class));
            }
        });

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT = name.getText().toString();
                String emailTXT = email.getText().toString();
                String ageTXT = age.getText().toString();

                Boolean checkInsertData = db.insertUserData(nameTXT, emailTXT, ageTXT);
                if(checkInsertData == true){
                    Toast.makeText(MainActivity.this,"New Entry Inserted", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"Data couldn't be saved", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
