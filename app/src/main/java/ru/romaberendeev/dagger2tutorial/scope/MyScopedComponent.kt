package ru.romaberendeev.dagger2tutorial.scope

import dagger.Component

@MyScope
@Component
interface MyScopedComponent {

  fun myScopedClass(): MyScopedClass
}
