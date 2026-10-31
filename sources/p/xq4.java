package p;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class xq4 {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = azp0.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(azp0.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(o170.class.getName(), "okhttp.Http2");
        linkedHashMap.put(isd1.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        b = sqg0.U(linkedHashMap);
    }

    public static void a(int i, String str, String str2, Throwable th) {
        int iMin;
        String strC1 = (String) b.get(str);
        if (strC1 == null) {
            strC1 = ihc1.c1(23, str);
        }
        if (Log.isLoggable(strC1, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int iV0 = ihc1.v0(str2, '\n', i2, 4);
                if (iV0 == -1) {
                    iV0 = length;
                }
                while (true) {
                    iMin = Math.min(iV0, i2 + 4000);
                    Log.println(i, strC1, str2.substring(i2, iMin));
                    if (iMin >= iV0) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }

    public static void b(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (a.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(yq4.a);
        }
    }
}
