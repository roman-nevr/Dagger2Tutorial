package ru.romaberendeev.dagger2tutorial

import dagger.Module
import dagger.Provides

@Module
abstract class MyModuleAbstractClass {

  companion object {
    @Provides
    @JvmStatic
    fun provideMyDataClass(): MyDataClass {
      return MyDataClass("Hello, world")
    }
  }
}
