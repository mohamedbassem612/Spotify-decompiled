package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fp20 implements n561 {
    public final n561 a;
    public final iu30 b;
    public final iu30 c;

    public fp20(n561 n561Var, iu30 iu30Var, iu30 iu30Var2) {
        this.a = n561Var;
        this.b = iu30Var;
        this.c = iu30Var2;
    }

    @Override // p.n561
    public final Iterator iterator() {
        return new ep20(this);
    }
}
