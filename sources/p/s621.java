package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class s621 extends onm {
    public Iterator a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mzr0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s621(mzr0 mzr0Var, onm onmVar) {
        super(onmVar);
        this.c = mzr0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.k(null, this);
    }
}
