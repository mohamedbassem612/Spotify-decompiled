package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yd31 extends onm {
    public Iterator a;
    public String b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ n0v0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd31(n0v0 n0v0Var, onm onmVar) {
        super(onmVar);
        this.e = n0v0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.j(null, this);
    }
}
