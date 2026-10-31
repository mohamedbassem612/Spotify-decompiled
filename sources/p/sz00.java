package p;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sz00 {
    public static volatile sz00 b;
    public static final sz00 c = new sz00();
    public final Map a = Collections.EMPTY_MAP;

    public static sz00 a() {
        sz00 sz00Var;
        liy0 liy0Var = liy0.c;
        sz00 sz00Var2 = b;
        if (sz00Var2 != null) {
            return sz00Var2;
        }
        synchronized (sz00.class) {
            try {
                sz00Var = b;
                if (sz00Var == null) {
                    Class cls = mz00.a;
                    sz00 sz00Var3 = null;
                    if (cls != null) {
                        try {
                            sz00Var3 = (sz00) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    sz00Var = sz00Var3 != null ? sz00Var3 : c;
                    b = sz00Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sz00Var;
    }
}
