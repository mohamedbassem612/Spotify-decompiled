package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l7d0 extends onm {
    public Set a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wj3 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7d0(wj3 wj3Var, onm onmVar) {
        super(onmVar);
        this.c = wj3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.p(null, this);
    }
}
