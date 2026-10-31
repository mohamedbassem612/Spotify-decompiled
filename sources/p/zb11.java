package p;

import java.lang.reflect.Type;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class zb11 implements m7a0 {
    @Override // p.m7a0
    public cb11 a(kf30 kf30Var) {
        Object next;
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (u890.j(bb11.a(j2h1.s(((cb11) next).a).n()).a(), kf30Var)) {
                return (cb11) next;
            }
        }
        next = null;
        return (cb11) next;
    }

    public abstract Type b();

    public final boolean equals(Object obj) {
        return (obj instanceof zb11) && u890.j(b(), ((zb11) obj).b());
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
