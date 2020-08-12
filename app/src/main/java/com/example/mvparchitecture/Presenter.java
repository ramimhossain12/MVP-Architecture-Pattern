package com.example.mvparchitecture;

public class Presenter implements Contract.Presenter{

    Contract.view view;

    public Presenter(Contract.view view) {
        this.view = view;
    }

    @Override
    public void doLogin(String email, String password) {
if ( email.equals("codutest@gmail.com")&& password.equals("pass125")){
    view.onSuccess("Successful");

}
else
{
    view.onError("Wrong email or password");
}


    }
}
