package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class rc11 {
    public static final jd11 a;

    static {
        jd11 jd11Var = null;
        try {
            jd11Var = (jd11) kd11.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (jd11Var == null) {
            jd11Var = new jd11();
        }
        a = jd11Var;
    }

    public static oma0 a(Class cls, tma0 tma0Var) {
        jd11 jd11Var = a;
        return jd11Var.m(jd11Var.b(cls), Collections.singletonList(tma0Var), false);
    }
}
