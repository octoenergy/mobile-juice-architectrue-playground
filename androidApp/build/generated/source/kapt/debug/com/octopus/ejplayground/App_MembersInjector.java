// Generated by Dagger (https://dagger.dev).
package com.octopus.ejplayground;

import dagger.MembersInjector;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class App_MembersInjector implements MembersInjector<App> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<TestInjection> testInjectionProvider;

  public App_MembersInjector(Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<TestInjection> testInjectionProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.testInjectionProvider = testInjectionProvider;
  }

  public static MembersInjector<App> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<TestInjection> testInjectionProvider) {
    return new App_MembersInjector(androidInjectorProvider, testInjectionProvider);}

  @Override
  public void injectMembers(App instance) {
    DaggerApplication_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectTestInjection(instance, testInjectionProvider.get());
  }

  @InjectedFieldSignature("com.octopus.ejplayground.App.testInjection")
  public static void injectTestInjection(App instance, TestInjection testInjection) {
    instance.testInjection = testInjection;
  }
}
