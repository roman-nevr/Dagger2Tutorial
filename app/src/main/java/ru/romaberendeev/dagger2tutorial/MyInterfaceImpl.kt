package ru.romaberendeev.dagger2tutorial

import javax.inject.Inject

class MyInterfaceImpl @Inject constructor(): MyInterface {

  override fun myFun() {
  }
}