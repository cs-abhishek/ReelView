@file:OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)

package com.vickbt.shared.resources

import kotlin.OptIn
import kotlin.String
import kotlin.collections.MutableMap
import org.jetbrains.compose.resources.InternalResourceApi
import org.jetbrains.compose.resources.StringResource

private object CommonMainString0 {
  public val back: StringResource by 
      lazy { init_back() }

  public val cancel: StringResource by 
      lazy { init_cancel() }

  public val cast: StringResource by 
      lazy { init_cast() }

  public val categories: StringResource by 
      lazy { init_categories() }

  public val change_image_quality: StringResource by 
      lazy { init_change_image_quality() }

  public val change_language: StringResource by 
      lazy { init_change_language() }

  public val change_theme: StringResource by 
      lazy { init_change_theme() }

  public val close_search: StringResource by 
      lazy { init_close_search() }

  public val dark_theme: StringResource by 
      lazy { init_dark_theme() }

  public val def: StringResource by 
      lazy { init_def() }

  public val language_eg: StringResource by 
      lazy { init_language_eg() }

  public val light_theme: StringResource by 
      lazy { init_light_theme() }

  public val movie_poster: StringResource by 
      lazy { init_movie_poster() }

  public val movies: StringResource by 
      lazy { init_movies() }

  public val overview: StringResource by 
      lazy { init_overview() }

  public val popular_movies: StringResource by 
      lazy { init_popular_movies() }

  public val popular_tv_shows: StringResource by 
      lazy { init_popular_tv_shows() }

  public val popularity: StringResource by 
      lazy { init_popularity() }

  public val rating: StringResource by 
      lazy { init_rating() }

  public val report_bug: StringResource by 
      lazy { init_report_bug() }

  public val report_bug_description: StringResource by 
      lazy { init_report_bug_description() }

  public val search_movie: StringResource by 
      lazy { init_search_movie() }

  public val see_more: StringResource by 
      lazy { init_see_more() }

  public val share: StringResource by 
      lazy { init_share() }

  public val similar_movies: StringResource by 
      lazy { init_similar_movies() }

  public val source_code: StringResource by 
      lazy { init_source_code() }

  public val source_code_description: StringResource by 
      lazy { init_source_code_description() }

  public val system_default: StringResource by 
      lazy { init_system_default() }

  public val title_details: StringResource by 
      lazy { init_title_details() }

  public val title_extras: StringResource by 
      lazy { init_title_extras() }

  public val title_favorites: StringResource by 
      lazy { init_title_favorites() }

  public val title_home: StringResource by 
      lazy { init_title_home() }

  public val title_personalisation: StringResource by 
      lazy { init_title_personalisation() }

  public val title_search: StringResource by 
      lazy { init_title_search() }

  public val title_settings: StringResource by 
      lazy { init_title_settings() }

  public val top_rated_tv_shows: StringResource by 
      lazy { init_top_rated_tv_shows() }

  public val trailer: StringResource by 
      lazy { init_trailer() }

  public val trending_movies: StringResource by 
      lazy { init_trending_movies() }

  public val trending_tv_shows: StringResource by 
      lazy { init_trending_tv_shows() }

  public val tv_shows: StringResource by 
      lazy { init_tv_shows() }

  public val unknown_actor: StringResource by 
      lazy { init_unknown_actor() }

  public val unknown_character: StringResource by 
      lazy { init_unknown_character() }

  public val unknown_movie: StringResource by 
      lazy { init_unknown_movie() }

  public val upcoming_movies: StringResource by 
      lazy { init_upcoming_movies() }

  public val view_all: StringResource by 
      lazy { init_view_all() }
}

@InternalResourceApi
internal fun _collectCommonMainString0Resources(map: MutableMap<String, StringResource>) {
  map.put("back", CommonMainString0.back)
  map.put("cancel", CommonMainString0.cancel)
  map.put("cast", CommonMainString0.cast)
  map.put("categories", CommonMainString0.categories)
  map.put("change_image_quality", CommonMainString0.change_image_quality)
  map.put("change_language", CommonMainString0.change_language)
  map.put("change_theme", CommonMainString0.change_theme)
  map.put("close_search", CommonMainString0.close_search)
  map.put("dark_theme", CommonMainString0.dark_theme)
  map.put("def", CommonMainString0.def)
  map.put("language_eg", CommonMainString0.language_eg)
  map.put("light_theme", CommonMainString0.light_theme)
  map.put("movie_poster", CommonMainString0.movie_poster)
  map.put("movies", CommonMainString0.movies)
  map.put("overview", CommonMainString0.overview)
  map.put("popular_movies", CommonMainString0.popular_movies)
  map.put("popular_tv_shows", CommonMainString0.popular_tv_shows)
  map.put("popularity", CommonMainString0.popularity)
  map.put("rating", CommonMainString0.rating)
  map.put("report_bug", CommonMainString0.report_bug)
  map.put("report_bug_description", CommonMainString0.report_bug_description)
  map.put("search_movie", CommonMainString0.search_movie)
  map.put("see_more", CommonMainString0.see_more)
  map.put("share", CommonMainString0.share)
  map.put("similar_movies", CommonMainString0.similar_movies)
  map.put("source_code", CommonMainString0.source_code)
  map.put("source_code_description", CommonMainString0.source_code_description)
  map.put("system_default", CommonMainString0.system_default)
  map.put("title_details", CommonMainString0.title_details)
  map.put("title_extras", CommonMainString0.title_extras)
  map.put("title_favorites", CommonMainString0.title_favorites)
  map.put("title_home", CommonMainString0.title_home)
  map.put("title_personalisation", CommonMainString0.title_personalisation)
  map.put("title_search", CommonMainString0.title_search)
  map.put("title_settings", CommonMainString0.title_settings)
  map.put("top_rated_tv_shows", CommonMainString0.top_rated_tv_shows)
  map.put("trailer", CommonMainString0.trailer)
  map.put("trending_movies", CommonMainString0.trending_movies)
  map.put("trending_tv_shows", CommonMainString0.trending_tv_shows)
  map.put("tv_shows", CommonMainString0.tv_shows)
  map.put("unknown_actor", CommonMainString0.unknown_actor)
  map.put("unknown_character", CommonMainString0.unknown_character)
  map.put("unknown_movie", CommonMainString0.unknown_movie)
  map.put("upcoming_movies", CommonMainString0.upcoming_movies)
  map.put("view_all", CommonMainString0.view_all)
}

public val Res.string.back: StringResource
  get() = CommonMainString0.back

private fun init_back(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:back", "back",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 148, 20),
    )
)

public val Res.string.cancel: StringResource
  get() = CommonMainString0.cancel

private fun init_cancel(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:cancel", "cancel",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 169, 22),
    )
)

public val Res.string.cast: StringResource
  get() = CommonMainString0.cast

private fun init_cast(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:cast", "cast",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 192, 20),
    )
)

public val Res.string.categories: StringResource
  get() = CommonMainString0.categories

private fun init_categories(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:categories", "categories",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 213, 34),
    )
)

public val Res.string.change_image_quality: StringResource
  get() = CommonMainString0.change_image_quality

private fun init_change_image_quality(): StringResource =
    org.jetbrains.compose.resources.StringResource(
  "string:change_image_quality", "change_image_quality",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 248, 56),
    )
)

public val Res.string.change_language: StringResource
  get() = CommonMainString0.change_language

private fun init_change_language(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:change_language", "change_language",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 305, 43),
    )
)

public val Res.string.change_theme: StringResource
  get() = CommonMainString0.change_theme

private fun init_change_theme(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:change_theme", "change_theme",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 349, 36),
    )
)

public val Res.string.close_search: StringResource
  get() = CommonMainString0.close_search

private fun init_close_search(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:close_search", "close_search",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 386, 36),
    )
)

public val Res.string.dark_theme: StringResource
  get() = CommonMainString0.dark_theme

private fun init_dark_theme(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:dark_theme", "dark_theme",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 423, 34),
    )
)

public val Res.string.def: StringResource
  get() = CommonMainString0.def

private fun init_def(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:def", "def",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 458, 23),
    )
)

public val Res.string.language_eg: StringResource
  get() = CommonMainString0.language_eg

private fun init_language_eg(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:language_eg", "language_eg",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 482, 35),
    )
)

public val Res.string.light_theme: StringResource
  get() = CommonMainString0.light_theme

private fun init_light_theme(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:light_theme", "light_theme",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 518, 35),
    )
)

public val Res.string.movie_poster: StringResource
  get() = CommonMainString0.movie_poster

private fun init_movie_poster(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:movie_poster", "movie_poster",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 554, 36),
    )
)

public val Res.string.movies: StringResource
  get() = CommonMainString0.movies

private fun init_movies(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:movies", "movies",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 591, 22),
    )
)

public val Res.string.overview: StringResource
  get() = CommonMainString0.overview

private fun init_overview(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:overview", "overview",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 614, 28),
    )
)

public val Res.string.popular_movies: StringResource
  get() = CommonMainString0.popular_movies

private fun init_popular_movies(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:popular_movies", "popular_movies",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 643, 42),
    )
)

public val Res.string.popular_tv_shows: StringResource
  get() = CommonMainString0.popular_tv_shows

private fun init_popular_tv_shows(): StringResource =
    org.jetbrains.compose.resources.StringResource(
  "string:popular_tv_shows", "popular_tv_shows",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 686, 48),
    )
)

public val Res.string.popularity: StringResource
  get() = CommonMainString0.popularity

private fun init_popularity(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:popularity", "popularity",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 735, 34),
    )
)

public val Res.string.rating: StringResource
  get() = CommonMainString0.rating

private fun init_rating(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:rating", "rating",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 770, 22),
    )
)

public val Res.string.report_bug: StringResource
  get() = CommonMainString0.report_bug

private fun init_report_bug(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:report_bug", "report_bug",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 864, 34),
    )
)

public val Res.string.report_bug_description: StringResource
  get() = CommonMainString0.report_bug_description

private fun init_report_bug_description(): StringResource =
    org.jetbrains.compose.resources.StringResource(
  "string:report_bug_description", "report_bug_description",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 793, 70),
    )
)

public val Res.string.search_movie: StringResource
  get() = CommonMainString0.search_movie

private fun init_search_movie(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:search_movie", "search_movie",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 899, 36),
    )
)

public val Res.string.see_more: StringResource
  get() = CommonMainString0.see_more

private fun init_see_more(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:see_more", "see_more",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 936, 28),
    )
)

public val Res.string.share: StringResource
  get() = CommonMainString0.share

private fun init_share(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:share", "share",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 965, 21),
    )
)

public val Res.string.similar_movies: StringResource
  get() = CommonMainString0.similar_movies

private fun init_similar_movies(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:similar_movies", "similar_movies",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 987, 42),
    )
)

public val Res.string.source_code: StringResource
  get() = CommonMainString0.source_code

private fun init_source_code(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:source_code", "source_code",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 1090, 35),
    )
)

public val Res.string.source_code_description: StringResource
  get() = CommonMainString0.source_code_description

private fun init_source_code_description(): StringResource =
    org.jetbrains.compose.resources.StringResource(
  "string:source_code_description", "source_code_description",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 1030, 59),
    )
)

public val Res.string.system_default: StringResource
  get() = CommonMainString0.system_default

private fun init_system_default(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:system_default", "system_default",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 1126, 42),
    )
)

public val Res.string.title_details: StringResource
  get() = CommonMainString0.title_details

private fun init_title_details(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:title_details", "title_details",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 1169, 33),
    )
)

public val Res.string.title_extras: StringResource
  get() = CommonMainString0.title_extras

private fun init_title_extras(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:title_extras", "title_extras",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 1203, 28),
    )
)

public val Res.string.title_favorites: StringResource
  get() = CommonMainString0.title_favorites

private fun init_title_favorites(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:title_favorites", "title_favorites",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 1232, 35),
    )
)

public val Res.string.title_home: StringResource
  get() = CommonMainString0.title_home

private fun init_title_home(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:title_home", "title_home",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 1268, 26),
    )
)

public val Res.string.title_personalisation: StringResource
  get() = CommonMainString0.title_personalisation

private fun init_title_personalisation(): StringResource =
    org.jetbrains.compose.resources.StringResource(
  "string:title_personalisation", "title_personalisation",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 1295, 49),
    )
)

public val Res.string.title_search: StringResource
  get() = CommonMainString0.title_search

private fun init_title_search(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:title_search", "title_search",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 1345, 28),
    )
)

public val Res.string.title_settings: StringResource
  get() = CommonMainString0.title_settings

private fun init_title_settings(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:title_settings", "title_settings",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 1374, 34),
    )
)

public val Res.string.top_rated_tv_shows: StringResource
  get() = CommonMainString0.top_rated_tv_shows

private fun init_top_rated_tv_shows(): StringResource =
    org.jetbrains.compose.resources.StringResource(
  "string:top_rated_tv_shows", "top_rated_tv_shows",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 1409, 50),
    )
)

public val Res.string.trailer: StringResource
  get() = CommonMainString0.trailer

private fun init_trailer(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:trailer", "trailer",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 1460, 27),
    )
)

public val Res.string.trending_movies: StringResource
  get() = CommonMainString0.trending_movies

private fun init_trending_movies(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:trending_movies", "trending_movies",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 1488, 43),
    )
)

public val Res.string.trending_tv_shows: StringResource
  get() = CommonMainString0.trending_tv_shows

private fun init_trending_tv_shows(): StringResource =
    org.jetbrains.compose.resources.StringResource(
  "string:trending_tv_shows", "trending_tv_shows",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 1532, 49),
    )
)

public val Res.string.tv_shows: StringResource
  get() = CommonMainString0.tv_shows

private fun init_tv_shows(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:tv_shows", "tv_shows",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 1582, 28),
    )
)

public val Res.string.unknown_actor: StringResource
  get() = CommonMainString0.unknown_actor

private fun init_unknown_actor(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:unknown_actor", "unknown_actor",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 1611, 41),
    )
)

public val Res.string.unknown_character: StringResource
  get() = CommonMainString0.unknown_character

private fun init_unknown_character(): StringResource =
    org.jetbrains.compose.resources.StringResource(
  "string:unknown_character", "unknown_character",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 1653, 49),
    )
)

public val Res.string.unknown_movie: StringResource
  get() = CommonMainString0.unknown_movie

private fun init_unknown_movie(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:unknown_movie", "unknown_movie",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 1703, 41),
    )
)

public val Res.string.upcoming_movies: StringResource
  get() = CommonMainString0.upcoming_movies

private fun init_upcoming_movies(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:upcoming_movies", "upcoming_movies",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 1745, 43),
    )
)

public val Res.string.view_all: StringResource
  get() = CommonMainString0.view_all

private fun init_view_all(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:view_all", "view_all",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/com.vickbt.shared.resources/values/strings.commonMain.cvr", 1789, 28),
    )
)
