@file:OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)

package com.vickbt.shared.resources

import kotlin.OptIn
import kotlin.String
import kotlin.collections.MutableMap
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.InternalResourceApi

private object CommonMainDrawable0 {
  public val logo_n: DrawableResource by 
      lazy { init_logo_n() }
}

@InternalResourceApi
internal fun _collectCommonMainDrawable0Resources(map: MutableMap<String, DrawableResource>) {
  map.put("logo_n", CommonMainDrawable0.logo_n)
}

public val Res.drawable.logo_n: DrawableResource
  get() = CommonMainDrawable0.logo_n

private fun init_logo_n(): DrawableResource = org.jetbrains.compose.resources.DrawableResource(
  "drawable:logo_n",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/drawable/logo_n.png", -1, -1),
    )
)
