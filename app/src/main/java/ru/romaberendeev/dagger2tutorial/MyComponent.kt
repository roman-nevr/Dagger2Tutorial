package ru.romaberendeev.dagger2tutorial

import dagger.Component

@Component(
    modules = [ MyModuleAbstractClass::class ],
    dependencies = [ MyDependenciesClass::class ]
)
interface MyComponent {

  fun myClass(): MyClass

  fun myDataClass(): MyDataClass

  @MyQualifierKotlin
  fun myDataClassQualified(): MyDataClass

  @Component.Factory
  interface Factory {
    fun create(dependencies: MyDependenciesClass): MyComponent
  }
}
