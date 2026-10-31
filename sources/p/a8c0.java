package p;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a8c0 {
    public static final xot b = new xot("LibraryVersion", "");
    public static final a8c0 c = new a8c0();
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final String a(String str) throws Throwable {
        String str2;
        InputStream resourceAsStream;
        String str3;
        String str4;
        String str5;
        String str6;
        xot xotVar = b;
        zod.p(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.a;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream = null;
        property = null;
        property = null;
        property = null;
        String property = null;
        InputStream inputStream2 = null;
        try {
            try {
                resourceAsStream = a8c0.class.getResourceAsStream("/" + str + ".properties");
                try {
                    if (resourceAsStream != null) {
                        properties.load(resourceAsStream);
                        property = properties.getProperty("version", null);
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(property).length());
                        sb.append(str);
                        sb.append(" version is ");
                        sb.append(property);
                        String string = sb.toString();
                        if (Log.isLoggable(xotVar.b, 2) && (str6 = xotVar.c) != null) {
                            str6.concat(string);
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
                        sb2.append("Failed to get app version for libraryName: ");
                        sb2.append(str);
                        String string2 = sb2.toString();
                        if (Log.isLoggable(xotVar.b, 5) && (str5 = xotVar.c) != null) {
                            str5.concat(string2);
                        }
                    }
                } catch (IOException unused) {
                    String str7 = property;
                    inputStream = resourceAsStream;
                    str2 = str7;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
                    sb3.append("Failed to get app version for libraryName: ");
                    sb3.append(str);
                    String string3 = sb3.toString();
                    if (Log.isLoggable(xotVar.b, 6) && (str3 = xotVar.c) != null) {
                        str3.concat(string3);
                    }
                    InputStream inputStream3 = inputStream;
                    property = str2;
                    resourceAsStream = inputStream3;
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = resourceAsStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused3) {
            str2 = null;
        }
        if (resourceAsStream != null) {
            try {
                resourceAsStream.close();
            } catch (IOException unused4) {
            }
        }
        if (property == null) {
            if (Log.isLoggable(xotVar.b, 3) && (str4 = xotVar.c) != null) {
                str4.concat(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            }
            property = "UNKNOWN";
        }
        concurrentHashMap.put(str, property);
        return property;
    }
}
