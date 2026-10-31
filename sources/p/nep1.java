package p;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nep1 {
    public static final nep1 b = new nep1();
    public final HashMap a = new HashMap();

    public final synchronized void a(String str, w9p1 w9p1Var) {
        try {
            HashMap map = this.a;
            if (!map.containsKey(str)) {
                map.put(str, w9p1Var);
                return;
            }
            if (((w9p1) map.get(str)).equals(w9p1Var)) {
                return;
            }
            String strValueOf = String.valueOf(map.get(str));
            String strValueOf2 = String.valueOf(w9p1Var);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + strValueOf.length() + 17 + strValueOf2.length());
            sb.append("Parameters object with name ");
            sb.append(str);
            sb.append(" already exists (");
            sb.append(strValueOf);
            sb.append("), cannot insert ");
            sb.append(strValueOf2);
            throw new GeneralSecurityException(sb.toString());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (w9p1) entry.getValue());
        }
    }
}
