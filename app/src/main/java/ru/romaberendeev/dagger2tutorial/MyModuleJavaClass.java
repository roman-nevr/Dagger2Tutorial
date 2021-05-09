package ru.romaberendeev.dagger2tutorial;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class MyModuleJavaClass {

  @Provides
  public static MyDataClass provideMyDataClass() {
    return new MyDataClass("Hello, world");
  }
}
