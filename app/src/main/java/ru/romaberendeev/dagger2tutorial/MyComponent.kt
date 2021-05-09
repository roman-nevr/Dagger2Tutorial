package ru.romaberendeev.dagger2tutorial

import dagger.BindsInstance
import dagger.Component

@Component(modules = [ MyModuleAbstractClass::class ])
interface MyComponent {

  fun myClass(): MyClass

  fun myDataClass(): MyDataClass

  @Component.Factory
  interface Factory {
    fun create(@BindsInstance string: String): MyComponent
  }
}
