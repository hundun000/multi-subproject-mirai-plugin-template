package com.example.bot.plugin

import com.example.bot.core.DemoJavaAutoSaveData
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.console.plugin.jvm.reloadPluginData
import net.mamoe.mirai.utils.info


object PluginMain : KotlinPlugin(
    JvmPluginDescription(
        id = "org.example.mirai-plugin",
        name = "ExamplePlugin",
        version = "0.1.0"
    )
) {
    override fun onEnable() {
        logger.info { "Plugin loaded"}
        this.reloadPluginData(DemoJavaAutoSaveData.INSTANCE)
    }
}