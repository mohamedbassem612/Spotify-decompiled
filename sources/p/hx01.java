package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hx01 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ rut0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx01(rut0 rut0Var, onm onmVar) {
        super(onmVar);
        this.b = rut0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        d9n d9nVarI = this.b.i(null, this);
        return d9nVarI == d9n.a ? d9nVarI : new e331(d9nVarI);
    }
}
