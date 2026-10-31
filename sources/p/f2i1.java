package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class f2i1 extends onm {
    public List a;
    public /* synthetic */ Object b;
    public final /* synthetic */ h2i1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2i1(h2i1 h2i1Var, onm onmVar) {
        super(onmVar);
        this.c = h2i1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
