package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v7h0 extends onm {
    public Set a;
    public /* synthetic */ Object b;
    public final /* synthetic */ y7h0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7h0(y7h0 y7h0Var, onm onmVar) {
        super(onmVar);
        this.c = y7h0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(null, this);
    }
}
