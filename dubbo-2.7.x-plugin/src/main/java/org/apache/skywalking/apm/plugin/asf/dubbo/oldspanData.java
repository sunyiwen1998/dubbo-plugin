//package org.apache.skywalking.apm.plugin.asf.dubbo;
//
//import com.google.gson.Gson;
//
//public class oldspanData {
//    private static final Gson gson = new Gson();
//    public oldspanData(String traceID, String startTime){
//        this.traceID = traceID;
//        this.startTime = startTime;
////        this.syscalls = new String[2];
//    }
//
//    public String toJson(){
//        return gson.toJson(this);
//    }
//
//    public static oldspanData fromJson(String str){
//        oldspanData span = gson.fromJson(str, oldspanData.class);
//        return span;
//    }
//    public String traceID;
//    public String startTime;
//    public String endTime;
//    public String[] syscalls;
////    public JsonObject syscalls;
//}
