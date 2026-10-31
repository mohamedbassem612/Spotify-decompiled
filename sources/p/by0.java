package p;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class by0 {
    public final LinkedHashSet a = new LinkedHashSet();
    public final LinkedHashMap b = new LinkedHashMap();

    public final Object a(jx0 jx0Var, ciw0 ciw0Var) {
        iu30 iu30Var;
        synchronized (this) {
            this.a.add(jx0Var.a);
            iu30Var = (iu30) this.b.remove(jx0Var.a);
        }
        if (iu30Var == null) {
            return rih1.a;
        }
        Object objInvoke = iu30Var.invoke(ciw0Var);
        return objInvoke == d9n.a ? objInvoke : rih1.a;
    }
}
