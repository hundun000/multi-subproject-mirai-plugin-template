package com.example.bot.core;

import net.mamoe.mirai.console.data.Value;
import net.mamoe.mirai.console.data.java.JavaAutoSavePluginData;

public class DemoJavaAutoSaveData extends JavaAutoSavePluginData {
    public static final DemoJavaAutoSaveData INSTANCE = new DemoJavaAutoSaveData();

    public DemoJavaAutoSaveData() {
        super("DemoJavaAutoSaveData");
    }

    public final Value<String> myString = value("valueNameOfMyString", "test"); // 默认值 "test"
    public final Value<MyDataWrapper> myDataWrapper = typedValue("myDataWrapper", createKType(MyDataWrapper.class), new MyDataWrapper(new MyData())); // 默认值 "test"
}
