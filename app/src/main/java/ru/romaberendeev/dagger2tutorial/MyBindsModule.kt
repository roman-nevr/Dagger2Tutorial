package ru.romaberendeev.dagger2tutorial

import dagger.Binds
import dagger.Module

@Module
interface MyBindsModule {

  @Binds
  fun bindMyInterface(impl: MyInterfaceImpl): MyInterface
}
