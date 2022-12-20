package org.apache.skywalking.apm.plugin.asf.dubbo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class segmentData {
    public String threadID;
    public String spanID;
    public spanData span;
    public static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public segmentData(String threadID, String spanID, spanData spanObject){
        this.threadID = threadID;
        this.spanID = spanID;
        this.span = spanObject;
    }
//    }

    public String toJson(){
        return gson.toJson(this);
    }

    public static segmentData fromJson(String str){
        segmentData segment = gson.fromJson(str, segmentData.class);
        return segment;
    }
}
