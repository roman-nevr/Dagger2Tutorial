package ru.romaberendeev.dagger2tutorial

import javax.inject.Inject

class MyDependenciesClass @Inject constructor(
    val string: String
)