package ru.romaberendeev.dagger2tutorial

import dagger.Component

@Component(modules = [ MyModuleClass::class, MyBindsModule::class ])
interface MyComponent {

  fun myClass(): MyClass

  fun myDataClass(): MyDataClass

  fun myInterface(): MyInterface

  @Component.Factory
  interface Factory {
    fun create(moduleClass: MyModuleClass): MyComponent
  }
}
