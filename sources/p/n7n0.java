package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n7n0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ e5l0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7n0(e5l0 e5l0Var, onm onmVar) {
        super(onmVar);
        this.b = e5l0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objF = this.b.f(null, this);
        return objF == d9n.a ? objF : new e331(objF);
    }
}
