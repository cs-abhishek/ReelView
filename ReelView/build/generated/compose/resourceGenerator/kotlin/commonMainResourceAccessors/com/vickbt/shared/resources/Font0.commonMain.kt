@file:OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)

package com.vickbt.shared.resources

import kotlin.OptIn
import kotlin.String
import kotlin.collections.MutableMap
import org.jetbrains.compose.resources.FontResource
import org.jetbrains.compose.resources.InternalResourceApi

private object CommonMainFont0 {
  public val nunito: FontResource by 
      lazy { init_nunito() }
}

@InternalResourceApi
internal fun _collectCommonMainFont0Resources(map: MutableMap<String, FontResource>) {
  map.put("nunito", CommonMainFont0.nunito)
}

public val Res.font.nunito: FontResource
  get() = CommonMainFont0.nunito

private fun init_nunito(): FontResource = org.jetbrains.compose.resources.FontResource(
  "font:nunito",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/font/nunito.ttf", -1, -1),
    )
)
