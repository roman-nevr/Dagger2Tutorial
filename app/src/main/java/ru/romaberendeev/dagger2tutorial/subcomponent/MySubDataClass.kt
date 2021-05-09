package ru.romaberendeev.dagger2tutorial.subcomponent

import javax.inject.Inject

data class MySubDataClass @Inject constructor(
    val myData: String
)