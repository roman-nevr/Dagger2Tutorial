package ru.romaberendeev.dagger2tutorial

import dagger.Component

@Component(modules = [ MyModuleClass::class ])
interface MyComponent {

  fun myClass(): MyClass

  fun myDataClass(): MyDataClass

  @Component.Factory
  interface Factory {
    fun create(moduleClass: MyModuleClass): MyComponent
  }
}
