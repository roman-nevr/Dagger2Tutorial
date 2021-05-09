package ru.romaberendeev.dagger2tutorial

import dagger.Component
import ru.romaberendeev.dagger2tutorial.qualifier.MyQualifierKotlin
import ru.romaberendeev.dagger2tutorial.subcomponent.MySubcomponent

@Component(
    modules = [ MyModuleAbstractClass::class, MyBindsModule::class ],
    dependencies = [ MyDependenciesClass::class ]
)
interface MyComponent {

  fun myClass(): MyClass

  fun myDataClass(): MyDataClass

  @MyQualifierKotlin
  fun myDataClassQualified(): MyDataClass

  fun plusMySubcomponent(): MySubcomponent

  fun myInterface(): MyInterface

  @Component.Factory
  interface Factory {
    fun create(dependencies: MyDependenciesClass): MyComponent
  }
}
