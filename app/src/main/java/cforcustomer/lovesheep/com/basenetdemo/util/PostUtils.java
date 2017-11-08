package cforcustomer.lovesheep.com.basenetdemo.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wjt on 2017/11/8.
 */

public class PostUtils {
    public static Map<String,String> getPublicParaMap(){
        Map<String, String> map = new HashMap<>();
        map.put( "device_id" , "5404064a");
        map.put( "token" , "27c11647da554c97a1e3e57872917259");
        map.put( "member_uuid" , "0");
        map.put( "version" , "1.10.6 alpha");
        return map;
    }
}
