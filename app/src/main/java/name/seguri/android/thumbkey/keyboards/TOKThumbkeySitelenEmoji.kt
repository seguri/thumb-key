package name.seguri.android.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import name.seguri.android.thumbkey.utils.ColorVariant
import name.seguri.android.thumbkey.utils.KeyAction
import name.seguri.android.thumbkey.utils.KeyC
import name.seguri.android.thumbkey.utils.KeyDisplay
import name.seguri.android.thumbkey.utils.KeyItemC
import name.seguri.android.thumbkey.utils.KeyboardC
import name.seguri.android.thumbkey.utils.KeyboardDefinition
import name.seguri.android.thumbkey.utils.KeyboardDefinitionModes
import name.seguri.android.thumbkey.utils.SwipeDirection

// Frequencies from here: https://www.reddit.com/r/tokipona/comments/cxlpt5/frequency_list_of_toki_pona_words_from_tatoeba
// Since these aren't vowels, no need to alternate, just do bottom right to left, bottom to top

val KB_TOK_SITELEN_EMOJI_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("❌"),
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("🛒"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("👥"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("👂"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("🏋️"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("💀"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("⚫"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("🛏️"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("⚔️"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("👉"),
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("🔈"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("😴"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("👪"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("💰"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("↔️"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("⭕"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("📄"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("➕"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("↪️"),
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("🐒"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("💥"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("⚓"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("✌️"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("🌀"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("🔀"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("☝️"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("🛫"),
                                ),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("🔼"),
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("❕"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("🎁"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("⚡"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("🛣️"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("😃"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("🖼️"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("👨"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("⬆️"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("👇"),
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("🤔"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("👧"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("😶"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("🐘"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("☯️"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("⚙️"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("☀️"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("🍽️"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("👤"),
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("🐚"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("⚖️"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("💧"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("📤"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("🔧"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("👎"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("♾️"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("🏝️"),
                                ),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("👈"),
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("🏁"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("🐭"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("❤️"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("👜"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("✊"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("👀"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("↩️"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("🏠"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("⏩"),
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("🧠"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("💪"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("👋"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("💭"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText(","),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("."),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                                    action = KeyAction.ToggleShiftMode(true),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("🗣️"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("▶️"),
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("❓"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("🚶"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("👍"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("👐"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("⏰"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("👆"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("⏹️"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("📍"),
                                ),
                        ),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_TOK_SITELEN_EMOJI_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("⏺️"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("💬"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("🔥"),
                        ),
                    swipes =
                        mapOf(
                            // Last char added here
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("♐"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("🍄"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("👁️"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("🧂"),
                                ),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("🌴"),
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("👹"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("💊"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("⛿"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("🧱"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("🫳"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("📕"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("🐊"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("✂️"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("✋"),
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("🦝"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("🪞"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("😎"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("📖"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("😹"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("🍆"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("🔵"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("🐟"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("💨"),
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("💛"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("🏹"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("📏"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("🌙"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("🍞"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("🐞"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("🗻"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("🦅"),
                                ),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("👕"),
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("🔴"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("🍦"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("💩"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("🍎"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("⚪"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("🔲"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("❗"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("⬅️"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("💕"),
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("🕳️"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("🌈"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("🦎"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("❄️"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText(","),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("."),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                                    action = KeyAction.ToggleShiftMode(false),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("👄"),
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("🔓"),
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("🦵"),
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    action = KeyAction.CommitText("〰️"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("#️⃣"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("⬇️"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    action = KeyAction.CommitText("💎"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    action = KeyAction.CommitText("🍭"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("➡️"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    action = KeyAction.CommitText("📦"),
                                ),
                        ),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_TOK_SITELEN_EMOJI_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "toki pona sitelen emoji thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_TOK_SITELEN_EMOJI_THUMBKEY_MAIN,
                shifted = KB_TOK_SITELEN_EMOJI_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
