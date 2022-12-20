package org.apache.skywalking.apm.plugin.asf.dubbo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.HashMap;
public class tracingData {
    public String processID;
    public String segmentID;
    segmentData segment;
    public static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public tracingData(String processID, String segmentID, segmentData data){
        this.processID = processID;
        this.segmentID = segmentID;
        this.segment = data;
    }
//    public void setPorcessSegment(String processID,String segmentID){
//        psPair.put(processID,segmentID);
//    }
//
//    public void setSegment(String segmentID, segmentData data){
//        String str = GSON.toJson(data);
//        segment.addProperty(segmentID,str);
//    }
//
//    public void setSegment(String processID,String segmentID,segmentData data){
//        setPorcessSegment(processID,segmentID);
//        setSegment(segmentID,data);
//    }

    public String toJson(){
        return gson.toJson(this);
    }

    public static tracingData fromJson(String str){
        tracingData traceData = gson.fromJson(str, tracingData.class);
        return traceData;
    }
}
