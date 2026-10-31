package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pj50 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ qj50 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj50(qj50 qj50Var, onm onmVar) {
        super(onmVar);
        this.b = qj50Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, null, this);
    }
}
