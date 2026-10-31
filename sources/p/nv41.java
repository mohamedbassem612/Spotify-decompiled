package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nv41 extends onm {
    public Set a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ m021 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv41(m021 m021Var, onm onmVar) {
        super(onmVar);
        this.d = m021Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.l(0, null, null, this);
    }
}
