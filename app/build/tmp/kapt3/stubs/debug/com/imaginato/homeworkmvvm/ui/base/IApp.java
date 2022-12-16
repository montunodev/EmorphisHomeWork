package com.imaginato.homeworkmvvm.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/imaginato/homeworkmvvm/ui/base/IApp;", "Landroid/app/Application;", "()V", "initKoin", "", "onCreate", "Companion", "app_debug"})
public final class IApp extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public static final com.imaginato.homeworkmvvm.ui.base.IApp.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private static com.imaginato.homeworkmvvm.ui.base.IApp instance;
    
    public IApp() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void initKoin() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/imaginato/homeworkmvvm/ui/base/IApp$Companion;", "", "()V", "instance", "Lcom/imaginato/homeworkmvvm/ui/base/IApp;", "getInstance", "()Lcom/imaginato/homeworkmvvm/ui/base/IApp;", "setInstance", "(Lcom/imaginato/homeworkmvvm/ui/base/IApp;)V", "applicationContext", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.imaginato.homeworkmvvm.ui.base.IApp getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.Nullable()
        com.imaginato.homeworkmvvm.ui.base.IApp p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context applicationContext() {
            return null;
        }
    }
}