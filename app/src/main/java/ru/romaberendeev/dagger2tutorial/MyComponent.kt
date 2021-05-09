package ru.romaberendeev.dagger2tutorial

import dagger.Component
import ru.romaberendeev.dagger2tutorial.qualifier.MyQualifierKotlin
import ru.romaberendeev.dagger2tutorial.subcomponent.MySubcomponent

@Component(
    modules = [ MyModuleAbstractClass::class ],
    dependencies = [ MyDependenciesClass::class ]
)
interface MyComponent {

  fun myClass(): MyClass

  fun myDataClass(): MyDataClass

  @MyQualifierKotlin
  fun myDataClassQualified(): MyDataClass

  fun plusMySubcomponent(): MySubcomponent

  @Component.Factory
  interface Factory {
    fun create(dependencies: MyDependenciesClass): MyComponent
  }
}
