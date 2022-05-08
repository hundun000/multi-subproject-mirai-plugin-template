package com.example.bot.plugin

import com.example.bot.core.BotCore
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.utils.info


object PluginMain : KotlinPlugin(
    JvmPluginDescription(
        id = "org.example.mirai-plugin",
        name = "ExamplePlugin",
        version = "0.1.0"
    )
) {
    override fun onEnable() {
        val core = BotCore()
        logger.info { "Plugin loaded" + core.hashCode()}
    }
}