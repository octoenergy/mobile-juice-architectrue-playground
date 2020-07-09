// Generated by Dagger (https://dagger.dev).
package com.octopus.ejplayground.ui;

import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AnnouncerImpl_Factory implements Factory<AnnouncerImpl> {
  private final Provider<AndroidPlaygroundActivity> androidPlaygroundActivityProvider;

  public AnnouncerImpl_Factory(
      Provider<AndroidPlaygroundActivity> androidPlaygroundActivityProvider) {
    this.androidPlaygroundActivityProvider = androidPlaygroundActivityProvider;
  }

  @Override
  public AnnouncerImpl get() {
    return newInstance(androidPlaygroundActivityProvider.get());
  }

  public static AnnouncerImpl_Factory create(
      Provider<AndroidPlaygroundActivity> androidPlaygroundActivityProvider) {
    return new AnnouncerImpl_Factory(androidPlaygroundActivityProvider);
  }

  public static AnnouncerImpl newInstance(AndroidPlaygroundActivity androidPlaygroundActivity) {
    return new AnnouncerImpl(androidPlaygroundActivity);
  }
}