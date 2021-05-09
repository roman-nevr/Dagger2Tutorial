package ru.romaberendeev.dagger2tutorial

import dagger.Module
import dagger.Provides

@Module
class MyModuleClass {

  @Provides
  fun provideMyDataClass(): MyDataClass {
    return MyDataClass("Hello, world")
  }
}
