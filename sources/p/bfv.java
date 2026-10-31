package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bfv extends onm {
    public tv80 a;
    public Set b;
    public g3d0 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ nl9 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfv(nl9 nl9Var, onm onmVar) {
        super(onmVar);
        this.e = nl9Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.j(null, this);
    }
}
