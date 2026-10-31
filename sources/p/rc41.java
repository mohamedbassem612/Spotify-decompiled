package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rc41 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ m021 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc41(m021 m021Var, onm onmVar) {
        super(onmVar);
        this.b = m021Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objJ = this.b.j(null, null, 0.0f, this);
        return objJ == d9n.a ? objJ : new e331(objJ);
    }
}
