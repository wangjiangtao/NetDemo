package cforcustomer.lovesheep.com.basenetdemo.base;

import android.text.TextUtils;

import com.ivydad.readtool.global.Constants;
import com.ivydad.readtool.global.ReadToolApp;
import com.ivydad.readtool.utils.StringUtils;

import org.apache.http.NameValuePair;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by yedf on 2017/10/31.
 */

public class Cache {
    public static String getCacheData(Map<String, String> paraMap) {
        return getCacheData(paraMap, false);
    }

    public static Map<String, String> list2Map(List<NameValuePair> params) {
        Map<String, String> map = new HashMap<>();
        for (NameValuePair pair: params) {
            map.put(pair.getName(), pair.getValue());
        }
        return map;
    }

    public static String getCacheData(List<NameValuePair> params) {
        return getCacheData(list2Map(params));
    }
    public static void deleteCacheData(Map<String, String> paraMap) {
        String cacheName = getCacheName(paraMap);
        if (StringUtils.isNull(cacheName)) {
            return;
        }
        File cacheFile = new File(getCacheDir() + "//" + cacheName);
        if (cacheFile.exists()) {
            boolean a = cacheFile.delete();
        }
    }
    private static String getCacheName(Map<String, String> map) {
        ArrayList<String> words = new ArrayList<>();
        Set<String> kset = map.keySet();
        kset.remove("token"); // 删除不想要的，不影响缓存结果的key
        kset.remove("version"); // 每个版本还能够复用之前版本的缓存
        Object[] keys = kset.toArray();
        Arrays.sort(kset.toArray());
        for (Object key1: keys) {
            String key = (String)key1;
            words.add(key);
            words.add(map.get(key));
        }
        return TextUtils.join("-", words);
    }
    private static String getCacheDir() {
        // 2016.7.11修改，将缓存数据的存储路径改为自定义缓存路径
        File cacheDir = new File(Constants.PATH_INTERNAL_APP_FILE_CACHE);
        if (!cacheDir.exists()) {
            boolean r = cacheDir.mkdirs();
        }
        return cacheDir.getPath();
    }

    private static String readFileByLines(File file) {
        BufferedReader reader = null;
        StringBuffer sb = new StringBuffer();
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                sb.append(tempString);
            }
            reader.close();
        } catch (IOException e) {
            return null;
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                    System.err.println(e1);
                }
            }
        }
        return sb.toString();
    }

    private static void createCacheData(final Map<String, String> paraMap, final String cacheData) {
        ReadToolApp.sHandler.post(() -> {
            String cacheName = getCacheName(paraMap);
            if (cacheName == null) {
                return;
            }
            FileWriter fw = null;
            try {
                fw = new FileWriter(getCacheDir() + "//" + cacheName);
                fw.write(cacheData);
            } catch (IOException e) {
                System.err.println(e);
            } finally {
                if (fw != null)
                    try {
                        fw.close();
                    } catch (IOException e) {
                        System.err.println(e);
                    }
            }
        });
    }

    static void createCacheData(List<NameValuePair> params, String cacheData) {
        createCacheData(list2Map(params), cacheData);
    }

    public static String getCacheData(Map<String, String> paraMap, boolean isConn) {
        String cache = null;
        String cacheName = getCacheName(paraMap);
        if (!StringUtils.isNull(cacheName)) {
            File cacheFile = new File(getCacheDir() + "//" + cacheName);
            if (cacheFile.exists()) {
                cache = readFileByLines(cacheFile);
                return cache;
            }
        }
        return cache;
    }


}
