//package org.apache.skywalking.apm.plugin.asf.dubbo;
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//
//public class oldsegmentData {
////    public HashMap<String, String> tsPair = new HashMap<String, String>();
////    public JsonObject span;
//    public String threadID;
//    public String spanID;
//    public oldspanData span;
//    public static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
//
//    public oldsegmentData(String threadID, String spanID, oldspanData spanObject){
//        this.threadID = threadID;
//        this.spanID = spanID;
//        this.span = spanObject;
//    }
////    }
//
//    public String toJson(){
//        return gson.toJson(this);
//    }
//
//    public static oldsegmentData fromJson(String str){
//        oldsegmentData segment = gson.fromJson(str, oldsegmentData.class);
//        return segment;
//    }
//}
