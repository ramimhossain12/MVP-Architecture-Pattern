package com.example.mvparchitecture;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements Contract.view {

    Contract.Presenter presenter;

    EditText email, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        presenter =new Presenter(this);

        email = findViewById(R.id.emailediteTextID);
        password = findViewById(R.id.passwordediteTextID);
        login = findViewById(R.id.btnLoginID);

        //click login


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email1 = email.getText().toString();

                String Passwrd = password.getText().toString();

                if (TextUtils.isEmpty(email1) || TextUtils.isEmpty(Passwrd)){


                    onError("Field(s) Required");

                }
                else {
                    presenter.doLogin(email1,Passwrd);
                }

            }
        });



    }

    @Override
    public void onSuccess(String message) {

      Toast.makeText(this,message,Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onError(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}