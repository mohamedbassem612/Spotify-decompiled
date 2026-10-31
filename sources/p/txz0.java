package p;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class txz0 {
    public final Set a;

    public txz0(t380 t380Var) {
        this.a = t380Var;
    }

    public final sxz0 a(frd1 frd1Var) {
        Object next;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((sxz0) next).h(frd1Var)) {
                return (sxz0) next;
            }
        }
        next = null;
        return (sxz0) next;
    }
}
