package com.imaginato.homeworkmvvm.ui.base;

import java.lang.System;

@org.koin.core.component.KoinApiExtension()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\'\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\f"}, d2 = {"Lcom/imaginato/homeworkmvvm/ui/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "()V", "appPreference", "Lcom/imaginato/homeworkmvvm/utils/AppPreference;", "getAppPreference", "()Lcom/imaginato/homeworkmvvm/utils/AppPreference;", "setAppPreference", "(Lcom/imaginato/homeworkmvvm/utils/AppPreference;)V", "onCleared", "", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel implements org.koin.core.component.KoinComponent {
    @org.jetbrains.annotations.Nullable()
    private com.imaginato.homeworkmvvm.utils.AppPreference appPreference;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.imaginato.homeworkmvvm.utils.AppPreference getAppPreference() {
        return null;
    }
    
    public final void setAppPreference(@org.jetbrains.annotations.Nullable()
    com.imaginato.homeworkmvvm.utils.AppPreference p0) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}