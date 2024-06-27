package name.seguri.android.thumbkey.keyboards

import name.seguri.android.thumbkey.utils.KeyboardDefinition
import name.seguri.android.thumbkey.utils.KeyboardDefinitionModes
import name.seguri.android.thumbkey.utils.KeyboardDefinitionSettings
import name.seguri.android.thumbkey.utils.autoCapitalizeI
import name.seguri.android.thumbkey.utils.autoCapitalizeIApostrophe
import name.seguri.android.thumbkey.utils.lastColKeysToFirst

val KB_EN_MESSAGEASE_LEFT: KeyboardDefinition =
    KeyboardDefinition(
        title = "english left-handed messagease",
        modes =
            KeyboardDefinitionModes(
                main = lastColKeysToFirst(KB_EN_MESSAGEASE_MAIN),
                shifted = lastColKeysToFirst(KB_EN_MESSAGEASE_SHIFTED),
                numeric = lastColKeysToFirst(KB_EN_MESSAGEASE_NUMERIC),
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
