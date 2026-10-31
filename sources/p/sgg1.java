package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sgg1 implements n561 {
    public final n561 a;
    public final iu30 b;

    public sgg1(iu30 iu30Var, n561 n561Var) {
        this.a = n561Var;
        this.b = iu30Var;
    }

    @Override // p.n561
    public final Iterator iterator() {
        return new xpc1(this);
    }
}
