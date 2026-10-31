package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cc6 extends onm {
    public List a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ic6 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc6(ic6 ic6Var, onm onmVar) {
        super(onmVar);
        this.c = ic6Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.l(null, this);
    }
}
