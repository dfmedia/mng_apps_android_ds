// MNG Apps button pilot (DEC-07). Package com.mng.designsystem (confirmed 2026-10-29, DEC-04).
package com.mng.designsystem.button

import android.graphics.Paint
import android.widget.TextView

/** Helpers for the shipped Android text link (Widget.MNG.Button.TextLink). */
object MngTextLink {
    /** Adds the underline the shipped paywall Log In link has. */
    @JvmStatic
    fun underline(view: TextView) {
        view.paintFlags = view.paintFlags or Paint.UNDERLINE_TEXT_FLAG
    }
}
