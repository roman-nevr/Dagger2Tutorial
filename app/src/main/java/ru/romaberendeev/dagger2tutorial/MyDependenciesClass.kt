package ru.romaberendeev.dagger2tutorial

import javax.inject.Inject
import javax.inject.Named

const val MY_STRING = "MyString"
class MyDependenciesClass @Inject constructor(

    val string: String,

    @MyQualifierKotlin
    @get:MyQualifierKotlin
    val myString: String
)