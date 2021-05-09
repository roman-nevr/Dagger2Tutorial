package ru.romaberendeev.dagger2tutorial

import ru.romaberendeev.dagger2tutorial.qualifier.MyQualifierKotlin
import javax.inject.Inject

const val MY_STRING = "MyString"
class MyDependenciesClass @Inject constructor(

    val string: String,

    @MyQualifierKotlin
    @get:MyQualifierKotlin
    val myString: String
)