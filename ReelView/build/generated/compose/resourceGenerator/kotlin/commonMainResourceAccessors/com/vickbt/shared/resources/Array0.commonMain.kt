@file:OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)

package com.vickbt.shared.resources

import kotlin.OptIn
import kotlin.String
import kotlin.collections.MutableMap
import org.jetbrains.compose.resources.InternalResourceApi
import org.jetbrains.compose.resources.StringArrayResource

private object CommonMainArray0 {
  public val image_qualities: StringArrayResource by 
      lazy { init_image_qualities() }

  public val themes: StringArrayResource by 
      lazy { init_themes() }
}

@InternalResourceApi
internal fun _collectCommonMainArray0Resources(map: MutableMap<String, StringArrayResource>) {
  map.put("image_qualities", CommonMainArray0.image_qualities)
  map.put("themes", CommonMainArray0.themes)
}

public val Res.array.image_qualities: StringArrayResource
  get() = CommonMainArray0.image_qualities

private fun init_image_qualities(): StringArrayResource =
    org.jetbrains.compose.resources.StringArrayResource(
  "string-array:image_qualities", "image_qualities",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 10, 62),
    )
)

public val Res.array.themes: StringArrayResource
  get() = CommonMainArray0.themes

private fun init_themes(): StringArrayResource =
    org.jetbrains.compose.resources.StringArrayResource(
  "string-array:themes", "themes",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 73, 74),
    )
)
