package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x87 extends onm {
    public Set a;
    public /* synthetic */ Object b;
    public final /* synthetic */ u60 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x87(u60 u60Var, lnm lnmVar) {
        super(lnmVar);
        this.c = u60Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(this);
    }
}
