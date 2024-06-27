package name.seguri.android.thumbkey.keyboards

import name.seguri.android.thumbkey.utils.KeyboardDefinition
import name.seguri.android.thumbkey.utils.KeyboardDefinitionModes
import name.seguri.android.thumbkey.utils.KeyboardDefinitionSettings
import name.seguri.android.thumbkey.utils.autoCapitalizeI
import name.seguri.android.thumbkey.utils.autoCapitalizeIApostrophe
import name.seguri.android.thumbkey.utils.lastColKeysToFirst

val KB_EN_QBASED_LEFT: KeyboardDefinition =
    KeyboardDefinition(
        title = "english qbased left-handed",
        modes =
            KeyboardDefinitionModes(
                main = lastColKeysToFirst(KB_EN_QBASED_MAIN),
                shifted = lastColKeysToFirst(KB_EN_QBASED_SHIFTED),
                numeric = lastColKeysToFirst(NUMERIC_KEYBOARD),
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
