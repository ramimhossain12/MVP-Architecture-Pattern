package com.example.mvparchitecture;

public interface Contract {


     interface view{

         void onSuccess(String message);
         void  onError(String message);

     }

     interface  Presenter{

         void  doLogin(String email,String password);

     }
}
