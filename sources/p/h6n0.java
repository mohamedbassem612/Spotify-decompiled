package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h6n0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ i6n0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6n0(i6n0 i6n0Var, onm onmVar) {
        super(onmVar);
        this.b = i6n0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        d9n d9nVarD = this.b.d(null, this);
        return d9nVarD == d9n.a ? d9nVarD : new e331(d9nVarD);
    }
}
