package com.imaginato.homeworkmvvm.data.remote.login.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/imaginato/homeworkmvvm/data/remote/login/repo/LoginDataRepository;", "Lcom/imaginato/homeworkmvvm/data/remote/login/repo/LoginRepository;", "api", "Lcom/imaginato/homeworkmvvm/data/remote/login/repo/LoginApi;", "(Lcom/imaginato/homeworkmvvm/data/remote/login/repo/LoginApi;)V", "getLoginData", "Lkotlinx/coroutines/flow/Flow;", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "loginRequest", "Lcom/imaginato/homeworkmvvm/data/remote/login/request/LoginRequest;", "(Lcom/imaginato/homeworkmvvm/data/remote/login/request/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LoginDataRepository implements com.imaginato.homeworkmvvm.data.remote.login.repo.LoginRepository {
    private com.imaginato.homeworkmvvm.data.remote.login.repo.LoginApi api;
    
    public LoginDataRepository(@org.jetbrains.annotations.NotNull()
    com.imaginato.homeworkmvvm.data.remote.login.repo.LoginApi api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getLoginData(@org.jetbrains.annotations.NotNull()
    com.imaginato.homeworkmvvm.data.remote.login.request.LoginRequest loginRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<retrofit2.Response<okhttp3.ResponseBody>>> p1) {
        return null;
    }
}