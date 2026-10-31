package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q4g0 extends onm {
    public Set a;
    public /* synthetic */ Object b;
    public final /* synthetic */ s4g0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4g0(s4g0 s4g0Var, onm onmVar) {
        super(onmVar);
        this.c = s4g0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
