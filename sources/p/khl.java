package p;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class khl implements n561 {
    public final AtomicReference a;

    public khl(n561 n561Var) {
        this.a = new AtomicReference(n561Var);
    }

    @Override // p.n561
    public final Iterator iterator() {
        n561 n561Var = (n561) this.a.getAndSet(null);
        if (n561Var != null) {
            return n561Var.iterator();
        }
        eg.m("This sequence can be consumed only once.");
        return null;
    }
}
