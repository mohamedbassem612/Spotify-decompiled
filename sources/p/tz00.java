package p;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tz00 {
    public static volatile tz00 b;
    public static final tz00 c = new tz00();
    public final Map a = Collections.EMPTY_MAP;

    public static tz00 a() {
        tz00 tz00Var;
        tz00 tz00Var2 = b;
        if (tz00Var2 != null) {
            return tz00Var2;
        }
        synchronized (tz00.class) {
            try {
                tz00Var = b;
                if (tz00Var == null) {
                    Class cls = nz00.a;
                    tz00 tz00Var3 = null;
                    if (cls != null) {
                        try {
                            tz00Var3 = (tz00) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    tz00Var = tz00Var3 != null ? tz00Var3 : c;
                    b = tz00Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tz00Var;
    }
}
