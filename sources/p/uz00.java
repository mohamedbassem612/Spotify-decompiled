package p;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class uz00 {
    public static volatile uz00 b;
    public static final uz00 c = new uz00();
    public final Map a;

    public uz00(uz00 uz00Var) {
        if (uz00Var == c) {
            this.a = Collections.EMPTY_MAP;
        } else {
            this.a = Collections.unmodifiableMap(uz00Var.a);
        }
    }

    public static uz00 a() {
        uz00 uz00Var;
        oiy0 oiy0Var = oiy0.c;
        uz00 uz00Var2 = b;
        if (uz00Var2 != null) {
            return uz00Var2;
        }
        synchronized (uz00.class) {
            try {
                uz00Var = b;
                if (uz00Var == null) {
                    Class cls = oz00.a;
                    uz00 uz00Var3 = null;
                    if (cls != null) {
                        try {
                            uz00Var3 = (uz00) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    uz00Var = uz00Var3 != null ? uz00Var3 : c;
                    b = uz00Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return uz00Var;
    }

    public uz00() {
        this.a = Collections.EMPTY_MAP;
    }
}
