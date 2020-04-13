package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;
//@SerializedName 注解的方式来让JSON字段和Java字段之间建立映射关系

public class Basic {
    @SerializedName("city")
    public String cityName; //城市名

    @SerializedName("id")
    public String weatherId; //天气编号

    public Update update; //更新状态类

    public class Update{
        @SerializedName("loc")
        public String updateTime; //更新时间
    }
}
