package p;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ava0 {
    public final HashMap a = new HashMap();
    public final int b;

    public ava0(int i) {
        this.b = i;
    }

    public static String a(int i, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i) {
                return str.substring(0, i);
            }
        }
        return str;
    }

    public final synchronized boolean b(String str, String str2) {
        boolean zEquals;
        try {
            if (str == null) {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
            String strA = a(this.b, str);
            if (this.a.size() >= 64 && !this.a.containsKey(strA)) {
                ws10.Z.j();
                return false;
            }
            String strA2 = a(this.b, str2);
            String str3 = (String) this.a.get(strA);
            if (str3 == null) {
                zEquals = strA2 == null;
            } else {
                zEquals = str3.equals(strA2);
            }
            if (zEquals) {
                return false;
            }
            HashMap map = this.a;
            if (str2 == null) {
                strA2 = "";
            }
            map.put(strA, strA2);
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(Map map) {
        try {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strA = a(this.b, str);
                if (this.a.size() < 64 || this.a.containsKey(strA)) {
                    String str2 = (String) entry.getValue();
                    this.a.put(strA, str2 == null ? "" : a(this.b, str2));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                ws10.Z.j();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
