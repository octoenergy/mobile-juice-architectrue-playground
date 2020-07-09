package com.octopus.ejplayground.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/octopus/ejplayground/services/GithubService;", "", "githubApiBuilder", "Lcom/octopus/ejplayground/services/GithubApiBuilder;", "githubRepoMapper", "Lcom/octopus/ejplayground/services/GithubRepoMapper;", "(Lcom/octopus/ejplayground/services/GithubApiBuilder;Lcom/octopus/ejplayground/services/GithubRepoMapper;)V", "githubApi", "Lcom/octopus/ejplayground/services/GitHubApi;", "fetchCodeRepos", "", "Lcom/octopus/ejplayground/GithubRepo;", "username", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "androidApp_debug"})
public final class GithubService {
    private final com.octopus.ejplayground.services.GitHubApi githubApi = null;
    private final com.octopus.ejplayground.services.GithubApiBuilder githubApiBuilder = null;
    private final com.octopus.ejplayground.services.GithubRepoMapper githubRepoMapper = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchCodeRepos(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.octopus.ejplayground.GithubRepo>> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public GithubService(@org.jetbrains.annotations.NotNull()
    com.octopus.ejplayground.services.GithubApiBuilder githubApiBuilder, @org.jetbrains.annotations.NotNull()
    com.octopus.ejplayground.services.GithubRepoMapper githubRepoMapper) {
        super();
    }
}