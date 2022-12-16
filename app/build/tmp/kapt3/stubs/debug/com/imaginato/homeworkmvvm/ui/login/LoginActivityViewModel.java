package com.imaginato.homeworkmvvm.ui.login;

import java.lang.System;

@org.koin.core.component.KoinApiExtension()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006$"}, d2 = {"Lcom/imaginato/homeworkmvvm/ui/login/LoginActivityViewModel;", "Lcom/imaginato/homeworkmvvm/ui/base/BaseViewModel;", "()V", "_progress", "Landroidx/lifecycle/MutableLiveData;", "", "_resultLiveData", "Lcom/imaginato/homeworkmvvm/data/remote/login/response/LoginResponse;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/imaginato/homeworkmvvm/ui/login/LoginUiState;", "progress", "Landroidx/lifecycle/LiveData;", "getProgress", "()Landroidx/lifecycle/LiveData;", "repository", "Lcom/imaginato/homeworkmvvm/data/remote/login/repo/LoginRepository;", "getRepository", "()Lcom/imaginato/homeworkmvvm/data/remote/login/repo/LoginRepository;", "repository$delegate", "Lkotlin/Lazy;", "resultLiveData", "getResultLiveData", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "userRepository", "Lcom/imaginato/homeworkmvvm/data/local/login/UserDataRepository;", "getUserRepository", "()Lcom/imaginato/homeworkmvvm/data/local/login/UserDataRepository;", "userRepository$delegate", "getLoginData", "", "loginRequest", "Lcom/imaginato/homeworkmvvm/data/remote/login/request/LoginRequest;", "app_debug"})
public final class LoginActivityViewModel extends com.imaginato.homeworkmvvm.ui.base.BaseViewModel {
    private final kotlin.Lazy repository$delegate = null;
    private final kotlin.Lazy userRepository$delegate = null;
    private androidx.lifecycle.MutableLiveData<com.imaginato.homeworkmvvm.data.remote.login.response.LoginResponse> _resultLiveData;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _progress;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.imaginato.homeworkmvvm.ui.login.LoginUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.imaginato.homeworkmvvm.ui.login.LoginUiState> uiState = null;
    
    public LoginActivityViewModel() {
        super();
    }
    
    private final com.imaginato.homeworkmvvm.data.remote.login.repo.LoginRepository getRepository() {
        return null;
    }
    
    private final com.imaginato.homeworkmvvm.data.local.login.UserDataRepository getUserRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.imaginato.homeworkmvvm.ui.login.LoginUiState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.imaginato.homeworkmvvm.data.remote.login.response.LoginResponse> getResultLiveData() {
        return null;
    }
    
    public final void getLoginData(@org.jetbrains.annotations.NotNull()
    com.imaginato.homeworkmvvm.data.remote.login.request.LoginRequest loginRequest) {
    }
}