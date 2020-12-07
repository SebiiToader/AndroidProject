package com.example.androidproject.presentation;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.androidproject.domain.LoginCallbacks;

public class LoginViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private LoginCallbacks loginCallbacks;

    public LoginViewModelFactory(LoginCallbacks loginCallbacks) {
        this.loginCallbacks = loginCallbacks;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new LoginViewModel(loginCallbacks);
    }
}
