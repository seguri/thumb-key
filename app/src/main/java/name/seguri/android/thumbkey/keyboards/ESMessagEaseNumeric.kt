package name.seguri.android.thumbkey.keyboards

import name.seguri.android.thumbkey.utils.ColorVariant
import name.seguri.android.thumbkey.utils.FontSizeVariant
import name.seguri.android.thumbkey.utils.KeyAction
import name.seguri.android.thumbkey.utils.KeyC
import name.seguri.android.thumbkey.utils.KeyDisplay
import name.seguri.android.thumbkey.utils.KeyItemC
import name.seguri.android.thumbkey.utils.KeyboardC
import name.seguri.android.thumbkey.utils.SwipeDirection
import name.seguri.android.thumbkey.utils.getLocalCurrency

// this val is so we can can use mapOf in the key with currency symbol
val KB_ES_MESSAGEASE_CURRENCY_SYMBOL: String =
    getLocalCurrency()?.let {
        if (it !in setOf("$", "£", "€")) {
            it
        } else {
            "$"
        }
    }!!

val KB_ES_MESSAGEASE_NUMERIC =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("1"),
                            action = KeyAction.CommitText("1"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.RIGHT to KeyC(display = KeyDisplay.TextDisplay("-"), action = KeyAction.CommitText("-")),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(KB_ES_MESSAGEASE_CURRENCY_SYMBOL),
                                    action = KeyAction.CommitText(KB_ES_MESSAGEASE_CURRENCY_SYMBOL),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("2"),
                            action = KeyAction.CommitText("2"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to KeyC(display = KeyDisplay.TextDisplay("`"), action = KeyAction.CommitText("`")),
                            SwipeDirection.TOP to KeyC(display = KeyDisplay.TextDisplay("^"), action = KeyAction.CommitText("^")),
                            SwipeDirection.TOP_RIGHT to KeyC(display = KeyDisplay.TextDisplay("´"), action = KeyAction.CommitText("´")),
                            SwipeDirection.RIGHT to KeyC(display = KeyDisplay.TextDisplay("!"), action = KeyAction.CommitText("!")),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("\\"),
                                    action = KeyAction.CommitText("\\"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("/"),
                                    action = KeyAction.CommitText("/"),
                                ),
                            SwipeDirection.LEFT to KeyC(display = KeyDisplay.TextDisplay("+"), action = KeyAction.CommitText("+")),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("3"),
                            action = KeyAction.CommitText("3"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_RIGHT to KeyC(display = KeyDisplay.TextDisplay("¡"), action = KeyAction.CommitText("¡")),
                            SwipeDirection.LEFT to KeyC(display = KeyDisplay.TextDisplay("?"), action = KeyAction.CommitText("?")),
                            SwipeDirection.RIGHT to KeyC(display = KeyDisplay.TextDisplay("¿"), action = KeyAction.CommitText("¿")),
                            SwipeDirection.BOTTOM_RIGHT to KeyC(display = KeyDisplay.TextDisplay("€"), action = KeyAction.CommitText("€")),
                            SwipeDirection.BOTTOM_LEFT to KeyC(display = KeyDisplay.TextDisplay("£"), action = KeyAction.CommitText("£")),
                            SwipeDirection.BOTTOM to KeyC(display = KeyDisplay.TextDisplay("="), action = KeyAction.CommitText("=")),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("4"),
                            action = KeyAction.CommitText("4"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to KeyC(display = KeyDisplay.TextDisplay("{"), action = KeyAction.CommitText("{")),
                            SwipeDirection.TOP_RIGHT to KeyC(display = KeyDisplay.TextDisplay("%"), action = KeyAction.CommitText("%")),
                            SwipeDirection.BOTTOM_RIGHT to KeyC(display = KeyDisplay.TextDisplay("_"), action = KeyAction.CommitText("_")),
                            SwipeDirection.BOTTOM_LEFT to KeyC(display = KeyDisplay.TextDisplay("["), action = KeyAction.CommitText("[")),
                            SwipeDirection.LEFT to KeyC(display = KeyDisplay.TextDisplay("("), action = KeyAction.CommitText("(")),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("5"),
                            action = KeyAction.CommitText("5"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(SwipeDirection.TOP to KeyC(display = KeyDisplay.TextDisplay("¬"), action = KeyAction.CommitText("¬"))),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("6"),
                            action = KeyAction.CommitText("6"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to KeyC(display = KeyDisplay.TextDisplay("|"), action = KeyAction.CommitText("|")),
                            SwipeDirection.TOP_RIGHT to KeyC(display = KeyDisplay.TextDisplay("}"), action = KeyAction.CommitText("}")),
                            SwipeDirection.RIGHT to KeyC(display = KeyDisplay.TextDisplay(")"), action = KeyAction.CommitText(")")),
                            SwipeDirection.BOTTOM_RIGHT to KeyC(display = KeyDisplay.TextDisplay("]"), action = KeyAction.CommitText("]")),
                            SwipeDirection.BOTTOM_LEFT to KeyC(display = KeyDisplay.TextDisplay("@"), action = KeyAction.CommitText("@")),
                        ),
                ),
                ABC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("7"),
                            action = KeyAction.CommitText("7"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to KeyC(display = KeyDisplay.TextDisplay("~"), action = KeyAction.CommitText("~")),
                            SwipeDirection.TOP to KeyC(display = KeyDisplay.TextDisplay("¨"), action = KeyAction.CommitText("¨")),
                            SwipeDirection.LEFT to KeyC(display = KeyDisplay.TextDisplay("<"), action = KeyAction.CommitText("<")),
                            SwipeDirection.RIGHT to KeyC(display = KeyDisplay.TextDisplay("*"), action = KeyAction.CommitText("*")),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("8"),
                            action = KeyAction.CommitText("8"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to KeyC(display = KeyDisplay.TextDisplay("\""), action = KeyAction.CommitText("\"")),
                            SwipeDirection.TOP_RIGHT to KeyC(display = KeyDisplay.TextDisplay("'"), action = KeyAction.CommitText("'")),
                            SwipeDirection.BOTTOM_RIGHT to KeyC(display = KeyDisplay.TextDisplay(":"), action = KeyAction.CommitText(":")),
                            SwipeDirection.BOTTOM to KeyC(display = KeyDisplay.TextDisplay("."), action = KeyAction.CommitText(".")),
                            SwipeDirection.BOTTOM_LEFT to KeyC(display = KeyDisplay.TextDisplay(","), action = KeyAction.CommitText(",")),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("9"),
                            action = KeyAction.CommitText("9"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to KeyC(display = KeyDisplay.TextDisplay("&"), action = KeyAction.CommitText("&")),
                            SwipeDirection.TOP_RIGHT to KeyC(display = KeyDisplay.TextDisplay("°"), action = KeyAction.CommitText("°")),
                            SwipeDirection.RIGHT to KeyC(display = KeyDisplay.TextDisplay(">"), action = KeyAction.CommitText(">")),
                            SwipeDirection.BOTTOM_LEFT to KeyC(display = KeyDisplay.TextDisplay(";"), action = KeyAction.CommitText(";")),
                            SwipeDirection.LEFT to KeyC(display = KeyDisplay.TextDisplay("#"), action = KeyAction.CommitText("#")),
                        ),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("0"),
                            action = KeyAction.CommitText("0"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    widthMultiplier = 2,
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )