package ru.romaberendeev.dagger2tutorial

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
abstract class MyModuleAbstractClass {

  companion object {
    @Provides
    @JvmStatic
    fun provideMyDataClass(string: String): MyDataClass {
      return MyDataClass(string)
    }

    @Provides
    @JvmStatic
    @MyQualifierKotlin
    fun provideMyDataClassNamed(
        @MyQualifierKotlin string: String
    ): MyDataClass {
      return MyDataClass(string)
    }
  }
}
