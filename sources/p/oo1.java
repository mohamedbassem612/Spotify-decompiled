package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class oo1 extends onm {
    public Set a;
    public /* synthetic */ Object b;
    public final /* synthetic */ so1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo1(so1 so1Var, onm onmVar) {
        super(onmVar);
        this.c = so1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.l((go1) null, this);
    }
}
