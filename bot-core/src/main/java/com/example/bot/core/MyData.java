package com.example.bot.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyData {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class MyInnerData {
        String innerString = "default";
    }

    MyInnerData innerData = new MyInnerData();

    String outString = "default";

}
