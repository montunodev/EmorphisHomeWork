package com.imaginato.homeworkmvvm.data.remote.login.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\b"}, d2 = {"Lcom/imaginato/homeworkmvvm/data/remote/login/repo/LoginApi;", "", "getLoginResponseAsync", "Lkotlinx/coroutines/Deferred;", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "loginRequest", "Lcom/imaginato/homeworkmvvm/data/remote/login/request/LoginRequest;", "app_debug"})
public abstract interface LoginApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "api/login")
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<okhttp3.ResponseBody>> getLoginResponseAsync(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.imaginato.homeworkmvvm.data.remote.login.request.LoginRequest loginRequest);
}