package top.jatus.miku.core

import android.content.Context
import top.jatus.miku.profile.MihomoProfileStore

/** Stores a complete, native Mihomo YAML document without translating nodes. */
object MihomoConfigStore {

    fun activeConfig(context: Context): String = MihomoProfileStore.activeConfig(context)

    fun replaceActiveConfig(context: Context, yaml: String) {
        MihomoProfileStore.replaceActiveConfig(context, yaml)
    }
}
