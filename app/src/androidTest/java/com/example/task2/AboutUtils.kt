package com.example.task2

import android.view.Gravity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.openContextualActionModeOverflowMenu
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText

private fun openAboutViaBottomNav() {
    onView(withId(R.id.nav_view)).perform(click())
}


fun openAbout() = openAboutViaBottomNav()