package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g6e0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ o860 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6e0(o860 o860Var, onm onmVar) {
        super(onmVar);
        this.b = o860Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objT = this.b.t(null, null, this);
        return objT == d9n.a ? objT : new e331(objT);
    }
}
