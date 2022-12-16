package com.imaginato.homeworkmvvm.data.remote.login.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/imaginato/homeworkmvvm/data/remote/login/repo/LoginRepository;", "", "getLoginData", "Lkotlinx/coroutines/flow/Flow;", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "loginRequest", "Lcom/imaginato/homeworkmvvm/data/remote/login/request/LoginRequest;", "(Lcom/imaginato/homeworkmvvm/data/remote/login/request/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface LoginRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLoginData(@org.jetbrains.annotations.NotNull()
    com.imaginato.homeworkmvvm.data.remote.login.request.LoginRequest loginRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<retrofit2.Response<okhttp3.ResponseBody>>> p1);
}