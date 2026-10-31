package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sn9 extends onm {
    public int a;
    public Set b;
    public /* synthetic */ Object c;
    public final /* synthetic */ q59 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn9(q59 q59Var, onm onmVar) {
        super(onmVar);
        this.d = q59Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.k(0, (Set) null, this);
    }
}
