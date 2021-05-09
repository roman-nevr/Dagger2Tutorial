package ru.romaberendeev.dagger2tutorial.subcomponent

import dagger.Subcomponent

@Subcomponent
interface MySubcomponent {

  fun mySubDataClass(): MySubDataClass
}