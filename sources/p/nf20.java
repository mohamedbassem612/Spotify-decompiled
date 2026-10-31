package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nf20 implements n561 {
    public final n561 a;
    public final boolean b;
    public final iu30 c;

    public nf20(n561 n561Var, boolean z, iu30 iu30Var) {
        this.a = n561Var;
        this.b = z;
        this.c = iu30Var;
    }

    @Override // p.n561
    public final Iterator iterator() {
        return new mf20(this);
    }
}
