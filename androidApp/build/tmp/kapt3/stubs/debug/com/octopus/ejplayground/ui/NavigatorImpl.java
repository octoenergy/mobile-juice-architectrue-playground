package com.octopus.ejplayground.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/octopus/ejplayground/ui/NavigatorImpl;", "Lcom/octopus/ejplayground/domain/Navigator;", "androidPlaygroundActivity", "Lcom/octopus/ejplayground/ui/AndroidPlaygroundActivity;", "(Lcom/octopus/ejplayground/ui/AndroidPlaygroundActivity;)V", "goToDetails", "", "githubRepo", "Lcom/octopus/ejplayground/GithubRepo;", "goToUrl", "url", "", "androidApp_debug"})
@com.octopus.ejplayground.di.SingleActivity()
public final class NavigatorImpl implements com.octopus.ejplayground.domain.Navigator {
    private final com.octopus.ejplayground.ui.AndroidPlaygroundActivity androidPlaygroundActivity = null;
    
    @java.lang.Override()
    public void goToDetails(@org.jetbrains.annotations.NotNull()
    com.octopus.ejplayground.GithubRepo githubRepo) {
    }
    
    @java.lang.Override()
    public void goToUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @javax.inject.Inject()
    public NavigatorImpl(@org.jetbrains.annotations.NotNull()
    com.octopus.ejplayground.ui.AndroidPlaygroundActivity androidPlaygroundActivity) {
        super();
    }
}