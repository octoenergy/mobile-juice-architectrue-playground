package com.octopus.ejplayground;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/octopus/ejplayground/App;", "Ldagger/android/DaggerApplication;", "()V", "testInjection", "Lcom/octopus/ejplayground/TestInjection;", "getTestInjection", "()Lcom/octopus/ejplayground/TestInjection;", "setTestInjection", "(Lcom/octopus/ejplayground/TestInjection;)V", "applicationInjector", "Ldagger/android/AndroidInjector;", "androidApp_debug"})
public final class App extends dagger.android.DaggerApplication {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.octopus.ejplayground.TestInjection testInjection;
    
    @org.jetbrains.annotations.NotNull()
    public final com.octopus.ejplayground.TestInjection getTestInjection() {
        return null;
    }
    
    public final void setTestInjection(@org.jetbrains.annotations.NotNull()
    com.octopus.ejplayground.TestInjection p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected dagger.android.AndroidInjector<com.octopus.ejplayground.App> applicationInjector() {
        return null;
    }
    
    public App() {
        super();
    }
}