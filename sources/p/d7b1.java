package p;

import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class d7b1 {
    public static final idd1 a = new idd1(w0n0.W0);
    public static final AtomicReference b = new AtomicReference(null);

    public static final v5b1 a(String str) {
        if (ihc1.y0(str)) {
            return null;
        }
        Set set = x6b1.e;
        x6b1 x6b1VarL = oqn1.l(str);
        if (x6b1VarL == null) {
            return null;
        }
        c7b1 c7b1Var = (c7b1) b.get();
        if (c7b1Var == null) {
            c7b1Var = (c7b1) a.getValue();
        }
        return c7b1Var.a.a(x6b1VarL);
    }
}
