package ru.tinkoff.uiautomator.application

import android.content.Intent
import androidx.test.uiautomator.By
import androidx.test.uiautomator.BySelector
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.Until
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.CoreMatchers.notNullValue
import org.hamcrest.MatcherAssert.assertThat
import ru.tinkoff.uiautomator.util.*
import kotlin.concurrent.thread


class YouTube : AbstractApplication("com.google.android.youtube") {

    fun clickSearch() {
        val s= byClass("awq").waitFindObject()
        s.children.get(1).click()
    }

    fun Search(text: String){
        byClass("android.widget.EditText").waitFindObject().text=text

    }

     fun selectVideo(num:Int)
     {
         val videos=byStringRes("com.google.android.youtube:id/thumbnail").waitFindObjects()
         videos[num].click()
     }

    fun pauseVideo(seconds: Long)
    {
        byStringRes("com.google.android.youtube:id/fast_forward_rewind_triangles").waitFindObjectlong()
        Thread.sleep(seconds*1000)
        byStringRes("com.google.android.youtube:id/fast_forward_rewind_triangles").waitFindObject().click()
        byStringRes("com.google.android.youtube:id/player_control_play_pause_replay_button").waitFindObject().click()
    }
}





