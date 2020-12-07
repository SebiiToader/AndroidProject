package com.example.androidproject.presentation;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import androidx.lifecycle.ViewModel;

import com.example.androidproject.domain.LoginCallbacks;

public class LoginViewModel extends ViewModel {
    private LoginModel loginModel;
    private LoginCallbacks loginCallbacks;

    public LoginViewModel(LoginCallbacks loginCallbacks) {
        this.loginCallbacks = loginCallbacks;
        this.loginModel = new LoginModel();
    }

    public LoginModel getLoginModel() {
        return loginModel;
    }

    public void setLoginModel(LoginModel loginModel) {
        this.loginModel = loginModel;
    }

    public LoginCallbacks getLoginCallbacks() {
        return loginCallbacks;
    }

    public void setLoginCallbacks(LoginCallbacks loginCallbacks) {
        this.loginCallbacks = loginCallbacks;
    }

    public TextWatcher emailTextWatcher() {

        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                loginModel.setEmail(editable.toString());
            }
        };
    }

    public TextWatcher passwordTextWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                loginModel.setPassword(editable.toString());
            }
        };
    }

    public void onLoginBtnClick(View view) {
        if (loginModel.isValid()) {
            loginCallbacks.onSuccess("Successful");
        } else {
            loginCallbacks.onFailure("Failed");
        }
    }
}
