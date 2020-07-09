// Generated by Dagger (https://dagger.dev).
package com.octopus.ejplayground.di;

import com.octopus.ejplayground.App;
import com.octopus.ejplayground.App_MembersInjector;
import com.octopus.ejplayground.TestInjection;
import com.octopus.ejplayground.domain.GithubRepoManager;
import com.octopus.ejplayground.domain.GithubRepoManager_Factory;
import com.octopus.ejplayground.services.GithubApiBuilder_Factory;
import com.octopus.ejplayground.services.GithubRepoMapper_Factory;
import com.octopus.ejplayground.services.GithubService;
import com.octopus.ejplayground.services.GithubService_Factory;
import com.octopus.ejplayground.ui.AndroidPlaygroundActivity;
import com.octopus.ejplayground.ui.AnnouncerImpl;
import com.octopus.ejplayground.ui.AnnouncerImpl_Factory;
import com.octopus.ejplayground.ui.NavigatorImpl;
import com.octopus.ejplayground.ui.NavigatorImpl_Factory;
import com.octopus.ejplayground.ui.details.DetailsFragment;
import com.octopus.ejplayground.ui.details.DetailsFragment_MembersInjector;
import com.octopus.ejplayground.ui.details.DetailsViewModel;
import com.octopus.ejplayground.ui.details.DetailsViewModel_Factory;
import com.octopus.ejplayground.ui.main.MainFragment;
import com.octopus.ejplayground.ui.main.MainFragment_MembersInjector;
import com.octopus.ejplayground.ui.main.MainViewModel;
import com.octopus.ejplayground.ui.main.MainViewModel_Factory;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAndroidPlaygroundComponent implements AndroidPlaygroundComponent {
  private Provider<SingleActivityModule_AndroidPlaygroundActivity.AndroidPlaygroundActivitySubcomponent.Factory> androidPlaygroundActivitySubcomponentFactoryProvider;

  private DaggerAndroidPlaygroundComponent() {

    initialize();
  }

  public static AndroidPlaygroundComponent.Builder builder() {
    return new Builder();
  }

  public static AndroidPlaygroundComponent create() {
    return new Builder().build();
  }

  private Map<Class<?>, Provider<AndroidInjector.Factory<?>>> getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(
      ) {
    return Collections.<Class<?>, Provider<AndroidInjector.Factory<?>>>singletonMap(AndroidPlaygroundActivity.class, (Provider) androidPlaygroundActivitySubcomponentFactoryProvider);}

  private DispatchingAndroidInjector<Object> getDispatchingAndroidInjectorOfObject() {
    return DispatchingAndroidInjector_Factory.newInstance(getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());}

  @SuppressWarnings("unchecked")
  private void initialize() {
    this.androidPlaygroundActivitySubcomponentFactoryProvider = new Provider<SingleActivityModule_AndroidPlaygroundActivity.AndroidPlaygroundActivitySubcomponent.Factory>() {
      @Override
      public SingleActivityModule_AndroidPlaygroundActivity.AndroidPlaygroundActivitySubcomponent.Factory get(
          ) {
        return new AndroidPlaygroundActivitySubcomponentFactory();}
    };
  }

  @Override
  public void inject(App arg0) {
    injectApp(arg0);}

  private App injectApp(App instance) {
    DaggerApplication_MembersInjector.injectAndroidInjector(instance, getDispatchingAndroidInjectorOfObject());
    App_MembersInjector.injectTestInjection(instance, new TestInjection());
    return instance;
  }

  private static final class Builder implements AndroidPlaygroundComponent.Builder {
    @Override
    public AndroidPlaygroundComponent build() {
      return new DaggerAndroidPlaygroundComponent();
    }
  }

  private final class AndroidPlaygroundActivitySubcomponentFactory implements SingleActivityModule_AndroidPlaygroundActivity.AndroidPlaygroundActivitySubcomponent.Factory {
    @Override
    public SingleActivityModule_AndroidPlaygroundActivity.AndroidPlaygroundActivitySubcomponent create(
        AndroidPlaygroundActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new AndroidPlaygroundActivitySubcomponentImpl(arg0);
    }
  }

  private final class AndroidPlaygroundActivitySubcomponentImpl implements SingleActivityModule_AndroidPlaygroundActivity.AndroidPlaygroundActivitySubcomponent {
    private Provider<FragmentModule_MainFragment.MainFragmentSubcomponent.Factory> mainFragmentSubcomponentFactoryProvider;

    private Provider<FragmentModule_DetailsFragment.DetailsFragmentSubcomponent.Factory> detailsFragmentSubcomponentFactoryProvider;

    private Provider<GithubService> githubServiceProvider;

    private Provider<GithubRepoManager> githubRepoManagerProvider;

    private Provider<AndroidPlaygroundActivity> arg0Provider;

    private Provider<NavigatorImpl> navigatorImplProvider;

    private Provider<AnnouncerImpl> announcerImplProvider;

    private Provider<MainViewModel> mainViewModelProvider;

    private Provider<DetailsViewModel> detailsViewModelProvider;

    private AndroidPlaygroundActivitySubcomponentImpl(AndroidPlaygroundActivity arg0Param) {

      initialize(arg0Param);
    }

    private Map<Class<?>, Provider<AndroidInjector.Factory<?>>> getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(
        ) {
      return MapBuilder.<Class<?>, Provider<AndroidInjector.Factory<?>>>newMapBuilder(3).put(AndroidPlaygroundActivity.class, (Provider) DaggerAndroidPlaygroundComponent.this.androidPlaygroundActivitySubcomponentFactoryProvider).put(MainFragment.class, (Provider) mainFragmentSubcomponentFactoryProvider).put(DetailsFragment.class, (Provider) detailsFragmentSubcomponentFactoryProvider).build();}

    private DispatchingAndroidInjector<Object> getDispatchingAndroidInjectorOfObject() {
      return DispatchingAndroidInjector_Factory.newInstance(getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());}

    @SuppressWarnings("unchecked")
    private void initialize(final AndroidPlaygroundActivity arg0Param) {
      this.mainFragmentSubcomponentFactoryProvider = new Provider<FragmentModule_MainFragment.MainFragmentSubcomponent.Factory>() {
        @Override
        public FragmentModule_MainFragment.MainFragmentSubcomponent.Factory get() {
          return new MainFragmentSubcomponentFactory();}
      };
      this.detailsFragmentSubcomponentFactoryProvider = new Provider<FragmentModule_DetailsFragment.DetailsFragmentSubcomponent.Factory>() {
        @Override
        public FragmentModule_DetailsFragment.DetailsFragmentSubcomponent.Factory get() {
          return new DetailsFragmentSubcomponentFactory();}
      };
      this.githubServiceProvider = GithubService_Factory.create(GithubApiBuilder_Factory.create(), GithubRepoMapper_Factory.create());
      this.githubRepoManagerProvider = GithubRepoManager_Factory.create(githubServiceProvider);
      this.arg0Provider = InstanceFactory.create(arg0Param);
      this.navigatorImplProvider = DoubleCheck.provider(NavigatorImpl_Factory.create(arg0Provider));
      this.announcerImplProvider = DoubleCheck.provider(AnnouncerImpl_Factory.create(arg0Provider));
      this.mainViewModelProvider = DoubleCheck.provider(MainViewModel_Factory.create(githubRepoManagerProvider, (Provider) navigatorImplProvider, (Provider) announcerImplProvider));
      this.detailsViewModelProvider = DoubleCheck.provider(DetailsViewModel_Factory.create((Provider) navigatorImplProvider));
    }

    @Override
    public void inject(AndroidPlaygroundActivity arg0) {
      injectAndroidPlaygroundActivity(arg0);}

    private AndroidPlaygroundActivity injectAndroidPlaygroundActivity(
        AndroidPlaygroundActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectAndroidInjector(instance, getDispatchingAndroidInjectorOfObject());
      return instance;
    }

    private final class MainFragmentSubcomponentFactory implements FragmentModule_MainFragment.MainFragmentSubcomponent.Factory {
      @Override
      public FragmentModule_MainFragment.MainFragmentSubcomponent create(MainFragment arg0) {
        Preconditions.checkNotNull(arg0);
        return new MainFragmentSubcomponentImpl(arg0);
      }
    }

    private final class MainFragmentSubcomponentImpl implements FragmentModule_MainFragment.MainFragmentSubcomponent {
      private MainFragmentSubcomponentImpl(MainFragment arg0) {

      }

      @Override
      public void inject(MainFragment arg0) {
        injectMainFragment(arg0);}

      private MainFragment injectMainFragment(MainFragment instance) {
        DaggerFragment_MembersInjector.injectAndroidInjector(instance, AndroidPlaygroundActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfObject());
        MainFragment_MembersInjector.injectMainViewModel(instance, AndroidPlaygroundActivitySubcomponentImpl.this.mainViewModelProvider.get());
        return instance;
      }
    }

    private final class DetailsFragmentSubcomponentFactory implements FragmentModule_DetailsFragment.DetailsFragmentSubcomponent.Factory {
      @Override
      public FragmentModule_DetailsFragment.DetailsFragmentSubcomponent create(
          DetailsFragment arg0) {
        Preconditions.checkNotNull(arg0);
        return new DetailsFragmentSubcomponentImpl(arg0);
      }
    }

    private final class DetailsFragmentSubcomponentImpl implements FragmentModule_DetailsFragment.DetailsFragmentSubcomponent {
      private DetailsFragmentSubcomponentImpl(DetailsFragment arg0) {

      }

      @Override
      public void inject(DetailsFragment arg0) {
        injectDetailsFragment(arg0);}

      private DetailsFragment injectDetailsFragment(DetailsFragment instance) {
        DaggerFragment_MembersInjector.injectAndroidInjector(instance, AndroidPlaygroundActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfObject());
        DetailsFragment_MembersInjector.injectDetailsViewModel(instance, AndroidPlaygroundActivitySubcomponentImpl.this.detailsViewModelProvider.get());
        return instance;
      }
    }
  }
}
