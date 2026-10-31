package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class eoo1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ xoo1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eoo1(xoo1 xoo1Var, onm onmVar) {
        super(onmVar);
        this.b = xoo1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objC = this.b.c(null, 0L, this);
        return objC == d9n.a ? objC : new e331(objC);
    }
}
