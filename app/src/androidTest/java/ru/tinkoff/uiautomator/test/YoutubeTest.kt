package ru.tinkoff.uiautomator.test

import android.support.test.runner.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import ru.tinkoff.uiautomator.application.PlayMarket
import ru.tinkoff.uiautomator.application.YouTube
import ru.tinkoff.uiautomator.util.byStringText
import ru.tinkoff.uiautomator.util.getDevice
import ru.tinkoff.uiautomator.util.waitHasObject

//TODO (3.4 Tests) run with is important
@RunWith(AndroidJUnit4::class)
class YoutubeTest : AbstractApplicationTest<YouTube>(YouTube()) {

    //TODO (3.5 Tests)finally some tests
    @Test
    fun Youtube() {
        app.open()
        app.clickSearch()
        app.Search("thunder imagine dragons")
        getDevice().pressEnter()
        app.selectVideo(0)
        app.pauseVideo(10)
    }

}