package ru.romaberendeev.dagger2tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

  @Inject
  lateinit var myDataClass: MyDataClass

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    DaggerMyComponent.factory().create(
        MyDependenciesClass("simpleString", "qualifiedString")
    ).inject(this)
  }
}