package ru.romaberendeev.dagger2tutorial

import dagger.Component

@MyScope
@Component
interface MyScopedComponent {

  fun myScopedClass(): MyScopedClass
}
