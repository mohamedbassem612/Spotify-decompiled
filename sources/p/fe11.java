package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fe11 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ n801 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe11(n801 n801Var, onm onmVar) {
        super(onmVar);
        this.b = n801Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objC = this.b.c(null, this);
        return objC == d9n.a ? objC : new e331(objC);
    }
}
