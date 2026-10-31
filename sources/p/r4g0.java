package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class r4g0 extends onm {
    public Set a;
    public wls0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ s4g0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4g0(s4g0 s4g0Var, onm onmVar) {
        super(onmVar);
        this.d = s4g0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, null, this);
    }
}
