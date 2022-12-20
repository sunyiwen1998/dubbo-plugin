package org.apache.skywalking.apm.plugin.asf.dubbo;

import com.google.gson.Gson;

public class spanData {
    private static final Gson gson = new Gson();
    public spanData(String traceID, String startTime){
        this.traceID = traceID;
        this.startTime = startTime;
//        this.syscalls = new String[2];
    }

    public String toJson(){
        return gson.toJson(this);
    }

    public static spanData fromJson(String str){
        spanData span = gson.fromJson(str, spanData.class);
        return span;
    }
    public String traceID;
    public String startTime;
    public String endTime;
    public String[] syscalls;

}
