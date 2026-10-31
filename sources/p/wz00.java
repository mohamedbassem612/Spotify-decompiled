package p;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wz00 {
    public static volatile wz00 b;
    public static final wz00 c;
    public final Map a = Collections.EMPTY_MAP;

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        c = new wz00();
    }

    public static wz00 a() {
        wz00 wz00Var;
        wz00 wz00Var2 = b;
        if (wz00Var2 != null) {
            return wz00Var2;
        }
        synchronized (wz00.class) {
            try {
                wz00Var = b;
                if (wz00Var == null) {
                    Class cls = pz00.a;
                    if (cls != null) {
                        try {
                            wz00Var = (wz00) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                            wz00Var = c;
                        }
                    } else {
                        wz00Var = c;
                    }
                    b = wz00Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wz00Var;
    }
}
