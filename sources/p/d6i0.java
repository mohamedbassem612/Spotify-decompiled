package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d6i0 extends onm {
    public List a;
    public /* synthetic */ Object b;
    public final /* synthetic */ n6i0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6i0(n6i0 n6i0Var, onm onmVar) {
        super(onmVar);
        this.c = n6i0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.l(null, this);
    }
}
