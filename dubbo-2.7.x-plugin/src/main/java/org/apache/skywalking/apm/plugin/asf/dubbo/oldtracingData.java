//package org.apache.skywalking.apm.plugin.asf.dubbo;
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//
//public class oldtracingData {
////    public HashMap<String, String> psPair = new HashMap<String, String>();
////    public JsonObject segment;
//    public String processID;
//    public String segmentID;
//    oldsegmentData segment;
//    public static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
//
//    public oldtracingData(String processID, String segmentID, oldsegmentData data){
//        this.processID = processID;
//        this.segmentID = segmentID;
//        this.segment = data;
//    }
////    public void setPorcessSegment(String processID,String segmentID){
////        psPair.put(processID,segmentID);
////    }
////
////    public void setSegment(String segmentID, segmentData data){
////        String str = GSON.toJson(data);
////        segment.addProperty(segmentID,str);
////    }
////
////    public void setSegment(String processID,String segmentID,segmentData data){
////        setPorcessSegment(processID,segmentID);
////        setSegment(segmentID,data);
////    }
//
//    public String toJson(){
//        return gson.toJson(this);
//    }
//
//    public static oldtracingData fromJson(String str){
//        oldtracingData traceData = gson.fromJson(str, oldtracingData.class);
//        return traceData;
//    }
//}
