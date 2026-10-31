package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o7n0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ e5l0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7n0(e5l0 e5l0Var, onm onmVar) {
        super(onmVar);
        this.b = e5l0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        d9n d9nVarG = this.b.g(null, this);
        return d9nVarG == d9n.a ? d9nVarG : new e331(d9nVarG);
    }
}
